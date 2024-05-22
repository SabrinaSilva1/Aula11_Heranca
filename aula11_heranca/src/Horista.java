public class Horista extends Empregado {
    private double horas;
    private double vl_horas;

    //Construtor
    public Horista(String nome, String endereco, double salario, double horas, double vl_horas){
        super(nome, endereco);
        this.horas = horas;
        this.vl_horas = vl_horas;
    }

    //Métodos de acesso
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void calcularSalario(){
        salario = horas * 50;
    }
    

    
}
