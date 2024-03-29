<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>List Page</title>
</head>
<body>

    <div class="container">
        <h1>Your Todos</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>name</th>
                    <th>description</th>
                    <th>targetDate</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.userName}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td></td>
                    </tr>
                </c:forEach>
            </tbody>

        </table>
        <a href="add-todo" class="btn btn-primary">ADD Todo</a>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"/>
    <script src="webjars/jquery/3.6.0/jquery.min.js"/>
</body>
</html>