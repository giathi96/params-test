html ="""
<style>
html,
    body,
    div,
    span {
        margin: 0;
        padding: 0;
        border: 0;
        font-size: 100%;
        vertical-align: baseline;
    }

    article,
    aside,
    details,
    figcaption,
    figure,
    footer,
    header,
    hgroup,
    menu,
    nav,
    section {
        display: block;
    }

    body {
        line-height: 1.5;
    }

    ol,
    ul {
        list-style: none;
    }

    blockquote,
    q {
        quotes: none;
    }

    blockquote:before,
    blockquote:after,
    q:before,
    q:after {
        content: '';
        content: none;
    }

    table {
        border-collapse: collapse;
        border-spacing: 0;
        width: 500px;
    }

    .task-select {
        padding: 5px 5px;
        width: 500px;
        border: 1px solid #ccc;
        border-radius: 4px;
        resize: vertical;
    }

    .task_des {
        padding: 5px 5px;
        display: inline-block;
        font-style: italic;
        font-weight: lighter;
        font-size: 80%;
    }

    .features_des {
        padding: 5px 5px;
        display: inline-block;
        font-style: italic;
        font-weight: lighter;
        font-size: 80%;
    }

    .row {
        width: 100%;
        margin-top: 10px;
    }
    .style{
        font: inherit;
    }
</style>
<div>
   <table>
            <tr>
                <td>
                    <span class="task_des">Choose the task you want to do</span>
                </td>
            </tr>
            <tr>
                <td>
                    <select name='value' class='task-select'>
                        <option value="skip" >Skip stage</option>
                        <option value="all" >All</option>
                          <option value="create" >Create Tenant</option>
                          <option value="deploy">Deployment</option>
                     </select>
                </td>
            </tr>
            <tr >
            <td><br><span class="features_des">Select features for tenant</span><br></td>
            </tr>
            <tr>
            <td><input name='value' alt='voice' json='voice' type='checkbox' class='' value='voice'><label title='voice'
                class='' style="padding-left: 30px;">Messaging</label></td>
        </tr>
        </table>
</div>
"""
println(html)
return html