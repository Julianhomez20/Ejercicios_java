/**
 * Clase Rectangulo que hereda de FiguraGeometrica
 */
class Rectangulo extends FiguraGeometrica {
    private String nombre;
    private String color;
    private double lado1;
    private double lado2;

    /**
     * Constructor de la clase rectangulo  
     *  
     * @param nombre 
     * @param color 
     * @param lado1 lado 1 del rectangulo
     * @param lado2 lado 2 del rectangulo
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */

     public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
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
     * Metodo para obtener el lado 1 de la figura
     * 
     * @return Retorna el lado 1 de la figura
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public double getLado1() {
        return this.lado1;
    }

    /**
     * Metodo para establecer el lado 1 de la figura
     * 
     * @param lado1 El valor del lado1 para establecer
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Metodo para obtener el lado 2 de la figura
     * 
     * @return Retorna el lado 2 de la figura
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public double getLado2() {
        return this.lado2;
    }

    /**
    * Metodo para establecer el lado 2 de la figura
    * 
    * @param lado2 El valor del lado 2 para establecer
    * 
    * Complejidad Temporal: O(1) Tiempo constante
    */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
     
    /**
     * Metodo para calcular el area del rectangulo
     * Redefine el metodo getArea de la clase padre FiguraGeometrica
     * 
     * @return Área del rectangulo
     * 
     * Complejidad temporal = O(1) Tiempo constante 
    */
    @Override
    public double getArea() {
        double areaRectangulo = lado1 * lado2;
        return areaRectangulo;
    }

    /**
     * Metodo para calcular el perimetro del rectangulo
     * Redefine el metodo getPerimetro de la clase padre FiguraGeometrica
     * 
     * @return Perimetro del rectangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    @Override
    public double getPerimetro() {
        double perimetroRectangulo = 2 *(lado1 + lado2);
        return perimetroRectangulo;
    }
}