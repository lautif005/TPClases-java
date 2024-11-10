public class EstadoObjeto {
    private String atributo1;
    private int atributo2;

    public EstadoObjeto(String atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    public static void main(String[] args) {
        EstadoObjeto obj = new EstadoObjeto("Valor inicial", 10);
        System.out.println("Atributo1: " + obj.getAtributo1());
        System.out.println("Atributo2: " + obj.getAtributo2());

        obj.setAtributo1("Nuevo valor");
        obj.setAtributo2(20);

        System.out.println("Atributo1 (modificado): " + obj.getAtributo1());
        System.out.println("Atributo2 (modificado): " + obj.getAtributo2());
    }
}

