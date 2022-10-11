package mislistas;
public class nodo 
{
    private int informacion;
    nodo siguiente;
    nodo(int dato)
    {
        this.informacion = dato;
        this.siguiente = null;
    }
    public int obtenerInfo()
    {
        return this.informacion;
    }
}
