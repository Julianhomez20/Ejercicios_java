/**
 * Clase para una figura geometrica
 */
public class FiguraGeometrica {
    private String nombre;
    private String color;

    /**
     * Constructor de la clase
     * 
     * @param nombre Nombre de la figura geometrica
     * @param color Color de la figura geometrica
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public FiguraGeometrica (String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
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
     * Metodo para obtener el area de la figura geometrica
     * 
     * @return area de la figura
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double getArea () {
        return 0.0;
    }

    /**
     * Metodo para obtener el perimetro de la figura geometrica
     * 
     * @return perimetro de la figura
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public double getPerimetro () {
        return 0.0;
    }


    }
