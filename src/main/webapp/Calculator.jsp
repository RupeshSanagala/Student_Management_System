<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
<form method="post" action="">
    A: <input type="text" name="num1">
    <select name="operation">
        <option value="add">Add</option>
        <option value="sub">Sub</option>
        <option value="mul">Mul</option>
        <option value="div">Div</option>
    </select>
    B: <input type="text" name="num2">
    <input type="submit" value="Calculate">
</form>

<%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        // Get the form parameters
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");

        // Convert the string parameters to doubles
        double num1 = Double.parseDouble(num1Str.trim());
        double num2 = Double.parseDouble(num2Str.trim());
        double result = 0.0;

        // Perform the selected operation
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    out.println("<p>Division by zero is not allowed.</p>");
                }
                break;
            default:
                out.println("<p>Invalid operation selected.</p>");
                break;
        }

        // Display the result
        out.println("<p>Result: " + result + "</p>");
    }
%>

</body>
</html>



