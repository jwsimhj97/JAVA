package com.hi;

import java.util.ArrayList;

public class Ex11_1 {

   public static void main(String[] args) {
      // �л� ���� ���� ���α׷� (ver 0.5.0)
      // 1.�Է� 2.���� 3.���� 4.���� 0.���� >
      // �ѿ�x
      ArrayList<String[]> list=new ArrayList<>();
      java.util.Scanner sc=new java.util.Scanner(System.in);
      String input=null;
      String[] data = null;
      String bar="--------------------------------------";
      
      System.out.println("�л� ���� ���� ���α׷� (ver 0.5.0)");
      
      while(true){
         System.out.print("1.�Է� 2.���� 3.���� 4.���� 0.���� >");
         input=sc.nextLine();
         if(input.equals("0")){
            System.out.println("�����Դϴ�");
            break;
         }else if(input.equals("1")){
//            System.out.println("�Է��Դϴ�");
            data=new String[4];      // data��� ��ü�� �������ٻ��� �����ǰ���
            
            System.out.print("�й� >");
            data[0]=sc.nextLine();
            System.out.print("���� >");
            data[1]=sc.nextLine();
            System.out.print("���� >");
            data[2]=sc.nextLine();
            System.out.print("���� >");
            data[3]=sc.nextLine();
                        
            list.add(data);
         }else if(input.equals("2")){
//            System.out.println("�����Դϴ�");
            System.out.println(bar);
            System.out.println("�й�\t����\t����\t����");
            System.out.println(bar);
            for(int i=0; i<list.size(); i++){      // list�� �迭����
               for(int j=0; j<list.get(i).length; j++){      // list �迭���� �迭����
                  System.out.print(list.get(i)[j]+"\t");
               }
               System.out.println();
            }
         }else if(input.equals("3")){
//            System.out.println("�����Դϴ�");
            System.out.println("������ �й��� �Է��ϼ���");
            input=sc.nextLine();
            for(int i=0; i<list.size(); i++){
               if(input.equals(list.get(i)[0])){
                  data=new String[4];   
                  System.out.print("�й� >");
                  data[0]=sc.nextLine();
                  System.out.print("���� >");
                  data[1]=sc.nextLine();
                  System.out.print("���� >");
                  data[2]=sc.nextLine();
                  System.out.print("���� >");
                  data[3]=sc.nextLine();
                  
                  list.set(i, data);                  
               }
            }
         }else if(input.equals("4")){
//            System.out.println("�����Դϴ�");
            System.out.println("������ �й��� �Է��ϼ���");
            input=sc.nextLine();
            for(int i=0; i<list.size(); i++){
               if(input.equals(list.get(i)[0])){
                  list.remove(i);
               }
            }
         }else{
            System.out.println("�޴��� ���ð� �ٽ��Է����ּ���");
         }
      }
      System.out.println("���α׷��� �����Ͽ����ϴ�");
   }

}