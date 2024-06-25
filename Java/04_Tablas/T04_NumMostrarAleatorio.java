//Leer 10 números enteros, Debemos mostrarlos en el siguiente orden: 
//El primero, el último, el segundo, el penultimo, el tercero, etc.
public class T04_NumMostrarAleatorio {
    public static void main(String[] args) {
        int i, t[];
        t = new int[10];

        for ( i = 0; i < t.length; i++) {
            System.out.println("Introduzca un número: ");
            t[i]=Entrada.entero();
        }
        System.out.println("El resultado es: ");
        for(i=0; i<=4; i++){
            System.out.println(t[i]);//Mostramos el i-ésimo número
            System.out.println(t[9-i]);// Y el i-ésimo por el final
            //Como en cada vuelta del for se muestran 2 números
            //Para mostrarlos todos, solo necesitaremos la mitad de vueltas.
        }
    }
}
