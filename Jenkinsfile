pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                script {
                    echo 'Running tests...'
                    try {
                        sh './gradlew clean test'
                    } catch (err) {
                        echo "Error occurred while running tests: ${err}"
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                // Здесь может быть логика для развертывания приложения
            }
        }
        stage('Allure Report') {
            steps {
                script {
                    // Загрузка плагина Allure
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'build/allure-results']]
                    ])
                }
            }
        }
    }
}
