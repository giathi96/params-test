tasks = [
    ["task_name": "All", "value":"all"],
    ["task_name": "Create New Tenant", "tenant_index": "","place_holder": "New TenantID", "value":"create"],
    ["task_name": "Deployment", "tenant_index": "","place_holder": "TenantID", "value":"deploy" ],
    ["task_name": "Skip Stage", "value":"skip"],
]


html_to_be_rendered = "<table><tr>"
tasks.each { task ->
    if (task["task_name"] == "All" || task["task_name"] == "Skip Stage"){
            html_to_be_rendered = """
            ${html_to_be_rendered}
            <tr>
            <td>
            <input name=\"value\" alt=\"${task.task_name}\" json=\"${task.task_name}\" type=\"radio\" class=\" \" value=\"${task.value}\">
            <label title=\"${task.task_name}\" class=\" \">${task.task_name}</label>
            </td>
            </tr>
            """
    } else{
        html_to_be_rendered = """
            ${html_to_be_rendered}
            <tr>
            <td>
            <input name=\"value\" alt=\"${task.task_name}\" json=\"${task.task_name}\" type=\"radio\" class=\" \" value=\"${task.value}\">
            <label title=\"${task.task_name}\" class=\" \">${task.task_name}</label>
            </td>
            <td>
            <input type=\"text\" class=\" \" name=\"value\" value=\"${task.tenant_index}\" placeholder=\"${task.place_holder}\" > </br>
            </td>
            </tr>
        """
    }
  
}

html_to_be_rendered = "${html_to_be_rendered}</tr></table>"
return html_to_be_rendered


tasks = [
    ["task_name": "All"],
    ["task_name": "Create New Tenant", "tenant_index": "","place_holder": "New TenantID"],
    ["task_name": "Deployment", "tenant_index": "","place_holder": "TenantID" ],
    ["task_name": "Skip Stage"],
]


html_to_be_rendered = ""
if (Task2 == "All") {
    html_to_be_rendered = """<input type=\"text\" class=\" \" name=\"value\" value=\"\" placeholder=\"traffic rate\" title=\"Traffic Rate [0,15000]\"> """
}

return html_to_be_rendered



tasks = [
    ["task_name": "All"],
    ["task_name": "Create New Tenant", "tenant_index": "","place_holder": "New TenantID"],
    ["task_name": "Deployment", "tenant_index": "","place_holder": "TenantID" ],
    ["task_name": "Skip Stage"],
]

<select name="task3" id="task3">
    <option value="">--Please choose an option--</option>
    <option value="dog">Dog</option>
    <option value="cat">Cat</option>
</select>

html_to_be_rendered = "<select name="task3" id="task3">"

tasks.each { task ->
            html_to_be_rendered = """
            ${html_to_be_rendered}
            <tr>
            <td>
            <input name=\"value\" alt=\"${task.task_name}\" json=\"${task.task_name}\" type=\"radio\" class=\" \" value=\"${task.value}\">
            <label title=\"${task.task_name}\" class=\" \">${task.task_name}</label>
            </td>
            </tr>
            """
  
}

html_to_be_rendered = "${html_to_be_rendered}</select>"
return html_to_be_rendered