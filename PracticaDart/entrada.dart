// fichero -> class - variable - metodo/funciones
// Clase -> class
// retorno? nombre (tipo nombre){cuerpo}

void main(){
  print("Primera app Dart");

  const DNI = "12345A";
  final NIF = 1234;

  String nombre = "Efren";
  int edad = 42;
  bool acierto = false;

  print("Mi nombre es $nombre y tengo $edad años.");
  String? correo;

  print("Mi correo es ${correo ?? "sin correo"}");

  var direccion;
  direccion = "Madrid";
  print("La direccion del usuario es ${direccion*2}");
  direccion = 101;
  print("La direccion del usuario es ${direccion*2}");

  saludar(nombre,"Lunes");
  saludarNominal(nombre: "pepe", mes: "segundo");
  saludarNominalEspecifico(mes: 2);
}

void saludar(String nombre, [String dia = "Miercoles"]){
  print("Enhorabuena $nombre. jaja salu2");
  print("Estamos a $dia");
}

void saludarNominal({var nombre, var mes}){
  print("Oh $nombre, morituri te salutant en $mes");
}

void saludarNominalEspecifico({String? nombre=null, required int mes}){
  if(nombre == null){
    print("Tolai");
  }else{
    print("Oh $nombre, morituri te salutant en $mes");
  }

}















