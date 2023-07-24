def SelectionSort(array,size):
    for sort in range(size):
        min_index = sort
        for j in range(sort+1,size):
            if array [j]<array[min_index]:
             min_index=j
            (array[sort],array[min_index])=(array[min_index],array[sort])
            arr = [15,17,35,25,36,28,13]
            size = len(array)
            SelectionSort(array,size)
            print("The array after sorting is Acending order by selection sort is:")
            print(arr)
