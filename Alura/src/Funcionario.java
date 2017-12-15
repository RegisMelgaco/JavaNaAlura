public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String entradaNoBanco;
    private String rg;

    public Funcionario(String nome, String departamento, double salario, String entradaNoBanco, String rg){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.entradaNoBanco = entradaNoBanco;
        this.rg = rg;
    }

    public void recebeAumento(double aumento){
        this.salario += aumento;
    }

    public double calculaGanhoAnual(){
        return this.salario*12;
    }

    public void mostra(){
        System.out.println("nome: " + this.nome +"\n" +
                           "departamento: " + this.departamento + "\n" +
                           "salario: " + this.salario + "\n" +
                           "entrada no banco: " + this.entradaNoBanco + "\n" +
                           "RG: " + this.rg + "\n");
    }

    public String getNome(){
        return this.nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String novoDepartamento){
        this.departamento = novoDepartamento;
    }

    public String getEntradaNoBanco() {
        return entradaNoBanco;
    }

    public String getRg() {
        return rg;
    }

    public double getSalario() {
        return salario;
    }
}