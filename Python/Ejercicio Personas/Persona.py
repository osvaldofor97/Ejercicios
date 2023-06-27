class Persona:
    def __init__(self, nombre, apellido, dni, telefono):
        self.nombre = nombre
        self.apellido = apellido
        self.dni = dni
        self.telefono = telefono

    def __str__(self):
        return "Nombre: "+self.nombre+'\nApellido: '+self.apellido+'\nDNI: '+self.dni+'\nTelefono: '+self.telefono