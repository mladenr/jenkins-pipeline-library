pipeline {
  agent any
  stages {
    
    stage('Checkout') {
      steps {
        echo 'Checkout...' 
      }
    }
    
    stage('Verify Format') {
      steps {
        echo 'Verify Format...' 
      }
    }
    
    stage('Build & Unit Tests') {
      steps {
        echo 'Build & Unit Tests...' 
      }
    }
    
    stage('Integration Tests') {
      steps {
        echo 'Integration Tests...' 
      }
    }
    
    stage('Deploy') {
      steps {
        a: { echo 'Create Docker Image...' },
        b: {echo 'Create Docker Image 3'}
      }
    }

    stage('Checkout222') {
      
      parallel {
        stage('Stage1') {
          steps {
            echo 'Checkout code 1...'
          }
        }
        
        stage('Stage2') {
          steps {
            echo 'Checkout code 2...'
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
    
  }
}
