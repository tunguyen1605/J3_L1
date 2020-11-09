
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="myStyle.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="https://code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
        <script type="text/javascript">
            function ValidatePetSelection()
            {
                var checkboxes = document.getElementsByName("correct");
                var numberOfCheckedItems = 0;
                for (var i = 0; i < checkboxes.length; i++)
                {
                    if (checkboxes[i].checked)
                        numberOfCheckedItems++;
                }
                if (numberOfCheckedItems > 1)
                {
                    alert("You can't select more than one option!");
                    return false;
                }
            }
        </script>
        <script type="text/javascript">
            jQuery(function ($) {
                var requiredCheckboxes = $(':checkbox[required]');
                requiredCheckboxes.on('change', function (e) {
                    var checkboxGroup = requiredCheckboxes.filter('[name="' + $(this).attr('name') + '"]');
                    var isChecked = checkboxGroup.is(':checked');
                    checkboxGroup.prop('required', !isChecked);
                });
                requiredCheckboxes.trigger('change');
            });
        </script>
        <%
            if (session.getAttribute("user") != null) {

            } else {
                response.sendRedirect("login.jsp");
            }
        %>
        <title>Manager Question</title>
    </head>
    <body>
        <div class="container">
            <%@include file="header.jsp" %>
            <div class="content">
                <form action="ManagerQuestionServlet">
                    <div class="table">
                        <div class="table-row">
                            <div class="table-cell cell-manager">
                                <p>Question:</p>
                            </div>
                            <div class="table-cell">
                                <textarea  class="md-textarea form-control" name="question" cols="60" rows="7" placeholder="Please Enter Your Question" required="required"></textarea>
                            </div>
                        </div>
                        <div >

                            <div class="table-cell cell-manager">
                                <p>Option1: </p>
                            </div>
                            <div class="table-cell">
                                <textarea  class="md-textarea form-control" rows="3" name="option1" cols="60" rows="3" placeholder="Answer" required="required"></textarea>
                            </div>
                        </div>



                        <div class="table-row">
                            <div class="table-cell cell-manager">
                                <p>Option2: </p>
                            </div>
                            <div class="table-cell">
                                <textarea  class="md-textarea form-control" name="option2" cols="60" rows="3" placeholder="Answer" required="required"></textarea>
                            </div>
                        </div>
                        <div class="table-row">
                            <div class="table-cell cell-manager">
                                <p>Option3: </p>
                            </div>
                            <div class="table-cell">
                                <textarea class="md-textarea form-control" name="option3" cols="60" rows="3" placeholder="Answer" required="required"></textarea>
                            </div>
                        </div>
                        <div class="table-row">
                            <div class="table-cell cell-manager">
                                <p>Option4: </p>
                            </div>
                            <div class="table-cell">
                                <textarea class="md-textarea form-control" name="option4" class="question" cols="60" rows="3" placeholder="Answer" required="required"></textarea>
                            </div>
                        </div>
                        <div class="table-row">
                            <div class="table-cell cell-manager">
                                <p>Answers(s): </p>
                            </div>

                            <div class="table-row">
                                <label class="btn btn-success ">
                                    <input  autocomplete="off" type="radio" name="correct"  value="1"required="required">Option1
                                </label>

                                <label class="btn btn-success ">
                                    <input   autocomplete="off" type="radio" name="correct"  value="2" required="required">Option2
                                </label>
                                <label class="btn btn-success ">
                                    <input   autocomplete="off"type="radio" name="correct"  value="3" required="required">Option3
                                </label>
                                <label  class="btn btn-success ">
                                    <input  autocomplete="off" type="radio" name="correct"  value="4" required="required">Option4
                                </label>       
                            </div>
                            <div class="table-row md">
                                <div class="table-cell cell-manager">
                                </div>
                                <div class="table-cell">
                                    <input class="btn btn-success"type="submit" value="save">
                                </div>
                            </div>
                        </div>
                </form>
            </div>
        </div>
    </body>
</html>
