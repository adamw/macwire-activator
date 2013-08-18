$(function() {
    $("#addGreeting").click(function(event) {
        $("#greetingAdded").hide();
        var greeting = $("#greetingText").val();
        jsRoutes.controllers.AddGreetingController.addGreeting(greeting).ajax({
            success: function(data) {
                $("#greetingAdded").show();
            }
        });

        return false;
    })
})