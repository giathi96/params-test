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
                        if (taskArr.size() == 2){
                            tenantIndex = taskArr[1];
                        }
                        
                }
                echo "Features: ${features}"
                echo "Task: ${task}"
                echo "Index: ${tenantIndex}"
            }
        }
        stage('Speak') {
            when {
                expression { "${Lab}" != 'perf-2' }
            }
            steps {
                echo "Do something"
            }
        }  
        stage('build binary') {
            steps {
                echo 'Done!!'
            }
        }
        stage('test perf with params') {
            steps {
                echo 'test perf with params'
                echo 'Done!!'
            }
        }
    }
}