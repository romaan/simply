#!/usr/bin/python

def set_matrix_zero(matrix):
    """
    >>> set_matrix_zero([[1, 0, 1, 1], [1, 1, 0, 1], [1, 1, 1, 1]])
    [[1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 1]]
    """
    n = len(matrix)
    assert(n >= 1)
    m = len(matrix[0])
    x = set()
    y = set()
    for i in xrange(0, n):
        for j in xrange(0, m):
            if matrix[i][j] == 0:
                x.add(i)
                y.add(j)
    for i in x:
        for j in xrange(1, m):
            matrix[i][j] = 0
    for j in y:
        for i in xrange(1, n):
            matrix[i][j] = 0
    return matrix

def spiral_matrix(matrix_order):
    """
    >>> spiral_matrix(4)
    [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
    """
    matrix = [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]]
    k = 1
    i = 0
    j = 0
    left_order = 0
    while left_order < matrix_order:
        while j < matrix_order:
            matrix[i][j] = k
            k += 1
            j += 1
        i += 1
        j -= 1
        while i < matrix_order:
            matrix[i][j] = k
            k += 1
            i += 1
        i -= 1
        j -= 1
        while j >= left_order:
            matrix[i][j] = k
            k += 1
            j -= 1
        i -= 1
        j += 1
        while i >= left_order + 1:
            matrix[i][j] = k
            k += 1
            i -= 1
        i += 1
        j += 1
        matrix_order -= 1
        left_order += 1
    return matrix


def search_2d_matrix(matrix, target):
    """
    >>> search_2d_matrix([[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]], 5)
    True
    """
    i = j = 0
    while matrix[i][j] < target and i < len(matrix) and j < len(matrix[i]):
        j += 1
        if matrix[i][j] == target:
            return True
        else:
            i += 1
            j = 0
    return False
