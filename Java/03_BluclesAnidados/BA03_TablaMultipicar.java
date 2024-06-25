//Muestra las tablas de multipicar
public class BA03_TablaMultipicar {
    public static void main(String[] args) {
        int tabla, i;
        for(tabla=1; tabla<=10; tabla++){
            System.out.println("\n\nTabla del "+tabla);
            System.out.println("---------------");
            for(i=1;i<=10;i++)
                System.out.println(tabla+" x "+i+" = "+tabla*i);
        }
    }
}
