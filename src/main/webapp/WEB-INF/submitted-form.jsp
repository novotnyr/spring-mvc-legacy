<%--@elvariable id="greeting" type="com.github.novotnyr.spring.FormController.Greeting"--%>
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<body>
    <p>
        You said: ${greeting.greeting} (language: ${greeting.lang})
    </p>
    <p>
        Hello to you, too!
    </p>
</body>
</html>