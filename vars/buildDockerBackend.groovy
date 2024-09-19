def call(String backendDir = 'backend', String imageTag = 'latest') {
    dir(backendDir) {
        sh """
        docker build -t smr123/ecomm:${imageTag} .
        """
    }
}