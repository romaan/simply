#!/usr/bin/python

def binary_search_iterative(an_array, key):
    """
    >>> binary_search_iterative([2, 4, 6, 8, 10], 10)
    4
    >>> binary_search_iterative([2, 4, 6, 8, 10], 9)
    -1
    """
    left = 0
    right = len(an_array) - 1
    while left <= right:
        mid = (left + right) // 2
        if an_array[mid] == key:
            return mid
        elif key > an_array[mid]:
            left = mid + 1
        else:
            right = mid - 1
    return -1
