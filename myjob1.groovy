job('My Job 1') {
    scm {
        git('https://github.com/akasam/jenkins-demo1') {  node -> 
            node / gitConfigName('srohaut  ')
            node / gitConfigEmail('srohaut@estiam.com')
        }
    }
    triggers {
        scm('H/10 * * * *')
    }
    wrappers {
        nodejs('NodeJS10')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}

job('My Job 2') {
    scm {
        git('https://github.com/akasam/jenkins-demo1') {  node -> 
            node / gitConfigName('srohaut  ')
            node / gitConfigEmail('srohaut@estiam.com')
        }
    }
    triggers {
        scm('H/10 * * * *')
    }
    wrappers {
        nodejs('NodeJS11')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
