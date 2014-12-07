groovy-executable-jar-with-gradle-example
===

### Description
Example for creating a Groovy stand-alone self-executable jar with gradle.

The generated jar contains the compiled groovy script, and the groovy embeddable jar.

Having this self-executable jar, you can start the groovy script, like `java -jar MyScriptAsJar.jar`

### How to do a test run
* Run command `gradlew uberjar` to execute the task `uberjar`
* Generated jar file is at `build\libs\printer-1.0.jar`
* Run command `java -jar build/libs/printer-1.0.jar -p HelloGroovy` to execute the jar

### Alternative
* [GroovyWrapper](http://docs.codehaus.org/display/GROOVY/WrappingGroovyScript) 

### Resource
* http://stackoverflow.com/questions/378905/how-to-invoke-groovy-with-java-from-command-line
* http://stackoverflow.com/questions/9749032/create-a-groovy-executable-jar-with-gradle