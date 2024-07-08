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
                bat 'gradlew.bat build' 
            }
        }
        stage('Test') {
            steps {
                sh 'gradlew.bat test' 
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
