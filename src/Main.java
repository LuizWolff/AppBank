import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String senha;
        String nome;
        String CPF;
        String contaBancaria;

        Random gerador = new Random();

        int opcao = 0;
        int saldo = 0;
        int conta;
        int pFpJ;
        int agencia = 1228;
        int numeroAleatorio = gerador.nextInt(10000000) + 10000000;
        int numeroAleatorio2 = gerador.nextInt(10) + 1;

        double saque;
        double saqueTaxa;
        double deposito;
        double transferencia;
        double investir;
        double jurosInvestir;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo ao AppBank!\nDigite um número para acessar algumas das " +
                "opções:");
        //Colocar o While aqui
        while (opcao != 7) {
            System.out.println("Menu Principal");
            System.out.println("1 - Abrir Conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferência");
            System.out.println("5 - Investir");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Sair");
            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1: //============================Opção 1 - Abrir Conta===============================
                    System.out.println("Para abrir uma conta em banco é necessário os seguintes dados:");
                    System.out.println("Digite seu nome completo: ");
                    nome = entrada.nextLine();
                    System.out.println("Digite seu CPF:");
                    CPF = entrada.nextLine();
                    System.out.println("Digite sua nova senha!");
                    senha = entrada.nextLine();
                    System.out.println("Senha criada com sucesso!");
                    System.out.println("Digite 1 - para uma Conta-Poupança");
                    System.out.println("Digite 2 - para uma Conta-Corrente");
                    conta = Integer.parseInt(entrada.nextLine());

                    switch (conta) {
                        //============================Opção 1 - Abrir Conta===============================
                        //==============================Opção 1- Conta Poupança===============================
                        case 1:
                            System.out.println("Digite 1 - para Pessoa Física");
                            System.out.println("Digite 2 - para uma Pessoa Jurídica");
                            pFpJ = Integer.parseInt(entrada.nextLine());

                            switch (pFpJ) {
                                //============================Opção 1 - Abrir Conta===============================
                                //==============================Opção 1- Conta Poupança===============================
                                //====================================Opção 1- Pessoa Física=========================================
                                case 1:
                                    System.out.println("\nConta Criada com sucesso, segue abaixo os dados da conta:");
                                    System.out.printf("Nome: %s \nCPF: %s \nConta-Poupança\n", nome, CPF);
                                    System.out.printf("Número da Agencia: %d \nNúmero Conta: %d-%d", agencia, numeroAleatorio, numeroAleatorio2);
                                    System.out.println("\nAnote seu Número de Agencia e Número da conta, " +
                                            "voltando para o Menu Principal.\n");
                                    break;
                                //============================Opção 1 - Abrir Conta===============================
                                //==============================Opção 1- Conta Poupança===============================
                                //====================================Opção 2- Pessoa Jurídica=========================================
                                case 2:
                                    System.out.println("Pessoa jurídica não pode abrir conta Poupança, por favor " +
                                            "inicie novamente o programa. Obrigado!\n");
                                    break;
                                default: {
                                    System.out.println("Não entendi a resposta, por favor inicie o programa novamente.");
                                    break;
                                }
                            }
                            break;

                        case 2: {
                            //============================Opção 1 - Abrir Conta======================================
                            //============================Opção 2 - Conta-Corrente========================================
                            System.out.println("Digite 1 - para Pessoa Física");
                            System.out.println("Digite 2 - para uma Pessoa Jurídica");
                            pFpJ = Integer.parseInt(entrada.nextLine());
                            switch (pFpJ) {
                                case 1:
                                    //=======================Opção 1 - Abrir Conta======================================
                                    //=======================Opção 2 - Conta-Corrente========================================
                                    //=======================Opção 1 - Pessoa Física=========================================
                                    System.out.println("\nConta Criada com sucesso, segue abaixo os dados da conta:");
                                    System.out.printf("Nome: %s \nCPF: %s \nConta-Corrente\n", nome, CPF);
                                    System.out.printf("Número da Agencia: %d \nNúmero Conta: %d-%d", agencia,
                                            numeroAleatorio, numeroAleatorio2);
                                    System.out.println("\nAnote seu Número de Agencia e Número da conta, " +
                                            "qualquer tecla pressionada " + "vai encerrar o programa.\n");
                                    break;
                                case 2:
                                    //=======================Opção 1 - Abrir Conta======================================
                                    //=======================Opção 2 - Conta-Corrente========================================
                                    //=======================Opção 2 - Pessoa Jurídica======================================
                                    System.out.println("\nConta Criada com sucesso, segue abaixo os dados da conta:");
                                    System.out.printf("Nome: %s \nCPF: %s \nConta-Corrente\n", nome, CPF);
                                    System.out.printf("Número da Agencia: %d \nNúmero Conta: %d-%d", agencia,
                                            numeroAleatorio, numeroAleatorio2);
                                    System.out.println("\nLembrando que além do produto conta-corrente, os clientes PF podem abrir " +
                                            "uma conta-poupança e conta-investimento.\n" +
                                            "\nAnote seu Número de Agencia e Número da conta, qualquer tecla pressionada " +
                                            "vai encerrar o programa.\n");
                                    break;
                            }
                        }
                        //============================Opção 1 - Abrir Conta===============================
                        //==============================Opção 1- Conta Poupança===============================
                        //=============================Opção default==========================================
                        break;
                        default:
                            System.out.println("Não entendi a resposta, por favor inicie o programa novamente.\n");
                            break;
                    }// Fim do case 1 que é o abrir conta
                    break;
                //==============================Opção 2- Sacar===========================================
                //Clientes PF podem abrir uma conta-poupança e conta-investimento.
                //Clientes PJ não abrem poupança.
                case 2: {
                    System.out.println("Digite 1 - para Pessoa Física");
                    System.out.println("Digite 2 - para uma Pessoa Jurídica");
                    pFpJ = Integer.parseInt(entrada.nextLine());

                    switch (pFpJ) {
                        //===========================Opção 2- Sacar===========================================
                        // ==========================Opção 1- Pessoa Física=============================================
                        case 1: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());

                            switch (conta) {
                                //=========================Opção 2- Sacar===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 1- Conta-Poupança==================================
                                case 1: {
                                    System.out.println("Para sacar em uma Conta-Poupança em banco é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println("Digite o valor para saque:");
                                    saque = Double.parseDouble(entrada.nextLine());
                                    System.out.printf("Nome: %s \nCPF: %s \nConta-Poupança\n", nome, CPF);
                                    System.out.printf("Seu valor do saque:\nR$%.2f\n", saque);
                                    System.out.println("Saque realizado com sucesso!\n");
                                    break;
                                }
                                //=========================Opção 2- Sacar===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 2- Conta-Corrente===========================
                                case 2: {
                                    System.out.println("Para sacar em uma Conta-Corrente em banco é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println("Digite o valor para saque:");
                                    saque = Double.parseDouble(entrada.nextLine());
                                    System.out.printf("Nome: %s \nCPF: %s \nConta-Poupança\n", nome, CPF);
                                    System.out.printf("Seu valor do saque:\nR$%.2f\n", saque);
                                    System.out.println("Saque realizado com sucesso!");
                                    break;
                                }
                            }
                        }
                        break;
                        //=========================Opção 2- Sacar===========================================
                        // ========================Opção 2- Pessoa Júridica=============================================
                        //PJ existe a cobrança de uma taxa de 0.5% para cada saque ou transferência.
                        case 2: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());
                            switch (conta) {
                                //=========================Opção 2- Sacar===========================================
                                // ========================Opção 2- Pessoa Júridica================================
                                //=========================Opção 1- Conta-Poupança===================================
                                //=========================Clientes PJ não abrem poupança===========================
                                case 1: {
                                    System.out.println("Pessoa jurídica não pode abrir conta Poupança, por favor " +
                                            "inicie novamente o programa. Obrigado!\n");
                                    break;
                                }
                                //=========================Opção 2- Sacar===========================================
                                // ========================Opção 2- Pessoa Júridica=================================
                                //=========================Opção 2- Conta-Corrente==================================
                                case 2: {
                                    System.out.println("Para sacar em uma Conta-Corrente em banco é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println("Clientes PJ existe a cobrança de uma taxa de 0.5% para " +
                                            "cada saque ou transferência.\n");
                                    System.out.println("Você deseja continuar? Digite um número");
                                    System.out.println("1 - Sim");
                                    System.out.println("2 - Não");
                                    opcao = Integer.parseInt(entrada.nextLine());

                                    switch (opcao) {
                                        //=========================Opção 2- Sacar===========================================
                                        // ========================Opção 2- Pessoa Júridica=================================
                                        //=========================Opção 2- Conta-Corrente==================================
                                        //=========================Opção 1 - Sim============================================
                                        case 1: {
                                            System.out.println("Digite o valor para saque:");
                                            saque = Double.parseDouble(entrada.nextLine());
                                            saqueTaxa = saque + (saque * 0.05);
                                            System.out.printf("Nome: %s \nCPF: %s \nConta-Corrente\n", nome, CPF);
                                            System.out.printf("Novo valor do saque:\nR$%.2f\n", saqueTaxa);
                                            System.out.println("Saque realizado com sucesso!");
                                            break;
                                        }
                                        //=========================Opção 2- Sacar===========================================
                                        // ========================Opção 2- Pessoa Júridica=================================
                                        //=========================Opção 2- Conta-Corrente===================================
                                        // ========================Opção Default============================================
                                        default: {
                                            System.out.println("Obrigado por usar o programa AppBank!\n ");
                                            break;
                                        }
                                    }
                                    break;

                                }
                            }
                            //======================Digito não reconhecido=======================================
//                                default:
//                                    System.out.println("Não entendi a resposta, por favor inicie o programa novamente.\n");
//                                    break;
                        }
                        //======================Digito não reconhecido=======================================
                        default:
                            System.out.println("Não entendi a resposta, por favor inicie o programa novamente.\n");
                            break;
                    }

                }
                //Fim do Case 2 que é o saque.
                break;
                case 3: {
                    //==============================Opção 3- Depositar===========================================
                    //Clientes PF podem abrir uma conta-poupança e conta-investimento.
                    //Clientes PJ não abrem poupança.
                    // código para depositar

                    System.out.println("Digite 1 - para Pessoa Física");
                    System.out.println("Digite 2 - para uma Pessoa Jurídica");
                    pFpJ = Integer.parseInt(entrada.nextLine());


                    switch (pFpJ) {
                        //===========================Opção 3- Depositar===========================================
                        // ==========================Opção 1- Pessoa Física=============================================
                        case 1: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());

                            switch (conta) {
                                //=========================Opção 3- Depositar===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 1- Conta-Poupança==================================
                                case 1: {
                                    System.out.println("Para depositar em uma Conta-Poupança em banco é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println("Digite o valor para deposito:");
                                    deposito = Double.parseDouble(entrada.nextLine());
                                    System.out.printf("Nome: %s \nCPF: %s \nConta-Poupança\n", nome, CPF);
                                    System.out.printf("Seu valor do deposito:\nR$%.2f\n", deposito);
                                    System.out.println("Deposito realizado com sucesso!\n");
                                    break;
                                }
                                //=========================Opção 3- Deposito===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 2- Conta-Corrente===========================
                                case 2: {
                                    System.out.println("Para depositar em uma Conta-Corrente em banco é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println("Digite o valor para o deposito:");
                                    deposito = Double.parseDouble(entrada.nextLine());
                                    System.out.printf("Nome: %s \nCPF: %s \nConta-Poupança\n", nome, CPF);
                                    System.out.printf("Seu valor do deposito:\nR$%.2f\n", deposito);
                                    System.out.println("Deposito realizado com sucesso!\n");
                                    break;
                                }
                            }
                        }
                        break;
                        //=========================Opção 3- Depositar===========================================
                        // ========================Opção 2- Pessoa Júridica=============================================
                        case 2: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());
                            switch (conta) {
                                //=========================Opção 3- Depositar===========================================
                                // ========================Opção 2- Pessoa Júridica================================
                                //=========================Opção 1- Conta-Poupança===================================
                                //=========================Clientes PJ não abrem poupança===========================
                                case 1: {
                                    System.out.println("Pessoa jurídica não pode abrir conta Poupança, por favor " +
                                            "inicie novamente o programa. Obrigado!\n");
                                    break;
                                }
                                //=========================Opção 3- Depositar===========================================
                                // ========================Opção 2- Pessoa Júridica=================================
                                //=========================Opção 2- Conta-Corrente==================================
                                case 2: {
                                    System.out.println("Para depositar em uma Conta-Corrente em banco é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println("Você deseja continuar? Digite um número");
                                    System.out.println("1 - Sim");
                                    System.out.println("2 - Não");
                                    opcao = Integer.parseInt(entrada.nextLine());

                                    switch (opcao) {
                                        //=========================Opção 3- Sacar===========================================
                                        // ========================Opção 2- Pessoa Júridica=================================
                                        //=========================Opção 2- Conta-Corrente==================================
                                        //=========================Opção 1 - Sim============================================
                                        case 1: {
                                            System.out.println("Digite o valor para o deposito:");
                                            deposito = Double.parseDouble(entrada.nextLine());
                                            System.out.printf("Nome: %s \nCPF: %s \nConta-Corrente\n", nome, CPF);
                                            System.out.println("Deposito realizado com sucesso!\n");
                                            break;
                                        }
                                        //=========================Opção 3- Depositar===========================================
                                        // ========================Opção 2- Pessoa Júridica=================================
                                        //=========================Opção 2- Conta-Corrente===================================
                                        // ========================Opção Default============================================
                                        default: {
                                            System.out.println("Obrigado por usar o programa AppBank!\n ");
                                            break;
                                        }
                                    }
                                }
                            }
                            break;

                        }

                        //======================Digito não reconhecido=======================================
                        default:
                            System.out.println("Não entendi a resposta, por favor inicie o programa novamente.\n");
                            break;
                    }
                }
                //==============================Fim do Case 3 que é o deposito====================================

                case 4: {//============================Opção 4 - Transferência===============================

                    System.out.println("Digite 1 - para Pessoa Física");
                    System.out.println("Digite 2 - para uma Pessoa Jurídica");
                    pFpJ = Integer.parseInt(entrada.nextLine());

                    switch (pFpJ) {
                        //===========================Opção 4- Transferência===========================================
                        // ==========================Opção 1- Pessoa Física=============================================
                        case 1: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());

                            switch (conta) {
                                //=========================Opção 4- Transferência===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 1- Conta-Poupança==================================
                                case 1: {
                                    System.out.println("Para transferir em uma Conta-Poupança no AppBank é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println("Digite o número do banco para a transferência: ");
                                    contaBancaria = (entrada.nextLine());
                                    System.out.println("Digite o valor da transferência");
                                    transferencia = Double.parseDouble(entrada.nextLine());
                                    System.out.println();
                                    System.out.printf("Nome: %s \nCPF: %s \nNúmero da conta bancaria para Transferência\n%s\n",
                                            nome, CPF, contaBancaria);
                                    System.out.printf("Seu valor para transferência:\nR$%.2f\n", transferencia);
                                    System.out.println("Transferência realizado com sucesso!\n");
                                    break;
                                }
                                //=========================Opção 4- Transferência===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 2- Conta-Corrente===========================
                                case 2: {
                                    System.out.println("Para transferir em uma Conta-Corrente em banco é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println("Digite o número do banco para a transferência: ");
                                    contaBancaria = (entrada.nextLine());
                                    System.out.println("Digite o valor da transferência");
                                    transferencia = Double.parseDouble(entrada.nextLine());
                                    System.out.println();
                                    System.out.printf("Nome: %s \nCPF: %s \nNúmero da conta bancaria para Transferência:\n%s\n",
                                            nome, CPF, contaBancaria);
                                    System.out.printf("Seu valor para transferência:\nR$%.2f\n", transferencia);
                                    System.out.println("Transferência realizado com sucesso!\n");
                                    break;
                                }
                            }
                        }
                        break;
                        //=========================Opção 4- Transferência===========================================
                        // ========================Opção 2- Pessoa Júridica=============================================
                        //PJ existe a cobrança de uma taxa de 0.5% para cada saque ou transferência.
                        case 2: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());
                            switch (conta) {
                                //=========================Opção 4- Transferência===========================================
                                // ========================Opção 2- Pessoa Júridica================================
                                //=========================Opção 1- Conta-Poupança===================================
                                //=========================Clientes PJ não abrem poupança===========================
                                case 1: {
                                    System.out.println("Pessoa jurídica não pode abrir conta Poupança, por favor " +
                                            "inicie novamente o programa. Obrigado!\n");
                                    break;
                                }
                                //=========================Opção 4- Transferência===========================================
                                // ========================Opção 2- Pessoa Júridica=================================
                                //=========================Opção 2- Conta-Corrente==================================
                                case 2: {
                                    System.out.println("Para transferir em uma Conta-Corrente no AppBank é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println("Clientes PJ existe a cobrança de uma taxa de 0.5% para " +
                                            "cada saque ou transferência.\n");
                                    System.out.println("Você deseja continuar? Digite um número");
                                    System.out.println("1 - Sim");
                                    System.out.println("2 - Não");
                                    opcao = Integer.parseInt(entrada.nextLine());

                                    switch (opcao) {
                                        //=========================Opção 4- Transferência===========================================
                                        // ========================Opção 2- Pessoa Júridica=================================
                                        //=========================Opção 2- Conta-Corrente==================================
                                        //=========================Opção 1 - Sim============================================
                                        case 1: {
                                            System.out.println("Digite o número da conta bancaria para transferir: ");
                                            contaBancaria = entrada.nextLine();
                                            System.out.println("Digite o valor para a transferencia:");
                                            saque = Double.parseDouble(entrada.nextLine());
                                            saqueTaxa = saque + (saque * 0.05);
                                            System.out.printf("Nome: %s \nCPF: %s \nTransferência Conta-Corrente\n", nome, CPF);
                                            System.out.printf("Número do banco que vai ser transferido:\n%s\n", contaBancaria);
                                            System.out.println("Valor com -5%:");
                                            System.out.printf("R$%.2f\n", saqueTaxa);
                                            System.out.println("Transferencia realizado com sucesso!");
                                            break;
                                        }
                                        //=========================Opção 4- Sacar===========================================
                                        // ========================Opção 2- Pessoa Júridica=================================
                                        //=========================Opção 2- Conta-Corrente===================================
                                        // ========================Opção Default============================================
                                    }
                                    break;

                                }

                            }
                        }

                        //======================Digito não reconhecido=======================================
                        default:
                            System.out.println("Não entendi a resposta, por favor inicie o programa novamente.\n");
                            break;
                    }
                }//===========================Fim do case 4- Transferência===========================
                break;
                case 5:
                {//============================Opção 5 - Investir===============================

                    System.out.println("Digite 1 - para Pessoa Física");
                    System.out.println("Digite 2 - para uma Pessoa Jurídica");
                    pFpJ = Integer.parseInt(entrada.nextLine());

                    switch (pFpJ) {
                        //===========================Opção 5- Investir===========================================
                        // ==========================Opção 1- Pessoa Física=============================================
                        case 1: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());

                            switch (conta) {
                                //=========================Opção 5- Investir===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 1- Conta-Poupança==================================
                                case 1: {
                                    System.out.println("Para consultar saldo em uma Conta-Poupança no AppBank é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println();
                                    System.out.printf("Nome: %s \nCPF: %s \n", nome, CPF);
                                    System.out.printf("Seu saldo:\nR$ %d\n", saldo);
                                    System.out.println("Consulta do saldo realizado com sucesso!\n");
                                    break;
                                }
                                //=========================Opção 5- Investir===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 2- Conta-Corrente===========================
                                case 2: {
                                    System.out.println("Pessoa Física não rende nada em investimentos" +
                                            ", por favor inicie novamente o programa. Obrigado!\n");
                                    break;
                                }
                            }
                        }
                        break;
                        //=========================Opção 5- Investir===========================================
                        // ========================Opção 2- Pessoa Júridica=============================================
                        //PJ existe a cobrança de uma taxa de 0.5% para cada saque ou transferência.
                        case 2: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());
                            switch (conta) {
                                //=========================Opção 5- Investir==========================================
                                // ========================Opção 2- Pessoa Júridica================================
                                //=========================Opção 1- Conta-Poupança===================================
                                //=========================Clientes PJ não abrem poupança===========================
                                case 1: {
                                    System.out.println("Pessoa jurídica não pode abrir conta Poupança, por favor " +
                                            "inicie novamente o programa. Obrigado!\n");
                                    break;
                                }
                                //=========================Opção 5- Investir===========================================
                                // ========================Opção 2- Pessoa Júridica=================================
                                //=========================Opção 2- Conta-Corrente==================================
                                case 2: {
                                    System.out.println("Para realizar um investimento" +
                                            " em uma Conta-Corrente no AppBank é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println();
                                    System.out.println("Qual valor para investir?\n");
                                    investir = Double.parseDouble(entrada.nextLine());
                                    jurosInvestir = (investir * 0.02);
                                    System.out.printf("Nome: %s \nCPF: %s \n\n", nome, CPF);
                                    System.out.printf("%s no primeiro mês vai obter um total de:\n", nome);
                                    saqueTaxa = investir + (investir * 0.02);
                                    System.out.printf("R$ %.2f\n", saqueTaxa);
                                    System.out.printf("Por mês vai obter um valor de: \nR$ %.2f\n", jurosInvestir);
                                    System.out.println("\nConsulta do saldo realizado com sucesso!\n");
                                    break;
                                }

                            }
                        }
                    }
                }
                    break;
                case 6:
                {//============================Opção 6 - Consultar Saldo===============================

                    System.out.println("Digite 1 - para Pessoa Física");
                    System.out.println("Digite 2 - para uma Pessoa Jurídica");
                    pFpJ = Integer.parseInt(entrada.nextLine());

                    switch (pFpJ) {
                        //===========================Opção 6- Consultar Saldo===========================================
                        // ==========================Opção 1- Pessoa Física=============================================
                        case 1: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());

                            switch (conta) {
                                //=========================Opção 6- Consultar Saldo===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 1- Conta-Poupança==================================
                                case 1: {
                                    System.out.println("Para consultar saldo em uma Conta-Poupança no AppBank é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println();
                                    System.out.printf("Nome: %s \nCPF: %s \n", nome, CPF);
                                    System.out.printf("Seu saldo:\nR$ %d\n", saldo);
                                    System.out.println("Consulta do saldo realizado com sucesso!\n");
                                    break;
                                }
                                //=========================Opção 6- Consultar Saldo===========================================
                                // ========================Opção 1- Pessoa Física===================================
                                //=========================Opção 2- Conta-Corrente===========================
                                case 2: {
                                    System.out.println("Para consultar saldo em uma Conta-Corrente no AppBank é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println();
                                    System.out.printf("Nome: %s \nCPF: %s \n", nome, CPF);
                                    System.out.printf("Seu saldo:\nR$ %d\n", saldo);
                                    System.out.println("Consulta do saldo realizado com sucesso!\n");
                                    break;
                                }
                            }
                        }
                        break;
                        //=========================Opção 6- Consultar Saldo===========================================
                        // ========================Opção 2- Pessoa Júridica=============================================
                        //PJ existe a cobrança de uma taxa de 0.5% para cada saque ou transferência.
                        case 2: {
                            System.out.println("Digite 1 - para uma Conta-Poupança");
                            System.out.println("Digite 2 - para uma Conta-Corrente");
                            conta = Integer.parseInt(entrada.nextLine());
                            switch (conta) {
                                //=========================Opção 6- Consultar saldo==========================================
                                // ========================Opção 2- Pessoa Júridica================================
                                //=========================Opção 1- Conta-Poupança===================================
                                //=========================Clientes PJ não abrem poupança===========================
                                case 1: {
                                    System.out.println("Pessoa jurídica não pode abrir conta Poupança, por favor " +
                                            "inicie novamente o programa. Obrigado!\n");
                                    break;
                                }
                                //=========================Opção 6- Conta-Corrente===========================================
                                // ========================Opção 2- Pessoa Júridica=================================
                                //=========================Opção 2- Conta-Corrente==================================
                                case 2: {
                                    System.out.println("Para consultar saldo em uma Conta-Corrente no AppBank é " +
                                            "necessário dos seguintes dados:");
                                    System.out.println("Digite seu nome completo: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Digite seu CPF:");
                                    CPF = entrada.nextLine();
                                    System.out.println("Digite sua senha");
                                    senha = entrada.nextLine();
                                    System.out.println("Senha Correta!");
                                    System.out.println();
                                    System.out.printf("Nome: %s \nCPF: %s \n", nome, CPF);
                                    System.out.printf("Seu saldo:\nR$ %d\n", saldo);
                                    System.out.println("Consulta do saldo realizado com sucesso!\n");
                                    break;
                                }

                            }
                        }

                        //======================Digito não reconhecido=======================================
                        default:
                            System.out.println("Não entendi a resposta, por favor inicie o programa novamente.\n");
                            break;
                    }
                }//============================Fim case 6- Consultar saldo==================================
                    break;
                case 7:
                    //System.out.println("Saindo do programa AppBank");
                    break;
                default:
                    System.out.println("Não entendi a resposta, " +
                            "por favor inicie o programa novamente.\n");
                    break;

            }
        }
    }
}