@regression @positive
Feature: Busqueda de Productos
  Esta caracteristica permite a los clientes realizar busquedas de
  productos que desean comprar en la tienda virtual.
  Se presenta informacion como precio, stock, colores.

  Scenario: Creacion de una cuenta
  Este escenario consiste registrar un nuevo cliente.

    Given El cliente entra a la pagina y ingresa a la opcion crear nueva cuenta
    When  ingresa el email y pone registrar nueva cuenta
    And   luego el cliente registra sus datos y pone registrar
    Then  Se muestra mensaje "MY ACCOUNT"