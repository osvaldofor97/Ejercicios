import pytesseract as tess
from PIL import Image
tess.pytesseract.tesseract_cmd = r'C:\Program Files\Tesseract-OCR\tesseract.exe'

My_image= Image.open(r'C:\Users\User\Desktop\python\PruebaOCR.PNG')
txt = tess.image_to_string(My_image)
print(txt)