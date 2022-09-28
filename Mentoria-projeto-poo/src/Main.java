public class Main {
    public static void main(String[] args) {

        Vendedor Rafael = new Vendedor("Rafael", "04944535910", 10.0, 5);
        double salarioRafael = Rafael.calcularSalario();
        System.out.println("O salário de Rafael é: " + salarioRafael);

        Consultor Jhooy = new Consultor("Jhoyce", "4145476845", 100.0, 10);
        double salarioJhooy = Jhooy.calcularSalario();
        System.out.println("O salário da jhooy é: " + salarioJhooy);

        Gerente Pietro = new Gerente("Pietro", "98187676523", 10.0, 10, 100, 10);
        double salarioPietro = Pietro.calcularSalario();
        System.out.println("O salário de Pietro é: " + salarioPietro);
    }
}