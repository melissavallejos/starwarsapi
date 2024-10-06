<<<<<<< HEAD
package com.vallejos.screenmatch.calculos;

import com.vallejos.screenmatch.modelos.Pelicula;
import com.vallejos.screenmatch.modelos.Serie;
import com.vallejos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

     public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
        System.out.println("Agregando duración en minutos de " + titulo);
      this.tiempoTotal += titulo.getDuracionEnMinutos();
    }




}
=======
package com.vallejos.screenmatch.calculos;

import com.vallejos.screenmatch.modelos.Pelicula;
import com.vallejos.screenmatch.modelos.Serie;
import com.vallejos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

     public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
      this.tiempoTotal += titulo.getDuracionEnMinutos();
    }




}
>>>>>>> 53776b72c78df407a32a72f42c28eb1e64545e3a
