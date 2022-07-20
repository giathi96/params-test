tasks_info = [
    "skip": ["placeholder":"Skip this field", "disabled":"disabled", "description":"Can't enter this field because task is Skip"],
    "all": ["placeholder":"Tenant index", "disabled":"", "description":"Specify the index of tenant you want to create"],
    "deploy": ["placeholder":"Tenant index", "disabled":"", "description":"Specify the index of an existing tenant you want to use"],
    "create": ["placeholder":"Tenant index", "disabled":"", "description":"Specify the index of tenant you want to create"],
]
Task = "all"
task_infor = tasks_info[Task]
html ="""
<style>
time, mark, audio, video {
  margin: 0;
  padding: 0;
  border: 0;
  font-size: 100%;
  font: inherit;
  vertical-align: baseline; }

article, aside, details, figcaption, figure,
footer, header, hgroup, menu, nav, section {
  display: block; }

body {
  line-height: 1; }

ol, ul {
  list-style: none; }

blockquote, q {
  quotes: none; }

blockquote:before, blockquote:after,
q:before, q:after {
  content: '';
  content: none; }

table {
  border-collapse: collapse;
  border-spacing: 0; }

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
</table>
</div>
"""
println(html)
return html