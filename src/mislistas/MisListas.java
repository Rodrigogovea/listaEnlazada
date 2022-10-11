package mislistas;
public class MisListas 
{
    public static void main(String[] args) 
    {
        // Comienza aquí
        lista miLista = new lista();
        
        miLista.insertarElemento(10);
        miLista.insertarElemento(20);
        miLista.insertarElemento(30);
        miLista.insertarElemento(40);
        miLista.insertarElemento(50);

        
        
        System.out.println(miLista.mostrarElementos());

        System.out.println("");
    }
}
