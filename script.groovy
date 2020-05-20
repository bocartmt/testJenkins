def buildApp(){
    echo 'the application is building'
}
def testApp(){
    echo 'the application is testing'
}
def deployApp(){
    echo "the application is deploying ${params.VERSION}"
}
return this
