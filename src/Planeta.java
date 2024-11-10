enum TipoPlaneta { GASEOSO, TERRESTRE, ENANO }

public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaMediaSol = 0;
    TipoPlaneta tipoPlaneta;
    boolean observable = false;
    double periodoOrbital; // Nuevo atributo
    double periodoRotacion; // Nuevo atributo

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, TipoPlaneta tipoPlaneta, boolean observable, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    public void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa = " + masa);
        System.out.println("Volumen = " + volumen);
        System.out.println("Diámetro = " + diametro);
        System.out.println("Distancia media al Sol = " + distanciaMediaSol);
        System.out.println("Tipo de planeta = " + tipoPlaneta);
        System.out.println("Observable = " + observable);
        System.out.println("Periodo orbital = " + periodoOrbital);
        System.out.println("Periodo de rotación = " + periodoRotacion);
    }

    public double calcularDensidad() {
        return volumen != 0 ? masa / volumen : 0;
    }

    public boolean esPlanetaExterior() {
        return distanciaMediaSol > 210 && distanciaMediaSol < 340;
    }

    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 142984, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);
        Planeta planeta2 = new Planeta("Marte", 2, 6.39e23, 1.6318e11, 6779, 228, TipoPlaneta.TERRESTRE, true, 1.88, 1.03);

        planeta1.imprimir();
        System.out.println("Densidad = " + planeta1.calcularDensidad());
        System.out.println("Es planeta exterior = " + planeta1.esPlanetaExterior());

        planeta2.imprimir();
        System.out.println("Densidad = " + planeta2.calcularDensidad());
        System.out.println("Es planeta exterior = " + planeta2.esPlanetaExterior());
    }
}

