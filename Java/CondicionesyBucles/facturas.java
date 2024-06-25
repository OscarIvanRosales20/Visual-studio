//Una empresa que se dedica a la venta de desinfectantes necesita
//un programa para gestionar las facturas. En cada factura viene:
//El codigo del articulo, la cantidad vendida en litros y el
// y el precio por litro. Se pide 5 facturas introducidas: Facturacion total
//Cantidad en litros vendidos del articulo 1 y cuantas facturas se emitieron de más de 600ξ.

package CondicionesyBucles;

public class facturas {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int codigo; //El código del articulo en cada factura
        int litros; //La cantidad de litros en cada factura
        float precio; //El precio por litro de cada factura

        float importe_factura;//Guardará el importe de la factura con la que estemos trabajando.
        float facturacion_total; //El importe de todas las facturas.
        int litros_cod1;//El total de litros vendidos del producto 1 en todas las facturas.
        int mas_600; //El contador que sirve para llenar la cuenta de cuantas facturas es de mas de 600₤.
        
        facturacion_total=0;
        litros_cod1=0;
        mas_600=0;
        for (int i = 1; i < 5; i++) {
            System.out.println("Factura n° " +i);
            System.out.println("Código de producto: ");
            codigo=Entrada.entero();
            System.out.println("Cantidad (litros): ");
            precio=(float)Entrada.real();

            importe_factura = litros*precio;
            facturacion_total += importe_factura;
            if (codigo ==1)
                litros_cod1 += litros;
            if(importe_factura >= 600)
                mas_600++;
        }

        System.out.println("Resumen de ventas\n");//Facturacion total.
        System.out.println("La facturación total es de: "+facturacion_total+ "₤");

        System.out.println("Ventas del producto 1: "+litros_cod1+" litros");//Litros del articulo 1
        System.out.println("Factura superior a 600₤: " +mas_600);//Factura de mas 600 euros
    }
}
