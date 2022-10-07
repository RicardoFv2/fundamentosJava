package InstanciadoDe;

public class Main{
    public static void main(String[] args) {

        FiguraGeometrica figura;

        figura = new Elipse();
        //Determina solo un tipo el que corresponda con la jerarquia

        determinaTipo(figura);
        //Determina todos los tipos posbiles

        System.out.println("\nTodos sus tipos");
        determinaTodosLosTipos(figura);

//        Mas ejemplos
        figura = new Rectangulo();
        determinaTipo(figura);

        figura = new Circulo();
        determinaTipo(figura);
    }
    private static void determinaTodosLosTipos(FiguraGeometrica figura){

        if (figura instanceof Elipse){
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }
        if (figura instanceof Circulo ){
            //Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        }
        if (figura instanceof FiguraGeometrica ){
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Gepmetrica");
        }
        if (figura instanceof Object ){
            //Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se enontro el tipo");
        }
    }
    private static void determinaTipo(FiguraGeometrica figura){
        if (figura instanceof Elipse){
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        } else if (figura instanceof Circulo ){
            //Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        } else if (figura instanceof FiguraGeometrica ){
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Geometrica");
        } else if (figura instanceof Object ){
            //Procesa algo particular de un Objeto
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontro el tipo");
        }
    }
}
