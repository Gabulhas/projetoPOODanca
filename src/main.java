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
    public static File espetaculos = new File("espetaculos.txt");
    public static File bailarinos = new File("bailarinos.txt");
    public static File coreografos = new File("coreografos.txt");
    public static File tecnicos = new File("tecnicos.txt");
    public static int n = 1;
    public static ArrayList<Espetaculo> espetaculoList = new ArrayList<Espetaculo>();
    public static ArrayList<Coreografo> coreografoList = new ArrayList<Coreografo>();
    public static ArrayList<Tecnico> tecnicoList = new ArrayList<Tecnico>();
    public static ArrayList<Bailarino> bailarinoList = new ArrayList<Bailarino>();

    public static void main(String[] args) throws IOException {

        FileInputStream fis;
        ObjectInputStream ois;
        fis = new FileInputStream("bailarinos.txt");
        ois = new ObjectInputStream(fis);
        try {
            bailarinoList = (ArrayList<Bailarino>) ois.readObject();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            coreografos.createNewFile();
            bailarinos.createNewFile();
        }

        /*
         * fis = new FileInputStream("coreografo.txt"); ois = new
         * ObjectInputStream(fis); try { coreografoList = (ArrayList<Coreografo>)
         * ois.readObject(); } catch (ClassNotFoundException e) {
         * 
         * e.printStackTrace(); } catch (IOException e) { coreografos.createNewFile();
         * bailarinos.createNewFile(); }
         * 
         * fis = new FileInputStream("espetaculos.txt"); ois = new
         * ObjectInputStream(fis); try { espetaculoList = (ArrayList<Espetaculo>)
         * ois.readObject(); } catch (ClassNotFoundException e) {
         * 
         * e.printStackTrace(); } catch (IOException e) { espetaculos.createNewFile();
         * 
         * e.printStackTrace(); } fis = new FileInputStream("tecnicos.txt"); ois = new
         * ObjectInputStream(fis); try { tecnicoList = (ArrayList<Tecnico>)
         * ois.readObject(); } catch (ClassNotFoundException e) {
         * 
         * e.printStackTrace(); } catch (IOException e) { tecnicos.createNewFile();
         * 
         * e.printStackTrace(); }
         * 
         */

        menu();

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
            gerirCoreografos();
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
        Scanner s = new Scanner(System.in);
        // Scanner s = new Scanner(System.in);
        System.out.println(
                "========GERIR ESPETÁCULOS========\n1 - Criar Espetáculo\n2 - Remover Espetáculo\n3 - Consultar Espetáculo\n4 - Alterar Espetáculo\n5 - Consultar Investimento\n6 - Calcular Lucro\n7 - Consultar Lotação\n8 - Consultar numero total de Espetáculos\n9 - Listar todos os Espetáculos\n10 - Voltar Atrás");
        switch (s.nextInt()) {
        case 1:
        

            break;
            case 2:
        

            break;

            case 3:
        

            break;

            case 4:
        

            break;

            case 5:
        

            break;

            case 6:
        

            break;



        default:
            break;
        }

    }

    public static void gerirBailarinos() {

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
            int indexaAlterar = 0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getNome() == nomeConsultar) {
                        indexaAlterar = i;
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getCc() == ccConsultar) {
                        indexaAlterar = i;
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
            int indexaAlterarSalario = 0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getNome() == nomeConsultar) {
                        indexaAlterarSalario = i;
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < bailarinoList.size(); i++) {
                    if (bailarinoList.get(i).getCc() == ccConsultar) {
                        indexaAlterarSalario = i;
                    }

                }

                break;

            }
            System.out.println("Salario Atual: " + bailarinoList.get(indexaAlterarSalario).getSalario());
            System.out.println(
                    "1 - Aumentar a Partir de percentagem\n2 - Aumentar a Partir de um valor\n3 - Diminuir a Partir de percentagem\n4 - Diminuir a Partir de um valor\n5 - Alterar Salario\n\n6 - Voltar Atrás");
            double percentagem = 0;
            double salarioA = 0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Percentagem: ");
                percentagem = s.nextDouble();
                salarioA = bailarinoList.get(indexaAlterarSalario).getSalario();
                bailarinoList.get(indexaAlterarSalario).setSalario(salarioA + salarioA * (percentagem / 100));
                break;
            case 2:
                System.out.println("Valor: ");
                salarioA = bailarinoList.get(indexaAlterarSalario).getSalario() + s.nextDouble();
                bailarinoList.get(indexaAlterarSalario).setSalario(salarioA);

                break;
            case 3:
                System.out.println("Percentagem: ");

                percentagem = s.nextDouble();
                salarioA = bailarinoList.get(indexaAlterarSalario).getSalario();
                bailarinoList.get(indexaAlterarSalario).setSalario(salarioA - salarioA * (percentagem / 100));
                break;
            case 4:
                System.out.println("Valor: ");
                salarioA = bailarinoList.get(indexaAlterarSalario).getSalario() - s.nextDouble();
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
                "========GERIR COREOGRAFOS========\n1 - Adicionar Coreografo\n2 - Remover Coreografo\n3 - Consultar Coreografo\n4 - Alterar Coreografo\n5 - Alterar Salario\n6 - Consultar numero total de Coreografos\n7 - Listar todos os Coreografos\n8 - Voltar Atrás");
        switch (s.nextInt()) {
        case 1:
            Coreografo x;
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

            // remover genero para facilitar e inicializar com salario base por exemplo
            // 1000€

            x = new Coreografo(nome, cc, idade, salario); // no construtor deves diminuir os parametros para apenas
                                                          // estes
                                                          // (facilitar trabalho)
            coreografoList.add(x);
            writeToFileCoreografo();
            break;
        case 2:
            System.out.println("Remover a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            n = s.nextInt();
            switch (n) {

            case 1:
                System.out.println("Nome:\n");
                String nomeRemover = s.next();
                for (int i = 0; i < coreografoList.size(); i++) {
                    if (coreografoList.get(i).getNome() == nomeRemover) {
                        coreografoList.remove(i);
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccRemover = s.nextFloat();
                for (int i = 0; i < coreografoList.size(); i++) {
                    if (coreografoList.get(i).getCc() == ccRemover) {
                        coreografoList.remove(i);
                    }

                }

                break;

            default:
                gerirCoreografos();
                break;

            }
            writeToFileCoreografo();

            break;

        case 3:

            System.out.println("Consultar a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            // ler nome
            // = nome lido
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < coreografoList.size(); i++) {
                    if (coreografoList.get(i).getNome().equals(nomeConsultar)) {
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
                gerirCoreografos();
                break;

            }
            break;
        case 4:

            System.out.println("Escolher coreografo a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            Coreografo aAlterar = new Coreografo("", 0, 0, 0);
            int indexaAlterar = 0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < coreografoList.size(); i++) {
                    if (coreografoList.get(i).getNome() == nomeConsultar) {
                        indexaAlterar = i;
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < coreografoList.size(); i++) {
                    if (coreografoList.get(i).getCc() == ccConsultar) {
                        indexaAlterar = i;
                    }

                }

                break;

            }
            System.out.println("Coreografo a alterar: " + coreografoList.get(indexaAlterar));
            System.out.println("O que deseja alterar:\n1 - Nome\n2 - Idade\n3 - CC\n4 - Salario\n\n5 - Voltar Atrás");
            switch (s.nextInt()) {
            case 1:
                System.out.println("Nome: ");

                coreografoList.get(indexaAlterar).setNome(s.next());
                gerirCoreografos();

                break;
            case 2:
                System.out.println("Idade: ");
                coreografoList.get(indexaAlterar).setIdade(s.nextInt());
                gerirCoreografos();

                break;
            case 3:
                System.out.println("CC: ");
                coreografoList.get(indexaAlterar).setCc(s.nextFloat());
                gerirCoreografos();

                break;
            case 4:
                System.out.println("Salario");
                coreografoList.get(indexaAlterar).setSalario(s.nextDouble());
                gerirCoreografos();

                break;

            default:
                gerirCoreografos();
                break;
            }

        case 5:
            System.out.println("Escolher coreografo a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            int indexaAlterarSalario = 0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < coreografoList.size(); i++) {
                    if (coreografoList.get(i).getNome() == nomeConsultar) {
                        indexaAlterarSalario = i;
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < coreografoList.size(); i++) {
                    if (coreografoList.get(i).getCc() == ccConsultar) {
                        indexaAlterarSalario = i;
                    }

                }

                break;

            }
            System.out.println("Salario Atual: " + coreografoList.get(indexaAlterarSalario).getSalario());
            System.out.println(
                    "1 - Aumentar a Partir de percentagem\n2 - Aumentar a Partir de um valor\n3 - Diminuir a Partir de percentagem\n4 - Diminuir a Partir de um valor\n5 - Alterar Salario\n\n6 - Voltar Atrás");
            double percentagem = 0;
            double salarioA = 0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Percentagem: ");
                percentagem = s.nextDouble();
                salarioA = coreografoList.get(indexaAlterarSalario).getSalario();
                coreografoList.get(indexaAlterarSalario).setSalario(salarioA + salarioA * (percentagem / 100));
                break;
            case 2:
                System.out.println("Valor: ");
                salarioA = coreografoList.get(indexaAlterarSalario).getSalario() + s.nextDouble();
                coreografoList.get(indexaAlterarSalario).setSalario(salarioA);

                break;
            case 3:
                System.out.println("Percentagem: ");

                percentagem = s.nextDouble();
                salarioA = coreografoList.get(indexaAlterarSalario).getSalario();
                coreografoList.get(indexaAlterarSalario).setSalario(salarioA - salarioA * (percentagem / 100));
                break;
            case 4:
                System.out.println("Valor: ");
                salarioA = coreografoList.get(indexaAlterarSalario).getSalario() - s.nextDouble();
                coreografoList.get(indexaAlterarSalario).setSalario(salarioA);

                break;
            case 5:
                System.out.println("Valor: ");
                coreografoList.get(indexaAlterarSalario).setSalario(s.nextDouble());

                break;
            default:
                gerirCoreografos();
                break;

            }

        case 6:
            int numTotal = coreografoList.size();
            System.out.println("Número total de Coreografos: " + numTotal + "\n");

            break;

        case 7:
            for (int i = 0; i < coreografoList.size(); i++)
                System.out.println(coreografoList.get(i));

            break;

        case 8:
            menu();
            break;

        default:
            menu();
            break;
        }

        gerirCoreografos();

    }

    public static void gerirTecnicos() {
        Scanner s = new Scanner(System.in);

        System.out.println(
                "========GERIR COREOGRAFOS========\n1 - Adicionar Tecnico\n2 - Remover Tecnico\n3 - Consultar Tecnico\n4 - Alterar Tecnico\n5 - Alterar Salario\n6 - Consultar numero total de Tecnicos\n7 - Listar todos os Tecnicos\n8 - Listar Tecnicos por especificação\n9 - Voltar Atrás");
        switch (s.nextInt()) {
        case 1:
            Tecnico x;
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

            System.out.println("Especificação");
            String especificacao = s.next();

            // remover genero para facilitar e inicializar com salario base por exemplo
            // 1000€

            x = new Tecnico(nome, cc, especificacao, salario, idade);// no construtor deves diminuir os parametros para
                                                                     // apenas estes
            // (facilitar trabalho)
            tecnicoList.add(x);
            writeToFileTecnicos();
            break;
        case 2:
            System.out.println("Remover a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            n = s.nextInt();
            switch (n) {

            case 1:
                System.out.println("Nome:\n");
                String nomeRemover = s.next();
                for (int i = 0; i < tecnicoList.size(); i++) {
                    if (tecnicoList.get(i).getNome() == nomeRemover) {
                        tecnicoList.remove(i);
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccRemover = s.nextFloat();
                for (int i = 0; i < tecnicoList.size(); i++) {
                    if (tecnicoList.get(i).getCc() == ccRemover) {
                        tecnicoList.remove(i);
                    }

                }

                break;

            default:
                gerirTecnicos();
                break;

            }
            writeToFileTecnicos();

            break;

        case 3:

            System.out.println("Consultar a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            // ler nome
            // = nome lido
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < tecnicoList.size(); i++) {
                    if (tecnicoList.get(i).getNome().equals(nomeConsultar)) {
                        System.out.println(tecnicoList.get(i));
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < tecnicoList.size(); i++) {
                    if (tecnicoList.get(i).getCc() == ccConsultar) {
                        System.out.println(tecnicoList.get(i));
                    }

                }

                break;

            default:
                gerirTecnicos();
                break;

            }
            break;
        case 4:

            System.out.println("Escolher tecnico a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            Tecnico aAlterar = new Tecnico("", 0, "", 0, 0);
            int indexaAlterar = 0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < tecnicoList.size(); i++) {
                    if (tecnicoList.get(i).getNome() == nomeConsultar) {
                        indexaAlterar = i;
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < tecnicoList.size(); i++) {
                    if (tecnicoList.get(i).getCc() == ccConsultar) {
                        indexaAlterar = i;
                    }

                }

                break;

            }
            System.out.println("Tecnico a alterar: " + tecnicoList.get(indexaAlterar));
            System.out.println("O que deseja alterar:\n1 - Nome\n2 - Idade\n3 - CC\n4 - Salario\n\n5 - Voltar Atrás");
            switch (s.nextInt()) {
            case 1:
                System.out.println("Nome: ");

                tecnicoList.get(indexaAlterar).setNome(s.next());
                gerirTecnicos();

                break;
            case 2:
                System.out.println("Idade: ");
                tecnicoList.get(indexaAlterar).setIdade(s.nextInt());
                gerirTecnicos();

                break;
            case 3:
                System.out.println("CC: ");
                tecnicoList.get(indexaAlterar).setCc(s.nextFloat());
                gerirTecnicos();

                break;
            case 4:
                System.out.println("Salario");
                tecnicoList.get(indexaAlterar).setSalario(s.nextDouble());
                gerirTecnicos();

                break;

            default:
                gerirTecnicos();
                break;
            }

        case 5:
            System.out.println("Escolher tecnico a partir do \n1 - Nome\n2 - CC\n\n3 - Voltar atrás");
            int indexaAlterarSalario = 0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Nome:\n");
                String nomeConsultar = s.next();
                for (int i = 0; i < tecnicoList.size(); i++) {
                    if (tecnicoList.get(i).getNome() == nomeConsultar) {
                        indexaAlterarSalario = i;
                    }

                }

                break;
            case 2:
                System.out.println("CC:\n");
                float ccConsultar = s.nextFloat();
                for (int i = 0; i < tecnicoList.size(); i++) {
                    if (tecnicoList.get(i).getCc() == ccConsultar) {
                        indexaAlterarSalario = i;
                    }

                }

                break;

            }
            System.out.println("Salario Atual: " + tecnicoList.get(indexaAlterarSalario).getSalario());
            System.out.println(
                    "1 - Aumentar a Partir de percentagem\n2 - Aumentar a Partir de um valor\n3 - Diminuir a Partir de percentagem\n4 - Diminuir a Partir de um valor\n5 - Alterar Salario\n\n6 - Voltar Atrás");
            double percentagem = 0;
            double salarioA = 0;
            switch (s.nextInt()) {

            case 1:
                System.out.println("Percentagem: ");
                percentagem = s.nextDouble();
                salarioA = tecnicoList.get(indexaAlterarSalario).getSalario();
                tecnicoList.get(indexaAlterarSalario).setSalario(salarioA + salarioA * (percentagem / 100));
                break;
            case 2:
                System.out.println("Valor: ");
                salarioA = tecnicoList.get(indexaAlterarSalario).getSalario() + s.nextDouble();
                tecnicoList.get(indexaAlterarSalario).setSalario(salarioA);

                break;
            case 3:
                System.out.println("Percentagem: ");

                percentagem = s.nextDouble();
                salarioA = tecnicoList.get(indexaAlterarSalario).getSalario();
                tecnicoList.get(indexaAlterarSalario).setSalario(salarioA - salarioA * (percentagem / 100));
                break;
            case 4:
                System.out.println("Valor: ");
                salarioA = tecnicoList.get(indexaAlterarSalario).getSalario() - s.nextDouble();
                tecnicoList.get(indexaAlterarSalario).setSalario(salarioA);

                break;
            case 5:
                System.out.println("Valor: ");
                tecnicoList.get(indexaAlterarSalario).setSalario(s.nextDouble());

                break;
            default:
                gerirTecnicos();
                break;

            }

        case 6:
            int numTotal = tecnicoList.size();
            System.out.println("Número total de Tecnicos: " + numTotal + "\n");

            break;

        case 7:
            for (int i = 0; i < tecnicoList.size(); i++)
                System.out.println(tecnicoList.get(i));

            break;

        case 8:
            System.out.println("Especificação:");
            String temp = s.next();

            for (int i = 0; i < tecnicoList.size(); i++) {
                if (tecnicoList.get(i).getEspecificacao().equals(temp)) {
                    System.out.println(tecnicoList.get(i));
                }

            }
            break;

        default:
            menu();
            break;
        }

        gerirTecnicos();

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

    public static void writeToFileBailarinos() {
        try {
            FileOutputStream fos = new FileOutputStream(bailarinos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bailarinoList); // write MenuArray to ObjectOutputStream
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeToFileCoreografo() {
        try {
            FileOutputStream fos = new FileOutputStream(coreografos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(coreografoList); // write MenuArray to ObjectOutputStream
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeToFileTecnicos() {
        try {
            FileOutputStream fos = new FileOutputStream(tecnicos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tecnicoList); // write MenuArray to ObjectOutputStream
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeToFileEspetaculos() {
        try {
            FileOutputStream fos = new FileOutputStream(espetaculos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(espetaculoList); // write MenuArray to ObjectOutputStream
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}