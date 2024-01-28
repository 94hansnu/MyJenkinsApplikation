pipeline {

  agent any
  tools {

  }

  stages {

    stage ('build') {

      steps {
        echo 'building the application...'
        script {
            'mvn build'
        }
        echo 'Building succeeded!'
      }
    }

  }
}