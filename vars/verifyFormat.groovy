#!/usr/bin/env groovy

void call() {
    echo "VerifyFormat......."
    container('build') {
        sh './gradlew --stacktrace --parallel spotlessCheck'
    }
    echo "VerifyFormatFinished......."
}