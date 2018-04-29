<%--
  Created by IntelliJ IDEA.
  User: tinca
  Date: 4/27/2018
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
    <style type="text/css">
      
    </style>
  </head>
  <body>
  <form method="get" action="/bb">
    <div class="convert">
      <h1>Currency Converter</h1>
      <label>Rate: </label><br>
      <input type="text" name="Rate" size="30" placeholder="Rate"><br>
      <label>USA: </label><br>
      <input type="text" name="USA" size="30" placeholder="USA">
      <input type="submit" value="Converter">
    </div>
  </form>
  </body>
</html>

