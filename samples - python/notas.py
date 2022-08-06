nota = float(input('digite a nota: '))

if nota > 7.0 :
  print(f'Aprovado! | nota: {nota}')
elif nota > 4.0:
  print(f'Recuperação | nota: {nota}')
else :
  print(f'Reprovado | nota: {nota}')