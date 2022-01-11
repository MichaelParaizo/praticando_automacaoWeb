#language: pt
@message
 Funcionalidade: Enviar mensagem
   Eu como cliente
   quero me cadastrar no site
   para poder estar logado e fazer compras

   @enviar-mensagem-sucesso
 Cenário: Enviar uma mensagem com sucesso
   Dado que estou na tela de mensagens
   E preencho todos os campos
   Quando clico em enviar mensagens
   Entao vejo notificacao de mensagem enviada com sucesso