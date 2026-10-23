/* interface  Cola<E>  {   void  enqueue  (E x)  ;   }
   │         │            │      │        │       │
   │         │            │      │        │       └── ; ← la interfaz NO lleva cuerpo, solo punto y coma
   │         │            │      │        └── parámetro: recibe un E
   │         │            │      └── nombre del método
   │         │            └── tipo que DEVUELVE (void = nada, E = genérico, boolean = true/false)
   │         └── nombre de la interfaz + <E> = tipo genérico
   └── palabra para declarar una interfaz (NO se usa class)*/

/*class  ColaArray<E>  implements  Cola<E>  {
  │         │              │         │
  │         │              │         └── la interfaz que cumple
  │         │              └── palabra para "cumplo el contrato"
  │         └── nombre de la clase + <E>
  └── palabra para declarar una clase

    public  void     enqueue  (E x)  { ... }
      │      │          │       │       │
      │      │          │       │       └── cuerpo: acá SÍ va el {} con lo que hace
      │      │          │       └── parámetro
      │      │          └── nombre del método
      │      └── tipo que DEVUELVE
      └── public: obligatorio en la clase que implementa
} 
*/

/*  interface Caja<E> {          class CajaSimple<E> implements Caja<E> {
    void guardar(E cosa);        public void guardar(E cosa) { ... }
     E sacar();                   public E sacar() { ... }
}                            }
        │                              │
        │ E es un comodín              │ E también es comodín
        │                              │
        └── al usar: Caja<String>      └── al usar: new CajaSimple<String>()
            E pasa a ser String            E pasa a ser String


*/