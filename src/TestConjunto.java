import java.util.ArrayList;
import java.util.List;

public class TestConjunto {
    public static void main(String[] args) {
        Conjunto A=new Conjunto();
        Conjunto B=new Conjunto();
        Conjunto C=Conjunto.of(2,4,6,8,10,12,14,16,18,20,22,24,26,28,30);
        A.add(10);
        B.add(15);
        //verdadero
        System.out.println(A.pertenece(10));
        //falso
        System.out.println(A.pertenece(15));
        //verdadero
        System.out.println(C.union((A.union(B))).pertenece(15));


    }
}
