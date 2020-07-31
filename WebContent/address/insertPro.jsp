<%@page import="com.jqueryAddress.AddressDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="ad" class="com.jqueryAddress.Address"/>
<jsp:setProperty property="*" name="ad"/> 
<%
	AddressDAO dao = AddressDAO.getInstance();
	dao.addrInsert(ad);
	response.sendRedirect("list.jsp");
%>


