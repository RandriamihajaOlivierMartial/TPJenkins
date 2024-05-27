pipeline {
    agent any
    stages{
        stage('clone and clean repo'){
            steps {
                bat "git clone https://github.com/RandriamihajaOlivierMartial?tab=repositories"
                bat "mvn clean -f DemoIC"
                   }
    }
    stage('Test'){
           steps{ bat "mvn test -f DemoIC"
                }}
                stage('Deploy'){
                steps {
                        bat "mvn package -f DemoIC"
                        bat "mvn deploy -f DemoIC"
                        bat "mvn sonar:sonar -f DemoIC"
                        }
                                }
            }
}
