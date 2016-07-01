from isorting_algorithm import ISortingAlgorithm as ISA

class QuickSort(ISA):
	def sort(self, a_list):
		self.sortHelper(a_list, 0, len(a_list) - 1)

	def sortHelper(self, a_list, start, end):
		if (start < end) :
			split_point = self.partition(a_list, start, end)

			self.sortHelper(a_list, start, split_point - 1)
			self.sortHelper(a_list, split_point + 1, end)

	def partition(self, a_list, start, end):
		pivot_value = a_list[start]
		done = False

		left_mark = start + 1
		right_mark = end

		while (not(done)):
			while ((left_mark <= right_mark) and (a_list[left_mark] <= pivot_value)):
				left_mark += 1

			while ((right_mark >= left_mark) and (a_list[right_mark] >= pivot_value)):
				right_mark -= 1

			if left_mark > right_mark:
				done = True
			else:
				a_list[left_mark], a_list[right_mark] = a_list[right_mark], a_list[left_mark]

		a_list[start], a_list[right_mark] = a_list[right_mark], a_list[start]

		return right_mark