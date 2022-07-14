pipeline {
    agent any
    stages {
        stage('Clone repo') {
            steps {
                echo 'clone repo'
            }
        }
        stage('Configuration') {
            steps {
                echo "STAGE: CONFIGURATION"
                script{
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
                echo "TASSK:  ${task}"      
                echo "INDEX: ${tenantIndex}"
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
                echo "- Run create-tenant.py"
                echo "${exec}"
            }
        }
        stage('deployment') {
            steps {
                echo "STAGE: DEPLOYMENT"
            }
        }
        stage('login tenant') {
            steps {
                echo "STAGE: LOGIN TENANT"
            }
        }       
    }
}

        