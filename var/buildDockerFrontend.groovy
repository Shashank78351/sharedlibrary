def call(String frontendDir = 'e-Commerce-main', String imageTag = 'latest') {
    dir(frontendDir) {
        sh """
        docker build -t linuxappvm.eastus.cloudapp.azure.com:5050/root/e-comm-app/frontend:${imageTag} .
        """
    }
}