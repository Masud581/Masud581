def Swap(a,b):
    temp = a
    a = b
    b = temp
    print("After swapping the no.is:",a,b)
    a = int(input("Enter the first no:"))
    b = int(input("Enter the second no.:"))
    print("Before swapping the no.is:",a,b)
    Swap(a,b)