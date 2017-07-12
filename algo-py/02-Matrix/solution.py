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
