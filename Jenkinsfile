pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /tmp:/tmp' 
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test'){
            steps {
                sh 'mvn test'
            }
        }
        stage('Deliver'){
            steps {
                sh ./jenkins/scripts/deliver.sh
            }
}
    }
}
