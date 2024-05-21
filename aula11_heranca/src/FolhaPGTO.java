public class FolhaPGTO {
    public static void main(String args[]){
        Mensalista men1, men2;
        Horista hora1, hora2;

        //Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcINSS();
        System.out.println("Nome: " + men1.getNome());
        System.out.println("Endereço: " + men1.getEndereço());
        System.out.println("Salário: " + men1.getSalario());

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcINSS();
        System.out.println("Nome: " + men2.getNome());
        System.out.println("Endereço: " + men2.getEndereço());
        System.out.println("Salário: " + men2.getSalario());

        // Empregados horistas

        hora1 = new Horista("Carlos", "Rua xyz", 20);

        hora1.calcularSalario();
        System.out.println("Nome: " + hora1.getNome());
        System.out.println("Endereço: " + hora1.getEndereço());
        System.out.println("Salário: " + hora1.getSalario());

        hora2 = new Horista("Cristina", "Rua do centro", 100);

        hora2.calcularSalario();
        System.out.println("Nome: " + hora2.getNome());
        System.out.println("Endereço: " + hora2.getEndereço());
        System.out.println("Salário: " + hora2.getSalario());

    }
}
