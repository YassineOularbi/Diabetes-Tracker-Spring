<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2024
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <title>Diabetes Tracker</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="https://i.ibb.co/PzZLzNM/favicon.png" rel="icon">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com" rel="preconnect">
    <link href="https://fonts.gstatic.com" rel="preconnect" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Raleway:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <!-- AOS CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aos/3.0.0-beta.6/aos.css">
    <!-- Font Awesome CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <!-- Glightbox CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/glightbox/3.2.0/css/glightbox.min.css">

    <!-- Swiper CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/9.2.1/swiper-bundle.min.css">

    <!-- Main CSS File -->
    <style><%@include file="assets/css/main.css"%></style>

</head>

<body class="index-page">

<header id="header" class="header sticky-top">

    <div class="topbar d-flex align-items-center">
        <div class="container d-flex justify-content-center justify-content-md-between">
            <div class="contact-info d-flex align-items-center">
                <i class="bi bi-envelope d-flex align-items-center"><a href="mailto:contact@example.com">contact@diabetes-tracker.com</a></i>
                <i class="bi bi-phone d-flex align-items-center ms-4"><span>+1 5589 55488 55</span></i>
            </div>
            <div class="social-links d-none d-md-flex align-items-center">
                <a href="#" class="twitter"><i class="bi bi-twitter-x"></i></a>
                <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
                <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
                <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></a>
            </div>
        </div>
    </div><!-- End Top Bar -->

    <div class="branding d-flex align-items-center">

        <div class="container position-relative d-flex align-items-center justify-content-between">
            <a href="index.html" class="logo d-flex align-items-center me-auto">
                <!-- Uncomment the line below if you also wish to use an image logo -->
                <!-- <img src="assets/img/logo.png" alt=""> -->
                <img src="https://i.ibb.co/s2s8hnX/light.png" alt="">
            </a>

            <nav id="navmenu" class="navmenu">
                <ul>
                    <li><a href="#hero" class="active">Home<br></a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#services">Services</a></li>
                    <li><a href="#departments">Measures</a></li>
                    <li><a href="#doctors">Doctors</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
                <i class="mobile-nav-toggle d-xl-none bi bi-list"></i>
            </nav>

            <a class="cta-btn d-none d-sm-block" href="track">Get Tracking</a>

        </div>

    </div>

</header>

<main class="main">

    <!-- Hero Section -->
    <section id="hero" class="hero section">

        <img src="https://img.freepik.com/premium-photo/background-diabetic-disease-concept-with-copy-space-world-diabetes-day-banner_132254-879.jpg?w=826" alt="" data-aos="fade-in">

        <div class="container position-relative">

            <div class="welcome position-relative" data-aos="fade-down" data-aos-delay="100">
                <h2>WELCOME TO BLOOD TRACKING</h2>
                <p>We are a platform dedicated to diabetes tracking and diabetic support.</p>
            </div><!-- End Welcome -->

            <div class="content row gy-4">
                <div class="col-lg-4 d-flex align-items-stretch">
                    <div class="why-box" data-aos="zoom-out" data-aos-delay="200">
                        <h3>Why Choose Blood Tracking?</h3>
                        <p>
                            At Blood Tracking, we provide an all-encompassing platform for diabetes management, offering accurate blood glucose tracking, personalized insights, and comprehensive patient support. Our user-friendly interface, coupled with secure data handling, ensures that you receive the best care and guidance on your diabetes journey.
                        </p>
                        <div class="text-center">
                            <a href="#about" class="more-btn"><span>Learn More</span> <i class="bi bi-chevron-right"></i></a>
                        </div>
                    </div>
                </div><!-- End Why Box -->

                <div class="col-lg-8 d-flex align-items-stretch">
                    <div class="d-flex flex-column justify-content-center">
                        <div class="row gy-4">

                            <div class="col-xl-4 d-flex align-items-stretch">
                                <div class="icon-box" data-aos="zoom-out" data-aos-delay="300">
                                    <i class="bi bi-clipboard-data"></i>
                                    <h4>Advanced Blood Analytics</h4>
                                    <p>Blood Tracking specializes in comprehensive analytics for diabetes-related blood measures.</p>
                                </div>
                            </div><!-- End Icon Box -->

                            <div class="col-xl-4 d-flex align-items-stretch">
                                <div class="icon-box" data-aos="zoom-out" data-aos-delay="400">
                                    <i class="bi bi-bandaid"></i>
                                    <h4>Personalized Health Insights</h4>
                                    <p>Blood Tracking provides specialized analytics and expert advice on nutrition and medication for diabetes management.</p>
                                </div>
                            </div><!-- End Icon Box -->

                            <div class="col-xl-4 d-flex align-items-stretch">
                                <div class="icon-box" data-aos="zoom-out" data-aos-delay="500">
                                    <i class="bi bi-inboxes"></i>
                                    <h4>Comprehensive Diabetes Monitoring</h4>
                                    <p>Blood Tracking offers expert analytics and personalized advice on nutrition and medication for diabetes.</p>
                                </div>
                            </div><!-- End Icon Box -->

                        </div>
                    </div>
                </div>
            </div><!-- End  Content-->

        </div>

    </section><!-- /Hero Section -->

    <!-- About Section -->
    <section id="about" class="about section">

        <div class="container">

            <div class="row gy-4 gx-5">

                <div class="col-lg-6 position-relative align-self-start" data-aos="fade-up" data-aos-delay="200">
                    <img src="https://sterlingmedicaldevices.com/app/uploads/2022/09/wearable-technology-in-healthcare.jpg" class="img-fluid" alt="">
                    <a href="https://www.youtube.com/watch?v=UlwJkPG-zZI" class="glightbox play-btn"></a>
                </div>

                <div class="col-lg-6 content" data-aos="fade-up" data-aos-delay="100">
                    <h3>About Us</h3>
                    <p>
                        At Blood Tracking, we are dedicated to empowering individuals living with diabetes through cutting-edge analytics and personalized health insights. Our mission is to help you manage your condition effectively by providing detailed analysis and expert advice tailored to your unique needs.
                    </p>
                    <ul>
                        <li>
                            <i class="fa-solid fa-vial-circle-check"></i>
                            <div>
                                <h5>Advanced Analytics</h5>
                                <p>We specialize in monitoring key blood measures related to diabetes, including glucose levels, HbA1c, and lipid profiles.</p>
                            </div>
                        </li>
                        <li>
                            <i class="fa-solid fa-pump-medical"></i>
                            <div>
                                <h5>Personalized Advice</h5>
                                <p>Our team offers specialized guidance on nutrition and medication, ensuring that your diabetes management plan is optimized for your lifestyle.</p>
                            </div>
                        </li>
                        <li>
                            <i class="fa-solid fa-heart-circle-xmark"></i>
                            <div>
                                <h5>Progress Tracking</h5>
                                <p>We maintain a comprehensive history for each patient, enabling us to track your progress and provide updates on your health status over time.</p>
                            </div>
                        </li>
                    </ul>
                </div>

            </div>

        </div>

    </section><!-- /About Section -->

    <!-- Stats Section -->
    <section id="stats" class="stats section">

        <div class="container" data-aos="fade-up" data-aos-delay="100">

            <div class="row gy-4">

                <div class="col-lg-3 col-md-6 d-flex flex-column align-items-center">
                    <i class="fa-solid fa-user-doctor"></i>
                    <div class="stats-item">
                        <span data-purecounter-start="0" data-purecounter-end="${countDoctors}" data-purecounter-duration="2" class="purecounter">0</span>
                        <p>Doctors</p>
                    </div>
                </div><!-- End Stats Item -->

                <div class="col-lg-3 col-md-6 d-flex flex-column align-items-center">
                    <i class="fa-regular fa-hospital"></i>
                    <div class="stats-item">
                        <span data-purecounter-start="0" data-purecounter-end="100" data-purecounter-duration="2" class="purecounter">0</span>
                        <p>Insights</p>
                    </div>
                </div><!-- End Stats Item -->

                <div class="col-lg-3 col-md-6 d-flex flex-column align-items-center">
                    <i class="fas fa-flask"></i>
                    <div class="stats-item">
                        <span data-purecounter-start="0" data-purecounter-end="100" data-purecounter-duration="2" class="purecounter">0</span>
                        <p>Measures</p>
                    </div>
                </div><!-- End Stats Item -->

                <div class="col-lg-3 col-md-6 d-flex flex-column align-items-center">
                    <i class="bi bi-lungs-fill"></i>
                    <div class="stats-item">
                        <span data-purecounter-start="0" data-purecounter-end="${countDiabetics}" data-purecounter-duration="2" class="purecounter">0</span>
                        <p>Diabetics</p>
                    </div>
                </div><!-- End Stats Item -->

            </div>

        </div>
        <script>
            /**
             * Animation on scroll function and init
             */
            function aosInit() {
                AOS.init({
                    duration: 600,
                    easing: 'ease-in-out',
                    once: true,
                    mirror: false
                });
            }
            window.addEventListener('load', aosInit);
        </script>

        <script>
            document.addEventListener('DOMContentLoaded', function() {
                const counters = document.querySelectorAll('.purecounter');
                counters.forEach(counter => {
                    const start = parseInt(counter.getAttribute('data-purecounter-start'));
                    const end = parseInt(counter.getAttribute('data-purecounter-end'));
                    const duration = parseInt(counter.getAttribute('data-purecounter-duration'));

                    let current = start;

                    const updateCounter = () => {
                        const increment = (end - start) / (duration * 60);
                        current += increment;
                        counter.textContent = Math.floor(current);

                        if (current < end) {
                            requestAnimationFrame(updateCounter);
                        }
                    };

                    updateCounter();
                });
            });
        </script>

    </section><!-- /Stats Section -->

    <!-- Services Section -->
    <section id="services" class="services section">

        <!-- Section Title -->
        <div class="container section-title" data-aos="fade-up">
            <h2>Services</h2>
            <p>Providing advanced analytics, personalized health advice, and detailed progress tracking for optimal diabetes management.</p>
        </div><!-- End Section Title -->

        <div class="container">

            <div class="row gy-4">

                <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="100">
                    <div class="service-item  position-relative">
                        <div class="icon">
                            <i class="fas fa-heartbeat"></i>
                        </div>
                        <a href="#" class="stretched-link">
                            <h3>Comprehensive Testing</h3>
                        </a>
                        <p>Measure your blood glucose, HbA1c, weight, blood ketone, and urinary ketone levels easily.</p>
                    </div>
                </div><!-- End Service Item -->

                <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="200">
                    <div class="service-item position-relative">
                        <div class="icon">
                            <i class="fas fa-pills"></i>
                        </div>
                        <a href="#" class="stretched-link">
                            <h3>Detailed Analytics</h3>
                        </a>
                        <p>Visualize your health data with intuitive charts and analyses.</p>
                    </div>
                </div><!-- End Service Item -->

                <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="300">
                    <div class="service-item position-relative">
                        <div class="icon">
                            <i class="fas fa-hospital-user"></i>
                        </div>
                        <a href="#" class="stretched-link">
                            <h3>Medication Guidance</h3>
                        </a>
                        <p>Receive expert advice on managing your medications effectively.</p>
                    </div>
                </div><!-- End Service Item -->

                <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="400">
                    <div class="service-item position-relative">
                        <div class="icon">
                            <i class="fas fa-dna"></i>
                        </div>
                        <a href="#" class="stretched-link">
                            <h3>Nutritional Counseling</h3>
                        </a>
                        <p>Get tailored dietary recommendations to support your diabetes management.</p>
                        <a href="#" class="stretched-link"></a>
                    </div>
                </div><!-- End Service Item -->

                <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="500">
                    <div class="service-item position-relative">
                        <div class="icon">
                            <i class="bi bi-activity"></i>
                        </div>
                        <a href="#" class="stretched-link">
                            <h3>Insulin Dosing</h3>
                        </a>
                        <p>Calculate the right insulin doses and receive timely recommendations and alerts.</p>
                        <a href="#" class="stretched-link"></a>
                    </div>
                </div><!-- End Service Item -->

                <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="600">
                    <div class="service-item position-relative">
                        <div class="icon">
                            <i class="fas fa-notes-medical"></i>
                        </div>
                        <a href="#" class="stretched-link">
                            <h3>Appointment Scheduling</h3>
                        </a>
                        <p>Get suggestions for scheduling appointments with medical professionals.</p>
                        <a href="#" class="stretched-link"></a>
                    </div>
                </div><!-- End Service Item -->

            </div>

        </div>

    </section><!-- /Services Section -->

    <!-- Appointment Section -->
    <section id="appointment" class="appointment section">

        <!-- Section Title -->
        <div class="container section-title" data-aos="fade-up">
            <h2>Appointment Scheduling</h2>
            <p>Get suggestions for scheduling appointments with medical professionals.</p>
        </div><!-- End Section Title -->

        <div class="container" data-aos="fade-up" data-aos-delay="100">

            <form action="forms/appointment.php" method="post" role="form" class="php-email-form">
                <div class="row">
                    <div class="col-md-4 form-group">
                        <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" required="">
                    </div>
                    <div class="col-md-4 form-group mt-3 mt-md-0">
                        <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" required="">
                    </div>
                    <div class="col-md-4 form-group mt-3 mt-md-0">
                        <input type="tel" class="form-control" name="phone" id="phone" placeholder="Your Phone" required="">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 form-group mt-3">
                        <input type="datetime-local" name="date" class="form-control datepicker" id="date" placeholder="Appointment Date" required="">
                    </div>
                    <div class="col-md-4 form-group mt-3">
                        <select name="department" id="department" class="form-select" required="">
                            <option value="">Select Measure</option>
                            <option value="Department 1">Glycemia</option>
                            <option value="Department 2">HbA1c</option>
                            <option value="Department 3">Blood Ketone</option>
                            <option value="Department 3">Urinary Ketone</option>
                            <option value="Department 3">Weight</option>
                        </select>
                    </div>
                    <div class="col-md-4 form-group mt-3">
                        <select name="doctor" id="doctor" class="form-select" required="">
                            <option value="">Select Doctor</option>
                            <c:forEach var="doctor" items="${doctors}">
                            <option value="${doctor.jobType}">${doctor.jobType}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>

                <div class="form-group mt-3">
                    <textarea class="form-control" name="message" rows="5" placeholder="Message (Optional)"></textarea>
                </div>
                <div class="mb-3">
                    <div class="loading">Loading</div>
                    <div class="error-message"></div>
                    <div class="sent-message">Your appointment request has been sent successfully. Thank you!</div>
                </div>
                <div class="text-center"><button type="submit">Make an Appointment</button></div>
            </form>

        </div>

    </section><!-- /Appointment Section -->

    <!-- Departments Section -->
    <section id="departments" class="departments section">

        <!-- Section Title -->
        <div class="container section-title" data-aos="fade-up">
            <h2>Measures</h2>
            <p>Measure your blood glucose, HbA1c, weight, blood ketone, and urinary ketone levels easily.</p>
        </div><!-- End Section Title -->

        <div class="container" data-aos="fade-up" data-aos-delay="100">

            <div class="row">
                <div class="col-lg-3">
                    <ul class="nav nav-tabs flex-column">
                        <li class="nav-item">
                            <a class="nav-link active show" data-bs-toggle="tab" href="#departments-tab-1">Glycemia</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-bs-toggle="tab" href="#departments-tab-2">HbA1c</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-bs-toggle="tab" href="#departments-tab-3">Blood Ketone</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-bs-toggle="tab" href="#departments-tab-4">Urinary Ketone</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-bs-toggle="tab" href="#departments-tab-5">Weight</a>
                        </li>
                    </ul>
                </div>
                <div class="col-lg-9 mt-4 mt-lg-0">
                    <div class="tab-content">
                        <div class="tab-pane active show" id="departments-tab-1">
                            <div class="row">
                                <div class="col-lg-8 details order-2 order-lg-1">
                                    <h3>Glycemia Measurement</h3>
                                    <p class="fst-italic">Easily monitor your blood glucose levels with our precise testing tools. Regularly tracking your glycemia helps you maintain optimal control of your diabetes and make informed health decisions.</p>
                                </div>
                                <div class="col-lg-4 text-center order-1 order-lg-2">
                                    <img src="https://californialifehd.com/wp-content/uploads/2018/11/15206082080_184a156ed5.jpg" alt="" class="img-fluid">
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane" id="departments-tab-2">
                            <div class="row">
                                <div class="col-lg-8 details order-2 order-lg-1">
                                    <h3>HbA1c Measurement</h3>
                                    <p class="fst-italic">Ensure long-term diabetes control with our HbA1c measurement services, providing valuable insights into your average blood sugar levels over time for better management.</p>
                                </div>
                                <div class="col-lg-4 text-center order-1 order-lg-2">
                                    <img src="https://healthjade.net/wp-content/uploads/2018/08/HbA1c.jpg" alt="" class="img-fluid">
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane" id="departments-tab-3">
                            <div class="row">
                                <div class="col-lg-8 details order-2 order-lg-1">
                                    <h3>Blood Ketone Measurement</h3>
                                    <p class="fst-italic">Our blood ketone measurement services offer accurate insights into your ketone levels, aiding in proactive diabetes management and preventing potential complications.</p>
                                </div>
                                <div class="col-lg-4 text-center order-1 order-lg-2">
                                    <img src="https://img.tsn.ua/cached/909/tsn-0adb2b455a252fbeb54cd6e76bc767e2/thumbs/1200x630/82/54/a5b9bf20e718965ec7d4e8613a835482.jpeg" alt="" class="img-fluid">
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane" id="departments-tab-4">
                            <div class="row">
                                <div class="col-lg-8 details order-2 order-lg-1">
                                    <h3>Urinary Ketone Measurement</h3>
                                    <p class="fst-italic">Monitor your urinary ketone levels with precision, aiding in proactive diabetes management and providing valuable insights for your overall health and well-being.</p>
                                </div>
                                <div class="col-lg-4 text-center order-1 order-lg-2">
                                    <img src="https://www.ucsfbenioffchildrens.org/-/media/project/ucsf/ucsf-bch/images/medical-tests/hero/ketones-urine-test-708x556-2x.jpg?h=1112&iar=0&w=1416&hash=2125AC883019C5485DDECE773AFFD0B7" alt="" class="img-fluid">
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane" id="departments-tab-5">
                            <div class="row">
                                <div class="col-lg-8 details order-2 order-lg-1">
                                    <h3>Weight Measurement</h3>
                                    <p class="fst-italic">Track your weight with precision, an essential aspect of diabetes management. Our services provide accurate measurements and insights to help you achieve your health goals.</p>
                                </div>
                                <div class="col-lg-4 text-center order-1 order-lg-2">
                                    <img src="https://post.healthline.com/wp-content/uploads/2019/04/Scale_Feet_1200x628-facebook.jpg" alt="" class="img-fluid">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </section><!-- /Departments Section -->

    <!-- Doctors Section -->
    <section id="doctors" class="doctors section">

        <!-- Section Title -->
        <div class="container section-title" data-aos="fade-up">
            <h2>Doctors</h2>
            <p>Meet our dedicated doctors for personalized diabetes care and expert guidance.</p>
        </div><!-- End Section Title -->

        <div class="container">

            <div class="row gy-4">

                <c:forEach var="doctor" items="${doctors}">
                <div class="col-lg-6" data-aos="fade-up" data-aos-delay="100">
                    <div class="team-member d-flex align-items-start">
                        <div class="pic"><img src="${doctor.picture}" class="img-fluid" alt=""></div>
                        <div class="member-info">
                            <h4>${doctor.name}</h4>
                            <span>${doctor.jobType}</span>
                            <p>Blood Tracking has been a game-changer for my diabetes management. Highly recommended!</p>
                            <div class="social">
                                <a href=""><i class="bi bi-twitter-x"></i></a>
                                <a href=""><i class="bi bi-facebook"></i></a>
                                <a href=""><i class="bi bi-instagram"></i></a>
                                <a href=""> <i class="bi bi-linkedin"></i> </a>
                            </div>
                        </div>
                    </div>
                </div><!-- End Team Member -->
                </c:forEach>

            </div>

        </div>

    </section><!-- /Doctors Section -->

    <!-- Testimonials Section -->
    <section id="testimonials" class="testimonials section">

        <div class="container">

            <div class="row align-items-center">

                <div class="col-lg-5 info" data-aos="fade-up" data-aos-delay="100">
                    <h3>Community of Diabetics</h3>
                    <p>
                        Our diabetic members form a vibrant community dedicated to mutual support, where personalized resources and expert guidance empower each individual to manage their condition effectively and thrive in their health journey.
                    </p>
                </div>

                <div class="col-lg-7" data-aos="fade-up" data-aos-delay="200">

                    <div class="swiper">
                        <script>
                            document.addEventListener('DOMContentLoaded', function() {
                                var mySwiper = new Swiper('.swiper', {
                                    loop: true,
                                    speed: 600,
                                    autoplay: {
                                        delay: 5000
                                    },
                                    slidesPerView: 'auto',
                                    pagination: {
                                        el: '.swiper-pagination',
                                        type: 'bullets',
                                        clickable: true
                                    }
                                });
                            });
                        </script>


                        <div class="swiper-wrapper">

                            <c:forEach var="diabetic" items="${diabetics}">
                            <div class="swiper-slide">
                                <div class="testimonial-item">
                                    <div class="d-flex">
                                        <img src="${diabetic.picture}" class="testimonial-img flex-shrink-0" alt="">
                                        <div>
                                            <h3>${diabetic.name}</h3>
                                            <h4>${diabetic.type}</h4>
                                            <div class="stars">
                                                <i class="bi bi-star-fill"></i><i class="bi bi-star-fill"></i><i class="bi bi-star-fill"></i><i class="bi bi-star-fill"></i><i class="bi bi-star-fill"></i>
                                            </div>
                                        </div>
                                    </div>
                                    <p>
                                        <i class="bi bi-quote quote-icon-left"></i>
                                        <span>Being part of Blood Tracking has been life-changing for me. The personalized advice and comprehensive analytics have helped me gain better control of my diabetes. I highly recommend their services to anyone looking to improve their health and well-being</span>
                                        <i class="bi bi-quote quote-icon-right"></i>
                                    </p>
                                </div>
                            </div><!-- End testimonial item -->
                            </c:forEach>

                        </div>
                        <div class="swiper-pagination"></div>
                    </div>

                </div>

            </div>

        </div>

    </section><!-- /Testimonials Section -->


    <!-- Contact Section -->
    <section id="contact" class="contact section">

        <!-- Section Title -->
        <div class="container section-title" data-aos="fade-up">
            <h2>Contact</h2>
            <p>Feel free to reach out to us for any questions or additional information. We're here to assist you on your diabetes management journey.</p>
        </div><!-- End Section Title -->

        <div class="mb-5" data-aos="fade-up" data-aos-delay="200">
            <iframe style="border:0; width: 100%; height: 270px;" src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d48389.78314118045!2d-74.006138!3d40.710059!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c25a22a3bda30d%3A0xb89d1fe6bc499443!2sDowntown%20Conference%20Center!5e0!3m2!1sen!2sus!4v1676961268712!5m2!1sen!2sus" frameborder="0" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
        </div><!-- End Google Maps -->

        <div class="container" data-aos="fade-up" data-aos-delay="100">

            <div class="row gy-4">

                <div class="col-lg-4">
                    <div class="info-item d-flex" data-aos="fade-up" data-aos-delay="300">
                        <i class="bi bi-geo-alt flex-shrink-0"></i>
                        <div>
                            <h3>Location</h3>
                            <p>A108 Adam Street, New York, NY 535022</p>
                        </div>
                    </div><!-- End Info Item -->

                    <div class="info-item d-flex" data-aos="fade-up" data-aos-delay="400">
                        <i class="bi bi-telephone flex-shrink-0"></i>
                        <div>
                            <h3>Call Us</h3>
                            <p>+1 5589 55488 55</p>
                        </div>
                    </div><!-- End Info Item -->

                    <div class="info-item d-flex" data-aos="fade-up" data-aos-delay="500">
                        <i class="bi bi-envelope flex-shrink-0"></i>
                        <div>
                            <h3>Email Us</h3>
                            <p>contact@diabetes-tracker.com</p>
                        </div>
                    </div><!-- End Info Item -->

                </div>

                <div class="col-lg-8">
                    <form action="forms/contact.php" method="post" class="php-email-form" data-aos="fade-up" data-aos-delay="200">
                        <div class="row gy-4">

                            <div class="col-md-6">
                                <input type="text" name="name" class="form-control" placeholder="Your Name" required="">
                            </div>

                            <div class="col-md-6 ">
                                <input type="email" class="form-control" name="email" placeholder="Your Email" required="">
                            </div>

                            <div class="col-md-12">
                                <input type="text" class="form-control" name="subject" placeholder="Subject" required="">
                            </div>

                            <div class="col-md-12">
                                <textarea class="form-control" name="message" rows="6" placeholder="Message" required=""></textarea>
                            </div>

                            <div class="col-md-12 text-center">
                                <div class="loading">Loading</div>
                                <div class="error-message"></div>
                                <div class="sent-message">Your message has been sent. Thank you!</div>

                                <button type="submit">Send Message</button>
                            </div>

                        </div>
                    </form>
                </div><!-- End Contact Form -->

            </div>

        </div>

    </section><!-- /Contact Section -->

</main>

<footer id="footer" class="footer">

    <div class="container footer-top">
        <div class="row gy-4">
            <div class="col-lg-4 col-md-6 footer-about">
                <a href="index.html" class="logo d-flex align-items-center">
                    <img src="https://i.ibb.co/s2s8hnX/light.png" alt="">
                </a>
                <div class="footer-contact pt-3">
                    <p>A108 Adam Street</p>
                    <p>New York, NY 535022</p>
                    <p class="mt-3"><strong>Phone:</strong> <span>+1 5589 55488 55</span></p>
                    <p><strong>Email:</strong> <span>contact@diabetes-tracker.com</span></p>
                </div>
                <div class="social-links d-flex mt-4">
                    <a href=""><i class="bi bi-twitter-x"></i></a>
                    <a href=""><i class="bi bi-facebook"></i></a>
                    <a href=""><i class="bi bi-instagram"></i></a>
                    <a href=""><i class="bi bi-linkedin"></i></a>
                </div>
            </div>

            <div class="col-lg-2 col-md-3 footer-links">
                <h4>Links</h4>
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">About us</a></li>
                    <li><a href="#">Services</a></li>
                    <li><a href="#">Terms of service</a></li>
                    <li><a href="#">Privacy policy</a></li>
                </ul>
            </div>

            <div class="col-lg-2 col-md-3 footer-links">
                <h4>Our Services</h4>
                <ul>
                    <li><a href="#">Comprehensive Testing</a></li>
                    <li><a href="#">Detailed Analytics</a></li>
                    <li><a href="#">Medication Guidance</a></li>
                    <li><a href="#">Nutritional Counseling</a></li>
                    <li><a href="#">Insulin Dosing</a></li>
                </ul>
            </div>

            <div class="col-lg-2 col-md-3 footer-links">
                <h4>Measures</h4>
                <ul>
                    <li><a href="#">Glycemia Measurement</a></li>
                    <li><a href="#">HbA1c Measurement</a></li>
                    <li><a href="#">Blood Ketone Measurement</a></li>
                    <li><a href="#">Urinary Ketone Measurement</a></li>
                    <li><a href="#">Weight Measurement</a></li>
                </ul>
            </div>


        </div>
    </div>

    <div class="container copyright text-center mt-4">
        <p>© <span>Copyright</span> <strong class="px-1 sitename">Blood Tracking</strong> <span>All Rights Reserved</span></p>
    </div>

</footer>

<!-- Scroll Top -->
<a href="#" id="scroll-top" class="scroll-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

<!-- Preloader -->
<div id="preloader"></div>

<!-- Vendor JS Files from CDN -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/validate.js/0.13.1/validate.min.js"></script>
<!-- AOS JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/aos/3.0.0-beta.6/aos.js"></script>
<!-- Glightbox JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/glightbox/3.2.0/js/glightbox.min.js"></script><script src="https://cdn.jsdelivr.net/npm/@srexi/purecounterjs@1.1.5/dist/purecounter_vanilla.js"></script>
<script src="https://kit.fontawesome.com/6150be860f.js" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/9.2.1/swiper-bundle.min.js"></script>
<!-- Purecounter JS -->
<script src="https://cdn.jsdelivr.net/npm/purecounter@1.1.0/dist/purecounter.min.js"></script>

<!-- Main JS File -->
<script><%@include file="assets/js/main.js"%></script>

</body>

</html>
