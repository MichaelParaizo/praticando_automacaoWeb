$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastro de usuario",
  "description": "Eu como cliente\r\nquero me cadastrar no site\r\npara poder estar logado e fazer compras",
  "id": "cadastro-de-usuario",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Registrar novo usuario com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;registrar-novo-usuario-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "acesso cadastro de usuario",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "vejo cadastro realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 12191124700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.acesso_cadastro_de_usuario()"
});
formatter.result({
  "duration": 612765500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.eu_preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "duration": 12690168800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.clico_em_registrar()"
});
formatter.result({
  "duration": 14800591700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.vejo_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 301153100,
  "status": "passed"
});
});