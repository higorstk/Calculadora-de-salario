public class Horista extends Professor{
    protected int numerodehoras;
    protected double valorhoraaula;

    public int getnumerodehoras(){
        return numerodehoras;
    }
    public double getvalorhoraaula(){
        return valorhoraaula;
    }
    public void setnumerodehoras(int numerodehoras){
        this.numerodehoras = numerodehoras;
    }

    public void setvalorhoraaula(double valorhoraaula){
        this.valorhoraaula = valorhoraaula;
    }
    
    public double calcularsalario(){
        return valorhoraaula*numerodehoras;
    }
    
}
