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
    
    stage('Create Docker Image') {
      when {
        branch 'develop'
      }
      steps {
        echo 'Create Docker image...' 
      }
    }
    
    stage('Push Docker Image') {
      when {
        branch 'develop'
      }
      steps {
        echo 'Push Docker image...' 
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
    
    stage('Smoke Tests') {
      steps {
        echo 'Smoke Tests...' 
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
