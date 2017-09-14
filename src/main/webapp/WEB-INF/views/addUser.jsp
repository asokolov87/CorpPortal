<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Портал техподдержки Acado telecom</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
    </style>
</head>
<body>
    <h2>Добавление пользователей системы</h2>
    <table class="tg" border="1">
        <form:form modelAttribute="user" action="/addUser">
            <tr>
                <th width="60"><form:label path="username">LOGIN</form:label></th>
                <th width="60"><form:label path="password">Пароль</form:label></th>
                <th width="60"><form:label path="NAME">Имя</form:label></th>
                <th width="100"><form:label path="EMAIL">Email</form:label></th>
                <th width="60"><form:label path="OTDEL">Отдел</form:label></th>
                <th width="80"><form:label path="POSITION">Должность</form:label></th>
                <th width="40"><form:label path="V_TEL">Внутренний телефон</form:label></th>
                <th width="60"><form:label path="MOB_TEL">Моб. телефон</form:label></th>
            </tr>
            <tr>
                <input id="id" name="id" type="hidden" value="${user.id}"/>
                <th><form:input path="username"/></th>
                <th><form:input path="password"/></th>
                <th><form:input path="NAME"/></th>
                <th><form:input path="EMAIL"/></th>
                <th>
                    <form:select path="OTDEL">
                        <form:option items="${user.OTDEL}" value="АУП">АУП</form:option>
                        <form:option items="${user.OTDEL}" value="IT">IT</form:option>
                        <form:option items="${user.OTDEL}" value="Абоненсткий отдел">Абоненсткий отдел</form:option>
                        <form:option items="${user.OTDEL}" value="Кометческий отдел">Кометческий отдел</form:option>
                        <form:option items="${user.OTDEL}" value="Бухгалтерия">Бухгалтерия</form:option>
                        <form:option items="${user.OTDEL}" value="ОС и ЭС">ОС и ЭС</form:option>
                        <form:option items="${user.OTDEL}" value="Монтажники">Монтажники</form:option>
                    </form:select></th>
                <th><form:input path="POSITION"/></th>
                <th><form:input path="V_TEL"/></th>
                <th><form:input path="MOB_TEL"/></th>
            </tr>
            <tr>
                <th colspan="10"><input type="submit" value="Добавить"></th>
            </tr>
        </form:form>
    </table>
    <a href="<c:url value="/logout" />">Logout</a>
</body>
</html>
