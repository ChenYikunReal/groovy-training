import groovy.json.JsonSlurper

class JsonSlurperTest {
    static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()

        def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')
        println(object.name);
        println(object.ID);

        Object lst = jsonSlurper.parseText('{ "List": [2, 3, 4, 5] }')
        lst.each {println it}

        def obj = jsonSlurper.parseText ''' {"Integer": 12, "fraction": 12.55, "double": 12e13}'''
        println(obj.Integer);
        println(obj.fraction);
        println(obj.double);
    }
}
