#language: pt
@cadastro
 Funcionalidade: Cadastro de usuario
   Eu como cliente
   quero me cadastrar no site
   para poder estar logado e fazer compras

   @cadastro-sucesso
 Cenário: Registrar novo usuario com sucesso
   Dado que estou na tela de login
   E acesso cadastro de usuario
   Quando eu preencho o formulario de cadastro
   E clico em registrar
   Entao vejo cadastro realizado com sucesso