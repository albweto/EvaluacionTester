$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreacionCuenta.feature");
formatter.feature({
  "line": 2,
  "name": "Busqueda de Productos",
  "description": "Esta caracteristica permite a los clientes realizar busquedas de\r\nproductos que desean comprar en la tienda virtual.\r\nSe presenta informacion como precio, stock, colores.",
  "id": "busqueda-de-productos",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@positive"
    }
  ]
});
formatter.before({
  "duration": 5433176900,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Creacion de una cuenta",
  "description": "Este escenario consiste registrar un nuevo cliente.",
  "id": "busqueda-de-productos;creacion-de-una-cuenta",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "El cliente entra a la pagina y ingresa a la opcion crear nueva cuenta",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "ingresa el email y pone registrar nueva cuenta",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "luego el cliente registra sus datos y pone registrar",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Se muestra mensaje \"MY ACCOUNT\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSteps.elClienteEntraALaPaginaYIngresaALaOpcionCrearNuevaCuenta()"
});
formatter.result({
  "duration": 4551092700,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.ingresaElEmailYPoneRegistrarNuevaCuenta()"
});
formatter.result({
  "duration": 888224100,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.luegoElClienteRegistraSusDatosYPoneRegistrar()"
});
formatter.result({
  "duration": 5807576600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MY ACCOUNT",
      "offset": 20
    }
  ],
  "location": "AccountSteps.seMuestraMensaje(String)"
});
formatter.result({
  "duration": 73899200,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.AccountSteps.seMuestraMensaje(AccountSteps.java:72)\r\n\tat ✽.Then Se muestra mensaje \"MY ACCOUNT\"(CreacionCuenta.feature:13)\r\n",
  "status": "pending"
});
formatter.after({
  "duration": 763515400,
  "status": "passed"
});
});