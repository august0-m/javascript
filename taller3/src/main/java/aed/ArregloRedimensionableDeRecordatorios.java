package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {

    public Recordatorio[] _recordatorio;


    public ArregloRedimensionableDeRecordatorios() {
        _recordatorio = new Recordatorio[]{}; 
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        _recordatorio = new Recordatorio[]{};
         for (int i=0; i<vector.longitud();i++){
            this.agregarAtras(vector.obtener(i));

        }

    }
    public int longitud() {
        int res=0;
        if (_recordatorio!=null ){
            res= _recordatorio.length;
        }
         return res;
    }

  
    public void agregarAtras(Recordatorio i) {   
      Recordatorio[] seqnueva = new Recordatorio[this.longitud()+1] ; 

      for (int j = 0; j < this.longitud(); j++) {
        seqnueva[j] = _recordatorio[j];
       }
       seqnueva[seqnueva.length - 1] = i;
       _recordatorio = seqnueva; 
  }                                   
    
    public Recordatorio obtener(int i) {
        return _recordatorio[i];
    }
    public void quitarAtras() { //dudosisimo
    if (_recordatorio != null && _recordatorio.length > 0) {
       // _recordatorio[(_recordatorio.length) - 1 ] = null; 
       Recordatorio[] nuevoarreglo = new Recordatorio[this.longitud()-1];
       for (int i = 0; i < nuevoarreglo.length; i++) {
        nuevoarreglo[i] = _recordatorio[i];
       }
       _recordatorio= nuevoarreglo;
   
   }
   }

    public void modificarPosicion(int indice, Recordatorio valor) {
        _recordatorio[indice]= valor;

    }

    public ArregloRedimensionableDeRecordatorios copiar(){
      ArregloRedimensionableDeRecordatorios recnuevo = new ArregloRedimensionableDeRecordatorios();
      for(int i=0 ; i < this.longitud(); i++ ){
        recnuevo.agregarAtras(_recordatorio[i]);
      }
      return recnuevo;
    }

}
