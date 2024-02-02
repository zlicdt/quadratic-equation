import cmath

while True:
    a = int(input("Please input a = "))
    b = int(input("Please input b = "))
    c = int(input("Please input c = "))

    delta = (b * b) - (4 * a * c)

    if delta > 0:
        x1 = ((-b) + cmath.sqrt(delta)) / (2 * a)
        x2 = ((-b) - cmath.sqrt(delta)) / (2 * a)
        print("Two results: x = ", x1, "; x = ", x2, ".")
    if delta == 0:
        x = (-b) / (2 * a)
        print("One result: x = ", x, ".")
    if delta < 0:
        print("No result")
    
    print("-- Repeat again --")
