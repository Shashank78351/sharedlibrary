def call(String backendImage, String frontendImage) {
    withCredentials([usernamePassword(credentialsId: 'Docker', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
        sh """
            docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD} 
            docker push  ${backendImage}
            docker push  ${frontendImage}
        """
    }
}