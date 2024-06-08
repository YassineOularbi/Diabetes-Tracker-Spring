<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03/06/2024
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Get Week Range</title>
</head>
<body>
<h1>Select a date to get the week range</h1>
<input type="week" id="datePicker">
<button onclick="getWeekRange()">Get Week Range</button>
<p id="weekRange"></p>

<script>
    function getWeekRange() {
        const dateInput = document.getElementById('datePicker').value;
        if (dateInput) {
            const [year, week] = dateInput.split('-W');
            const date = new Date(year, 0, (week - 1) * 7 + 1);
            const { startDate, endDate } = calculateWeekRange(date);
            document.getElementById('weekRange').innerText = "Week Range: " + startDate.toISOString().split('T')[0] + " to " + endDate.toISOString().split('T')[0];

            console.log(startDate.toISOString().split('T')[0]);
            console.log(endDate.toISOString().split('T')[0]);
        } else {
            document.getElementById('weekRange').innerText = 'Please select a date.';
        }
    }

    function calculateWeekRange(date) {
        const day = date.getDay(); // Get the day of the week (0-6)
        const diffToMonday = (day === 0 ? -6 : 1) - day; // Calculate the difference to Monday
        const startDate = new Date(date);
        startDate.setDate(date.getDate() + diffToMonday); // Set the start date to Monday
        const endDate = new Date(startDate);
        endDate.setDate(startDate.getDate() + 6); // Set the end date to Sunday

        return { startDate, endDate };
    }
</script>
</body>
</html>

