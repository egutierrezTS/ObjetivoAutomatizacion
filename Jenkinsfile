pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/tu-usuario/tu-repositorio.git'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew build' // o './mvnw clean install' si usas Maven
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test' // o './mvnw test' si usas Maven
            }
        }
        stage('Report') {
            steps {
                publishHTML(target: [
                    reportDir: 'build/reports/tests/test', // Ajusta la ruta según tu configuración
                    reportFiles: 'index.html',
                    reportName: 'Test Report'
                ])
            }
        }
    }
}
