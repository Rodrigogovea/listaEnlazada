package mislistas;
public class lista 
{
    nodo primero;
    String elementos = "";
    lista()
    {
        primero = null;
    }
    public void insertarElemento(int elDato)
    {
        nodo temp = new nodo(elDato);
        temp.siguiente = primero;
        primero = temp;
    }
    public String mostrarElementos()
    {
        if(verificarVacia())
            return "Lista vacía!";
        else
        {
            elementos = "[";
            nodo temp = primero;
            while(temp!=null)
            {
                //System.out.println(temp.obtenerInfo());
                elementos+=temp.obtenerInfo() + ",";
                temp = temp.siguiente;
            }
            elementos+="]";
        }
        return this.elementos;
    }
    public void eliminarElemento()
    {
        if(verificarVacia())
            System.out.println("No hay elementos");
        else
        {
            nodo temp = primero;
            System.out.print("Elemento eliminado: ");
            System.out.println(temp.obtenerInfo());
            primero = temp.siguiente;
        }
    }
    
    public boolean verificarVacia()
    {
        if(primero == null)
            return true;
        return false;
    }
}
