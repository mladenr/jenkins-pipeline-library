pipeline {
  agent any
  parameters {
    booleanParam(name: 'EXECUTE_COMMIT_STAGES', defaultValue: true, description: 'Skip commit stages...')
  }
  
  stages {
        stage('Checkout') {
          steps {
            echo 'Checkout...' 
          }
        }

        stage('Verify Format') {
          when { expression { return params.EXECUTE_COMMIT_STAGES } } 
          steps {
            echo 'Verify Format...' 
          }
        }

        stage('Build') {
          when { expression { return params.EXECUTE_COMMIT_STAGES } } 
          steps {
            echo 'Build...' 
          }
        }

        stage('Unit Tests') {
          when { expression { return params.EXECUTE_COMMIT_STAGES } } 
          steps {
            echo 'Unit Tests...' 
          }
        }

        stage('Integration Tests') {
          when { expression { return params.EXECUTE_COMMIT_STAGES } } 
          steps {
            echo 'Integration Tests...' 
          }
        }
    
    stage('Code Coverage') {
      steps {
        echo 'Code Coverage...' 
      }
    }
    
    stage('Static Code Analysis') {
      steps {
        echo 'Static Code Analysis...' 
      }
    }
    
    stage('SonarQube') {
      steps {
        echo 'SonarQube...' 
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
