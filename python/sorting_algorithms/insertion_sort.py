from isorting_algorithm import ISortingAlgorithm as ISA

class InsertionSort(ISA):
	def sort(self, a_list):
		for i in range(1, len(a_list), 1):
			pos = i
			val = a_list[i]

			while ((pos > 0) and (val < a_list[pos - 1])):
				a_list[pos] = a_list[pos - 1]
				pos -= 1

			a_list[pos] = val