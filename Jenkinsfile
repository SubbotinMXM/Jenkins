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
                script {
                    try {
                        echo 'Testing prod'
                        sh './gradlew clean prod_test'
                    } catch (err) {
                        echo "Error occurred while testing prod: ${err}"
                    }

                    try {
                        echo 'Testing web'
                        sh './gradlew clean web_test'
                    } catch (err) {
                        echo "Error occurred while testing web: ${err}"
                    }

                    try {
                        echo 'Testing other module'
                        sh './gradlew clean other_module_test'
                    } catch (err) {
                        echo "Error occurred while testing other module: ${err}"
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
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
