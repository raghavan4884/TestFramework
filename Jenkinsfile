pipeline {
    agent any
    tools {
        maven "MAVEN_HOME" // Ensure "MAVEN_HOME" is the actual name of the Maven tool configured in Jenkins
    }

    
        stages {
        stage("Build") {
            steps {
             //   git branch:'main',url:'https://github.com/raghavan4884/TestFramework.git'
              //  bat 'mvn clean' // Use 'sh' to run shell commands in a pipeline
                echo 'hello'
            }
        }
        stage("Test") {
            steps {
               // bat 'mvn test -Dcucumber.options="@target/rerun.txt" -Dcucumber.plugin="json:target/reports.json"'
                //echo "${params.tags}"
                echo 'world'
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
