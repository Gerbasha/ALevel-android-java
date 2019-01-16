package model;

public class Triangle {
    private int fstCathetus;
    private int secCathetus;
    private int hypotenuse;

    public Triangle(int fstCathetus, int secCathetus) {
        this.fstCathetus = fstCathetus;
        this.secCathetus = secCathetus;
    }

    public int getHypotenuse() {
        hypotenuse = (fstCathetus * fstCathetus) + (secCathetus * secCathetus);
        return hypotenuse;
    }

    public void printResult(){
        System.out.println("Hypotenuse = " + hypotenuse + ";");
    }
}
