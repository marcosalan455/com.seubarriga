# com.seubarriga
# automacaodetesteweb

## Objetivos:

###Text criado com a finalidade de validação de campos obrigatórios.
###O campo de login, o email e senha tem que ser válidos, caso contrário, não tem como acessar o sistema.
###Após o acesso com os campos corretamente preenchidos, segue o text.
###Na adição de usuario "conta", déve-se preencher o campo nome e clicar em salvar.
### Foi criado conta, adição de usuario, movimentação.
### Após foi deletado movimentação, usuário e conta.

##OBS:
### É necessário o preenchimento correto em todos os campos na criação de movimentação.

###Para a criação e execução do text, foi necessário:
### ter um ambiente configurado.
###Pode-se seguir as tecnologias citadas abaixo, mas em relação a IDE,
###Fique a vontade para utilizar de sua preferência.
###Após todo o ambiente configurado:
### Abra a IDE de sua escolha;
### Vá em criar novo progeto;
### Escolha new maven progect;
na primeira tela caso esteja utilizando a IDE IntelliJ basta clicar em next ou avançar.
### Caso esteja utilizando a Ide Eclipse selecione/marque creat simple progect e vá em next ou avançar.
### nesta tela dê um nome de sua preferência ou de acordo com o que foi sugerido, após nome dado, vá em finich.
### Quando clicar em Finich pode perguntar sobre perspectiva, fique a vontade para (sim ou não).
### Pronto, você está com seu ambiente criado, agora terá de seguir os próximos passos que é:
### Verificar seu pon.xml e importar as dependências necessárias de acordo com seu progeto.
### Neste progeto de text se está utilizando as dependências citadas mais abaixo deste documento.
### Após as dependências importadas corretamente em seu (pon.xml), começa a criação dos texts.
### Os texts são criados dentro de: (SRC/test/java).
### Com os pacotes sugeridos pelo seu desenvolvedor e nome de classes de acordo com seu test
### Caso esteja seguindo este progeto, mais abaixo tem nome de pacotes utilizados juntamente com suas classes.
### Esta foi uma breve explicação e dica de como criar e ambientar sua estrutura de tests, espero que tenham gostado.


# Site de test:
##URL : https://seubarriga.wcaquino.me/login

# Tecnologias e Ferramentas

##Ferramenta para criação do desenvolvimento:

### IntelliJ IDEA Community Edition 2019.3.3 x64
### Maven 4.0.0
###Java JDK 1.8
### Selenium-Java 4.0.0

``` Junit5
junit-jupiter-api
versão 5.6.0

junit-jupiter-engine
versão 5.6.0

dependência do Boni Garcia
webdrivermanager
versão 3.8.1

```


# Pacotes e classes:

##Foi criado para execução do text os seguintes pacotes:

### appobjects:(responsável pelo empacotamento dos elementos).
### tasks : (responsável pela chamada e execução dos elementos).
### textCases : (Responsável pela execução geral do ambiente de text com a obrigação de chamar os métodos tasks e elementos appobjects).

## Contributing
###Solicitações pull são bem-vindas. Para grandes mudanças, abra um problema primeiro para discutir o que você gostaria de mudar.
   
   ### Atualize os testes conforme apropriado.
   
   ## autor:
   ###Marcos Alan Schussler.
   

# seubarrigatestweb
# comseubarrigawcaquino
# comseubarrigawcaquino
# com.seubarrigawcaquino
