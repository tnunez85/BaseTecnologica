pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''whoami
'''
      }
    }
    stage('test') {
      steps {
        sh 'mvn test'
      }
    }
  }
}