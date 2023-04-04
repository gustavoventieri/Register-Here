import javax.swing.*;
public class Principal {
public static void main(String[] args) {
    int menu;
    String crtz, escol;
    double fim =0, salariofinal;
    JOptionPane.showMessageDialog(null, "Bem vindo ao programa cadastro de funcionario e calculo de salario");
    Funcionario fun = new Funcionario();
    Salario sal = new Salario();
    
    
    do {      
        menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Funcionario e Calcular Salario \n 2 - Apenas Cadastrar Funcionario \n 3 - Apenas Calculo de Salario  \n 0 - Finalizar Programa "));
        switch(menu){
            case 1: 
                fim = fun.inserirdados();
                fun.apresentardados(); 
                
                JOptionPane.showMessageDialog(null, "Agora iremos fazer o calculo do salario liquido");
                sal.calculoinss(fim);
                sal.calculoimpostrend(fim);
                sal.calculovt(fim);
                salariofinal = sal.salariototal();
                fun.apresentardadosfinal(salariofinal);
               
                
                
                escol = JOptionPane.showInputDialog("Voce deseja ver o valor de cada desconto?");
               
                switch(escol){
                    case "sim":
                    case "Sim":
                        sal.Apresentardesconto();
                        break;
                    case "Não":
                    case "não":
                        break;
                    default:
                        String escolha;
                        escolha = JOptionPane.showInputDialog("Opção invalida, Você deseja ver o valor de cada desconto?");
                        if("Sim".equals(escolha) || "sim".equals(escolha)){
                                sal.Apresentardesconto(); 
                                break;
                        }
                        else {
                                 break; } 
                }
                break;  
            case 2: 
                fim = fun.inserirdados();
                fun.apresentardados();
                crtz = JOptionPane.showInputDialog("Voce tem certeza que não quer calcular o salario bruto?");
                if("Sim".equals(crtz) || "sim".equals(crtz)){
                    break;
                }
                else if ("Não".equals(crtz) || "não".equals(crtz)) {
                        JOptionPane.showMessageDialog(null, "Ok, redirecionando para fazermos o calculo do salario liquido");
                        sal.calculoinss(fim);
                        sal.calculoimpostrend(fim);
                        sal.calculovt(fim);
                        salariofinal = sal.salariototal();
                        fun.apresentardadosfinal(salariofinal);
                
                escol = JOptionPane.showInputDialog("Voce deseja ver o valor de cada desconto?");
               
                switch(escol){
                    case "sim":
                    case "Sim":
                        sal.Apresentardesconto();
                        break;
                    case "Não":
                    case "não":
                        break;
                    default:
                    JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente");
                    break;
                        
                }
                break;
                }
               
            case 3:
                double salariobruto;
                salariobruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario bruto do funcionario"));
                sal.ApenasSalario(salariobruto);
                 escol = JOptionPane.showInputDialog("Voce deseja ver o valor de cada desconto?");
               
                switch(escol){
                    case "sim":
                    case "Sim":
                        sal.Apresentardesconto();
                        break;
                    case "Não":
                    case "não":
                        break;
                    default:
                    JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente");
                    break;
                }
                break;
            case 0: 
                 JOptionPane.showMessageDialog(null, "Voce finalizou o programa");
                 break;
            default: 
                 JOptionPane.showMessageDialog(null, "Voce não escolheu uma opção valida, tente novamente");
                break;
   }
    }while (menu != 0);

    
}
}
