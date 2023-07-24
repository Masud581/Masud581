def bubbleSort(arr):
    n = len(arr)
    Swapped = False
    for i in range (n-1):
        for j in range (0,n-i+1):
            Swapped = True
            arr[j],arr[j+1]=arr[j+1],arr[j]
            if not Swapped:
                return
        arr=[12,12,14,15,35,25.13]
        bubbleSort(arr)
        print("Sorted array is:")
        for i in range (len(arr)):
            print("%d",arr[i],end=" ")