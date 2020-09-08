pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'f9d3f35c-f1c7-4f8e-834e-a85147fc330f', url: 'https://github.com/dadichen/springbootDemo.git']]])
            }
        }
        stage('build project') {
            steps {
                bat label: '', script: 'mvn clean package'
            }
        }
        stage('release project') {
            steps {
                bat label: '', script: 'java -jar C:\\Windows\\System32\\config\\systemprofile\\AppData\\Local\\Jenkins.jenkins\\workspace\\test\\target\\springbootDemo.jar'
            }
        }
    }
}