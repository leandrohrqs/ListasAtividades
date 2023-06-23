numeroInt1 = int(input("Digite o primeiro inteiro: "))
numeroInt2 = int(input("Digite o segundo inteiro: "))
numeroReal = float(input("Digite o numero real: "))

calculo1 = (numeroInt1 * 2) + (numeroInt2 / 2)
calculo2 = (numeroInt1 * 3) + numeroReal
calculo3 = numeroReal ** 3

print(
    f"o produto do dobro do primeiro com metade do segundo: {calculo1}"
    f"\na soma do triplo do primeiro com o terceiro: {calculo2}"
    f"\no terceiro elevado ao cubo: {calculo3:.2f}"
)
