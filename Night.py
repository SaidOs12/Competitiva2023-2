n = int(input())
def cantidadT (triangulos, n) :
	total_triangulos = 0
	lado_actual = 2
	cantidad = 3
	while n >= cantidad:
		total_triangulos+=1
		n-=cantidad
		lado_actual += 1
		cantidad =int((lado_actual*(lado_actual+1))/2)
	if(n>=3):
		return cantidadT((total_triangulos + triangulos), n)
	return (total_triangulos+triangulos), n
total, n = cantidadT(0, n)

print(total, int(n))