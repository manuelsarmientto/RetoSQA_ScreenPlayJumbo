#language: es

Característica:  Automatizar Tiendas Jumbo

  @AgregarCarrito

  Esquema del escenario: Agregar Producto Al Carrito

    Dado  Que me encuentro en la pagina '<url>'
    Cuando  busco el producto '<producto>''<marca>'
    Y diligencio los datos de entrega '<correo>''<departamento>''<ciudad>''<direccion>''<complementoDireccion>'
    Entonces Visualizare '<producto>' en el carrito

    Ejemplos:
      | url | producto | marca |correo |departamento |ciudad |direccion |complementoDireccion |
##@externaldata@parametros/Datos.xlsx@AgregarProducto
   |https://www.tiendasjumbo.co/   |Silla Ejecutiva   |MUEBLES 2020   |manuel_automatiza@yopmail.com   |BOGOTÁ, D.C.   |Bogotá, D.C.   |DG 40 A 8-38   |101|

