pipeline {
    agent any
    environment{
        features = []
    }
    stages {
        stage('Clone repo') {
            steps {
                echo 'clone repo'
            }
        }
        stage('Configuration') {
            steps {
                echo "Env in jenkinsfile: ${features}"
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