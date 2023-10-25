/**
 * Clase Triangulo que hereda de FiguraGeometrica
 */
class Triangulo extends FiguraGeometrica {
    private String nombre;
    private String color;
    private double base;
    private double altura;

    /**
     * Constructor de la clase Triangulo
     * 
     * @param nombre
     * @param color
     * @param lado1 lado 1 del triangulo  
     * @param lado2 lado 2 del triangulo
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

     /****************************************************************************************************/
    /*************************************** MÉTODOS MODIFICADORES **************************************/
    /****************************************************************************************************/

    /**
     * Metodo para obtener el nombre de la figura
     * 
     * @return Retorna el nombre de la figura
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Metodo para establecer el nombre de la figura
     * 
     * @param nombre El valor del nombre para establecer
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el color de la figura
     * 
     * @return Retorna el color de la figura
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Metodo para establecer el color de la figura
     * 
     * @param color El valor del color para establecer
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo para obtener la base de la figura
     * 
     * @return Retorna la base de la figura
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public double getBase() {
        return this.base;
    }

    /**
     * Metodo para establecer la base de la figura
     * 
     * @param base El valor de la base para establecer
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Metodo para obtener la altura de la figura
     * 
     * @return Retorna la altura de la figura
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public double getAltura() {
        return this.altura;
    }

    /**
     * Metodo para establecer la altura de la figura
     * 
     * @param altura El valor de la altura para establecer
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public void setLado2(double altura) {
        this.altura = altura;
    }

    /**
     * Metodo para calcular el área de el triangulo 
     * 
     * @return Área del triangulo
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    @Override
    public double getArea () {
        double areaTriangulo = (base * altura) / 2;
        return areaTriangulo;
    }

    /**
     * Metodo para calcular el perimetro de el triangulo
     * 
     * @return Perimetro del triangulo
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    @Override
    public double getPerimetro () {
        double perimetroTriangulo = altura + altura + base;
        return perimetroTriangulo;
    }

}