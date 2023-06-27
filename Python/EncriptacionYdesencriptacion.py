
def encriptacion (texto):
    textoEncriptado=''
    for letra in texto:
        asciiCode = ord(letra)
        asciiCode += 1
        textoEncriptado += chr(asciiCode)
    return textoEncriptado

def desencriptacion(texto):
    textoDesencriptado=''
    for letra in texto:
        asciiCode = ord(letra)
        asciiCode -= 1
        textoDesencriptado += chr(asciiCode)
    return textoDesencriptado

def encriptarArchivo(rutaArchivo):
    archivo = open(rutaArchivo,'r')
    textoEnArchivo = archivo.read()
    archivo.close
    TextoInternoEncriptado = encriptacion(textoEnArchivo)

    archivo = open(rutaArchivo,'w')
    archivo.write(TextoInternoEncriptado)
    archivo.close

    print("El archivo se ha encriptado correctamente.")

    return TextoInternoEncriptado

def desencriptarArchivo(rutaArchivo):
    archivo = open(rutaArchivo,'r')
    textoEnArchivo = archivo.read()
    archivo.close

    archivo = open(rutaArchivo,'w')
    archivo.write(desencriptacion(textoEnArchivo))
    archivo.close

    print("El archivo se ha desencriptado correctamente.")

def main(rutaArchivo):
    repetir = True

    while repetir:
        menu = input("Digite: \nE: Para encriptar \nD: Para desencriptar \nS: para salir \n->")

        vectorEncriptar = ['E', 'e', 'Encriptar', 'encriptar',  'ENCRIPTAR']
        vectorDesncriptar = ['D', 'd', 'desencriptar', 'desencriptar',  'DESENCRIPTAR']
        vectorSalir = ['S', 's', 'Salir', 'salir',  'SALIR']

        if menu in vectorEncriptar:
            encriptarArchivo(rutaArchivo)
            continue
        elif menu in vectorDesncriptar:
            desencriptarArchivo(rutaArchivo)
            continue
        elif menu in vectorSalir:
            repetir = False
            print("El programa ha finalizado.")
            break

main(input("Digite la ruta del archivo: "))