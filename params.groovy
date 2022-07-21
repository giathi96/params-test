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

    .row {
        width: 100%;
        margin-top: 10px;
    }
    .traffic-des{
        width: 100px;
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
        <span class="features_des">Specify traffic rate for each feature</span>
</tr>
"""
features.each { feature ->
  html_to_be_rendered = """
    ${html_to_be_rendered}
    <tr class="row">
    <td class='traffic-des'>
            <span>${feature.channel_name} traffic</span>
        </td>
    <td class='traffic-text'>
        <input type='text' class='text' name='value' value='0' placeholder='${feature.placeholder}'> </br>
    </td>
    </tr>
"""
}


html_to_be_rendered = "${html_to_be_rendered}</table>"

println(html_to_be_rendered)
return html_to_be_rendered


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