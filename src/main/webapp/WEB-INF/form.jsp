<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
    <form action="form.form" method="post">
        <input type="text" name="greeting" value="Hello">
        <select size="1" name="lang">
            <option value="en">English</option>
            <option value="sk">Slovak</option>
            <option value="hu">Hungarian</option>
        </select>
        <input type="submit" value="Submit">
    </form>
</body>
</html>