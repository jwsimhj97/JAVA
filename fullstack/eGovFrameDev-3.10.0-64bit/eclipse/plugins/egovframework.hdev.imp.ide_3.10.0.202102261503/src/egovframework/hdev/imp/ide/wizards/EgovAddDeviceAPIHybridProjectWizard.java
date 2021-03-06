/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.hdev.imp.ide.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyDelegatingOperation;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import egovframework.hdev.imp.ide.EgovDeviceAPIIdePlugin;
import egovframework.hdev.imp.ide.common.DeviceAPIIdeLog;
import egovframework.hdev.imp.ide.common.DeviceAPIIdeUtils;
import egovframework.hdev.imp.ide.common.DeviceAPIMessages;
import egovframework.hdev.imp.ide.model.DeviceAPIContext;
import egovframework.hdev.imp.ide.pages.CustomizeTableCreationPage;
import egovframework.hdev.imp.ide.pages.DeviceAPIProjectCreationPage;
import egovframework.hdev.imp.ide.pages.DeviceAPIWebProjectCreationPage;
import egovframework.hdev.imp.ide.pages.GenerateTemplatePage;
import egovframework.hdev.imp.ide.pages.SelectProjectPage;
import egovframework.hdev.imp.ide.wizards.operation.AddDeviceAPITemplateGenerateOperation;
/**
 * AddDeviceAPIHybridProject Wizard
 * 
 * @since 2012.07.24
 * @author ???????????? API ???????????? ??? ?????????
 * @version 1.0
 * @see <pre>
 * &lt;&lt; ????????????(Modification Information) &gt;&gt;
 *   
 *?????????	  	?????????	  ????????????
 *-----------	------	----------------
 *2012.07.24	?????????	????????????
 *
 * 
 * </pre>
 */

public class EgovAddDeviceAPIHybridProjectWizard extends Wizard implements INewWizard, IExecutableExtension{
	
	/** ???????????? ?????? ?????? ?????? Page */
	DeviceAPIProjectCreationPage createPage = null;
	
	/** DB connection Test ??? Table create Page */
	CustomizeTableCreationPage customizeTablePage = null;
	
	/** Web ???????????? ?????? ????????? */
	DeviceAPIWebProjectCreationPage createWebPJT = null;
	
	/** ????????? ?????? ????????? */
	GenerateTemplatePage generateTemplatePage = null;
	
	/** ???????????? ?????? ????????? */
	SelectProjectPage selectPJTPage = null;
	
	/** EgovAddDeviceAPIHybridProjectWizard??? context */
	DeviceAPIContext context = new DeviceAPIContext();
	
	protected IConfigurationElement fConfigElement;
	
	/**
	 * ?????????
	 */
	public EgovAddDeviceAPIHybridProjectWizard() {
		
		setContext(new DeviceAPIContext());
		setWindowTitle(DeviceAPIMessages.WIZARD_ADD_PROJECT_TITLE);
		setDefaultPageImageDescriptor(EgovDeviceAPIIdePlugin.getDefault().getImageDescriptor(EgovDeviceAPIIdePlugin.IMG_CORE_PROJ_WIZ_BANNER));
	}
	
	/**
	 * @return DeviceAPIContext
	 */
	public DeviceAPIContext getContext() {
		return context;
	}

	/**
	 * @param context void
	 */
	public void setContext(DeviceAPIContext context) {
		this.context = context;
	}

	/** ????????? ?????? */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setContext(new DeviceAPIContext());
		setWindowTitle("New eGovFrame DeviceAPI Hybrid Project");
		
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * @param EgovAddDeviceAPIHybridProjectWizard
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		
		fConfigElement = config;
	}
	
	/**
	 * @param EgovAddDeviceAPIHybridProjectWizard
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {

		selectPJTPage = new SelectProjectPage("SelectProject", context);
		addPage(selectPJTPage);
		
//		Template generate Page
		generateTemplatePage = new GenerateTemplatePage("GenerateTemplatePage", context);
		addPage(generateTemplatePage);
		
		createWebPJT = new DeviceAPIWebProjectCreationPage("test", context);
		addPage(createWebPJT);
		
		customizeTablePage = new CustomizeTableCreationPage("CustomizePage", context);
		addPage(customizeTablePage);
	}
	
	/**
     * ??????????????? ??????
     */
    protected IRunnableWithProgress createOperation() {
    	
        return new AddDeviceAPITemplateGenerateOperation(getContext());
    }
    
    @Override
    public IWizardPage getStartingPage() {
    	if(DeviceAPIIdeUtils.isAndroidDevelopmentTool() == false) {
			
			MessageDialog.openInformation(EgovDeviceAPIIdePlugin
					.getActiveWorkbenchWindow().getShell(), "Inform", "Selected function has not been installed. ADT is required.");
			return null;
		}else{
    		return super.getStartingPage();
    		
    	}
    }
    
    /**
     * ????????? ??????
     */
    @Override
    public boolean performFinish() {
    	
    	if(!MessageDialog.openConfirm(getShell(), "Confirm", "?????? ???????????? ????????? ?????? ?????????")){
    		return false;
    	}
    	
        boolean result = true;
        IRunnableWithProgress runnable = createOperation();
        IRunnableWithProgress op = new WorkspaceModifyDelegatingOperation(runnable);
        
        try {
        	
            getContainer().run(false, true, op);
            BasicNewProjectResourceWizard.updatePerspective(fConfigElement);
            BasicNewProjectResourceWizard.selectAndReveal(context.getDeviceapiProject(), EgovDeviceAPIIdePlugin.getActiveWorkbenchWindow());
        } catch (InvocationTargetException e) {
        	
            DeviceAPIIdeLog.logError(e);
            result = false;
        } catch (InterruptedException e) {
        	
        	DeviceAPIIdeLog.logError(e);
            result = false;
        }
        return result;
    }
	
    /** generateTemplate checkBox??? ??????????????? customizeTablePage??? ?????? ????????? ????????? Finish ????????????*/
	@Override
	public boolean canFinish() {
		
		IWizardPage currentPage = getContainer().getCurrentPage();
		
		if(currentPage.equals(selectPJTPage)){
			return false;
		}
		
		if(currentPage.equals(generateTemplatePage)){
			if(generateTemplatePage.isEnableFinishButton()){
				return true;
			}else{
				return false;
			}
		}
		
		if(currentPage.equals(createWebPJT)){
			if(createWebPJT.isEnableFinishButton()){
				return true;
			}else{
				return false;
			}
		}
		
		return super.canFinish();
	}

}
