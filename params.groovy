Task = "all"
tasks_info = [
    "skip": ["placeholder":"Skip this field", "disabled":"disabled", "description":"Can't enter this field because task is Skip"],
    "all": ["placeholder":"Tenant index", "disabled":"", "description":"Specify the index of tenant you want to create"],
    "deploy": ["placeholder":"Tenant index", "disabled":"", "description":"Specify the index of an existing tenant you want to use"],
    "create": ["placeholder":"Tenant index", "disabled":"", "description":"Specify the index of tenant you want to create"],
]
task_infor = tasks_info[Task]
html ="""
<style>
.tenantindex{
    padding: 5px 5px;
  width: 500px;
    border-radius: 2px;
    display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
.task_des{
        padding: 5px 5px;
        display: inline-block;
        font-style: italic;
        font-weight: lighter;
        font-size: 80%;
    }
</style>
<div>
<table>
    <tr>
        <td><span class = "task_des">${task_infor.description}</span></td>
    </tr>
    <tr>
        <td><input name='value' value='' class='tenantindex' type='text' placeholder='${task_infor.placeholder}' ${task_infor.disabled}></td>
    </tr>
"""

if (Task == "all" || Task == "create"){
    html ="""
    ${html}
    <tr>
                         <td><span class="features_des">Specify features for tenant creation</span></td>
</tr>
<tr>
                         <td><input name='value' alt='voice' json='voice' type='checkbox' class='' value='voice'><label title='voice' class='' style="padding-left: 30px;">Chat</label></td> 
</tr>
<tr>
                <td><input name='value' alt='voice' json='voice' type='checkbox' class='' value='voice'><label title='voice' class='' style="padding-left: 30px;">Voice</label></td>
</tr>
<tr>
                   <td><input name='value' alt='voice' json='voice' type='checkbox' class='' value='voice'><label title='voice' class='' style="padding-left: 30px;">Email</label></td>
</tr>
<tr>
                <td><input name='value' alt='voice' json='voice' type='checkbox' class='' value='voice'><label title='voice' class='' style="padding-left: 30px;">Messaging</label></td>
</tr>
    """
}

html = """
${html}
</table>
</div>
"""
println(html)
return html


// task = Task
// lab = Lab
// id = TenantIndex
// command = "python3 --lab ${Lab} --task ${task} " 
// if(id != ""){
// command += "--tenantid " + id + " "
// }
// features = Features.split(',').collect{it as String}
// if(features.size() > 1){
// command += "--features "
// for(i = 0; i < features.size(); i += 2){
// features[i].replaceAll("\\s","")
// command += features[i] + " "
// }
// }
// return "<input name='value' value='${command}' class='setting-input' type='text'>"
