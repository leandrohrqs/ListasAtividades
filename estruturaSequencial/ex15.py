valorHora = float(input("Digite o valor da hora: "))
quantHora = float(input("Digite quantas horas trabalhou no mês: "))

salarioBruto = valorHora * quantHora
impostoRenda = salarioBruto * 0.11
impostoINSS = salarioBruto * 0.08
impostoSindicato = salarioBruto * 0.05
descontosTotais = impostoRenda + impostoINSS + impostoINSS + impostoSindicato
salarioLiquido = salarioBruto - descontosTotais

print(
    f"+ Salário Bruto : R$ {salarioBruto}"
    f"\n- IR (11%) : R$ {impostoRenda}"
    f"\n- INSS (8%) : R$ {impostoINSS}"
    f"\n- Sindicato ( 5%) : R$ {impostoSindicato}"
    f"\n= Descontos Totais : R$ {descontosTotais}"
    f"\n= Salário Liquido : R$ {salarioLiquido}"
)