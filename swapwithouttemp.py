def Swap(a,b):
    a,b=b,a
    print("After Swapping the no.is:",a,b)
    a = int(input("Enter the first no:"))
    b = int(input("Enter the second no;"))
    print("Before Swapping the no is:",a,b)
    Swap(a,b)