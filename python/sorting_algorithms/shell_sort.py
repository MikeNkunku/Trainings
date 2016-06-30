from isorting_algorithm import ISortingAlgorithm as ISA

class ShellSort(ISA):
	def sort(self, a_list):
		nb_elts_in_sublist = len(a_list) // 2

		while (nb_elts_in_sublist > 0):
			for i in range(nb_elts_in_sublist):
				self.gap_insertion(a_list, i, nb_elts_in_sublist)

			# print("Process finished for sublists with increments of %i!" % (nb_elts_in_sublist))

			nb_elts_in_sublist /= 2

	def gap_insertion(self, a_list, start, gap):
		for i in range(start + gap, len(a_list), gap):
			pos = i
			val = a_list[i]
			# print("pos = %i ; val = %.1f" % (pos, val))

			while ((pos >= gap) and (val < a_list[pos - gap])):
				a_list[pos] = a_list[pos - gap]
				pos -= gap

			a_list[pos] = val

			# print("List's state: %s\n" % (str(a_list)))