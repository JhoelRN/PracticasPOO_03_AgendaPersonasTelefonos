/*
   CLASE CLISTATELEFONOS
        MAIN 03
 */
package edu.utp.poo.libreria;

/**
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */
public class CListaTelefonos {
    
    //ATRIBUTOS
    private CPersona[] listaTelefonos; // matriz de objetos
    private int nElementos; // numero de elementos de la matriz
    
    public CListaTelefonos(){
        //crear una lista vacia
        nElementos = 0;
        listaTelefonos = new CPersona[nElementos];
    }
    
    private void unElementoMas(CPersona[] listaActual){
        nElementos = listaActual.length;
        listaTelefonos = new CPersona[nElementos+1];
        
        //copiar la lista actual
        for (int i = 0; i < nElementos; i++){
            listaTelefonos[i] = listaActual[i];
        }
            nElementos++;  //0_0
    }
    
    private void unElementoMenos(CPersona[] listaActual){
        
        if (listaActual.length == 0) {
            return;
        }
        int k =0;
        nElementos = listaActual.length;
        listaTelefonos = new CPersona[nElementos-1];
        
        //copiar la lista actual
        for (int i = 0; i < nElementos; i++) //{
            if (listaActual[i] != null) {
                listaTelefonos[k++] = listaActual[i];
            }
            nElementos--;
        //}
    }
    
    public void ponerValorEn(int i, CPersona objeto){
        if (i >= 0 && i < nElementos) {
            listaTelefonos[i] = objeto;
        } else {
            System.out.println("Indice fuera de limites");
        }
    }
    
    public CPersona valorEn(int i){
        if ( i>=0 && i < nElementos) {
            return listaTelefonos[i];
            
        } else {
            System.out.println("Infice fuera de Limites");
            return null;
        }
    }
    
    
    public int longitud(){
        return nElementos;
    }
    
    public void añadir(CPersona obj){
        unElementoMas(listaTelefonos);
        ponerValorEn( nElementos -1, obj);
    }
    
    public boolean eliminar(long telefono)
    {
        // Buscar el telefono y eliminar registro
        for (int i = 0; i < nElementos; i++) //{
            if (listaTelefonos[i].obtenerTelefono() == telefono) {
                listaTelefonos[i] = null;
                unElementoMenos(listaTelefonos);
                return true;
            }
        //}
        return false;

    }
    
    public int buscar(String cadena, int pos){
        String nombre;
        if (cadena == null) {
            return -1;
        }
        if (pos<0) {
            pos = 0;
        }
        
        for (int i = pos; i < nElementos; i++) {
            nombre = listaTelefonos[i].obtenerNombre();
            if (nombre == null) {
                continue;
            }
            //cadena está contenida en nombre?
            if (nombre.indexOf(cadena) > -1) {
                return i;
            }
        }
        return -1;
    }
    
    
     
}
