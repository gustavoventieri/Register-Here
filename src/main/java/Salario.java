import javax.swing.*;
public class Salario {
    public double vt;
    
    public double inss;
    public double impostderenda;
    public String convenio;
    public double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Salario (){
    this(0, 0,  0, "");
    }
    
    public Salario (double vt,  double inss, double impostderenda, String convenio) {
        this.vt = vt;
        
        this.inss = inss;
        this.impostderenda = impostderenda;
        this.convenio = convenio;
    }

    public double getVt() {
        return vt;
    }

    

    public void setVt(double vt) {
        this.vt = vt;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getImpostderenda() {
        return impostderenda;
    }

    public void setImpostderenda(double impostderenda) {
        this.impostderenda = impostderenda;
    }


    
    public void calculoinss (double Inss){
        this.setSalario(Inss);
        double desc;
        if (this.getSalario() <= 1302 ) {
            desc = (this.getSalario() * 7.5) / 100;
             this.setInss(desc);
           
        }
        else if (this.getSalario() > 1302 && this.getSalario() <= 2572){
            desc = (this.getSalario() * 9) / 100;
             this.setInss(desc);
           
        } 
        else if (this.getSalario() > 2572 && this.getSalario() <= 3857) {
            desc = (this.getSalario() * 12) / 100;
            this.setInss(desc);
            
        }
        else {
            desc = (this.getSalario() * 14) / 100;
            this.setInss(desc);
            
        }
    }
    public void calculoimpostrend (double Imposto){
        this.setSalario(Imposto);
        double desc;
        if (this.getSalario() <= 1900){
            desc  = (this.getSalario() * 5) / 100;
            this.setImpostderenda(desc);
        }
        else if(this.getSalario() >= 1904 && this.getSalario() <= 2827 ){
            desc  = (this.getSalario() * 7.5) / 100;
            this.setImpostderenda(desc);
      
        }
        else if(this.getSalario() >= 2827 && this.getSalario() <= 3751 ){
            desc  = (this.getSalario() * 15) / 100;
            this.setImpostderenda(desc);
        }
         else if(this.getSalario() > 3751 && this.getSalario() <= 4665 ){
            desc  = (this.getSalario() * 22.5) / 100;
            this.setImpostderenda(desc);
        }
          else if(this.getSalario() > 4665 ){
            desc  = (this.getSalario() * 27.5) / 100;
            this.setImpostderenda(desc);
        }   
    }
    public void calculovt(double valetrans) {
        this.setSalario(valetrans);
        double desc;
        desc = (this.getSalario() * 7) / 100;
        this.setVt(desc);
}
    public double salariototal(){
        double todosdesc;
        double salarioliquido;
        todosdesc = this.getImpostderenda() + this.getInss() + this.getVt();
        salarioliquido = this.getSalario() - todosdesc;
        JOptionPane.showMessageDialog(null, "O seu salario liquido é " + salarioliquido);
        return salarioliquido;
        
    }
    public void Apresentardesconto(){
        double soma;
        soma = this.getImpostderenda() + this.getInss() + this.getVt();
         JOptionPane.showMessageDialog(null, "o valor do desconto do inss  é " + this.getInss() + "\n"
                                           + "o valor desconto do imposto de renda é  " + this.getImpostderenda()
                                           + "\n" + "o valor do desconto do vt é " + this.getVt()
                                           + "\n" + "E a soma dos descontos é " + soma);
         
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void ApenasSalario(double salariobru){
        this.setSalario(salariobru);
        double desc;
        if (this.getSalario() <= 1302 ) {
            desc = (this.getSalario() * 7.5) / 100;
             this.setInss(desc);
           
        }
        else if (this.getSalario() > 1302 && this.getSalario() <= 2572){
            desc = (this.getSalario() * 9) / 100;
             this.setInss(desc);
           
        } 
        else if (this.getSalario() > 2572 && this.getSalario() <= 3857) {
            desc = (this.getSalario() * 12) / 100;
            this.setInss(desc);
        }
        else {
            desc = (this.getSalario() * 14) / 100;
            this.setInss(desc);     
        }
        
         double desc2;
         if (this.getSalario() <= 1900){
            desc2  = (this.getSalario() * 5) / 100;
            this.setImpostderenda(desc2);
        }
         else if(this.getSalario() >= 1904 && this.getSalario() <= 2827 ){
            desc2  = (this.getSalario() * 7.5) / 100;
            this.setImpostderenda(desc2);
           
        }
        else if(this.getSalario() >= 2827 && this.getSalario() <= 3751 ){
            desc2 = (this.getSalario() * 15) / 100;
            this.setImpostderenda(desc2);
        }
         else if(this.getSalario() > 3751 && this.getSalario() <= 4665 ){
            desc2  = (this.getSalario() * 22.5) / 100;
            this.setImpostderenda(desc);
        }
          else if(this.getSalario() > 4665 ){
            desc2  = (this.getSalario() * 27.5) / 100;
            this.setImpostderenda(desc2);
        }
         double desc3, desconto, salarioli;
         
         desc3 = (this.getSalario() * 7) / 100;
         
         desconto = this.getInss() + this.getImpostderenda() + desc3;
         salarioli = this.getSalario() - desconto;
         JOptionPane.showMessageDialog(null, "O salario liquido é " + salarioli);
      
    }
}