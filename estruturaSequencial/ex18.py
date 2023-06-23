tamanhoArquivoMB = float(input("Informe o tamanho do arquivo em MB: "))
downloadMBPS = float(input("Digite a velocidade de download em MBps: "))

tempoDownload = (tamanhoArquivoMB / downloadMBPS) / 60

print(f"\nO tempo de download é de {tempoDownload:.2} minutos.")
