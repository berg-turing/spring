<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>

<html>
<head>
    <title>Spittr</title>
</head>

<body>
    <h1 style="color: forestgreen;">Recent Spittles</h1>

    <ul>
        <c:forEach items="${spittles}" var="spittle">
            <li>
                <div class="spittleMessage">
                    <c:out value="${spittle.message}"/>
                </div>

                <div>
                    <span class="spittleTime"><c:out value="${spittle.time}"/></span>
                    <span class="spittleLocation">
                        ( <c:out value="${spittle.latitude}"/>,
                            <c:out value="${spittle.longitude}"/> )
                    </span>
                </div>
            </li>
        </c:forEach>
    </ul>
</body>

</html>