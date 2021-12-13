# Cubo 3D Con Transformaciones Tridimensionales En OpenGL

La práctica consiste en realizar un programa donde se muestra un cubo 3D y aplicar las distintas transformaciones tridimensionales como traslación, rotación y escalamiento.
Para ello primero se explica el código fuente del programa realizado.
En principio se realiza la importación de librerías necesarias para realizar la práctica.

![image](https://user-images.githubusercontent.com/72232712/145737739-617fedf6-ffe0-4a30-9758-5aa6b575c4ab.png)

El siguiente bloque de código es la declaración de variables necesarias para realizar distintas acciones.

![image](https://user-images.githubusercontent.com/72232712/145737749-df88c624-9320-4383-8dce-a57388944317.png)

La función principal es importante debido a que es en esta parte donde empieza a ejecutarse el programa. En este bloque se realizan diversas configuraciones de la ventana para que se muestre al usuario.

![image](https://user-images.githubusercontent.com/72232712/145737782-d97f5ad0-ee9a-48c4-8705-c8e22104362e.png)

La función init es parte de la librería OpenGL y se utiliza para inicializar los componentes del Canvas, este es un componente en el que se va a realizar el pintado del objeto.

![image](https://user-images.githubusercontent.com/72232712/145737794-829ac918-81d9-4135-a873-bcca4380af07.png)

En la función reshape se realizan las configuraciones necesarias para que se pueda mostrar el objeto.

![image](https://user-images.githubusercontent.com/72232712/145737806-c3b87e28-0d6c-4801-80fe-dfa7d81ec853.png)

La función display es una de las funciones más importantes porque es aquí donde se programan las instrucciones para que el programa pinte lo que le estamos indicando.
Para esta práctica se pintan los distintos cuadros que forman el cubo, para ello se tiene en cuenta las coordenadas de cada vértice del cuadrado. En total se pintan seis cuadrados para formar el cubo.

![image](https://user-images.githubusercontent.com/72232712/145737818-39047ab0-2598-4347-8ec5-213fa5cc8a57.png)

![image](https://user-images.githubusercontent.com/72232712/145737822-65f19d0b-d9d0-45ce-8ff6-661197b48ba8.png)

La última función por el momento no se realiza ninguna acción.

![image](https://user-images.githubusercontent.com/72232712/145737834-7bdeb721-ef90-4a01-bb56-de35de751a8b.png)

Ahora que se ha explicado el código fuente, la siguiente parte es mostrar el resultado.
Como resultado hemos obtenido lo que se muestra en la siguiente figura. 

![image](https://user-images.githubusercontent.com/72232712/145737847-ae5a1df2-1a04-45b8-8b27-5dfd5f4ef411.png)

A este objeto le aplicamos un escalamiento de 2.0 en x, y y z. El resultado es el siguiente.

![image](https://user-images.githubusercontent.com/72232712/145737862-96af2c4c-4fd9-4b93-a72e-d2b5f66b68af.png)

Si al cubo original le aplicamos una rotación de 30 grados respecto al eje y se muestra el siguiente resultado.

![image](https://user-images.githubusercontent.com/72232712/145737871-abfbe9d4-3316-403a-8897-ecadaccb12c0.png)

La última transformación que le vamos aplicar al cubo original es una traslación. El resultado es el que se muestra en la figura siguiente.

![image](https://user-images.githubusercontent.com/72232712/145737880-9ece12ac-5858-47fa-ad25-6c5163043de2.png)
