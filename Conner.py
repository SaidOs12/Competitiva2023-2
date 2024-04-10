t = int(input())

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

for _ in range(t):
    A, B, C, N = map(int, input().split())

    A += 1
    B += 1
    C += 1

    salida = N // A + N // B + N // C
    mcmAB = lcm(A, B)
    mcmBC = lcm(B, C)
    mcmCA = lcm(C, A)
    mcmT = lcm(mcmAB, C)

    resta = (N // mcmAB) + (N // mcmBC) + (N // mcmCA) - (N // mcmT)
    print(salida - resta)