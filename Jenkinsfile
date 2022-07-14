pipeline {
    // parameters{
    //     string(name: 'task', defaultValue: 'none', description: 'skip the configuration')
    // }
    agent any 
    stages {
        stage('clone repo') {
            steps {
                echo "Workspace: ${WORKSPACE}"
                echo 'clone repo'
                echo "PATH is: ${env.Path}" 
            }
        }
        stage('check fmt') {
            steps {
                echo 'Check fmt'
                sh 'go version'
                sh 'go fmt'
            }
        }
        stage('build binary') {
            steps {
                echo 'hello ${Voice}'
                echo 'Done!!'
            }
        }
        stage('test perf with params') {
            steps {
                echo 'test perf with params'
                echo "Email ${params.Voice}"
                echo "Email ${Email}"
                echo 'Done!!'
            }
        }
    }
}