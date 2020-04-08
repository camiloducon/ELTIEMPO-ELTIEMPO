# language: es
# encoding: iso-8859-1
# Author: camduc@eltiempo.com
Característica: Crear Cuenta
  yo como usuario de ELTIEMPO
  deseo crear mi cuenta en el aplicativo
  para acceder a su contenido

  Esquema del escenario: Creacion cuenta exitosa
    Dado que Rene requiere crear una cuenta en ELTIEMPO <Fila>
      | Ruta Excel                                 | Pestaña |
      | src/test/resources/data/DatosELTIEMPO.xlsx |         |
    Cuando completa el formulario
    Entonces ve como resultado la creacion de su cuenta

    Ejemplos: 
      | Fila |
      |    2 |
