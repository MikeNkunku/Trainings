import unittest as ut
import sorting_algorithms as sa

class SortingAlgorithmTestCase(ut.TestCase):
	def setUp(self):
		self.a_list = [0, 3, 2, 4.9, 100, 54, 505]

	def tearDown(self):
		self.a_list = None

	def runTest(self):
		classes = [sa.BubbleSort(), sa.InsertionSort(), sa.MergeSort(), sa.ShellSort(), sa.QuickSort(), sa.SelectionSort()]

		for cls in classes:
			a_list_copy = list(self.a_list)
			cls.sort(a_list_copy)
			error_msg = "List not sorted for %s..." % cls.__class__.__name__
			self.assertEqual(a_list_copy, [0, 2, 3, 4.9, 54, 100, 505], error_msg)