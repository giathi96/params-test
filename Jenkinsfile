def getArr(){
    arr = "${features}"
    list = arr.split(',').collect{it as String}
    // for(i = 0; i < list.size(); i++){
    //     if (list[i] == ""){
    //         list.remove(i);
    //         i--;
    //     }
    // }
    return list
}

pipeline {
    agent any
    environment{
        ft = getArr()
    }
    stages {
        stage('Clone repo') {
            steps {
                echo 'clone repo'
            }
        }
        stage('Configuration') {
            steps {
                echo "Env in jenkinsfile: ${ft}"
                echo "Lab: ${Lab}"
                echo "Task: ${Task}"
                echo "Features: ${Features}"
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