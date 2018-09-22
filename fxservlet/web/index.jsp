<%--
  Created by IntelliJ IDEA.
  User: lrrnn
  Date: 2018/8/26
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>HELLO WORLD!!</h1>
  <form name="bmiForm" action="bmi" method="post">
    <table>
      <tr>
        <td>Your Weight:</td>
        <td><input type="text" name="weight" placeholder="Type Kilogram"></td>
      </tr>
      <tr>
        <td>Your Height:</td>
        <td><input type="text" name="height" placeholder="Type MI"/>M</td>
      </tr>
      <tr>
        <td>
          <input type="submit" value="Submit" name="find">
        </td>
        <td>
          <input type="reset" value="Reset" name="reset">
        </td>
      </tr>
    </table>
    <h2>${bmiResult}</h2>
  </form>
  </body>
</html>
