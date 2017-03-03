<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Create User</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/action.css"/>
</head>
<body>
<br/>
<div class="container">
    <div class="row">
        <div class="jumbotron">
            <form method="post" action="">
                <div class="form-group">
                    <input name="username" type="text" class="form-control" placeholder="Enter username">
                </div>
                <div class="form-group">
                    <input name="fullName" type="text" class="form-control" placeholder="Enter full name">
                </div>
                <div class="form-group">
                    <input name="password" type="password" class="form-control" placeholder="Enter password">
                </div>
                <div class="form-group">
                    <input name="confirmPassword" type="password" class="form-control" placeholder="Repeat password">
                </div>
                <div class="form-group">
                    <input class="btn btn-primary" type="submit" value="Create">
                    <a href="/" class="btn btn-primary">Cancel</a>
                </div>
            </form>
        </div>
    </div>
</div>

<script  src="${pageContext.request.contextPath}static\jquery\jquery.min.js"></script>
<script  src="${pageContext.request.contextPath}\static\bootstrap\js\bootstrap.min.js"></script>
<script>
    $("#login").addClass("active");
</script>
</body>
</html>