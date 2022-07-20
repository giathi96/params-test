Features = "Chat,12,Email,12,,,"
Task = "all"
Lab = "2"
task = Task
lab = Lab 
command = "python3 app.py --lab ${lab} --task ${task}"
features = Features.split(',').collect{it as String}
println("Features: " + features)
for(i = 0; i < features.size(); i++){
    features[i].replaceAll("\\s","")
    if (features[i] == ""){
        features.remove(i);
        i--;
     }
}
if (features.size() != 0) {
    command += " --features "
    for (i = 0; i < features.size(); i +=2){
        command = command + features[i] + " "
    } 
}  
println("Command" + command)
return "<input name='value' value='${command}' class='setting-input' type='text'>"