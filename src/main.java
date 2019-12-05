import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws FileNotFoundException {

        File espetaculos = new File("espetaculos.txt");
        File bailarinos = new File("bailarinos.txt");
        File coreografos = new File("coreografos.txt");
        File tecnicos = new File("tecnicos.txt");
        int n = 1;
        ArrayList<Espetaculo> espetaculoList = new ArrayList<Espetaculo>();
        ArrayList<Coreografo> coreografoList = new ArrayList<Coreografo>();
        ArrayList<Tecnico> tecnicoList = new ArrayList<Tecnico>();
        ArrayList<Bailarino> bailarinoList = new ArrayList<Bailarino>();
        menu();
        // Menu
        /*
         * System.out.println("1 - Criar Espetáculo\n" + "2 – Consultar Espetáculo\n" +
         * "3 - Consultar apenas dia e local de Espetáculo" +
         * "4 – Modificar data de Espetáculo\n" +
         * "5 – Corrigir o nome de um Espetáculo\n" +
         * "6 – Listar todos os Espetáculos\n" + "7 - Consultar lotação do Espetáculo\n"
         * + "8 - Calcular média de assistência\n" +
         * "9 - Calcular média de investimento\n" +
         * "10 - Calcular Lucro de Espetáculo\n" + "11 - Criar Bailarino\n" +
         * "12 – Apagar um Bailarino\n" + "13 - Criar Coreógrafo\n" +
         * "14 – Apagar um Coreógrafo\n" + "15 - Criar Técnico\n" +
         * "16 – Apagar um Técnico\n" + "17 – Listar todos os Bailarinos\n" +
         * "18 – Listar todos os Coreógrafos\n" + "19 – Listar todos os Técnicos\n" +
         * "20 – Terminar"); switch (n) {
         * 
         * case 1: Espetaculo X;
         * 
         * 
         * Scanner s = new Scanner (System.in);
         * System.out.println(" Introduza um nome:\n");
         * 
         * X= new Espetaculo(s.next()); espetaculoList.add(X); PrintWriter writer = new
         * PrintWriter("espetaculo.txt");
         * 
         * 
         * 
         * break; case 2:
         * System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
         * Scanner b= new Scanner (System.in);
         * 
         * for (int i=0; i<espetaculoList.size();i++){
         * 
         * if(espetaculoList.get(i).getNome().equals(b))
         * System.out.println(espetaculoList.get(i)); }
         * 
         * 
         * 
         * 
         * 
         * break; case 3:
         * System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
         * Scanner c = new Scanner (System.in);
         * 
         * for (int i=0; i<espetaculoList.size();i++){
         * 
         * if(espetaculoList.get(i).getNome().equals(c)){
         * System.out.println(espetaculoList.get(i).getData());
         * System.out.println(espetaculoList.get(i).getLocal());
         * 
         * } }
         * 
         * 
         * 
         * 
         * 
         * break; case 4:
         * System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
         * Scanner d = new Scanner (System.in);
         * System.out.println("Intruduza uma nova data: \n"); Date datanova = new
         * Date(); for (int i=0; i<espetaculoList.size();i++){
         * 
         * if(espetaculoList.get(i).getNome().equals(d))
         * 
         * espetaculoList.get(i).setData(datanova);
         * 
         * 
         * 
         * } break; case 5:
         * System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
         * Scanner e = new Scanner (System.in);
         * System.out.println("Intruduza o nome do espetaculo que quer mudar: \n");
         * Scanner f = new Scanner (System.in);
         * 
         * for (int i=0; i<espetaculoList.size();i++){
         * 
         * if(espetaculoList.get(i).getNome().equals(e)){
         * espetaculoList.get(i).setNome(f.next()); }
         * 
         * }
         * 
         * break; case 6:
         * 
         * 
         * for (int i=0; i<espetaculoList.size();i++){
         * 
         * 
         * System.out.println(espetaculoList.get(i)); }
         * 
         * 
         * 
         * break; case 7: break; case 8: break; case 9: break; case 10: break; case 11:
         * 
         * 
         * 
         * break; case 12:
         * System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
         * Scanner r= new Scanner (System.in);
         * 
         * 
         * for (int i=0; i<bailarinoList.size();i++){
         * 
         * if(bailarinoList.get(i).getNome().equals(r)){ bailarinoList.remove(i); }
         * 
         * }
         * 
         * 
         * 
         * break; case 13: break; case 14:
         * System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
         * Scanner j = new Scanner (System.in);
         * 
         * 
         * for (int i=0; i<coreografoList.size();i++){
         * 
         * if(coreografoList.get(i).getNome().equals(j)){ coreografoList.remove(i); }
         * 
         * }
         * 
         * 
         * 
         * break; case 15: break; case 16:
         * System.out.println("Intruduza o nome do espetaculo que quer consular: \n");
         * Scanner w = new Scanner (System.in);
         * 
         * 
         * for (int i=0; i<tecnicoList.size();i++){
         * 
         * if(tecnicoList.get(i).getNome().equals(w)){ espetaculoList.remove(i); }
         * 
         * }
         * 
         * break; case 17: for (int i=0; i<bailarinoList.size();i++){
         * 
         * 
         * System.out.println(bailarinoList.get(i)); }
         * 
         * 
         * break; case 18: for (int i=0; i<coreografoList.size();i++){
         * 
         * 
         * System.out.println(coreografoList.get(i)); } break; case 19:
         * 
         * for (int i=0; i<tecnicoList.size();i++){
         * 
         * 
         * System.out.println(tecnicoList.get(i)); }
         * 
         * break;
         * 
         * }
         */
    }

    public static void menu() {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "1 - Visão geral da empresa\n2 - Gerir Bailarinos\n3 - Gerir Coreografos\n4 - Gerir Tecnicos\n5 - Gerir Espetaculos\n\n99 - Sair");
        switch (s.nextInt()) {
        case 1:
            System.out.println("\n\n\n\n");
            gerirEmpresa();
            break;
        case 2:
            System.out.println("\n\n\n\n");
            gerirBailarinos();
            break;
        case 3:
            System.out.println("\n\n\n\n");
            gerirCareografos();
            break;
        case 4:
            System.out.println("\n\n\n\n");
            gerirTecnicos();
            break;
        case 5:
            System.out.println("\n\n\n\n");
            gerirEspetaculos();
            break;
        default:
            System.out.println("\n\n\n\n");
            System.exit(0);
            break;

        }

    }

    public static void gerirEspetaculos() {

    }

    public static void gerirBailarinos() {
        Scanner s = new Scanner(System.in);

        System.out.println(
                "========GERIR BAILARINOS========\n1 - Adicionar Bailarino\n2 - Remover Bailarino\n3 - Consultar Bailarino\n4 - Alterar Bailarino\n5 - Alterar Salario\n6 - Voltar Atrás");
        switch (s.nextInt()) {
        case 1:
            System.out.println("Nome:\n");

            break;
        case 2:

            break;

        case 3:

            break;

        case 4:

            break;

        case 5:
            menu();
            break;

        default:
        menu();
            break;
        }
        s.close();

    }

    public static void gerirCareografos() {

    }

    public static void gerirTecnicos() {

    }

    public static void gerirEmpresa() {
        System.out.println(
                "========VISÃO GERAL DA EMPRESA========\n\n\n1 - Consultar Lucros\n2 - Consultar Investimento\n3 - Numero total de pessoas\n4 - Voltar Ao Menu Pricipal");

    }

}