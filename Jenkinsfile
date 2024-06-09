def gv
pipeline {
    agent any
    environment {
        VERSION = '1.0.0'
    // SERVER_CREDENTIAL=credentials('cloud-server')
    }
    parameters {
        choice(name:'Hierarchy', choices:['SM_Tune', 'SM_GO'], description:'')
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
                    if ("${params.Hierarchy}" == 'SM_GO') {
                        echo "If condition matched with SM GO : {$params.Hierarchy}"
                    }
                }
            }
        }
    }
}
