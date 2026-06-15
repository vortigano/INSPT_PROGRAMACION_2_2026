/*
    ## 14. Maquina de café.

    Realizá el prototipo de una máquina que preparará café.
    Ella consta de una marca, si está encendida y además dos
    componentes principales:
    - Un módulo de agua. 

      Tiene un medidor de temperatura y un indicador para saber si requiere o no mantenimiento.

    - Un módulo de leche.

      Tiene un medidor de líquido, de 0 a 5 y una textura para la leche que se sirva (espumosa, normal o líquida). Inicialmente, este módulo está vacío y con la textura establecida de forma líquida.

    A la hora de preparar un café, se necesita decirle a la máquina el
    tipo de café a realizar (expresso, latte o lágrima).
    > Nota: Por ahora no modelamos la necesidad de colocar un filtro con café molido o una cápsula para realizar el café.

    Como la cantidad de leche en el módulo es limitada, entonces cada tipo de café le representa un costo a la máquina:
    - Expresso: No lleva leche.
    - Latte: 2 puntos de leche. 
      - La textura de la leche debe ser espumosa.
    - Lágrima: 3 puntos de leche.
      - La textura de la leche debe ser líquida.

    Para cualquier tipo de café, el módulo de agua debe estar a una temperatura superior a 70ºC y no requerir mantenimiento. Presuponé que el agua siempre va a alcanzar (provendría de la red).

    Además, para que todo pueda ocurrir, la máquina debe estar encendida.

    Finalmente, cuando se le pida un café a la máquina (y dado que aún es un prototipo limitado), esta deberá simplemente responder con un mensaje en su pantalla que indique si hubo algún error (aclarar cuál), de lo contrario, mostrará una leyenda que diga: `"El café <poner_tipo_de_café> se ha servido correctamente"`.
    - A) Desarrollar las clases correspondientes para modelar lo enunciado.
    - B) Desarrollar, en la clase `MaquinaDeCafe`, el método `servirCafe()`, cuyos parámetros, lógica y valor de retorno deben deducirse según lo enunciado. Desarrollar también los métodos derivados que puedan surgir de él para conseguir el objetivo.
    - C) Desarrollar el método `main` del proyecto y generar las instancias necesarias para poder preparar los siguientes cafés (en este orden):
      - a. Un latte.
      - b. Otro latte.
      - c. Un expresso
      - d. Una lágrima

      Si se requiriera cargar el módulo de leche, hacerlo.
*/
package g01.e14;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        MaquinaDeCafe cafetera = new MaquinaDeCafe("Marca-1");
        System.out.println("- Servir cafe con maquina apagada");
        cafetera.servirCafe(TipoDeCafe.LATTE);
        cafetera.servirCafe(TipoDeCafe.LATTE);
        cafetera.servirCafe(TipoDeCafe.EXPRESO);
        cafetera.servirCafe(TipoDeCafe.LAGRIMA);
        cafetera.pulsarBotonDeEncendidoApagado();
        System.out.println("- Servir cafe con maquina encendida requiere mantenimiento");
        cafetera.servirCafe(TipoDeCafe.LATTE);
        cafetera.servirCafe(TipoDeCafe.LATTE);
        System.out.println("- Aplica mantenimiento");
        cafetera.mantenimiento();
        cafetera.servirCafe(TipoDeCafe.EXPRESO);
        cafetera.servirCafe(TipoDeCafe.LAGRIMA);
        System.out.println("- Calienta el agua");
        cafetera.calentarAgua();
        System.out.println("- Cargar Leche y Textura adecuada para cada tipo de cafe");
        //cafetera.cargarLecheYTextura(-1, Textura.NORMAL); //throws ok
        //cafetera.cargarLecheYTextura(1, null); //throws ok
        cafetera.cargarLecheYTextura(TipoDeCafe.LATTE.getNivelLeche(), TipoDeCafe.LATTE.getTextura());
        cafetera.servirCafe(TipoDeCafe.LATTE);
        cafetera.cargarLecheYTextura(TipoDeCafe.LATTE.getNivelLeche(), TipoDeCafe.LATTE.getTextura());
        cafetera.servirCafe(TipoDeCafe.LATTE);
        cafetera.cargarLecheYTextura(TipoDeCafe.EXPRESO.getNivelLeche(), TipoDeCafe.EXPRESO.getTextura());
        cafetera.servirCafe(TipoDeCafe.EXPRESO);
        cafetera.cargarLecheYTextura(TipoDeCafe.LAGRIMA.getNivelLeche(), TipoDeCafe.LAGRIMA.getTextura());
        cafetera.servirCafe(TipoDeCafe.LAGRIMA);
        
    }

}