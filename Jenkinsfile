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
                }
                echo "Features: ${features}"
                echo "Env in jenkinsfile: ${features}"
                echo "Env[1] in jenkinsfile: ${features[1]}"
                echo "Lab: ${Lab}"  
                echo "Task: ${Task}"
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