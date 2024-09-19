def call(String frontendDir = 'e-Commerce-main', String imageTag = 'latest') {
    dir(frontendDir) {
        sh """
        docker build -t smr123/ecomm:${imageTag} .
        """
    }
}