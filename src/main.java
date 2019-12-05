import java.io.File;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Date;
import myinputs.Ler;
import java.util.Scanner;
    public class main {




  
    public static void main(String[] args) {

        File espetaculos = new File ("espetaculos.txt");
        File bailarinos = new File ("bailarinos.txt");
        File coreografos = new File ("coreografos.txt");
        File tecnicos = new File ("tecnicos.txt");
        int n=1;
        ArrayList <Espetaculo> espetaculoList = new ArrayList<Espetaculo>();
        ArrayList <Coreografo> coreografoList = new ArrayList<Coreografo>();
        ArrayList <Tecnico> tecnicoList = new ArrayList<Tecnico>();
        ArrayList <Bailarino> bailarinoList = new ArrayList<Bailarino>();
        //Menu
         System.out.println("1 - Criar Espetáculo\n" +
                            "2 – Consultar Espetáculo\n" +
                            "3 - Consultar apenas dia e local de Espetáculo" +
                            "4 – Modificar data de Espetáculo\n" +
                            "5 – Corrigir o nome de um Espetáculo\n" +
                            "6 – Listar todos os Espetáculos\n" +
                            "7 - Consultar lotação do Espetáculo\n" +
                            "8 - Calcular média de assistência\n" + 
                            "9 - Calcular média de investimento\n" +
                            "10 - Calcular Lucro de Espetáculo\n" +
                            "11 - Criar Bailarino\n" +
                            "12 – Apagar um Bailarino\n" +
                            "13 - Criar Coreógrafo\n" +
                            "14 – Apagar um Coreógrafo\n" +
                            "15 - Criar Técnico\n" +
                            "16 – Apagar um Técnico\n" +
                            "17 – Listar todos os Bailarinos\n" +
                            "18 – Listar todos os Coreógrafos\n" +
                            "19 – Listar todos os Técnicos\n" +
                            "20 – Terminar");
         switch (n) {
             case 1:
                 Espetaculo X;
                 
                String nome;
              
                 System.out.println(" Introduza um nome:\n");
                 nome= Ler.umaString();
                 X= new Espetaculo(nome);
                 espetaculoList.add(X);
                 PrintWriter writer = new PrintWriter("espetaculo.txt");
                 
                 
                
                 break;
             case 2:
                 System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
                 String nome1 = Ler.umaString();
                 
                 for (int i=0; i<espetaculoList.size();i++){
                     
                     if(espetaculoList.get(i).getNome().equals(nome1))
                         System.out.println(espetaculoList.get(i));
                 }
                 
                 
                 
                 
                 
                 break;
             case 3:
                 System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
                 String nome1 = Ler.umaString();
                 
                 for (int i=0; i<espetaculoList.size();i++){
                     
                     if(espetaculoList.get(i).getNome().equals(nome1))
                         System.out.println(espetaculoList.get(i).getData());
                      System.out.println(espetaculoList.get(i).getLocal());
                 }
                 
                 
                 
                 
                 
                 break;
             case 4:
                 System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
                 String nome1 = Ler.umaString();
                   System.out.println("Intruduza uma nova data: \n");
                   Date datanova  = getData();
                 for (int i=0; i<espetaculoList.size();i++){
                       
                     if(espetaculoList.get(i).getNome().equals(nome1))
                         
                         espetaculoList.setData(datanova);
                 
                 
                 
                 
                 break;
             case 5:
                 System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
                 String nome1 = Ler.umaString();
                  System.out.println("Intruduza o nome do espetaculo que quer mudar: \n");
                 String nomenovo = Ler.umaString();
                 
                    for (int i=0; i<espetaculoList.size();i++){
                       
                     if(espetaculoList.get(i).getNome().equals(nome1)){
                         espetaculoList.setNome(nomenovo);
                 }
             
                 }
             
                 break;
             case 6:
       
                 
                 for (int i=0; i<espetaculoList.size();i++){
                     
                     
                         System.out.println(espetaculoList.get(i));
                 }
             
             
             
                 break;
             case 7:
                 break;
             case 8:
                 break;
             case 9:
                 break;
             case 10:
                 break;
             case 11:
                 break;
             case 12:
                 break;
             case 13:
                 break;
             case 14:
                 break;
             case 15:
                 break;
              case 16:
                 break;
             case 17:
                 break;
             case 18:
                 break;
             case 19:
                 break;
            
         }
    }
    
}