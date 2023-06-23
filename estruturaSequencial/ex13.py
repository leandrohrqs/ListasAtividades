metrosAltura = float(input("Digite sua altura em metros: "))

while True:
        sexoUsuario = input("Digite [F] para feminino ou [M] para masculino: ").upper()

        if sexoUsuario == "F":
            pesoIdeal = (62.1 * metrosAltura) - 44.7
            break

        elif sexoUsuario == "M":
            pesoIdeal = (72.7 * metrosAltura) - 58
            break

        else:
            print("Opção invalida! Digite [F] para feminino ou [M] para masculino")
            continue

print(f"Seu peso ideal é: {pesoIdeal:.2f}")

