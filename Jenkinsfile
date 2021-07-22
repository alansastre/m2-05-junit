pipeline {
    agent any
    tools {
        maven "maven3.8.1"
        jdk "jdk16"
    }
    stages {
        stage("Env Variables") {
            steps {
                sh "printenv"
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Sonar') {
           steps {
               sh 'mvn verify sonar:sonar -Dsonar.projectKey=alansastre_m2-05-junit -Dsonar.organization=alansastre -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=c4ca49d9a009c6eafa419133802b56cbc2377bf8'
           }
        }
    }
}