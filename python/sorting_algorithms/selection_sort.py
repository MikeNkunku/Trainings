from isorting_algorithm import ISortingAlgorithm as ISA

class SelectionSort(ISA):
	def sort(self, a_list):
		for i in range(len(a_list)-1):
			idx_min = i
			for j in range(i+1, len(a_list)-1, 1):
				if a_list[j] < a_list[idx_min]:
					idx_min = j

			a_list[idx_min], a_list[i] = a_list[i], a_list[idx_min]