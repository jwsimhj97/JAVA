<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" width="1130">
		<tr>
			<td colspan="6"><img src="imgs/img01.png"></td>
		</tr>
		<tr>
			<td><img src="imgs/img02.png"></td>
			<td align="center" width="184" background="imgs/img03.png"><a href="index.jsp">[HOME]</a></td>
			<td align="center" width="184" background="imgs/img03.png"><a href="intro.jsp">[INTRO]</a></td>
			<td align="center" width="184" background="imgs/img03.png"><a href="list.jsp">[B B S]</a></td>
			<td align="center" width="184" background="imgs/img03.png"><a href="guest.jsp">[GUEST]</a></td>
			<td><img src="imgs/img02.png"></td>
		</tr>
		<tr>			
			<td colspan="6">			
				<!-- content start -->
				<h1>입력 페이지</h1>
				<form action="insert.jsp">
					<table align="center">
						<tr>
							<td width="90">제목</td>
							<td><input type="text" name="sub" size="50"></td>
						</tr>
						<tr>
							<td colspan="2">
								<textarea rows="10" cols="50" name="content"></textarea>
							</td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="입 력">
								<input type="reset" value="취 소">
							</td>
						</tr>
					</table>
				</form>
				<!-- content end -->
			</td>
		</tr>
		<tr>
			<td colspan="6"><img src="imgs/img08.png"></td>
		</tr>
	</table>
</body>
</html>