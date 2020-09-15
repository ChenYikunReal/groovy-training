class FileReadTest {

    private static PATH = "resources/file.txt"

    static void main(String[] args) {
        new File(PATH).eachLine {
            line -> println "line : $line";
        }

        File file = new File(PATH)
        println file.text

        new File('resources/test.txt').withWriter('utf-8') {
            writer -> writer.writeLine 'Hello World'
        }
    }
}
