package entities;

public class Dados {
    public String name;
    public double grossSalery;
    public double tax;


  public double NetSalary(){ 
      
    return grossSalery - tax; 

  }

  public void increasesalary(double percentage){
     this.grossSalery += this.grossSalery * (percentage/100);
    //this.grossSalery= porcentage + 1 * grossSalery;

   //ele esta dizendo basicamente que o aumento de salario deve ser feito de acordo com a porcentagem que o usuario digita e essa porcentagem é referente ao valor do salario bruto  ou seja se o grossSalery antes era 6000 e o usuario digita que a percentage é 10.0 agora com o this.grossSalery ele transforma o gross salery que antes era 6000 em 6600 agora pois 10% de 6000 é = 600 , e depois quando a gente pega e acrescenta a taxa ele se transforma em 5600, pois esse acrescimo é feito em cima do salario bruto e não do salario liquido.
  }
  public String toString(){
     return name + ", $ "+ String.format("%.2f",NetSalary());

  }
 
}
