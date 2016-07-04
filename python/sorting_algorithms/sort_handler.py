class SortHandler():
	class __Singleton: # private attribute
		def __init__():
			self.val = None

		def __str__(self):
			return `self` + self.val

	def __new__(c):
		if (not(Singleton.instance)):
			Singleton.instance = Singleton.__Singleton()

	def __getattr__(self, attr):
		return getattr(self.instance, attr)

	def __setattr__(self, attr, val):
		return setattr(self.instance, attr, val)

	instance = None
	a_list = None
	sort_class = None