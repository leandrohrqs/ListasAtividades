pesoPeixe = float(input("Digite o peso do peixe: "))


valorTaxa = 4
limitePeso = 50
excessoDePeso = pesoPeixe - limitePeso

if pesoPeixe > limitePeso:
    valorMulta = excessoDePeso * valorTaxa
    print(
        f"O peso do peixe está acima do permitido: ({limitePeso}kg)"
        f"\nDeverá ser pago uma multa de R$ {valorTaxa} por kg excedido"
        f"\nO peixe ultrapassou {excessoDePeso} kg(s) do"
        f"\nA multa total é de R$ {valorMulta} !"
    )
else:
    print("O peixe está dentro do peso, sem multas a pagar!")