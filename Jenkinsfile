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
                echo "Lab: ${Task}"
                echo "Lab: ${Features}"
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