/**
 * Clase Circulo que hereda de FiguraGeometrica.
 */
class Circulo extends FiguraGeometrica {
    private String nombre;
    private String color;
    private double radio;

    /**
     * Constructor de la clase Circulo
     * 
     * @param nombre Nombre de la figura 
     * @param color Color de la figura
     * @param radio Radio de la figura
     * 
     * Complejidad Temporal : O(1) Tiempo constante.
     */
    public Circulo (String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
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
     * Metodo para obtener el radio de la figura
     * 
     * @return Retorna el valor del radio de la figura
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public double getRadio() {
        return this.radio;
    }

    /**
     * Metodo para establecer el radio de la figura
     * 
     * @param radio El valor del radio para establecer
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo para calcular el area del circulo 
     * Redefine el metodo getArea de la clase padre FiguraGeometrica
     * 
     * @return Área del circulo
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    @Override
    public double getArea() {
        super.getArea();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        return areaCirculo;

    }

    /**
     * Metodo para Calcular el perimetro del circulo
     * Redefine el metodo getPerimetro de la clase padre FiguraGeometrica
     * 
     * @return Perimetro del circulo
     * 
     * Complejidad Temporarl: O(1) Tiempo constante
     */
    @Override
    public double getPerimetro() {
        super.getPerimetro();
        double perimetroCirculo = 2 * Math.PI * radio;
        return perimetroCirculo;

    }
}