package OrientadaAObjetos;

// SON CONSTANTES FINAL QUE NO SE PUEDEN MODIFICAR PERO SI LLAMAR DESDE OTRAS CLASES
public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    VERDE("Verde"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NEGRO("Negro");

    private final String color;

    Color(String color){
        this.color = color;
    }

    // Si accedemos al color usando Color.AZUL la respuesta es AZUL, pero si usamos Color.AZUL.getColor() nos devuelve "Azul"
    public String getColor() {
        return color;
    }

    // Podemos añadir el toString para que al llamar o hacer print nos devuelva el color del atributo y no de la constante.
    @Override
    public String toString() {
        return this.color;
    }
}


