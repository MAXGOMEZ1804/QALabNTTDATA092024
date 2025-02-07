@ProbarFeatureOrden
Feature: Orden

  @crearOrden
  Scenario: Crear Orden
        When creo el orden con id "1", petId "3"
        Then el código de respuesta es 200
        And el type es "unknown"


  @consultarOrden
  Scenario: Consultar Orden
    When consulto la orden con IDORDEN 3
    Then valido el codigo de respuesta sea 404
    And valido la respuesta sea "Orden not found"