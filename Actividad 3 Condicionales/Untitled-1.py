nombre = (input("Ingrese el nombre: "))

apellido = (input("Ingrese el apellido: "))

edad = int(input("Ingrese la edad: "))

sexo = int(input("Ingrese el sexo (Masculino(1) / Femenino(2)): "))

if edad >= 18:
    print("Es mayor de edad.")
else:
    print("Es menor de edad.")

if sexo == 1:
    print("Es un Hombre.")
if sexo == 2:
    print("Es una Mujer.")