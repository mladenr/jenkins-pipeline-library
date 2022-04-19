#!/usr/bin/env groovy

void call(parameters) {
    echo "VerifyFormat......."
    container('build') {
        sh './gradlew --stacktrace --parallel spotlessCheck'
    }
    echo "VerifyFormatFinished......."
}