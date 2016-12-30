<%--
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : sunil
--%>
<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%@attribute name="id"%>
<%@attribute name="mainId"%>
<%@attribute name="imageType"%>
<%@attribute name="styleClass"%>
<%@attribute name="hideField" type="java.lang.Boolean"%>
<script>
    function set${id}(v){
        if(v){
            var comment = $('#comment').val();
            $("#${id}").val(comment)
        }
        if("${hideField}"){
            customFieldsHide("${mainId}","${id}");
        }
    }
    function get${id}(){
        return $('#${id}').val();    
    }

    function ${id}Text(){
        return 'Edit Text \n\<br/> \n\<textarea rows="8" cols="90" id="comment" name="comment"  style="cursor:default">'+get${id}()+"</textarea>";    
    }
    function ${id}CommentText(){
        return 'Add/Edit Comment \n\<br/> \n\<textarea rows="6" cols="60" placeholder="Add a comment..." id="comment" name="comment"  style="cursor:default">'+get${id}()+"</textarea>";
    }
    function customFieldsHide(mainField,customField){
        if($("#"+mainField).val() == ''){
            $("#"+customField).val('');
        }else if($("#"+mainField).val()==$("#"+customField).val()){
            $("#"+customField+"_H").hide();
        }else{
            $("#"+customField+"_H").show();
        }
    }

</script>
<c:choose>
    <c:when test="${imageType == 'comment'}">
        <img onclick="Prompt(${id}CommentText(),set${id},{width:'400px',persistent: false, buttons: {Ok:true}})" title="View/Edit Comment" src="${path}/images/common/comment-edit.png" style="cursor: pointer" class="${styleClass}"/>
    </c:when>
    <c:otherwise>
        <img onclick="Prompt(${id}Text(),set${id},{width:'600px',buttons: {Ok:true,Cancel:false}})" title="Edit" src="${path}/images/common/edit.png" style="cursor: pointer" class="${styleClass}"/>
    </c:otherwise>
</c:choose>

