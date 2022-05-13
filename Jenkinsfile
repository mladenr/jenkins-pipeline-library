pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        echo 'Checkout code...'
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