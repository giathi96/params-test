pipeline {
    // parameters{
    //     string(name: 'task', defaultValue: 'none', description: 'skip the configuration')
    // }
    agent any 
    stages {
        stage('Clone repo') {
            steps {
                echo 'clone repo'
            }
        }
        stage('Configuration') {
            steps {
                echo "Lab: ${Lab}"
                echo "Task: ${Task}"
                echo "Features: ${Features}"
                echo "Task2: ${Task2}"
                echo "Detail: ${task_detail}"
            }
        }
        stage('Speak') {
            when {
                expression { "${Lab}" != 'All' }
            }
            steps {
                echo "Hello, bitwiseman!"
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