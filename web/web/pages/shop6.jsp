<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/main.css">
    <title>Accountant for Alfacell</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../libs/Bootstrap/css/bootstrap.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../libs/Bootstrap/js/bootstrap.js"></script>
    <script src="../libs/jquery.tablesorter.js"></script>
    <script src="../js/script.js"></script>
    <script src="../libs/jquery.liveFilter.js"></script>
</head>

<body>
<div align="right">
    <form action="/ServletLogout">
        <h4> user: ${sessionScope.user.firstName} ${sessionScope.user.lastName}
            <input type="submit" value="logout" width="20%" height="20%"></h4>
    </form>
</div>
<div ng-controller="mainController">
    <p align="center">
        <img src="../resources/alfacell_logo.png" alt="ALFACELL"></p>

    <div align="center">
        <h2>Магазин # ${shopId}</h2></div>


    <div class="container">
        <div class="row">

            <div class="navbar navbar-default ">
                <div class="container ">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target="#responsive-menu">
                            <span class="sr-only">Открыть навигацию</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="collapse navbar-collapse" id="responsive-menu">
                        <ul class="nav navbar-nav">
                            <li><a href="/allShops">Все магазины</a></li>
                            <li><a href="/shop1">Магазин №1</a></li>
                            <li><a href="/shop2">Магазин №2</a></li>
                            <li><a href="/shop3">Магазин №3</a></li>
                            <li><a href="/shop4">Магазин №4</a></li>
                            <li><a href="/shop5">Магазин №5</a></li>
                            <li><a href="/shop6">Магазин №6</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div align="middle">
        <p>
            <input type="text" class="filter" name="liveFilter" placeholder="фильтр"/>
        </p>
        <table class="table_blur tablesorter" id="myTable">
            <thead>
            <tr>
                <th>Категория &#9660;</th>
                <th>Производитель &#9660;</th>
                <th>Модель &#9660;</th>
                <th>Количество &#9660;</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${storageList6}" var="storage">
                <tr>
                    <td><c:out value="${storage.productDto.categoryDto.nameCategory}"> </c:out></td>
                    <td><c:out value="${storage.productDto.brand}"> </c:out></td>
                    <td><c:out value="${storage.productDto.nameProduct}"> </c:out></td>
                    <td><c:out value="${storage.amount}"> </c:out></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>

