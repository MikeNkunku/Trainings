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