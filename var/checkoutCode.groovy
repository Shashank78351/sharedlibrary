def call(String branch = 'main', String credentialsId = 'gitlab', String repoUrl) {
    checkout scmGit(branches: [[name: "*/${branch}"]], 
                    extensions: [], 
                    userRemoteConfigs: [[credentialsId: credentialsId, url: repoUrl]]
    )
}
