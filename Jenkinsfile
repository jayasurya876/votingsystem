pipeline {
    agent any

    tools {
        maven 'Maven'
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
                echo 'Running Voting Eligibility System...'
                bat 'mvn exec:java'
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
