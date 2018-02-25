pipeline {
    agent {
        docker {
            image 'openjdk:8-jdk-alpine'
            // image '192.168.50.186:5000/jenkins-slave:latest'
        }
    }
    agent any
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

        stage('docker build') {
	        agent 'vagrant'
                steps {
                        sh 'docker build -t 192.168.50.186:5000/calculator .'
                }
        }

    }
}
