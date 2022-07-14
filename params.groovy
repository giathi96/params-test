tasks = [
    ["task_name": "All"],
    ["task_name": "Create New Tenant", "tenant_index": "","place_holder": "Input new TenantID"],
    ["task_name": "Deployment", "tenant_index": "","place_holder": "Input TenantID" ],
    ["task_name": "Skip Stage"],
]


html_to_be_rendered = "<table><tr>"
tasks.each { task ->
    if (task["task_name"] == "All" || task["task_name"] == "Skip Stage"){
            html_to_be_rendered = """
            ${html_to_be_rendered}
            <tr>
            <td>
            <input name=\"value\" alt=\"${task.task_name}\" json=\"${task.task_name}\" type=\"radio\" class=\" \">
            <label title=\"${task.task_name}\" class=\" \">${task.task_name}</label>
            </td>
            </tr>
            """
    } else{
        html_to_be_rendered = """
            ${html_to_be_rendered}
            <tr>
            <td>
            <input name=\"value\" alt=\"${task.task_name}\" json=\"${task.task_name}\" type=\"radio\" class=\" \">
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