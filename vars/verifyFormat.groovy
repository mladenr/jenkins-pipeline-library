void call() {
    println 'VerifyFormat.......'
    container('build') {
        sh './gradlew --stacktrace --parallel spotlessCheck'
    }
    println 'VerifyFormatFinished.......'
}