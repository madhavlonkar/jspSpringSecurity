<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>

    <form action="/login" method="post">
        Username: <input type="text" name="username"/><br>
        Password: <input type="password" name="password"/><br>
        <button type="submit">Login</button>
    </form>

    <!-- Display error message if login fails -->
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Invalid username or password. Please try again.</p>
    <% } %>

    <!-- Display logout success message -->
    <% if (request.getParameter("logout") != null) { %>
        <p style="color: green;">You have been logged out successfully.</p>
    <% } %>
</body>
</html>
