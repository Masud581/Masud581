def remove_duplicate(lst):
    return list(set(lst))
number = [1,2,3,4,3,2,1,5,6,7,6,5]
unique_numbers = remove_duplicate(number)
print("Original list:", number)
print("List with duplicates removed:",unique_numbers)