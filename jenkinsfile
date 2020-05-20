def gv
pipeline {
   agent any
   parameters{
       choice(name:'VERSION', choices:['1.2.0', '1.3.0', '2.1.0'], description:'please choose the rigth version')
       booleanParam(name:'testExecution', defaultValue:true, description:'')
   }
   stages {
      stage('init'){
        steps{
          script{
           gv = load"script.groovy"
          }
        }
      }
      stage('Build') {
         steps {
         script{
              gv.buildApp()
             }
         }
      }
    stage('test') {
        when{
            expression{
                params.testExecution
            }
        }
         steps {
          script{
            gv.testApp()
            
            }
         }
      }
    stage('deploy') {
         steps {
         script{
            gv.deployApp()
            }
         }
      }
   }
}
