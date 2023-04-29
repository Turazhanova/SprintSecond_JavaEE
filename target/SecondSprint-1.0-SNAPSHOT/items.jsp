<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.secondsprint.model.Item" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<div class="container mt-3">
    <div class="row">
        <h4 class="text-center">
            Welcome to <%=siteName%>
        </h4>
    </div>
    <div class="row mt-3">
        <div class="col-12">
            <button type="button" class="btn btn-primary" onclick="location.href='signup.jsp'">Sign Up</button>

            <div class="modal fade" id="addTask" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row mt-3">
        <%
            ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("items");
            if(items !=null){
                for(Item it : items){
        %>
        <div class="col-4">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title"><%=it.getName()%></h5>
                    <h6 class="card-subtitle mb-2 text-muted"><%=it.getDescription()%></h6>
                    <p class="card-text"><%=it.getPrice()%></p>
                </div>
            </div>
        </div>
        <%
                }
            }
        %>
    </div>
</div>
</body>
</html>
