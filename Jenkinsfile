pipeline {
    agent {
        docker {
            image 'openjdk:8-jdk-alpine'
            // image '192.168.50.186:5000/jenkins-slave:latest'
        }
    }
    stages {
        stage('build') {
            steps {
                sh './gradlew compileJava'
            }
        }
        
        stage('unit test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}