pipeline{
    agent any
    triggers {
    pollSCM '* * * * *'
    }
    stages {
        stage ('build') {
            steps{
                sh 'chmod +x gradlew'
                sh './gradlew assemble'
            }
        }
        stage ('Test') {
            steps{
                sh 'chmod +x gradlew'
                sh './gradlew test'
            }
        }
         stage ('Build docker image') {
            steps{
                 sh 'chmod +x gradlew'
                 sh './gradlew docker'
                    }
                }
           stage ('Push docker image') {

           environment {
                DOCKER_HUB_LOGIN = credentials('docker-hub')
           }
              steps{
                  sh 'docker login --username=$DOCKER_HUB_LOGIN_USR --password=$DOCKER_HUB_LOGIN_PSW'
                  sh 'chmod +x gradlew'
                  sh './gradlew dockerPush'
               }
           }
    }
}