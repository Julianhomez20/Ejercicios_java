import java.util.Scanner;
/**
 * Clase principal
 */
public class Principal {
    /**
     * Primer metodo que se ejecuta
     * 
     * @param args
     * 
     * Complejidad temporal : O(1) Tiempo constante.
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el color de la figura: ");
        String color = sc.nextLine();

        System.out.println("Ingrese el tipo de figura\n 1. Circulo\n 2. Rectangulo\n 3. Triangulo");
        int opcion = sc.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("Ingrese el radio del circulo: ");
                double radio = sc.nextDouble();
                FiguraGeometrica circulo = new Circulo(nombre, color, radio);
                double areaCirculo = circulo.getArea();
                double perimetroCirculo = circulo.getPerimetro();
                System.out.println("Area del circulo: " + areaCirculo);
                System.out.println("Perimetro del circulo: " + perimetroCirculo);
                break;
            case 2:
                System.out.println("Ingrese el valor de la base del rectangulo: ");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del rectangulo: ");
                double lado2 = sc.nextDouble();
                FiguraGeometrica rectangulo = new Rectangulo(nombre, color, lado1, lado2);
                double areaRectangulo = rectangulo.getArea();
                double perimetroRectangulo = rectangulo.getPerimetro();
                System.out.println("Area del rectangulo: " + areaRectangulo);
                System.out.println("Perimetro del rectangulo: " + perimetroRectangulo);
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triangulo: ");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo:  ");
                double altura = sc.nextDouble();
                FiguraGeometrica triangulo = new Triangulo(nombre, color, base, altura);
                double areaTriangulo = triangulo.getArea();
                double perimetroTriangulo = triangulo.getPerimetro();
                System.out.println("Area del triangulo: " + areaTriangulo);
                System.out.println("Perimetro del triangulo: " + perimetroTriangulo);
            default:
                System.out.println("Elija una opción valida");
        }
    }
}