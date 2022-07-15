/*
    def remote = [:]
    remote.name = 'sil-toolserver-1'
    remote.host = '10.134.134.10'
    remote.user = 'cust'
    remote.password = 'AvayaSIL123$'
    remote.allowAnyHosts = true
*/

pipeline {
    agent any
    stages {
        stage('Copy file to Linux Build Server') {
            steps {
                echo "STAGE: Copy file to Linux Build Server"
                //sshCommand remote: remote, command: 'cd; [ -d ./Jenkins ] && rm -f ./Jenkins/* || mkdir ./Jenkins; chmod 777 ./Jenkins'
                echo "- Compress project folder"
                //sh 'cd $WORKSPACE; tar -zcf archive.tar ./Python/ ./Config/'
                echo "- Put to Build Server"
                //sshPut remote: remote, from: "$WORKSPACE/archive.tar", into: "./Jenkins/"
                echo "- Extract in Build Server"
                // sshCommand remote: remote, command: 'cd ./Jenkins; tar -xf ./archive.tar'
                // sshCommand remote: remote, command: "ls -lrt ./Jenkins/" 
            }
        }
        stage('Placing files') {
            steps {
                echo 'STAGE: Placing files in Working Folder...'
                // sshCommand remote: remote, command: 'rm -Rf ./pythonAdmin/*'
                // sshCommand remote: remote, command: 'cp -R ./Jenkins/Python/* ./pythonAdmin'
                // sshCommand remote: remote, command: 'cp ./Jenkins/Config/PythonConfig/Labs/perf-5/ccaas-system-config.json ./pythonAdmin'
                // sshCommand remote: remote, command: 'chmod 755 ./pythonAdmin/tools/chromedriver'
            }
        }
        stage('Configuration') {
            steps {
                echo "STAGE: CONFIGURATION"
                script{
                        lab = "${params.Lab}"
                        taskArr = "${params.Task}".split(',').collect{it as String}
                        for(i = 0; i < taskArr.size(); i++){
                            taskArr[i].replaceAll("\\s","")
                            if (taskArr[i] == ""){
                                taskArr.remove(i);
                                i--;
                            }
                        }
                        exec = "python app.py --lab ${lab} "

                        task = taskArr[0];
                        exec = exec + "--task " + "${task}"
                        tenantIndex = "";
                        if (taskArr.size() == 2){
                            tenantIndex = taskArr[1];
                            exec = exec + " --index " + "${tenantIndex} "
                        }

                        features = "${params.Features}".split(',').collect{it as String}
                        for(i = 0; i < features.size(); i++){
                            features[i].replaceAll("\\s","")
                            if (features[i] == ""){
                                features.remove(i);
                                    i--;
                            }
                        } 
                        if (features.size() != 0) {
                            exec += "--features "
                            for (i = 0; i < features.size(); i +=2){
                                exec = exec + features[i] + " "
                            } 
                        }    
                } 
                echo "- PARAMS: task = ${task} TenantIndex =  ${tenantIndex} Features =  ${features}"
                echo "- Run command: ${exec}"
            }
        }
        stage('Login Agent') {
            steps {
                echo "STAGE: LOGIN AGENT"
            }
        }
        stage('Other stages') {
            steps {
                echo "STAGE: ...."
            }
        }        
    }
}

        