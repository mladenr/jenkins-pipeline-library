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
        timestamps()
        echo 'Step: Unit Tests...'
      }
    }

  }
}