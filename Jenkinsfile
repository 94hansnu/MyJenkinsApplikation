pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
       stage ('Build') {
         steps {
         echo 'Building app...'
         sh 'mvn -B clean package'
          echo 'Building succeded!'
          }
       }
      stage ('test') {
                steps {
                sc 'mvn test'
                }
                post {
                always {
                junit 'target/surefire-reports/*xml'
                }
                }
      }
    }
}