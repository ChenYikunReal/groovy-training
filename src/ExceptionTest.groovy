class ExceptionTest {
    static void main(String[] args) {
        try {
            def arr = new int[3];
            arr[5] = 5;
        } catch(ArrayIndexOutOfBoundsException e) {
            println("Catching the Array out of Bounds exception");
        } catch(Exception e) {
            println("Catching the exception");
        } finally {
            println("The final block");
        }
        println("Let's move on after the exception");
    }
}
