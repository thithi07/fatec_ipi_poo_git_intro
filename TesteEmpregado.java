public class TesteEmpregado {
    public static void main (String[] args){    
        Empregado Itamara = new Empregado();
        Empregado Diego = new Empregado();
        Empregado Maria = new Empregado();
        Itamara.setTipo(1);
        Diego.setTipo(2);
        Maria.setTipo(3);

        Itamara.setSalario(2000);
        Diego.setSalario(1700);
        Diego.setComissao(0.2);

        Maria.setSalario(1500);
        Maria.setBonus(400);

        System.out.println(Itamara.calcularSalario());
        System.out.println(Diego.calcularSalario());
        System.out.println(Maria.calcularSalario());
    }
}
