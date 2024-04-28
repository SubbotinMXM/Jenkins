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
                    try {
                        sh './gradlew clean prod_test'
                    } catch (err) {
                        echo "Error occurred while testing prod: ${err}"
                    }

                    echo 'Testing prod'
                    try {
                        sh './gradlew clean web_test'
                    } catch (err) {
                        echo "Error occurred while testing web: ${err}"
                    }

                    echo 'Testing prod'
                    try {
                        sh './gradlew clean web_test'
                    } catch (err) {
                        echo "Error occurred while testing web: ${err}"
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
