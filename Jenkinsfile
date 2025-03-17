pipeline {
    agent any
    tools {
        maven "MAVEN_HOME" // Ensure "MAVEN_HOME" is the actual name of the Maven tool configured in Jenkins
    }

    
   
        stages {
        stage("Clean") {
            steps {
                git branch:'main',url:'https://github.com/raghavan4884/TestFramework.git'
                bat 'mvn clean' // Use 'sh' to run shell commands in a pipeline
                //build job: 'FirstMavenProject', parameters: [string(name: 'browser', value: 'edge'), string(name: 'url', value: 'https://www.google.com'), string(name: 'tags', value: '"@Smoke or @Regression"')]
                
              }
        }
        stage("Build") {
            steps {

                bat 'mvn test -Dcucumber.plugin="json:target/reports.json" -Dcucumber.filter.tags="@Smoke"'
                
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
