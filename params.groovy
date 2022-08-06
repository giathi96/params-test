branchs = [
    ["branch_name": "Master", "value": "master" ],
    ["branch_name": "Dev", "value": "dev" ],
]

html ="""
<div>
   <table>
            <tr>
                <td>
                    <span class="params_des">Select the lab you want to run the script.</span>
                </td>
            </tr>
            <tr>
                <td>
                    <select name='value' class='params_select'>
                        
"""
branchs.each { branch ->
html = """${html}
<option value='${branch.value}'>${branch.branch_name}</option>
"""
}
html = """${html}
                   </select>
                </td>
            </tr>
        </table>
</div>
"""
return html