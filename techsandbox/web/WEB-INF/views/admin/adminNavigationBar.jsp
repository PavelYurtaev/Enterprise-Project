<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<header class="top">
    <spring:url value="/resources/images/headerLogo.png" var="logo"/>
    <spring:url value="/resources/images/headerSlogan.png" var="slogan"/>
    <img id="headerLogo"
         src="${logo}" alt="Enterprise header logo image">
    <img id="headerSlogan"
         src="${slogan}" alt="slogan">
</header>

<nav id="privateArea">
    <ul>
        <c:url value="/logout" var="logoutURL"/>
        <li><a href="${logoutURL}">ВЫХОД</a></li>
    </ul>
</nav>

<nav id="publicArea">
    <ul>
        <li><a href=<c:url value='/admin/account'/>>ЛИЧНЫЙ КАБИНЕТ АДМИНИСТРАТОРА</a></li>
        <li><a href=<c:url value='/admin/chat'/>>ЧАТ</a></li>
        <li><a href=<c:url value='/index'/>>НА ГЛАВНУЮ</a></li>
    </ul>
</nav>
