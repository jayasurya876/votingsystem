pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub...'
                git
 branch: 'main',
                    url:
 'https://github.com/kavin82007/voting-eligibility-system.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the Maven application...'
                bat
 'mvn clean install'
            }
        }
        stage('Run Application') {
            steps {
                echo 'Running Voting Eligibility System...'
                bat
            }
        }
    }
    post {
 'java -cp target\\voting-eligibility-system-1.0-SNAPSHOT.jar com.example.VotingEligibilitySystem'
        success {
            echo 'CI/CD Pipeline completed successfully!'
        }
        failure {
            echo 'CI/CD Pipeline failed.'
        }
    }
}
