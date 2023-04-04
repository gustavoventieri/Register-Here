import javax.swing.*;
public class Funcionario {

    private String nome;
    private String endereco;
    private String telefone;
    private String rg;
    private String cpf;
    private int codigodefunc;
    private int idade;
    private String gen;
    private String etnia;
    public double salario;
    

    public Funcionario(){
        this("", "", "", "", 0, "", 0, "", "", 0);
    }

 
    
    public Funcionario (String nome, String endereco, String telefone, String cpf, int codigofunc, String rg, int idade, String gen, String etnia, double salario){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.codigodefunc = codigofunc;
        this.rg = rg;
        this.idade = idade;
        this.gen = gen;
        this.etnia = etnia;
        this.salario = salario;
          }

   
    public String getNome(){
        return nome;
}

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigodefunc() {
        return codigodefunc;
    }

    public void setCodigodefunc(int codigodefunc) {
        this.codigodefunc = codigodefunc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
     public String getEndereco(){
        return endereco;
}
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getTelefone(){
        return telefone;
}
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double inserirdados(){
        this.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario" ));
        this.setEndereco(JOptionPane.showInputDialog("Digite o endereço do funcionario" ));
        this.setTelefone(JOptionPane.showInputDialog("Digite o telefone do funcionario" )); 
        this.setCodigodefunc(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do funcionario")));
        this.setCpf(JOptionPane.showInputDialog("Digite o cpf do funcionario"));
        this.setGen(JOptionPane.showInputDialog("Digite o genero do seu funcionario"));
        this.setEtnia(JOptionPane.showInputDialog("Digite a etnia do funcionario"));
        this.setRg(JOptionPane.showInputDialog("Digite o rg do funcionario"));
        this.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionario")));
        this.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario bruto do um funcionario")));
        
        
        return this.getSalario();
        
    }
    public void apresentardados(){
        
        JOptionPane.showMessageDialog(null, 
        "Nome: " + this.getNome() + "\n"
      + "Endereço: "+ this.getEndereco() + "\n" 
      + "Telefone: " + this.getTelefone() + "\n" 
      +  "Codigo do Funcionario: " + this.getCodigodefunc() + "\n"
      +  "CPF: " + this.getCpf() + "\n" 
      +  "Genero: " + this.getGen() + "\n" 
      +  "Etnia: " + this.getEtnia() + "\n" 
      +  "RG: " + this.getRg() + "\n" 
      +  "Idade: " + this.getIdade() + " \n"
      +  "Salario Bruto: " + this.getSalario());
     
    
    }
     public void apresentardadosfinal(double sala){
        
        JOptionPane.showMessageDialog(null, 
        "Nome: " + this.getNome() + "\n"
      + "Endereço: "+ this.getEndereco() + "\n" 
      + "Telefone: " + this.getTelefone() + "\n" 
      +  "Codigo do Funcionario: " + this.getCodigodefunc() + "\n"
      +  "CPF: " + this.getCpf() + "\n" 
      +  "Genero: " + this.getGen() + "\n" 
      +  "Etnia: " + this.getEtnia() + "\n" 
      +  "RG: " + this.getRg() + "\n" 
      +  "Idade: " + this.getIdade() + " \n"
      +  "Salario Bruto: " + this.getSalario() + "\n"
      +  "Salario Liquido: " + sala);
     
    
    }
}