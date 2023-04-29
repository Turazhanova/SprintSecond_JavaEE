<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>User Information</title>
  <%@ include file="head.jsp" %>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container mt-3">
  <div class="row">
    <h4 class="text-center">
      Hello <%= (String) request.getAttribute("user") %>
      <br>
      This is your profile!
    </h4>
  </div>
</div>
</body>
</html>
