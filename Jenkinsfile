pipeline {
    agent any
    stages {
        stage('Configuration') {
            steps {
                echo "STAGE: CONFIGURATION"
                echo "- Copy file to linux server: compress folder, put to server, extract"
                echo "- Get config file"
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
                } 
                echo "- task:  ${task}, run on lab perf-${lab}"  
            }
        }
        stage('Create new tenant') {
            when {
                expression{"${task}" == "all" || "${task}" == "create"}
            }
            steps {
                echo "STAGE: CREATE NEW TENANT"
                script{
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
                echo "- Run create-tenant.py (if task is  'all' or 'create', run this stage)"
                echo "- command: ${exec}"
            }
        }
        stage('deployment') {
            when {
                expression{"${task}" == "all" || "${task}" == "deploy"}
            }
            steps {
                echo "STAGE: DEPLOYMENT"
                echo "- Run ccaas-deployment.py (if task is  'all' or 'deployment', run this stage)"
                echo "- command: python ccaas-deployment.py"
            }
        }
        stage('login tenant') {
            steps {
                echo "STAGE: LOGIN AGENT"
            }
        }       
    }
}

        