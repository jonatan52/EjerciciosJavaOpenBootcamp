/*
Para este ejercicio tendréis que crear una función que
reciba un precio y devuelva el precio con el IVA incluido.
*/

package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        precioIva(2500);

    }
    static void precioIva(int precio){
        double iva = precio * 0.19;
        double precioMasIva = precio + iva;
        System.out.println("Precio mas Iva = " + precioMasIva);
        System.out.println("iva = " + iva);
    }

}
