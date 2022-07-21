Task = "skip"
if (Task != "skip") {
html ="""
<div>
<table>
<tr>
                         <td><span class="features_des">Select features for tenant</span></td>
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
</table>
</div>
"""
} else {
html = """<div>
<table>
<tr>
                  <td><span class="features_des">Select features for tenant</span></td>
</tr>
</table>
</div>"""
}
println(html)
return html