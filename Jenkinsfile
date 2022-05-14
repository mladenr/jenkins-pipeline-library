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
    
    stage('Deploy to Test Environment') {
      when {
        branch 'develop'
      }
      steps {
        echo "Create Docker Image..." 
      }
    }
    
    stage('Deploy to Production Environment') {
      when {
        branch 'master'
      }
      steps {
        echo "Create Docker Image..." 
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
