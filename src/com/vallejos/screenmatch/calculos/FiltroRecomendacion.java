<<<<<<< HEAD
package com.vallejos.screenmatch.calculos;

public class FiltroRecomendacion {
    private String recomendacion;


    public void filtra(Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colócalo en tu lista para verlo después");
        }
    }
}
=======
package com.vallejos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colócalo en tu lista para verlo después");
        }
    }
}
>>>>>>> 53776b72c78df407a32a72f42c28eb1e64545e3a
