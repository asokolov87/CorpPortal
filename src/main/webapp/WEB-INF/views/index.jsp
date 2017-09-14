<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Портал Акадо телеком</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/bootstrap.min.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/main.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/background_top_menu.css"/>"/>
    <link rel="script" href="<c:url value="../../resources/js/bootstrap.min.js"/>"/>
    <link rel="script" href="<c:url value="../../resources/js/jquery.js"/>"/>
    <link rel="script" href="<c:url value="../../resources/js/main.js"/>"/>
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
                    <li><a href="<c:url value="/logout" />">Выход</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>

<section id="main-slider"></section>

<section id="services">
    <div class="container">
        <div class="box first">
            <div class="row">
                <div class="col-md-4 col-sm-6">
                    <div class="center">
                        <a href="<c:url value="/users"/>" class="icon-star icon-md icon-color1"></a>
                        <h4>Сотрудники</h4>
                        <p>Список всех сотрудников компании</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6">
                    <div class="center">
                        <a href="#contact" class="icon-gear icon-md icon-color2"></a>
                        <h4>Техническая поддержка</h4>
                        <p>Обращения в отдел информационных технологий</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6">
                    <div class="center">
                        <a href="#contact" class="icon-file-alt icon-md icon-color3"></a>
                        <h4>Инструкции</h4>
                        <p>Инструкции для сотрудников компании</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6">
                    <div class="center">
                        <a href="#contact" class="icon-list-alt icon-md icon-color4""></a>
                        <h4>Документы</h4>
                        <p>Полезные документы и регламенты</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6">
                    <div class="center">
                        <a href="#contact" class="icon-check icon-md icon-color5"></a>
                        <h4>Новости</h4>
                        <p>Последние новости компании</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6">
                    <div class="center">
                        <a href="#contact" class="icon-thumbs-up icon-md icon-color6"></a>
                        <h4>Новому сотруднику</h4>
                        <p>Вся необходимая информация</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
