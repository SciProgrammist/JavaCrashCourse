public class CicloForEach{

    public static void main(String[] args){
        // foreach funciona para recorrer arrays
        //for(variable_temporal : array) {
            //setencia
        //}
        int []a = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int v : a) {
            System.out.println(v);
        }

        String []nombres = new String[]{"Alvaro", "Beto", "Alexys","Mircha","Alejo1","Alejo2"};

        for(String nombre : nombres) {
            System.out.println(nombre);
        }


    }
}