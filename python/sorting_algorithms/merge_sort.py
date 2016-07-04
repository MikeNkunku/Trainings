from isorting_algorithm import ISortingAlgorithm as ISA

class MergeSort(ISA):
	def sort(self, a_list):
		if (len(a_list) > 1):
			middle = len(a_list) // 2

			left_half = a_list[:middle]
			right_half = a_list[middle:]

			self.sort(left_half)
			self.sort(right_half)

			p_lh = 0 # cursor for the left half
			p_rh = 0 # cursor for the right half
			p_t = 0 # cursor for the final list

			while ((p_lh < len(left_half)) and (p_rh < len(right_half))):
				if (left_half[p_lh] < right_half[p_rh]) :
					a_list[p_t] = left_half[p_lh]
					p_lh += 1
				else:
					a_list[p_t] = right_half[p_rh]
					p_rh += 1
				p_t += 1

			while (p_lh < len(left_half)):
				a_list[p_t] = left_half[p_lh]
				p_lh += 1
				p_t += 1

			while (p_rh < len(right_half)):
				a_list[p_t] = right_half[p_rh]
				p_rh += 1
				p_t += 1