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
                bat './gradlew clean prod_test'

                echo 'Testing prod'
                bat './gradlew clean web_test'

                echo 'Testing prod'
                bat './gradlew clean web_test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
