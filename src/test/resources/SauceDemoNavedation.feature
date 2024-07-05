Feature: Inicio de sesion y compra
    Para ver los productos
    El usuario debe iniciar sesion
    se pueden agregar al carrito los productos

    Scenario: El usuario debe iniciar sesion 
        Given El usuario navega a www.saucedemo.com
        When El usuario ingresa sus credenciales de acceso
        Then El usuario es redidigido a la pagina de inicio


    Scenario: El usuario puede usar el carro de compras
        Given El usuario agrega productos al carrito de compras
        When El usuario debe visualizar y eliminar productos en el carrito
        Then El usuario debe seguir el flujo de checkout