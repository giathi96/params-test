lab = "${params.Lab}"
task = Task.replaceAll("\\s","")
lab = Lab.replaceAll("\\s","")
command = "python app.py --lab ${lab} --task ${task}"

features = "${Features}".split(',').collect{it as String}
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
return "<input name='value' value='${value}' class='setting-input' type='text'>"