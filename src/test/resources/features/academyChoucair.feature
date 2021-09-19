#Autor: Andres
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course

#  No se contempla para el ejercicio un escenario outline

  @scenario1
  Scenario: Search for a automation course
    Given than Andres wants to learn automation at the academy Choucair
      | strUser    | strPassword   |
      | 1036650112 | Choucair2021* |
    When he searches for the certification on courses and certifications
      | strCourse   |
      | Workshop de Automatización |
    Then he finds the course called
      | strCourse |
      | Workshop de Automatización |