figuras_tetris = {
        1: [['A', '-', '-'], ['B', '-', '-'], ['C', 'D', '-']],
        2: [['-', '-', 'A'], ['-', '-', 'B'], ['-', 'D', 'C']],
        3: [['-', '-', '-'], ['A', 'B', '-'], ['-', 'C', 'D']],
        4: [['-', '-', '-'], ['-', 'C', 'D'], ['A', 'B', '-']],
        5: [['-', '-', '-'], ['-', 'D', '-'], ['A', 'B', 'C']],
        6: [['-', '-', '-'], ['A', 'B', '-'], ['C', 'D', '-']]
    }
c= input()
A = (c.split(' '))
f,r= int(A.pop(0)), int(A.pop(0))
lista_de_numeros = list(map(int, A))
suma=sum(lista_de_numeros)
if(suma>=360):
	suma%=360
elif (suma<0):
	suma%=-360
	suma+=360
figura=figuras_tetris[f]
for _ in range(suma // 90):
  figura = list(zip(*figura[::-1]))

    # Imprimir la figura rotada
for fila in figura:
  print(''.join(fila))