import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class main {
    static File espetaculos = new File("espetaculos.txt");
    static File bailarinos = new File("bailarinos.txt");
    static File coreografos = new File("coreografos.txt");
    static File tecnicos = new File("tecnicos.txt");
    static int n = 1;
    static ArrayList<Espetaculo> espetaculoList = new ArrayList<Espetaculo>();
    static ArrayList<Coreografo> coreografoList = new ArrayList<Coreografo>();
    static ArrayList<Tecnico> tecnicoList = new ArrayList<Tecnico>();
    static ArrayList<Bailarino> bailarinoList = new ArrayList<Bailarino>();

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("bailarinos.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            bailarinoList = (ArrayList<Bailarino>) ois.readObject();
        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
            bailarinos.createNewFile();
            
            e.printStackTrace();
        }
        fis = new FileInputStream("coreografo.txt");
        ois = new ObjectInputStream(fis);
        try {
            coreografoList = (ArrayList<Coreografo>) ois.readObject();
        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
            coreografos.createNewFile();
            bailarinos.createNewFile();
        }
        
        fis = new FileInputStream("espetaculos.txt");
        ois = new ObjectInputStream(fis);
        try {
            espetaculoList = (ArrayList<Espetaculo>) ois.readObject();
        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
            espetaculos.createNewFile();
            
            e.printStackTrace();
        }
        fis = new FileInputStream("tecnicos.txt");
        ois = new ObjectInputStream(fis);
        try {
            tecnicoList = (ArrayList<Tecnico>) ois.readObject();
        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
            tecnicos.createNewFile();
            
            e.printStackTrace();
        }
        
        


        menu();

    }

    public static void menu() {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "1 - Visão geral da empresa\n2 - Gerir Bailarinos\n3 - Gerir Coreografos\n4 - Gerir Tecnicos\n5 - Gerir Espetaculos\n\n99 - Sair");
        switch (s.nextInt()) {
        case 1:
            System.out.println("\n\n\n\n");
            // gerirEmpresa();
            break;
        case 2:
            System.out.println("\n\n\n\n");
            gerirBailarinos();
            break;
        case 3:
            System.out.println("\n\n\n\n");
            // gerirCoreografos();
            break;
        case 4:
            System.out.println("\n\n\n\n");
            // gerirTecnicos();
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
        // Scanner s = new Scanner(System.in);
        System.out.println(
                "========GERIR ESPETÁCULOS========\n1 - Criar Espetáculo\n2 - Remover Espetáculo\n3 - Consultar Espetáculo\n4 - Alterar Espetáculo\n5 - Consultar Investimento\n6 - Calcular Lucro\n7 - Consultar Lotação\n8 - Consultar numero total de Espetáculos\n9 - Listar todos os Espetáculos\n10 - Voltar Atrás");

    }

    public static void gerirBailarinos() {
        Scanner s = new Scanner(System.in);

        System.out.println(
                "========GERIR BAILARINOS========\n1 - Adicionar Bailarino\n2 - Remover Bailarino\n3 - Consultar Bailarino\n4 - Alterar Bailarino\n5 - Alterar Salario\n6 - Consultar numero total de Bailarinos\n7 - Listar todos os Bailarinos\n8 - Voltar Atrás");
        switch (s.nextInt()) {
        case 1:
            Bailarino x;
            System.out.println("Nome:\n");
            // Ler nome
            String nome = s.next(); // = nome lido ;
            System.out.println("Numero de Identificação:\n");
            // Ler cc
            long cc = s.nextLong(); // = cc lido ;
            System.out.println("Idade:\n");
            // Ler idade
            int idade = s.nextInt();// = idade lido ;

            System.out.println("Salario [DEFAULT:1000€]:\n");
            double salario = s.nextDouble();
            System.out.println(salario + " debugger");

            // remover genero para facilitar e inicializar com salario base por exemplo
            // 1000€

            x = new Bailarino(nome, cc, idade, salario); // no construtor deves diminuir os parametros para apenas estes
                                                         // (facilitar trabalho)
            bailarinoList.add(x);
            writeToFileBailarinos();
            break;
        case 2:
            System.out.println("Remover a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            n = s.nextInt();
            switch (n) {

            case 1:
                System.out.println("Nome:\n");
                String nomeRemover = s.next();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getNome() == nomeRemover) {
                        bailarinoList.remove(i);
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccRemover = s.nextFloat();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getCc() == ccRemover) {
                        bailarinoList.remove(i);
                    }

                }

                break;

            default:
                gerirBailarinos();
                break;

            }
            writeToFileBailarinos();

            break;

        case 3:

            System.out.println("Consultar a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            // ler nome
            // = nome lido
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getNome().equals(nomeConsultar)) {
                        System.out.println(bailarinoList.get(i));
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getCc() == ccConsultar) {
                        System.out.println(bailarinoList.get(i));
                    }

                }

                break;

            default:
                gerirBailarinos();
                break;

            }
            break;
        case 4:

            System.out.println("Escolher bailarino a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            Bailarino aAlterar = new Bailarino("", 0, 0, 0);
            int indexaAlterar=0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getNome() == nomeConsultar) {
                        indexaAlterar=i;
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getCc() == ccConsultar) {
                        indexaAlterar=i;
                    }

                }

                break;

            }
            System.out.println("Bailarino a alterar: " + bailarinoList.get(indexaAlterar));
            System.out.println("O que deseja alterar:\n1 - Nome\n2 - Idade\n3 - CC\n4 - Salario\n\n5 - Voltar Atrás");
            switch (s.nextInt()) {
            case 1:
                System.out.println("Nome: ");
                
                bailarinoList.get(indexaAlterar).setNome(s.next());
                gerirBailarinos();

                break;
            case 2:
            System.out.println("Idade: ");
            bailarinoList.get(indexaAlterar).setIdade(s.nextInt());
            gerirBailarinos();

                break;
            case 3:
            System.out.println("CC: ");
            bailarinoList.get(indexaAlterar).setCc(s.nextFloat());
            gerirBailarinos();

                break;
            case 4:
            System.out.println("Salario");
            bailarinoList.get(indexaAlterar).setSalario(s.nextDouble());
            gerirBailarinos();

                break;

            default:
                gerirBailarinos();
                break;
            }

        case 5:
            System.out.println("Escolher bailarino a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            int indexaAlterarSalario=0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getNome() == nomeConsultar) {
                        indexaAlterarSalario=i;
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getCc() == ccConsultar) {
                        indexaAlterarSalario=i;
                    }

                }

                break;

            }
            System.out.println("Salario Atual: " + bailarinoList.get(indexaAlterarSalario).getSalario());
            System.out.println(
                    "1 - Aumentar a Partir de percentagem\n2 - Aumentar a Partir de um valor\n3 - Diminuir a Partir de percentagem\n4 - Diminuir a Partir de um valor\n5 - Alterar Salario\n\n6 - Voltar Atrás");
            double percentagem=0;
            double salarioA=0;
            switch (s.nextInt()) {
            
            case 1:
                System.out.println("Percentagem: ");
                percentagem=s.nextDouble();
                salarioA= bailarinoList.get(indexaAlterarSalario).getSalario();
                bailarinoList.get(indexaAlterarSalario).setSalario(salarioA+salarioA*(percentagem/100));
                break;
            case 2:
                System.out.println("Valor: ");
                salarioA=bailarinoList.get(indexaAlterarSalario).getSalario()+s.nextDouble();
                bailarinoList.get(indexaAlterarSalario).setSalario(salarioA);

                break;
            case 3:
                System.out.println("Percentagem: ");
                
                percentagem=s.nextDouble();
                salarioA= bailarinoList.get(indexaAlterarSalario).getSalario();
                bailarinoList.get(indexaAlterarSalario).setSalario(salarioA-salarioA*(percentagem/100));
                break;
            case 4:
                System.out.println("Valor: ");
                salarioA=bailarinoList.get(indexaAlterarSalario).getSalario()-s.nextDouble();
                bailarinoList.get(indexaAlterarSalario).setSalario(salarioA);

                break;
                case 5:
                System.out.println("Valor: ");
                bailarinoList.get(indexaAlterarSalario).setSalario(s.nextDouble());

                break;
            default:
                gerirBailarinos();
                break;

            }

        case 6:
            int numTotal = bailarinoList.size();
            System.out.println("Número total de Bailarinos: " + numTotal + "\n");

            break;

        case 7:
            for (int i = 0; i < bailarinoList.size(); i++)
                System.out.println(bailarinoList.get(i));

            break;

        case 8:
            menu();
            break;

        default:
            menu();
            break;
        }

        gerirBailarinos();

    }

    public static void gerirCoreografos() {

        Scanner s = new Scanner(System.in);

        System.out.println(
                "========GERIR COREÓGRAFOS========\n1 - Adicionar Coreógrafo\n2 - Remover Coreógrafo\n3 - Consultar Coreógrafo\n4 - Alterar Coreógrafo\n5 - Alterar Salario Base\n6 - Consultar numero total de Coreógrafos\n7 - Listar todos os Coreógrafos\n8 - Voltar Atrás");
        switch (s.nextInt()) {
        case 1:
            Coreografo x;
            System.out.println("Nome:\n");
            // Ler nome
            String nome = s.next(); // = nome lido ;
            System.out.println("Numero de Identificação:\n");
            // Ler cc
            float cc = s.nextFloat(); // = cc lido ;
            System.out.println("Idade:\n");
            // Ler idade
            int idade = s.nextInt(); // = idade lido ;
            System.out.println("Salario [DEFAULT:1000€]:\n");
            double salario = s.nextDouble();

            // remover genero para facilitar e inicializar com salario base por exemplo
            // 1000€

            x = new Coreografo(nome, cc, idade, salario); // no construtor deves diminuir os parametros para apenas
                                                          // estes (facilitar trabalho)
            coreografoList.add(x);
            break;
        case 2:
            System.out.println("Remover a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            n = s.nextInt();
            switch (n) {

            case 1:
                System.out.println("Nome:\n");
                String nomeRemover = s.next();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getNome() == nomeRemover) {
                        bailarinoList.remove(i);
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccRemover = s.nextFloat();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getCc() == ccRemover) {
                        bailarinoList.remove(i);
                    }

                }

                break;

            default:
                gerirBailarinos();
                break;

            }

            break;

        case 3:
            System.out.println("Intruduza o nome do coreógrafo que quer consular: \n");
            // ler nome

            System.out.println("Consultar a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            // ler nome
            // = nome lido
            switch (n) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < coreografoList.size(); i++) {
                    if (coreografoList.get(i).getNome() == nomeConsultar) {
                        System.out.println(coreografoList.get(i));
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < coreografoList.size(); i++) {
                    if (coreografoList.get(i).getCc() == ccConsultar) {
                        System.out.println(coreografoList.get(i));
                    }

                }

                break;

            default:
                gerirBailarinos();
                break;

            }
            break;

        case 4:
            // para este case sugiro fazermos outro menu para escolher qual dos parametros
            // (nome idade salario ou cc)quer alterar e depois alterar
            break;

        case 5:
            double salarioBase = 0;
            double perc = 0;
            int n = 0;
            System.out.println("Pretende diminuir ou aumentar o salário? \n");
            System.out.println("Introduza 0 para diminuir ou 1 para aumentar: ");

            // ler int
            if (n == 1) {
                System.out.println("Introduza a percentagem de salario a aumentar: ");
                // perc = ler percentagem;
                salarioBase = salarioBase + (salarioBase * perc) / 100.0;
            }
            if (n == 0) {
                System.out.println("Introduza a percentagem de salario a diminuir: ");
                // perc = ler percentagem;
                salarioBase = salarioBase - (salarioBase * perc) / 100.0;
            } else
                System.out.println("Introduza 0 para diminuir ou 1 para aumentar: ");
            // ler int
            break;

        case 6:
            int numTotal = coreografoList.size();
            System.out.println("Número total de Coreógrafos: " + numTotal + "\n");

            break;

        case 7:
            for (int i = 0; i < bailarinoList.size(); i++)
                System.out.println(coreografoList.get(i));

            break;

        case 8:
            menu();
            break;

        default:
            menu();
            break;
        }
        s.close();

    }

    public static void gerirTecnicos() {
        Scanner s = new Scanner(System.in);

        System.out.println(
                "========GERIR TÉCNICOS========\n1 - Adicionar Técnico\n2 - Remover Técnico\n3 - Consultar Técnico\n4 - Alterar Técnico\n5 - Alterar Salario Base\n6 - Consultar numero total de Técnicos\n7 - Listar todos os Técnicos\n8 - Voltar Atrás");
        switch (s.nextInt()) {
        case 1:
            Tecnico x;
            System.out.println("Nome:\n");
            // Ler nome
            String nome = s.next(); // = nome lido ;
            System.out.println("Numero de Identificação:\n");
            // Ler cc
            float cc = s.nextFloat(); // = cc lido ;
            System.out.println("Idade:\n");
            // Ler idade
            int idade = s.nextInt(); // = idade lido ;
            System.out.println("Especificação:\n");
            // Ler especialidade
            String especificacao = s.next(); // = espec lida ;
            System.out.println("Salario [DEFAULT:1000€]:\n");
            double salario = s.nextDouble();
            // remover genero para facilitar e inicializar com salario base por exemplo
            // 1000€

            x = new Tecnico(nome, cc, especificacao, salario, idade); // no construtor deves diminuir os parametros para
                                                                      // apenas estes (facilitar trabalho)
            tecnicoList.add(x);
            break;
        case 2:

            break;

        case 3:

            break;

        case 4:
            // para este case sugiro fazermos outro menu para escolher qual dos parametros
            // (nome idade salario especificacao ou cc)quer alterar e depois alterar
            break;

        case 5:
            double salarioBase = 0;
            double perc = 0;
            int n = 0;
            System.out.println("Pretende diminuir ou aumentar o salário? \n");
            System.out.println("Introduza 0 para diminuir ou 1 para aumentar: ");

            // ler int
            if (n == 1) {
                System.out.println("Introduza a percentagem de salario a aumentar: ");
                // perc = ler percentagem;
                salarioBase = salarioBase + (salarioBase * perc) / 100.0;
            }
            if (n == 0) {
                System.out.println("Introduza a percentagem de salario a diminuir: ");
                // perc = ler percentagem;
                salarioBase = salarioBase - (salarioBase * perc) / 100.0;
            } else
                System.out.println("Introduza 0 para diminuir ou 1 para aumentar: ");
            // ler int
            break;

        case 6:
            int numTotal = tecnicoList.size();
            System.out.println("Número total de Técnicos: " + numTotal + "\n");

            break;

        case 7:
            for (int i = 0; i < tecnicoList.size(); i++)
                System.out.println(tecnicoList.get(i));

            break;

        case 8:
            menu();
            break;

        default:
            menu();
            break;
        }
        s.close();

    }

    public static void gerirEmpresa() {
        Scanner s = new Scanner(System.in);

        System.out.println(
                "========VISÃO GERAL DA EMPRESA========\n\n\n1 - Consultar Lucro Total e Lucro Médio\n2 - Consultar Investimento Total e Investimento Médio\n3 - Consultar Assistência Total e Assistência Média\n4 - Voltar Ao Menu Pricipal");

        switch (s.nextInt()) {
        case 1:
            float brutoTotal = 0;
            float investimentoTotal = 0;
            float lucroTotal;
            float lucroMedio;

            for (int i = 0; i < espetaculoList.size(); i++) {

                brutoTotal = brutoTotal + espetaculoList.get(i).getBruto();
                investimentoTotal = investimentoTotal + espetaculoList.get(i).getInvestimento();

            }
            lucroTotal = brutoTotal - investimentoTotal;
            lucroMedio = lucroTotal / (espetaculoList.size());
            System.out.println("Lucro Total: " + lucroTotal + "\n");
            System.out.println("Lucro Médio: " + lucroMedio + "\n");

            break;

        case 2:

            float investTotal = 0;
            float investimentoMedio;

            for (int i = 0; i < espetaculoList.size(); i++)
                investTotal = investTotal + espetaculoList.get(i).getInvestimento();
            investimentoMedio = investTotal / (espetaculoList.size());

            System.out.println("Investimento Total: " + investTotal + "\n");
            System.out.println("Investimento Médio: " + investimentoMedio + "\n");

            break;

        case 3:
            float lotacaoTotal = 0;
            float assistMedia;

            for (int i = 0; i < espetaculoList.size(); i++)
                lotacaoTotal = lotacaoTotal + espetaculoList.get(i).getInvestimento();
            assistMedia = lotacaoTotal / (espetaculoList.size());

            System.out.println("Assistência Total: " + lotacaoTotal + "\n");
            System.out.println("Assistência Média: " + assistMedia + "\n");
            break;

        case 4:
            menu();
            break;

        default:
            menu();
            break;
        }
        s.close();

    }

    public static void writeToFileBailarinos(){
        try {
            FileOutputStream fos = new FileOutputStream(bailarinos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);   
            oos.writeObject(bailarinoList); // write MenuArray to ObjectOutputStream
            oos.close(); 
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void writeToFileCoreografo(){
        try {
            FileOutputStream fos = new FileOutputStream(coreografos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);   
            oos.writeObject(coreografoList); // write MenuArray to ObjectOutputStream
            oos.close(); 
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void writeToFileTecnicos(){
        try {
            FileOutputStream fos = new FileOutputStream(tecnicos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);   
            oos.writeObject(tecnicoList); // write MenuArray to ObjectOutputStream
            oos.close(); 
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void writeToFileEspetaculos(){
        try {
            FileOutputStream fos = new FileOutputStream(espetaculos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);   
            oos.writeObject(espetaculoList); // write MenuArray to ObjectOutputStream
            oos.close(); 
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}