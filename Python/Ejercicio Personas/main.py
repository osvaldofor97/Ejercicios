from Empleado import Empleado
from Cliente import Cliente

personas = []
def insertarPersona():
    opcion = input("Tipo de persona:\nEmpleado: E \nCliente: C \n-->")
    nombre = input("Ingrese el nombre de la persona: ")
    apellido = input("Ingrese el apellido de la persona: ")
    dni = input("Ingrese el documento de identificacion de la persona: ")
    telefono = input("Ingrese el telefono de la persona: ")

    if opcion == 'E':
        salario = input("Ingrese el salario del empleado: ")
        emp = Empleado(nombre, apellido, dni, telefono, salario)
        personas.append(emp)
    else:
        categoria = input("Ingrese la categoria del cliente: ")
        cli = Cliente(nombre, apellido, dni, telefono, categoria)
        personas.append(cli)

insertarPersona()

for persona in personas:
    print(persona)