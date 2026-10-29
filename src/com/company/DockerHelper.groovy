package com.company

class DockerHelper {

    String getImageName(String appName, String version) {
        return "${appName}:${version}"
    }
}
