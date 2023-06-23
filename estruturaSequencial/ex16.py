from math import ceil
metrosAreaAPintar = float(input("Digite em metros quadrados a area a ser pintada: "))

valorLata18L = 80

quantidadeLatas =  ceil(metrosAreaAPintar / (18*3))

valorAGastar = quantidadeLatas * valorLata18L

print(
    f"Será necessário utilizar: {quantidadeLatas} lata(s)"
    f"\nValor total: R$ {valorAGastar}"
    )


