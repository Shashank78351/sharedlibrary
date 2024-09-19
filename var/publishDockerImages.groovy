def call(String backendImage, String frontendImage) {
    withCredentials([usernamePassword(credentialsId: 'gitlab', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
        sh """
            docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD} linuxappvm.eastus.cloudapp.azure.com:5050
            docker push --all-tags ${backendImage}
            docker push --all-tags ${frontendImage}
        """
    }
}