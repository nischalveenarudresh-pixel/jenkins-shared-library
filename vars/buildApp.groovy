def call() {
    echo 'Starting Maven build'
    sh 'mvn -version'
    echo 'Maven command executed successfully'
}
