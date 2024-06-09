def gv
pipeline {
    agent any
    environment {
        VERSION = '1.0.0'
    // SERVER_CREDENTIAL=credentials('cloud-server')
    }
    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'pipeline.groovy'
                }
            }
        }
        stage('build') {
            steps {
                script {
                    gv.post_test()
                }
            }
        }
        stage('triggerSecondJob') {
            steps {
                script {
                    // build job:  'second/second_job'
                    build job: 'second/second_job', parameters: [string(name: 'Hierarchy', value: 'SM_GO')], waitForStart: true
                    // echo 'second job'
                }
            }
        }
    }
    post {
        always {
            echo 'always block'
        }
        success {
            echo 'success block'
        }
        failure {
            echo 'failiure block'
        }
    }
}
