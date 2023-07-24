h = eval(input("Enter diamond's height:"))
for i in range(h):
    print((h-1)*" ",(2*i+1)* "*")
    for i in range (h-2,-1,-1):
        print((h-i)*"",(2*i+1)*"*")

