# githubFelipeAraisMosquera-ensolvers-challenge

<!DOCTYPE html>
<html>
<head>
 Prueba laboral Notes Ensovers challenge
</head>
<body>
  <h1>Notes Ensolvers</h1>
  <p>¡Bienvenido a la Aplicación de Notas Ensolvers! Aquí los usuarios pueden crear, borrar, listar y editar sus notas personales de manera conveniente.</p>

  <h2>Tabla de Contenidos</h2>
  <ul>
    <li><a href="#requisitos">Requisitos</a></li>
    <li><a href="#instalacion">Instalación</a></li>
    <li><a href="#uso">Uso</a></li>
  </ul>

  <h2 id="requisitos">Requisitos</h2>
  <p>Antes de comenzar, asegúrate de tener instalados los siguientes requisitos:</p>
  <ul>
    <li>Node.js</li>
    <li>Angular CLI</li>
    <li>JDK 19 (Java Development Kit)</li>
    <li>JIntelliJ IDEA</li>
    <li>MySQL workbench</li>
    <li>Git</li>
  </ul>
  
  <h2 id="instalacion">Instalación</h2>
  <p>Para instalar y ejecutar la aplicación, sigue estos pasos:</p>
  <ul>
    <li>
      <p>Para instrucciones detalladas sobre cómo instalar Angular y Node.js, puedes consultar este video tutorial:</p>
      <a href="https://www.youtube.com/watch?v=6741ceWzsKQ">
        <img width="320" src="https://img.youtube.com/vi/6741ceWzsKQ/maxresdefault.jpg" alt="Enlace al video de instalación">
      </a>
    </li> 
    <br/>
  <li>
    <p>Cómo instalar el OpenJDK de Java 20 o Java 19 en Windows</p>
    <a href="https://www.youtube.com/watch?v=oAin-q1oTDw&pp=ygUfaW5zdGFsYWNpb24gZGVsIGpkayAxOSBpbnRlbGxpag%3D%3D">
      <img src="https://img.youtube.com/vi/oAin-q1oTDw/maxresdefault.jpg" alt="Cómo instalar el OpenJDK de Java 20 o Java 19 en Windows" width="320">
    </a>
  </li>
    <br/>
  <li>
    <p>Cómo descargar e instalar MySQL Workbench en Windows 10 en 2023</p>
    <a href="https://youtu.be/Pj5C7rkGrtc">
      <img src="https://i.ytimg.com/vi/Pj5C7rkGrtc/hq720.jpg" alt="Cómo instalar el OpenJDK de Java 20 o Java 19 en Windows" width="320">
    </a>
  </li>
  <li>
    <p>CCómo Instalar Git en Windows 10 en 2023</p>
    <a href="https://www.youtube.com/watch?v=WcYTcttEf50&ab_channel=CarlosMasterWeb">
      <img src="https://i.ytimg.com/vi/WcYTcttEf50/hq720.jpg" alt="Cómo Instalar Git en Windows 10 en 2023" width="320">
    </a>
  </li>
  
  </ul>
   

  <h2 id="uso">Uso</h2>
  <h3>Después de haber instalado las aplicaciones mencionadas anteriormente, estás listo para clonar el repositorio. Se sugiere optar por el JDK 19 en caso de que surjan errores, ya que esta versión fue utilizada durante el desarrollo.</h3>
   <img src="https://i.imgur.com/1Kdsb3d.png" width="320">
   <br/>
   <p>comprobando versiones y instalaciones</p>
   <img src="https://i.imgur.com/LWVpKkE.png" width="320">
   <br/>
   <p>Después, en la ubicación deseada (en este caso, he seleccionado la carpeta "Readme Note"), haz clic derecho y elige "Git Bash Here" para abrir la terminal de Git en esa ubicación.</p>
   <img src="https://i.imgur.com/gdkg9cb.png" width="320">
   <br/>
   <p>A continuación, en la terminal, ingresa el comando "git clone" seguido de la URL del repositorio:</p>
   <pre>git clone https://github.com/ElianaPranzetti/githubFelipeAraisMosquera-ensolvers-challenge.git
   </pre>
   <img src="https://i.imgur.com/1QuUL4d.png" width="320">
   <br/>
    <p>Después de elegir la carpeta señalada por la flecha naranja en la imagen de abajo, observa el ejemplo en el que se abre el IDE 
    IntelliJ. Selecciona "Open Folder" y luego escoge la carpeta que contiene la aplicación en la parte del (backend).</p>
   <img src="https://i.imgur.com/OPNfEQ9.png" width="320">
   <br/>
   <br/>
    <p>En este punto, abre el proyecto y aguarda a que todas las dependencias se instalen. Examina el archivo `application.properties` para 
    ver las configuraciones que concuerdan con la base de datos.</p>
   <img src="https://i.imgur.com/6j2ILDY.png" width="320">
   <img src="https://i.imgur.com/jg4NsDz.png" width="320">
   <br/>
     <p>Una vez que las dependencias se hayan instalado; si por alguna razón no es posible instalarlas, se púede hacer a través del siguiente 
    botón:</p>
   <img src="https://i.imgur.com/DKmC9lN.png" width="320">
   <br/>
   <br/>
      <p>Para ejecutarlo, simplemente haz clic derecho en "NotesApplication" y selecciona "Run NotesApplication", tal como se indica con la 
   flecha naranja en la imagen:</p>
   <img src="https://i.imgur.com/efEEntH.png" width="320">
   <br/>
   <p>De esta manera, al observar el terminal y verificar que el puerto 8080 está siendo utilizado, puedes confirmar que la aplicación se ha ejecutado correctamente.</p>
   <img src="https://i.imgur.com/rbglpXh.png" width="320">
   <br/>
    <p>Ahora procedemos a trabajar con la base de datos. Para ello, asegúrate de tener instalado MySQL Workbench.</p>
   <img src="https://i.imgur.com/n0g5DT4.png" width="320">
   <br/>
    <p>Una vez que hayas instalado MySQL, el siguiente paso es crear la base de datos. Para ello, sigue estos pasos:

   1. Abre MySQL Workbench y localiza la opción para crear una nueva base de datos, como se indica en la imagen, haciendo clic en el área    
    señalada por la flecha naranja.
   
   2. Asigna el nombre "notes" a la base de datos que estás creando.
   
   Este paso asegurará que la base de datos "notes" esté lista para su uso con la aplicación.</p>
   <img src="https://i.imgur.com/u3bWbrZ.png" width="320">
   <img src="https://i.imgur.com/qKqPJNP.png" width="320">
   <img src="https://i.imgur.com/3z9dFwo.png" width="320">
   <p>También es crucial destacar que los datos de inicio de sesión (usuario y contraseña) para acceder a la base de datos son de gran    
   importancia. En mi caso, los valores son:</p>
   <img src="https://i.imgur.com/h4VTs7B.png" width="320">
   <img src="https://i.imgur.com/3c1W6p3.png" width="320">
   <br/>
    <p>Cuando ejecutes la aplicación en Java, se encargará automáticamente de crear las tablas necesarias (como "user" y "notes"), como se  
    ilustra en la siguiente imagen:</p>
   <img src="https://i.imgur.com/ZIhkp7H.png" width="320">
   <br/>
    <p>Después de completar los pasos anteriores, es momento de instalar el frontend. Tienes dos opciones:

   Opción 1: Puedes utilizar el siguiente enlace para clonar el repositorio del frontend:

   <pre>git clone https://github.com/FelipeAraisMosquera/ensolverFront.git
   </pre>

  Opción 2: Alternativamente, también puedes encontrar el enlace en la carpeta descargada del backend con el nombre "Notes front-end". Este 
  enlace te llevará al repositorio del frontend que puedes clonar.</p>
   <img src="https://i.imgur.com/p2Ia25i.png" width="320">
   <br/>
    <p>Después de completar los pasos anteriores, puedes observar la carpeta donde clonaste el repositorio en la ubicación que seleccionaste previamente. Dentro de esta carpeta, encontrarás el enlace para el frontend. A continuación, sigue estos pasos:

1. Haz clic derecho en la carpeta donde clonaste el repositorio del backend.

2. Selecciona la opción "Git Bash Here". Esto abrirá la terminal de Git en la ubicación de la carpeta del backend.
</p>
   <img src="https://i.imgur.com/KHNsjOJ.png" width="320">
   <img src="https://i.imgur.com/sDRktG0.png" width="320">
   <img src="https://i.imgur.com/Gz0IjM3.png" width="320">
   <br/>
    <p>Después de clonar el repositorio como se muestra en la imagen anterior, el siguiente paso es ejecutar el comando npm install. Este comando tiene como objetivo instalar todas las dependencias y bibliotecas necesarias para que el frontend funcione correctamente.

El comando npm install consulta el archivo package.json en la carpeta del proyecto y descarga todas las dependencias listadas en ese archivo desde el registro de paquetes de Node.js (npm). Estas dependencias pueden incluir bibliotecas, módulos y herramientas que son esenciales para que el frontend funcione según lo previsto.</p>
   <img src="https://i.imgur.com/pOGl8fH.png" width="320">
   <br/>
    <p>Finalmente, para ejecutar el frontend, escribe el comando `ng serve -o`. Al ejecutar este comando, el proceso comenzará y, una vez completado, se abrirá automáticamente una ventana del navegador que mostrará la aplicación frontend en funcionamiento.</p>
   <img src="https://i.imgur.com/bWFdtHT.png" width="320">
   <br/>
    <p>Dado que no se pudo completar el proceso de registro de usuarios, aquí se incluye un script de inserción para agregar usuarios directamente en la base de datos:
 <pre>
 
 INSERT INTO notes.user (`email`,`name`,`password`) VALUES ('maria@example.com','Maria','1111');
 INSERT INTO notes.user (`email`,`name`,`password`) VALUES ('felipe@example.com','Felipe','1234');

 </pre>
Alternativamente, también puedes crear usuarios mediante Postman siguiendo estos pasos:

Utiliza la ruta correspondiente en Postman para enviar una solicitud POST para crear usuarios.
En el cuerpo de la solicitud, proporciona los detalles del usuario, como email, name y password.</p>
   <img src="https://i.imgur.com/FxVyqb2.png" width="320">
   <br/>
    <p>Una vez que hayas insertado los usuarios y confirmado que están presentes en la base de datos, como se muestra en la imagen a continuación:</p>
   <img src="https://i.imgur.com/PYzdrPm.png" width="320">
   <br/>
    <p>Se abre el front desde el localhost
    <pre>http://localhost:4200/login</pre>
</p>
   <br/>
   <p>Y verás el resultado que se muestra en la siguiente imagen:</p>
   <img src="https://i.imgur.com/SeHzuvd.png" width="320">
    <img src=https://i.imgur.com/NdpRqSi.png"" width="320">
   <br/>
       <p>Después de completar los pasos anteriores, puedes proceder a realizar una verificación utilizando credenciales incorrectas para 
          confirmar que la funcionalidad de manejo de excepciones está operativa. Luego, puedes autenticarte con un usuario que se encuentre 
          en la base de datos.
   
   A continuación, aquí tienes los pasos que puedes seguir:
   
   Verificación de Credenciales Incorrectas:
     Intenta iniciar sesión con credenciales incorrectas (por ejemplo, un correo o contraseña incorrectos) para comprobar que la excepción se        maneja adecuadamente y se muestra un mensaje de error apropiado.
   
   Iniciar Sesión con Usuario Existente:
   Autentica utilizando uno de los usuarios que insertaste previamente en la base de datos. Por ejemplo, puedes usar el usuario "maria@example.com" con la contraseña "1111" o "felipe@example.com" con la contraseña "1234".</p>
   <img src="https://i.imgur.com/dAWjw6e.png" width="320">
   <img src="https://i.imgur.com/wRIjFY0.png" width="320">
   <br/>
    <p>Una vez que hayas iniciado sesión exitosamente, la aplicación mostrará el nombre del usuario y le permitirá crear sus propias notas.</p>
   <img src="https://i.imgur.com/wf0iXFS.png" width="320">
   <img src="https://i.imgur.com/BXYzywI.png" width="320">
  
  <hr>
  <p align="center">Hecho con ❤️</p>
</body>
</html>
