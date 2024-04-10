c = input()

A = (c.split(' '))
totMeses = A.pop(0)
lista_de_numeros = list(map(int, A))
r = input()
dia, mes, año= int(r.split(' ')[0]), int(r.split(' ')[1]), int(r.split(' ')[2])
r2 = input()
dia2, mes2, año2= int(r2.split(' ')[0]), int(r2.split(' ')[1]), int(r2.split(' ')[2])
suma=sum(lista_de_numeros)
año*=suma
año2*=suma
if(mes==1):
	suma1=0
else :
	suma1=sum(lista_de_numeros[:mes - 1])
if(mes2==1):
	suma2=0
else :
	suma2=sum(lista_de_numeros[:mes2 - 1])
print((año2+suma2+dia2)-(año+suma1+dia))