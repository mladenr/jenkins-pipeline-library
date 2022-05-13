pipeline {
  agent any
  stages {
    stage('Main') {
      parallel {
        stage('Checkout') {
          steps {
            echo 'Checkout code...'
          }
        }
      }
    }
    
    stage('Scans') {
      parallel {
        stage('SonarQube Scan') {
          steps {
            echo 'SonarQube Scan'
          }
        }
        stage('BlackDuck Scan') {
          steps {
            echo 'BlackDuck Scan'
          }
        }
        stage('Fortify Scan') {
          steps {
            echo 'Fortify Scan'
          }
        }
        stage('WhiteSource Scan') {
          steps {
            echo 'WhiteSource Scan'
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
    
  }
}
