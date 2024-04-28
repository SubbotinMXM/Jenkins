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
    }
}
