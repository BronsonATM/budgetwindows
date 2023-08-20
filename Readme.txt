Te vas a tener que pelear con obramat para que suban el código del front (a mi no me han hecho caso) y al menos 
la última vez que lo he mirado, el presupuestador antiguo (https://smartperfil-uat.hq.es-bcm.corp.leroymerlin.com) sigue sin funcionar.

Estos son apuntes que hice en su día cuando si funcionaba:
La aplicación tiene las siguientes pantallas:
-Listado de presupuestos:
	-Filtrar por fecha, estado del presupuesto y por un campo en específico(DNI,movil...)(Botones de buscar y quitar filtros)
	-Listado de presupuestos: Columnas(Estado,subtotal precio, impuestos, precio total, fecha creacion) Botones editar y remove, crear
-Nuevo presupuesto:
	Esta función entendí que quedaba deprecated al ser la nueva con el iframe y demás.
-Gestionar proveedores:
	-menú Desplegable con todos los proveedores. Una vez seleccionado uno, nueva ventan donde se puede, o bien descargar template del proveedor(un excel)
	 o subir un fichero(esto no se muy bien para que)
-Gestionar margen de beneficios:
	-Permite modificar el porcentaje de margen y la fecha de aplicación de dicho margen de cada uno de los productos. Botones de guardar y cancelar.
Además, en la barra de navegación también aparecen:
-Botón de cerrar sesión
-Nombre del usuario
Por último, un botón abajo a la izquierda "Aviso legal" que redirecciona, el botón no redireccionaba bien, pero la url a la cual se supone que redireccionaba 
es una pantalla con texto de índole legal.


Al quitarnos de encima la parte de hacer el presupuesto en sí, la gran mayoría de código es un tanto inútil. Además, es un tanto extraña la arquitectura que siguen.

Sirius es una api de adeo que sirve para devolver la información de clientes de adeo.

Maestro sirve para gestionar los presupuestos de todas las aplicaciones de omnicommerce (https://developer-portal-uat1.nprd-02-a9ef.priv.manawa.adeo.cloud/docs/api/api-6a2fcef2-51ff-473d-864e-02223fd955ce)

Users se encarga del login y del PingID en general por lo que he visto. Respecto a la diferencia de clientes y customers, no entiendo muy bien por qué está separado.

Los modelos se encuentran todos en la carpeta models, tienen una clase con subclases donde se encuentran los budgets, clients, etc...(esto no me parece que esté muy bien hecho)

En general, creo que seguir la arquitectura de ferromax que hicieron victor y laura es lo mejor, aunque como veas.

Se que no he hecho gran cosa con el código, la verdad que he tomado demasiado tiempo en estudiar la certi que quiero y luego en vez de escribir por escribir he intentado entender lo maximo el código, además tuve algunos lios con las incidencias
En cualquier caso, si hace falta meteré más tiempo en cuanto empiece el proyecto de verdad.

Nos vemos el 28.

Buena semana.