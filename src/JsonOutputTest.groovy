import groovy.json.JsonOutput

class JsonOutputTest {
    static void main(String[] args) {
        def output = JsonOutput.toJson([name: 'John', ID: 1])
        println(output);
    }
}
