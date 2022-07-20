features =[
     ["channel_name": "Chat", "traffic_rate": "" ,"placeholder":"Traffic rate for Chat", "value":"chat"],
    ["channel_name": "Email", "traffic_rate": "" ,"placeholder":"Traffic rate for Email","value":"email"],
    ["channel_name": "Voice", "traffic_rate": "" ,"placeholder":"Traffic rate for Voice","value":"voice"],
    ["channel_name": "Messaging", "traffic_rate":"" ,"placeholder":"Traffic rate for Messaging","value":"messaging"],
]
   

html_to_be_rendered = """
<style>
    table {
        border-collapse: collapse;
        border-spacing: 0;
        width: 500px
    }
    .traffic-text {
        width: 390px;
        margin: auto;
    }

    .checkbox {
        width: 100px;
        border-radius: 4px;
        margin: auto;
    }
    .row {
        width: 100%;
        margin-top: 10px;
    }
    .text {
        padding: 5px;
        border: 0px;
        width: 100%;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    .features_des{
        padding: 5px 5px;
        display: inline-block;
        font-style: italic;
        font-weight: lighter;
        font-size: 80%;
    }
</style>
<table>
<tr class="row">
        <span class="features_des">Select features and traffic rate</span>
</tr>
"""
features.each { feature ->
  html_to_be_rendered = """
    ${html_to_be_rendered}
    <tr class="row">
    <td class="checkbox">
    <input name='value' alt='${feature.value}' json='${feature.value}' type='checkbox' class='' value='${feature.value}'>
    <label title='${feature.channel_name}' class=''>${feature.channel_name}</label>
    </td>
    <td class='traffic-text'>
    <input type='text' class='text' name='value' value='' placeholder='${feature.placeholder}'> </br>
    </td>
    </tr>
"""
}


html_to_be_rendered = "${html_to_be_rendered}</table>"

println(html_to_be_rendered)
return html_to_be_rendered