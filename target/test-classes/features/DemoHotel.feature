@tag
Feature: Elección hotel económico

  @tag1
  Scenario Outline: Elegir hotel
    Given un lugar <lugar>
    #And selecciono fecha check in <ida> y check out <devuelta>
    #And doy click en el boton SEARCH

    Examples: 
      | lugar  | ida       | devuelta  |
      | London | 11/1/2019 | 11/9/2019 |
