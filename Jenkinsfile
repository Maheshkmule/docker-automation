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
         stage('Push image to Hub'){
            steps{
                script{
                   
                   bat 'docker login -u maheshmule -p Haridas#9637'

                   bat 'docker push maheshmule/docker-automation '
                }
            }
        }
         stage('Deploy to k8s'){
            steps{
                script{
                    kubernetesDeploy (configs: 'deploymentservice.yaml',kubeconfigId: 'k8sconfigpwd')
                }
            }
        }
    }
}
   

