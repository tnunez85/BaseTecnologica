@test

Feature: Submit Spider test according to given parameters

  // IMPORTANTE: Si en el feature hay unicamente un Background sin scenarios, el test se ignora automaticamente

  Background: Go to testing environment
    Given "http://192.168.242.99:8080/spider-ump/" website
    And I use "admin" and "Admin-2013" credentials
    And I go to the index "website"
    And click into the layer "Medio_Ambiente"

  Scenario: Submit the test history you are needing.
    When execute the test "test"
    Then I expect the status "status"



#### Implemented Layers (99) Entorno 1
# "Movilidad_Ciclista"
# "Movilidad_Peatonal"
# "Transporte_Vertical"
# "Transporte_Público"
# "Circulación_Tráfico"
# "Seguridad_Vial"
# "Aparcamientos"
# "Electromovilidad"
###########################
#### Implemented Layers (99) Entorno 2
# "Medio_Ambiente"




