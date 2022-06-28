<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
<form action="/book/add" method="post">
    <input type="text" name="title" placeholder="please input title"/> <br>
    <input type="text" name="surname" placeholder="please input description"/> <br>
    <input type="double" name="email" placeholder="please input price"/> <br>
    <input type="int" name="author_id" placeholder="please input author_id"/> <br>
    <input type="submit" value="Add">
</form>
</body>
</html>
