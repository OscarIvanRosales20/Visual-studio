package PilaPrueba;

class Inicio {
    private static LinkedStack<Integer> stack;
    private static ArrayStack<Integer> stack2;

    private static void pilaLineal(){
        int Dato;

        System.out.println("Ingresa numeros para almacenarlos en una pila Lineal");
        Dato = Entrada.entero();
        stack.push(Dato);
    }

    private static void pilaArreglos(){
        String again;
        do {
            System.out.println("Ingresa numeros para almacenarlos en una pila");
            int dato = Entrada.entero();
            stack2.push(dato);
            System.out.println("Evaluar otra expresion [Y/N]???");
            again = Entrada.cadena();
            System.out.println();
        } while (again.equalsIgnoreCase("Y"));
        pilaArreglos();
    }

    private static void imprime(){
        if (!stack2.isEmpty()) {
            System.out.print(stack2.toString() + " ");
            menu();
        } else {
            System.out.println("Necesitas Ingresar Datos");
            menu();
        }
    }

    private static void menuPilas(){
        System.out.println();
        System.out.println("Almacenar en...");
        System.out.println("1.-Pila Lineal");
        System.out.println("2.-Pila de areglos");
        int varPilas = Entrada.caracter();
        switch (varPilas) {
            case 1:
                pilaLineal();
            case 2:
                pilaArreglos();
            default:
                break;
        }
    }

    private static void menu(){
        System.out.println();
        System.out.println("Que deseas hacer Usuario?...");
        System.out.println("Almacenar Datos..");
        System.out.println("Imprimir Datos..");
        int menuVar = Entrada.entero();

        if (menuVar == 1) {
            menuPilas();
        } 
        if(menuVar== 2){
            System.out.print("Holis");
        } 
        if(menuVar== 3){
            
        }
        else{
            System.out.print("erri");
        }
    }

    public static void main(String[] args){

        stack = new LinkedStack<Integer>();
        stack2 = new ArrayStack<>();
        String Nombre = null;

        Thread t = Thread.currentThread();

        System.out.println("Ingresa el nombre del Hilo");
        Nombre = Entrada.cadena();
        t.setName(Nombre);
        
        menu();
        System.out.println("Nombre de Hilo Principal " + t.getName());
        
    }
}
