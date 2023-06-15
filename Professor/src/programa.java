

public class programa {
    public static void main(String[] args){
    
   clt prof1 = new clt();
   prof1.nome = "Maria";
   prof1.valorsalariomensal = 3000;

   pj prof2 =new pj();
   prof2.nome = "Gabi";
   prof2.valorcontratual = 5000;

   Horista prof3 = new Horista();
   prof3.nome = "Higor";
   prof3.valorhoraaula = 300;
   prof3.numerodehoras = 8;

   System.out.println(prof1.string());
   System.out.println(prof1.calcularsalario());

   System.out.println(prof2.string());
   System.out.println(prof2.calcularsalario());

   System.out.println(prof3.string());
   System.out.println(prof3.calcularsalario());


   
    }
}
