pipeline {
    // parameters{
    //     string(name: 'task', defaultValue: 'none', description: 'skip the configuration')
    // }
    agent any 
    stages {
        stage('clone repo') {
            checkout csm
        }
        stage('check fmt') {
            steps {
                echo 'Check fmt'
                sh 'python3 --version'
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
                echo "Email ${params.Voice}"
                echo "Email ${Email}"
                echo 'Done!!'
            }
        }
    }
}