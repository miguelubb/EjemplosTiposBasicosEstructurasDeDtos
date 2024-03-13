public class Conjunto {
    private int items;

    public Conjunto(){
        items=0;
    }

    public static Conjunto of(int... valores){
        Conjunto output=new Conjunto();
        for (int i = 0; i < valores.length; i++) {
            output.add(valores[i]);
        }
        return output;
    }

    public boolean pertenece(int x){
        //pre: 0<=x<32
        int msk=0x80000000;
        return (items & (msk>>>x))!=0; //el error estaba aquí: decía ==1
    }

    public void add(int x){
        //pre: 0<=x<32
        int msk=0x80000000 >>> x;
        items = items | msk;
    }


    public Conjunto union(Conjunto b){
        //retornar this Union b
        // this.items | b.items
        Conjunto resp=new Conjunto();
        resp.items=this.items|b.items;
        return resp;
    }
    //ejercicio
    public Conjunto interseccion(Conjunto B){
        return null;
    }
    public Conjunto diferencia(Conjunto B){
        return null;
    }
    public int size(){ return 0; }
    public void remove(int x){}
    public String toString(){
        //despliega el conjunto mostrando los números presentes por ejemplo {1,3,7}
        return "{}";
    }


}
