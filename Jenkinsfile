v.pipeline {
    agent any
    tools {
        maven "MAVEN_HOME" // Ensure "MAVEN_HOME" is the actual name of the Maven tool configured in Jenkins
    }
    stages {
        stage("Build") {
            steps {
                git branch:'main',url:'https://github.com/raghavan4884/TestFramework.git'
                bat 'mvn clean' // Use 'sh' to run shell commands in a pipeline
            }
        }
        stage("Test") {
            steps {
                bat 'mvn test -Dcucumber.filter.tags=${tags} -Dcucumber.plugin="json:target/reports.json"'
            }
        }

    }
    post
    {
        success
        {
            cucumber buildStatus: 'UNCHANGED', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
        }
    }
}
