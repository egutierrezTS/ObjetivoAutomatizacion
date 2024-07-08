pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/egutierrezTS/ObjetivoAutomatizacion'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew build' 
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test' 
            }
        }
        stage('Report') {
            steps {
                publishHTML(target: [
                    reportDir: 'build/reports/tests/test', 
                    reportFiles: 'index.html',
                    reportName: 'Test Report'
                ])
            }
        }
    }
}
