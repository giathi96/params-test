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
                    arr = "${features}"
                        list = arr.split(',').collect{it as String}
                        for(i = 0; i < list.size(); i++){
                            if (list[i] == ""){
                                list.remove(i);
                                i--;
                            }
                        }
                }
                echo "Features: ${Features}"
                echo "Env in jenkinsfile: ${list}"
                echo "Env[1] in jenkinsfile: ${list[1]}"
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