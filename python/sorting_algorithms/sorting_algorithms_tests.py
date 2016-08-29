import unittest as ut
import sorting_algorithms

class SortingAlgorithmTestCase(ut.TestCase):
	def setUp(self):
		self.a_list = [0, 3, 2 , 4.9, 100, 54, 505]

	def tearDown(self):
		self.a_list.dispose()
		self.a_list = None