pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
       stage ('Build') {
         steps {
         echo 'Building app...'
         sh 'mvn -B'
          echo 'Building succeded!'
          }
       }
    }
}