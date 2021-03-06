<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, oracle.jdbc.driver.OracleDriver" %>
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
				<h1>게시판 페이지</h1>
				<table border="1" width="80%" align="center">
					<colgroup>
						<col width="15%">
						<col width="">
						<col width="40%">
					</colgroup>
					<tr>
						<th>No.</th>
						<th>제목</th>
						<th>날짜</th>
					</tr>
				<% // <% -> 스크립트릿		<%@ -> 디렉티브(페이지)
				String sql="select num,sub,nalja from bbs01";
				String url="jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
				String sqlList="select num from bbs01";
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				
				try{
					DriverManager.registerDriver(new OracleDriver());
					conn=DriverManager.getConnection(url);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					
					while(rs.next()){
				%>
						
				<tr>
					<td><% out.print(rs.getObject(1)); %></td>
					<td><a href="detail.jsp?num=<% out.print(rs.getObject(1)); %>"><% out.print(rs.getObject(2)); %></a></td>
					<td><% out.print(rs.getObject(3)); %></td>
				</tr>
				
				<%
					}
				}finally{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}
				%>
				</table>
				<p align="center">
					<a href="add.jsp">[입 력]</a>
				</p>
				
				<!-- content end -->
			</td>
		</tr>
		<tr>
			<td colspan="6"><img src="imgs/img08.png"></td>
		</tr>
	</table>
</body>
</html>