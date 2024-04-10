
c = input()
n =  int (c.split(' ')[0])
d =  int  (c.split(' ')[1])

ultimo = n%10
resta = ultimo-d
if(resta>=0):
    n+=10-resta
else:
    n-=resta
print(n)