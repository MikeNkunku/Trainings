import sorting_algorithms
from sort_handler import SortHandler as SH

from os import _exit as exit
from sys import exc_info

if __name__ != '__main__':
	print("Must rename file into 'main.py'!")
	exit(1)

options = {
	1: "Put list",
	2: "Display list",
	3: "Sort list",
	4: "Exit"
}

def put_list(sh_inst, a_list = None):
	while (not(isinstance(a_list, list))):
		print("Insert your list:")
		a_list = eval(raw_input())
		# print(sh_inst)

	sh_inst.a_list = a_list

def display_list(sh_inst):
	print "\nA list must be defined first!" if (sh_inst.a_list == None) else ("List: %s" % str(sh_inst.a_list))

def sort_list(sh_inst):
	pass

def quit(sh_inst):
	print("\nFarewell!\n\n"
		"Quitting...")

actions = {
	1: put_list,
	2: display_list,
	3: sort_list,
	4: quit
}

def print_menu():
	print('\n')
	for o in options:
		print("%i - %s" % (o, options[o]))

def get_user_choice():
	user_choice = 0

	while ((user_choice < 1) or (user_choice > len(options))):
		print_menu()
		user_choice = int(raw_input())

	return user_choice

try:
	# user_choice = None
	# exit_choice = [k for k, v in options.items() if v == "Exit"][0]

	# while (user_choice != exit_choice):
	# 	user_choice = get_user_choice()

	# 	actions[user_choice](sh_instance)

except Exception, e:
	raise e