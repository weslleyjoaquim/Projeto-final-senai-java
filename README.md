# Projeto final do curso Desenvolvedor Java feito no SENAI-DF

Criação de uma plataforma de registro de chamados, de incidentes de TI, onde os funcionários podem descrever um problema que esteja enfrentando e será atendido pelos técnicos de informática da empresa contratante.


A primeira tela ao abrir o sistema, é a tela de login, que só será apresentada, se for feita a conexão com o banco de dados, caso não seja possível, irá surgir uma mensagem de erro na tela do usuário, sendo feita a conexão, será solicitado um usuário e uma senha, previamente cadastrados pelo administrador do sistema, após serem validados os dados, o sistema leva para a tela principal, com uma mensagem de “Olá + nome de usuário logado”, uma mensagem no topo de bem-vindo, botão de logout, que leva para tela de login e três menus. 

O primeiro menu, leva para uma tela de cadastro do chamado, no qual, será preenchido um formulário e ao final, o sistema gera uma mensagem de cadastro do chamado e um protocolo, para que seja feito o acompanhamento do chamado. 

O segundo menu, leva para um tela que irá apresentar uma tabela com todos os chamados cadastrados no sistema e uma opção de consulta através do protocolo, que possibilitará verificar se tem uma resposta do chamado.

E o terceiro menu, irá levar para tela de tratamento do chamado, no qual pode ser feita uma edição, inclusive inserir a resolução do chamado, ou excluir o chamado através do protocolo.

### O projeto foi feito na linguagem Java, utilizando interface gráfica com Swing e o banco de dados MySQL.

## Tela de Login:



![TelaLogin](https://user-images.githubusercontent.com/107959293/225478249-4118345c-6b36-4049-b0fc-2ef5cc623859.png)

## Tela Principal:


![TelaPrincipal](https://user-images.githubusercontent.com/107959293/225478586-14d97d1b-1657-4af5-a142-d65cd5f87ab3.png)

## Tela para cadastrar os chamados:

![TelaCadastroChamados](https://user-images.githubusercontent.com/107959293/225478620-9ccb04d3-3104-40ee-bd93-80f1f82669ad.png)

## Tela de Consulta:

![TelaConsulta](https://user-images.githubusercontent.com/107959293/225478683-796927c4-ad69-4e36-ab12-468045a40790.png)


## Tela para editar um chamado ou deletar:
![TelaEditar](https://user-images.githubusercontent.com/107959293/225478756-ea983538-03e9-45cd-a479-8b1fe179c741.png)

