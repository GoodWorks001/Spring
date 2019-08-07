<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<form:form modelAttribute="userInfoForm">
	名前：<form:input path="name" placeholder="名前を入力してください" />
		<br>
	年齢：<form:input path="age" placeholder="0" />
		<br>
	性別：<form:radiobuttons path="gender" items="${genders}" />
		<br> 
	E-mail：<form:input path="mail" />
		<br>
	出身地：<form:select path="birthplace" items="${birthplace}" multiple="false" />
		<br> 
	好きな言語：<form:checkboxes path="langs" items="${langs}" />
		<br> 
	備考：<form:textarea path="etc" />
		<br>
		  <input type="submit" value="送信">	
	    </form:form>
	<c:if test="${not empty userInfoFormList}">
		<table border="1">
			<c:forEach var="userInfoForm" items="${userInfoFormList}">
				<tr>
					<td>名前<c:out value="${userInfoForm.name}"></c:out>
					<td>年齢<c:out value="${userInfoForm.age}"></c:out>
					<td>性別<c:out value="${userInfoForm.gender}"></c:out>
					<td>出身地<c:out value="${userInfoForm.birthplace}"></c:out>
					<td>E-mail<c:out value="${userInfoForm.mail}"></c:out>
					<td>好きな言語<c:out value="${userInfoForm.favoriteLangs}"></c:out>
					<td>備考<c:out value="${userInfoForm.etc}"></c:out>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>