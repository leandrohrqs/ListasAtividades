import math


metrosAreaAPintar = float(input("Digite em metros quadrados a area a ser pintada: "))

margemFolga = metrosAreaAPintar * 1.1

cobertura18L = 18 * 6

cobertura3L = 3.6 * 6

valor18L = 80

valor3L = 25

latas18L = 0

latas3L = 0

calcTamanho = margemFolga

while calcTamanho > 0:
    if calcTamanho > cobertura3L:
        if ((math.ceil(calcTamanho / cobertura3L)) * valor3L) < ((math.ceil(calcTamanho / cobertura18L)) * valor18L):
            latas3L += 1
            calcTamanho -= cobertura3L
        else:
            latas18L += 1
            calcTamanho -= cobertura18L
    elif calcTamanho <= cobertura3L:
        latas3L += 1
        calcTamanho -= cobertura3L
    else:
        latas3L += 1
        calcTamanho -= cobertura3L
        break


print(
    f"""
        \nUtilizando apenas latas de 18L: 
        - Número de latas: {(math.ceil(margemFolga / cobertura18L)):.2f}
        - Preço Total: R${((math.ceil(margemFolga / cobertura18L)) * valor18L):.2f}

        Utilizando apenas latas de 3,6L: 
        - Número de latas: {(math.ceil(margemFolga / cobertura3L)):.2f}
        - Preço Total: R${((math.ceil(margemFolga / cobertura3L)) * valor3L):.2f}

        Utilizando latas e galões:
        - Número de latas de 18 litros: {latas18L}
        - Número de latas de 3,6 litros: {latas3L}
        - Preço Total: {((latas18L * valor18L) + (latas3L * valor3L)):.2f}  
        - Latas de 18 litros: R${(latas18L * valor18L):.2f}
        - Latas de 3,6 litros: R${(latas3L * valor3L):.2f}""")