package bancario;

import java.util.*;

import persistencia.PersistenciaArquivo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersistenciaArquivo pa = new PersistenciaArquivo();
		Scanner sc = new Scanner(System.in);

		boolean sair = true;
		int opcao = 0;
		
		System.out.println("Seja bem-vindo ao Banco Único.");

		while (sair) {
			System.out.println("Escolha uma opção:\n1) Cadastrar um cliente;\n2) Remover cliente;\n3) Entrar como cliente;\n4) Listar clientes cadastrados;\n5) Consultar um cliente por CPF;\n6) Sair;");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				String nome = "";
				String cpf = "";
				System.out.println("Insira o nome do cliente: ");
				nome = sc.next();
				System.out.println("Insira o CPF: ");
				cpf = sc.next();
				Cliente cli = new Cliente(cpf, nome);
				pa.cadastrarCliente(cli);
				break;
			case 2:
				String cpfRemover = "";
				int makeSure;
				System.out.println("Insira o CPF do usuário a ser removido: ");
				cpfRemover = sc.next();
				
				Cliente clientLocalizer = pa.buscarClienteCPF(cpfRemover);
				if(clientLocalizer != null) {
					System.out.println(
							"Você tem certeza de que deseja remover o usuário "+clientLocalizer.nome+" ? \nDigite '0' para confirmar a ação, digite qualquer outro número para cancelar: ");
					makeSure = sc.nextInt();
					
					if(makeSure == 0) {
						pa.removerCliente(clientLocalizer);
						System.out.println("\n\nCliente "+clientLocalizer.nome+" removido com sucesso.");
					} else {
						System.out.println("\n\nAção cancelada.");
					}
					
				} else {
					System.err.println("Cliente não encontrado.");
				}
				
				
				System.out.println("\n\n");
				break;
			case 3:
				System.out.println("Insira o CPF do cliente: ");
				String cpfConsulta = "";
				cpfConsulta = sc.next();
				Cliente cliConsulta = pa.buscarClienteCPF(cpfConsulta);
				if (cliConsulta != null) {
					boolean segundoSair = true;
					int segundaOpcao = 0;
					String cliNome = cliConsulta.nome;
					System.out.println("\n\n\n\nSeja bem-vindo, "+cliNome);
					
					
					
					while (segundoSair) {
						System.out.println(
								"Escolha as opções para a sua Conta: \n1) Cadastrar uma nova conta;\n2) Remover uma conta;\n3) Listar contas;\n4) Acessar uma conta;\n5) Sair.");
						segundaOpcao = sc.nextInt();
						switch (segundaOpcao) {
						case 1:
							String numeroConta = "";
							System.out.println("Insira o número da conta");
							numeroConta = sc.next();
							Conta c1 = new Conta(numeroConta);
							cliConsulta.adicionarConta(c1);
							pa.atualizarCliente(cliConsulta);
							break;
						case 2:
							String rmSair = "";
							int temCerteza;
							int contagemRm = 0;
							String numeroContaRm = "";
							
							ArrayList<Conta> listaContagem = cliConsulta.getContas();
							
							for (int i=0; i<listaContagem.size(); i++){
								contagemRm++;
							}
							System.out.println(
									"Existem um total de "+contagemRm+" contas no nome de "+cliNome+".");
							
							if(contagemRm == 0) {
								System.err.println("Não existem contas disponíveis para remoção.");
							} else {
							
								System.out.println("Insira o número da conta que deseja remover: ");
								numeroContaRm = sc.next();
								
								Conta contaRemover = new Conta(numeroContaRm);
								if(listaContagem.contains(contaRemover)) {
									int index = listaContagem.indexOf(contaRemover);
									contaRemover = listaContagem.get(index);
									
									System.out.println(
											"\nA conta de número "+contaRemover.numero+" será removida permanentemente. Você deseja prosseguir?");
									System.out.println("Digite '0' para remover a conta, digite qualquer outro número para cancelar: ");
									temCerteza = sc.nextInt();
									
									if(temCerteza == 0) {
										
										cliConsulta.removerConta(contaRemover);
										pa.atualizarCliente(cliConsulta);
										System.out.println("\n\nConta removida com sucesso!");
									} else {
										System.out.println("\n\nAção cancelada.");
									}
								} else {
									System.err.println("A conta não foi encontrada.");
								}
								
							}
							
							System.out.println("\nDigite qualquer tecla para continuar.");
							rmSair = sc.next();

							break;
						case 3:
							String listaSair = "";
							ArrayList<Conta> listaContas = cliConsulta.getContas();
							
							if(listaContas.isEmpty()) {
								System.out.println("Não existem contas registradas no nome de "+cliNome);
							} else {
								listaContas.forEach(System.out::println);
							}
							System.out.println("\nDigite qualquer tecla para continuar.");
							listaSair = sc.next();
							
							System.out.println("\n\n\n");
							break;
						case 4:
							int contadorContas = 0;
							String escolherConta = "";
							
							ArrayList<Conta> listagemContas = cliConsulta.getContas();
							
							for (int i=0; i<listagemContas.size(); i++){
								contadorContas++;
							}
							System.out.println(
									"Existem um total de "+contadorContas+" contas no nome de "+cliNome+".");
							System.out.println("Insira o número da conta: ");
							escolherConta = sc.next();
							
							Conta contaEscolhida = new Conta(escolherConta);
							if(listagemContas.contains(contaEscolhida)) {
								int index = listagemContas.indexOf(contaEscolhida);
								contaEscolhida = listagemContas.get(index);
								System.out.println(contaEscolhida);
									
									
								boolean terceiroSair = true;
								int terceiraOpcao;
								System.out.println(
										"\n\n\nA conta de número "+escolherConta+" foi selecionada.");
										
								while (terceiroSair) {
									System.out.println(
											"Escolha as opções para a conta de numero "+contaEscolhida.numero+": \n1) Consultar saldo;\n2) Realizar um depósito;\n3) Realizar um saque;\n4) Sair.");
									terceiraOpcao = sc.nextInt();
											
									switch (terceiraOpcao) {
									case 1:
										String consultaSair = "";
										System.out.println("O saldo da sua conta é: "+contaEscolhida.consultarSaldo());
												
										System.out.println("\nDigite qualquer tecla para continuar.");
										consultaSair = sc.next();
												
										System.out.println("\n\n\n");
										break;
									case 2:
										float deposito;
										System.out.println("\nInsira o valor que deseja depositar: ");
										deposito = sc.nextFloat();
												
										if(deposito < 0f) {
											System.out.println("O valor de deposito inserido é inválido.");
										} else {
											contaEscolhida.realizarDeposito(deposito);
											pa.atualizarCliente(cliConsulta);
											System.out.println(
													"\nO deposito de "+deposito+" foi realizado com sucesso.\n");
										}
												
										break;
									case 3:
										float saque;
										float checkIn = contaEscolhida.consultarSaldo();
										System.out.println(checkIn);
										System.out.println("\nInsira o valor que deseja sacar: ");
										saque = sc.nextFloat();
												
										if(saque <= 0) {
											System.out.println("O valor de saque inserido é inválido.\n");
										} else if(checkIn >= saque) {
											contaEscolhida.realizarSaque(saque);
											pa.atualizarCliente(cliConsulta);
											System.out.println(
													"\nO saque de "+saque+" foi realizado com sucesso.\n");
										} else {
											System.out.println("Saldo insuficiente.\n");
										}
												
										break;
									case 4:
										terceiroSair = false;
										System.out.println("\n\n\n");
										break;
									default:
												
										break;
									}
								}
							} else {
								System.err.println("Conta não encontrada.");
							}
							
							
							System.out.println("\n");
							break;
						case 5:
							segundoSair = false;
							System.out.println("\n\n\n");
							break;
						default:

							break;
						}
						
						
						
					}
				} else
					System.err.println("Cliente não encontrado!");
				break;
			case 4:
				String left = "";
				ArrayList<Cliente> listaClientes = pa.getClientes();
				System.out.println("\nListando clientes pelo nome e CPF: ");
				
				// listaClientes.forEach(System.out::println);
				for (int i=0; i<listaClientes.size(); i++){
					System.out.println(
							"Nome: "+listaClientes.get(i).nome+", CPF: "+listaClientes.get(i).cpf+";");
				}
				
				System.out.println("Pressione qualquer tecla para continuar.");
				left = sc.next();
				
				break;
			case 5:
				String right = "";
				String cpfConsultar = "";
				System.out.println("Insira o CPF a ser consultado: ");
				cpfConsultar = sc.next();
				
				Cliente consultaResultado = pa.buscarClienteCPF(cpfConsultar);
				if(consultaResultado != null) {
					System.out.println(consultaResultado);
				} else {
					System.err.println("Cliente não encontrado.");
				}
				
				System.out.println("Pressione qualquer tecla para continuar.");
				right = sc.next();
				
				break;
			case 6:
				sair = false;
				System.out.println(
						"\n\n\nObrigado por usar o Banco Único. Volte sempre!");
				sc.close();
				break;
			default:
				sc.close();
				break;
			}
		}
	}

}
