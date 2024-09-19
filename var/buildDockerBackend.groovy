def call(String backendDir = 'backend', String imageTag = 'latest') {
    dir(backendDir) {
        sh """
        docker build -t linuxappvm.eastus.cloudapp.azure.com:5050/root/e-comm-app/backend:${imageTag} .
        """
    }
}