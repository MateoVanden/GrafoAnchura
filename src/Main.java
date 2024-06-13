import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Vertice> Letras = new ArrayList<Vertice>();
        Letras.add(new Vertice("A"));
        Letras.add(new Vertice("B"));
        Letras.add(new Vertice("C"));
        Letras.add(new Vertice("D"));
        Letras.add(new Vertice("H"));
        Letras.add(new Vertice("R"));
        Letras.add(new Vertice("T"));
        try {
            GrafoMatriz matrizadyacencia = new GrafoMatriz(Letras.size());
            matrizadyacencia.mostrarMatriz();
            System.out.println("");
            System.out.println("========================");
            System.out.println("");
            Iterator<Vertice> it = Letras.iterator();
            while(it.hasNext()){
                matrizadyacencia.nuevoVertice(it.next().nomVertice());

            }
            matrizadyacencia.mostrarMatriz();
            System.out.println("");
            System.out.println("=============================");
            System.out.println("");
            matrizadyacencia.nuevoArco("D","B");
            matrizadyacencia.nuevoArco("D","C");
            matrizadyacencia.nuevoArco("B","H");
            matrizadyacencia.nuevoArco("C","R");
            matrizadyacencia.nuevoArco("R","H");
            matrizadyacencia.nuevoArco("H","A");
            matrizadyacencia.nuevoArco("H","T");
            matrizadyacencia.mostrarMatriz();
            System.out.println("===============");
            System.out.println("");
            RecorrerAnchura.recorrerAnchura(matrizadyacencia, "D");

        }
        catch (Exception ex){
            System.out.println("No funciona");
        }
    }
}