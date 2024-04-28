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
                    echo 'Testing prod'
                    try {
                        sh './gradlew clean prod_test'
                    } catch (err) {
                        echo "Error occurred while testing prod: ${err}"
                    }

                    echo 'Testing web'
                    try {
                        sh './gradlew clean web_test'
                    } catch (err) {
                        echo "Error occurred while testing web: ${err}"
                    }

                    echo 'Testing other module'
                    try {
                        sh './gradlew clean smoke_test'
                    } catch (err) {
                        echo "Error occurred while testing smoke: ${err}"
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
