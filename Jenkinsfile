pipeline{
    agent any 
 
    stages{
        stage('Build Maven'){
            steps{
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Maheshkmule/docker-automation.git']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t maheshmule/docker-automation .'
                }
            }
        }
    }
}
