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
      stages {
        stage('Create Docker Image') {
          steps {
            echo 'Create Docker Image...' 
          }
        }
        stage('Push Docker Image') {
          steps {
            echo 'Push Docker Image...' 
          }
        }
        
        stage('Deployment') {
          parallel {
            stage {
              stage('Deployment to Test Environment') {
                steps {
                  echo 'Deployment to Test Environment...' 
                }
              }
              stage('Acceptance Tests') {
                steps {
                  echo 'Acceptance Tests...' 
                }
              }
            }

            stage('Deployment to Production Environment') {
              steps {
                echo 'Deployment to Production Environment...' 
              }
            }
          }
        }
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
