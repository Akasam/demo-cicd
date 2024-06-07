node {
   def commit_id
   stage('Preparation') {
     checkout scm
     sh "git rev-parse --short HEAD > .git/commit-id"                        
     commit_id = readFile('.git/commit-id').trim()
   }
   
   stage('install') {
     nodejs(nodeJSInstallationName: 'NodeJS-20-LTS') {
       sh 'npm install'
     }
   }
   
   stage('test') {
     nodejs(nodeJSInstallationName: 'NodeJS-20-LTS') {
       sh 'npm test'
     }
   }
}
