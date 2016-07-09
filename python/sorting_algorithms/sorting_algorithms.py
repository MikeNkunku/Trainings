from abc import ABCMeta, abstractmethod
import time as tm

class SortingAlgorithm():
	__metaclass__ = ABCMeta

	@abstractmethod
	def sort(self, a_list):
		pass

	def execute(self, a_list):
		start_time = tm.time()
		self.sort(a_list)
		end_time = tm.time()

		return ("%.5f" % (end_time - start_time))

class BubbleSort(SortingAlgorithm):
	def sort(self, a_list):
		exch = True

		while (exch):
			exch = False
			for i in range(len(a_list) - 1):
				if a_list[i] > a_list[i+1]:
					exch = True
					a_list[i], a_list[i+1] = a_list[i+1], a_list[i]

class InsertionSort(SortingAlgorithm):
	def sort(self, a_list):
		for i in range(1, len(a_list), 1):
			pos = i
			val = a_list[i]

			while ((pos > 0) and (val < a_list[pos - 1])):
				a_list[pos] = a_list[pos - 1]
				pos -= 1

			a_list[pos] = val

class MergeSort(SortingAlgorithm):
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

class QuickSort(SortingAlgorithm):
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

class SelectionSort(SortingAlgorithm):
	def sort(self, a_list):
		for i in range(len(a_list)-1):
			idx_min = i
			for j in range(i+1, len(a_list)-1, 1):
				if a_list[j] < a_list[idx_min]:
					idx_min = j

			a_list[idx_min], a_list[i] = a_list[i], a_list[idx_min]