// connect to Linux Build Server using SSH

pipeline {
    agent any
    stages {
        stage('Copy file to Linux Build Server') {
            steps {
                echo "STAGE: Copy file to Linux Build Server"
                echo "- Compress project folder"
                echo "- Put to Build Server"
                echo "- Extract in Build Server"
            }
        }
        stage('Configuration') {
            steps {
                echo "STAGE: CONFIGURATION"
                script{
                        lab = "${params.Lab}"
                        taskArr = "${params.Task}".split(',').collect{it as String}
                        for(i = 0; i < taskArr.size(); i++){
                            taskArr[i].replaceAll("\\s","")
                            if (taskArr[i] == ""){
                                taskArr.remove(i);
                                i--;
                            }
                        }
                        task = taskArr[0];
                        tenantIndex = "";
                        if (taskArr.size() == 2){
                            tenantIndex = taskArr[1];
                        }

                        features = "${params.Features}".split(',').collect{it as String}
                        for(i = 0; i < features.size(); i++){
                            features[i].replaceAll("\\s","")
                            if (features[i] == ""){
                                features.remove(i);
                                    i--;
                            }
                        }
                    exec = "python create-tenant.py --lab ${lab} " 
                    if (features.size() != 0) {
                        exec += "--features "
                        for (i = 0; i < features.size(); i +=2){
                            exec = exec + features[i] + " "
                        } 
                    }    
                } 
                echo "- task:  ${task}, run on lab perf-${lab}"
                echo "- Run create-tenant.py (if task is  'all' or 'create', run this stage)"
                echo "- command: ${exec}"
            }
        }
        stage('Login Agent') {
            steps {
                echo "STAGE: LOGIN AGENT"
            }
        }       
    }
}

        