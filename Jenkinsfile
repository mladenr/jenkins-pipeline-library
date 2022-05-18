pipeline {
  agent any
  parameters {
    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')
    booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')
    choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')
    password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
  }
  
  stages {
    stage("Commit Pipeline") {
      stage('Checkout') {
        steps {
          echo 'Checkout...' 
        }
      }

      stage('Verify Format') {
        when { expression { return params.TOGGLE } } 
        steps {
          echo 'Verify Format...' 
        }
      }

      stage('Build') {
        steps {
          echo 'Build...' 
        }
      }

      stage('Unit Tests') {
        steps {
          echo 'Unit Tests...' 
        }
      }

      stage('Integration Tests') {
        steps {
          echo 'Integration Tests...' 
        }
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
