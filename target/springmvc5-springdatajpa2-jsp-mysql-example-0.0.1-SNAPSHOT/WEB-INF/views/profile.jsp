<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08/06/2024
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="icon" type="image/png" href="https://i.ibb.co/PzZLzNM/favicon.png">
    <title>
        Diabetes Tracking
    </title>
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
    <!-- Vendor CSS Files -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">    <!-- Font Awesome CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <!-- CSS Files -->
    <link rel="stylesheet" href="https://yassineoularbi.github.io/CSS-JS/css/argon-dashboard.css">
</head>

<body class="">
<div class="col-12">
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg blur border-radius-lg top-0 z-index-3 shadow position-absolute mt-4 py-2 start-0 end-0 mx-4">
        <div class="container-fluid">
            <a class="navbar-brand font-weight-bolder ms-lg-0 ms-3 " href="">
                <img style="height: 30px" src="https://i.ibb.co/s2s8hnX/light.png" alt="">
            </a>
            <button class="navbar-toggler shadow-none ms-2" type="button" data-bs-toggle="collapse" data-bs-target="#navigation" aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon mt-2">
                <span class="navbar-toggler-bar bar1"></span>
                <span class="navbar-toggler-bar bar2"></span>
                <span class="navbar-toggler-bar bar3"></span>
              </span>
            </button>
            <div class="collapse navbar-collapse" id="navigation">
                <ul class="navbar-nav mx-auto">
                    <li class="nav-item">
                        <a class="nav-link me-2" href="">
                            <i class="fa fa-user opacity-6 text-dark me-1"></i>
                            Profile
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link me-2" href="">
                            <i class="fas fa-key opacity-6 text-dark me-1"></i>
                            New Account
                        </a>
                    </li>
                </ul>
                <ul class="navbar-nav d-lg-block d-none">
                    <li class="nav-item">
                        <a style="background-color: #063156; color: white;" href="" class="btn btn-sm mb-0 me-1">Get Tracking</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- End Navbar -->
</div>
<main class="main-content  mt-0">
    <section>
        <div class="page-header min-vh-100">
            <div class="container">
                <div class="col-12 d-lg-flex d-none h-100 my-auto pe-0 position-absolute top-0 end-0 text-center justify-content-center flex-column">
                    <div class="position-relative bg-gradient-primary h-100 m-3  border-radius-lg d-flex flex-column overflow-hidden" style="background-image: url('https://i.pinimg.com/originals/ec/a0/24/eca0245f3553e83cbda9c8091e07a213.jpg');background-size: cover;">
                        <span class="mask bg-gradient-primary opacity-6"></span>
                        <h4 class="text-white mt-7 font-weight-bolder position-relative">"Welcome, Beloved Diabetics"</h4>
                        <p class="text-white position-relative">Stay connected and continue your journey towards better health. Your well-being is our priority.</p>
                        <div class="profiles-diabetics row d-flex justify-content-center mt-5" style="z-index: 1000; gap: 30px;">
                            <c:forEach var="diabetic" items="${diabetics}">
                            <a href="dashboard/${diabetic.id}" style="height: 130px; width: 130px; padding: 0;" class="blur border-radius-lg card shadow">
                                <img class="card-img" style="height: 100px; width: 130px;" src="${diabetic.picture}" alt="">
                                <span class="pt-1" style="color: #063156; font-size: 15px; font-weight: bold;">${diabetic.name}</span>
                            </a>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</main>
<script src="https://kit.fontawesome.com/6150be860f.js" crossorigin="anonymous"></script>
<!--   Core JS Files   -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>

</html>
