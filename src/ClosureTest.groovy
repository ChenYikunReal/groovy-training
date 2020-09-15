class ClosureTest {
    static void main(String[] args) {
        def clos = {param->println "Hello ${param}"};
        clos.call("World");

        def lst = [1,2,3,4];
        lst.each {println it}
        println("The list will only display those numbers which are divisible by 2")
        lst.each{num -> if(num % 2 == 0) println num}
    }
}
