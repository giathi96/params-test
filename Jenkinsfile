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
                        features = "${params.Features}".split(',').collect{it as String}
                        for(i = 0; i < features.size(); i++){
                            features[i].replaceAll("\\s","")
                            if (features[i] == ""){
                                features.remove(i);
                                i--;
                            }
                        }
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
                echo "LAB: ${lab}"
                echo"FEATURES: ${features}"
                echo "TASK: ${task}"
                echo  "INDEX: ${tenantIndex}"
            }           
        }
        stage('Create new tenant') {
            when {
                    environment name: 'task', value: 'all'
                    // environment name: 'task', value: 'create'
            }
            steps {
                echo "STAGE: CREATE NEW TENANT"
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