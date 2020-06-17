node {
   def commit_id
   stage('Preparation') {
     checkout scm
     sh "git rev-parse --short HEAD > .git/commit-id"                        
     commit_id = readFile('.git/commit-id').trim()
   }
   
   stage('install') {
     nodejs(nodeJSInstallationName: 'NodeJS9') {
       sh 'npm install --only=dev'
     }
   }
   
   stage('test') {
     nodejs(nodeJSInstallationName: 'NodeJS9') {
       sh 'npm test'
     }
   }
   
   stage('docker build/push') {
     docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
       def app = docker.build("akasam/nodedemoapp:${commit_id}", '.').push()
     }
   }
}
