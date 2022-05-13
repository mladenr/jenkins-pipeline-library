pipeline {
  agent any
  stages {
    stage('Checkout') {
      parallel {
        stage('Checkout') {
          steps {
            echo 'Checkout code...'
          }
        }

        stage('SonarQube Scan') {
          steps {
            echo 'Step: SonarQube Scan'
          }
        }

      }
    }

    stage('Build') {
      steps {
        echo 'Step: Build code...'
      }
    }

    stage('Unit Tests') {
      steps {
        echo 'Step: Unit Tests...'
      }
    }
    
    stage('Parellel') {
      parallel {
        stage('Stage1') {
          steps {
            echo 'Stage1'
          }
        }
        stage('Stage2') {
          steps {
            echo 'Stage2'
          }
        }
      }
    }
  }
}
