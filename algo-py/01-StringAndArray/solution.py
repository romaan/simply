#!/usr/bin/python

# python -m doctest -v solution.py

def rotate_array(array, n, k):
	"""
	>>> rotate_array([1, 2 , 3, 4, 5, 6, 7], 7, 3)
	[5, 6, 7, 1, 2, 3, 4]
	"""
	assert(len(array) == n)
	k = k % n
	return array[(n - k):] + array[:(n - k)]


def evaluate_reverse(expression):
	"""
	>>> evaluate_reverse(["2", "1", "+", "3", "*"])
	9
	>>> evaluate_reverse(["4", "13", "5", "/", "+"])
	6
	"""
	temp = []

	for token in expression:
		if token.isdigit():
			temp.append(token)
		else:
			a = str(temp.pop())
			b = str(temp.pop())
			temp.append(eval(b + token + a))
	return temp.pop()

