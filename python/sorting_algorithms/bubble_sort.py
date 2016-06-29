from isorting_algorithm import ISortingAlgorithm as ISA

class BubbleSort(ISA):
	def sort(self, a_list):
		exch = True

		while (exch):
			exch = False
			for i in range(len(a_list) - 1):
				if a_list[i] > a_list[i+1]:
					exch = True
					a_list[i], a_list[i+1] = a_list[i+1], a_list[i]