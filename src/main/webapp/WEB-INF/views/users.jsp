<%--
  Created by IntelliJ IDEA.
  User: sokolov
  Date: 11.04.2017
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Akado Telecom</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/background_top_menu.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/bootstrap.min.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/main.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/table.css"/>"/>
    <link rel="script" href="<c:url value="../../resources/js/bootstrap.min.js"/>"/>
    <link rel="script" href="<c:url value="../../resources/js/jquery.js"/>"/>
    <link rel="script" href="<c:url value="../../resources/js/main.js"/>"/>
    <style>
        .c {
            border: 1px solid #333;
            display: inline-block;
            padding: 5px 15px;
            background: linear-gradient(to bottom, #fcfff4, #e9e9ce);
            text-decoration: none;
            color: #000;
        }
        .c:hover {
            box-shadow: 0 0 5px rgba(0,0,0,0.3);
            background: linear-gradient(to bottom, #fcfff4, #e9e9ce);
            color: #aa8e00;
        }
    </style>
</head>
<body>
<header id="header">
    <div class="container">
        <div id="navbar" class="navbar navbar-default">
            <div class="navbar-header" >
                <a class="navbar-brand" href="<c:url value="/index" />"></a>
            </div>
            <div class="topmenu">
                <ul class="nav navbar-nav">
                    <li><a href="#aup">АУП</a></li>
                    <li><a href="#com">Коммерческий</a></li>
                    <li><a href="#abon">Фбонентский</a></li>
                    <li><a href="#buh">Бухгалтерия</a></li>
                    <li><a href="#stroy">Ст и Э</a></li>
                    <li><a href="#it">ИТ</a></li>
                    <li><a href="#mont">Монтажники</a></li>
                    <li><a href="<c:url value="/logout" />">Выход</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>
    <div align="center">
        <h1>Сотрудники</h1>
        <a class="c" href="<c:url value="/addUser" />">Добавить пользователя</a>
        <table class="simple-little-table" cellspacing='0'>
                <tr>
                    <th colspan="6"><h3 id="aup">Административно Управленческий Персонал</h3></th>
                </tr>
                <c:forEach var="user" items="${listusers}">
                <c:if test="${user.OTDEL == 'АУП'}">
                    <tr>
                        <td width="300">${user.NAME}</td>
                        <td width="300"><a href="mailto:${user.EMAIL}">${user.EMAIL}</a></td>
                        <td width="200">${user.POSITION}</td>
                        <td width="80">${user.v_TEL}</td>
                        <td width="150">${user.MOB_TEL}</td>
                        <td width="80">
                            <a href="addUser/${user.id}">Изменить</a>
                            <a href="delete/${user.id}">Удалить</a>
                        </td>
                    </tr>
                </c:if>
                </c:forEach>
                <tr>
                    <th colspan="6"><h3 id="com">Коммерческий отдел</h3></th>
                </tr>
                <c:forEach var="user" items="${listusers}">
                <c:if test="${user.OTDEL == 'Кометческий отдел'}">
                    <tr>
                        <td>${user.NAME}</td>
                        <td><a href="mailto:${user.EMAIL}">${user.EMAIL}</a></td>
                        <td>${user.POSITION}</td>
                        <td>${user.v_TEL}</td>
                        <td>${user.MOB_TEL}</td>
                        <td>
                            <a href="addUser/${user.id}">Изменить</a>
                            <a href="delete/${user.id}">Удалить</a>
                        </td>
                    </tr>
                </c:if>
                </c:forEach>
                <tr>
                    <th colspan="6"><h3 id="abon">Абонентский отдел</h3></th>
                </tr>
                <c:forEach var="user" items="${listusers}">
                <c:if test="${user.OTDEL == 'Абоненсткий отдел'}">
                    <tr>
                        <td>${user.NAME}</td>
                        <td><a href="mailto:${user.EMAIL}">${user.EMAIL}</a></td>
                        <td>${user.POSITION}</td>
                        <td>${user.v_TEL}</td>
                        <td>${user.MOB_TEL}</td>
                        <td>
                            <a href="addUser/${user.id}">Изменить</a>
                            <a href="delete/${user.id}">Удалить</a>
                        </td>
                    </tr>
                </c:if>
                </c:forEach>
                <tr>
                    <th colspan="6"><h3 id="buh">Бухгалтерия</h3></th>
                </tr>
                <c:forEach var="user" items="${listusers}">
                <c:if test="${user.OTDEL == 'Бухгалтерия'}">
                    <tr>
                        <td>${user.NAME}</td>
                        <td><a href="mailto:${user.EMAIL}">${user.EMAIL}</a></td>
                        <td>${user.POSITION}</td>
                        <td>${user.v_TEL}</td>
                        <td>${user.MOB_TEL}</td>
                        <td>
                            <a href="addUser/${user.id}">Изменить</a>
                            <a href="delete/${user.id}">Удалить</a>
                        </td>
                    </tr>
                </c:if>
                </c:forEach>
                <tr>
                    <th colspan="6"><h3 id="stroy">Отдел строительства и эксплуатации</h3></th>
                </tr>
                <c:forEach var="user" items="${listusers}">
                <c:if test="${user.OTDEL == 'ОС и ЭС'}">
                    <tr>
                        <td>${user.NAME}</td>
                        <td><a href="mailto:${user.EMAIL}">${user.EMAIL}</a></td>
                        <td>${user.POSITION}</td>
                        <td>${user.v_TEL}</td>
                        <td>${user.MOB_TEL}</td>
                        <td>
                            <a href="addUser/${user.id}">Изменить</a>
                            <a href="delete/${user.id}">Удалить</a>
                        </td>
                    </tr>
                </c:if>
                </c:forEach>
                <tr>
                    <th colspan="6"><h3 id="it">Отдел Информационных технологий</h3></th>
                </tr>
                <c:forEach var="user" items="${listusers}">
                <c:if test="${user.OTDEL == 'IT'}">
                    <tr>
                        <td>${user.NAME}</td>
                        <td><a href="mailto:${user.EMAIL}">${user.EMAIL}</a></td>
                        <td>${user.POSITION}</td>
                        <td>${user.v_TEL}</td>
                        <td>${user.MOB_TEL}</td>
                        <td>
                            <a href="addUser/${user.id}">Изменить</a>
                            <a href="delete/${user.id}">Удалить</a>
                        </td>
                    </tr>
                </c:if>
                </c:forEach>
                <tr>
                    <th colspan="6"><h3 id="mont">Монтажники</h3></th>
                </tr>
                <c:forEach var="user" items="${listusers}">
                <c:if test="${user.OTDEL == 'Монтажники'}">
                    <tr>
                        <td>${user.NAME}</td>
                        <td><a href="mailto:${user.EMAIL}">${user.EMAIL}</a></td>
                        <td>${user.POSITION}</td>
                        <td>${user.v_TEL}</td>
                        <td>${user.MOB_TEL}</td>
                        <td>
                            <a href="addUser/${user.id}">Изменить</a>
                            <a href="delete/${user.id}">Удалить</a>
                        </td>
                    </tr>
                </c:if>
                </c:forEach>
        </table>
    </div>
</body>
</html>
