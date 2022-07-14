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
                anyOf {
                    anyOf {
                        environment name: 'task', value: 'skip'
                        environment name: 'task', value: 'deploy'
                    }
                }
            }
            steps {
                echo "Khac skip va deploy"
            }
        }  
        stage('deployment') {
            steps {
                echo 'Done!!'
            }
        }
        stage('login tenant') {
            steps {
                echo 'test perf with params'
                echo 'Done!!'
            }
        }
    }
}