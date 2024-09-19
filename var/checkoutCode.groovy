def call(String branch = 'main', String credentialsId = 'Github', String repoUrl) {
    checkout scmGit(branches: [[name: "*/${branch}"]], 
                    extensions: [], 
                    userRemoteConfigs: [[credentialsId: credentialsId, url: repoUrl]]
    )
}
