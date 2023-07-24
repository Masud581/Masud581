def binary_search(arr,target):
    left=0
    right=len(arr)-1
    while left<=right:
        mid=(left+right)//2
        if arr[mid]==target:
            return mid 
        elif arr[mid]<target:
            return mid
        left = mid+1
    else:
        right=mid-1
        return-1
numbers =[2,4,5,2,9,98,81,34,12,23,33]
target_number =12
result = binary_search(numbers,target_number)
if result !=-1:
    print(f"found the target number",{target_number}, "at index",{result})
else:
    print(f"The target number",{target_number},"is not found in the list")