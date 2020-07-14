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
    }
}