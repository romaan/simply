import array

# Given an array arr[] of n elements, write a function to search a given element x in arr[]

def search(an_array, key):
    """
    >>> search(array.array('i', [23, 34, 12, 92, 8]), 8)
    4
    """
    for idx, item in enumerate(an_array):
        if key == item:
            return idx
    return -1


# Sidebar: When to use array in python: https://stackoverflow.com/questions/176011/python-list-vs-array-when-to-use
