#language: pt
#encoding: UTF-8

Funcionalidade: Tela Cadastro

  @ID_001 @cadastro @telaVeiculos
  Esquema do Cenario: ID_001 - Cadastro veículo opção Gold
   Dado que o usuario acessa o site
   Quando acessa a tela de cadastro de veículos
   E preenche os dados "<nome>", "<marca>", "<modelo>", "<ano>", "<placa>"
   Então veiculo e cadastrado com sucesso "<placa>"
   
   Exemplos:
   |	nome	|	marca		|	modelo	|	ano		|	placa		|
   |	MT		|	Yamaha	|	02			|	2019	|	GTU8765	|
   
  @ID_002 @cadastro @telaVeiculos
  Esquema do Cenario: ID_002 - Cadastro Clientes
   Dado que o usuario acessa o site
   Quando acessa a tela de cadastro de Clientes
   E preenche os dados cliente "<nome>", "<cpf>", "<nascimento>", "<telefone>", "<email>"
   Então cliente e cadastrado com sucesso "<cpf>"
   
   Exemplos:
   |	nome								|	cpf					|	nascimento	|	telefone	|	email								|
   |	Fernando Machado		|	24567876545	|	27032002		|	999567876	|	fernando@teste.com	|
   