<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="_csrf" content="${_csrf.token}"/>
    <meta name="_csrf_header" content="${_csrf.headerName}"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
        $(function () {
            var token = $("meta[name='_csrf']").attr("content");
            var header = $("meta[name='_csrf_header']").attr("content");
            $(document).ajaxSend(function (e, xhr, options) {
                xhr.setRequestHeader(header, token);
            });
        });
    </script>
</head>
<body>

<h1>page</h1>
<input type="" name="email" placeholder="email">
<button id="add">add</button>
<button id="get">get</button>
<div class="wrap">

</div>
<script>
    $("#add").click(function () {
        let email = $("[name=email]").val();
        // $.ajax({
        //     url: '/saveUser',
        //     type: 'post',
        //     headers: {
        //         'Accept': 'application/json',
        //         'Content-Type': 'application/json'
        //     },
        //     data: JSON.stringify({email}),
        //     success: function () {
        //         console.log("ok")
        //
        //     },
        //     error: function (err) {
        //         console.log(err);
        //
        //     }
        // })
        $.ajax({
            url: "/saveUser/" + email,
            type: 'put',
            success: function () {
                console.log("ok")
            },
            error: function (err) {
                console.log(err);
            }
        })
    });
    $("#get").click(function () {
        $(".wrap").empty();
        $.ajax({
            url: "/giveUsers",
            type: "get",
            contentType: "application/json",
            success: function (res) {
                console.log(res);
                for (let obj of res) {
                    var $div = $("<div/>",
                        {text: obj.id + " " + obj.email}
                    );
                    $(".wrap").append($div);
                }
            },
            error: function (err) {
                console.log(err);
            }
        })
    })
</script>

</body>
</html>