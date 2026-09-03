pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {

        stage('Build') {
            steps {
                echo 'Building Maven application...'
                bat 'mvn clean package'
            }
        }

        stage('Run Application') {
            steps {
                bat 'mvn exec:java -Dexec.mainClass=com.example.VotingEligibilitySystem'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }

        failure {
            echo 'Build failed!'
        }
    }
}
