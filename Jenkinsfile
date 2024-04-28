pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing prod'
                sh './gradlew clean prod_test'

                echo 'Testing prod'
                sh './gradlew clean web_test'

                echo 'Testing prod'
                sh './gradlew clean web_test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
