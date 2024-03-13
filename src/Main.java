public class Main {

    public static void main(String[] args) {
        //ejemplo de overflow de un entero.
        byte i= (byte) 127;
        System.out.println(i);
        System.out.println(i++);
        for (byte j = i; j < 260 ; j++) {
            System.out.println(j);
        }
    }
}
