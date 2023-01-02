pipeline {
    agent any
    
    tools{
        maven "apache-maven-3.6.3-bin"
    }

    stages {
	
        stage('Clean') {
            steps {
                bat 'mvn -f pom.xml clean'
                echo 'Cleaning..'
            }
        }
        stage('Compile') {
            steps {
                bat 'mvn -f pom.xml compile'
                echo 'Compiling..'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn -f pom.xml test'
                echo 'Testing..'
            }
        }
        stage('Packaging') {
            steps {
                bat 'mvn -f LibraryManagement_springboot/LibraryManagement/pom.xml package'
                echo 'Packageing..'
            }
        }        
      
    }
}
