# Day6 - Assignment-1

class Bank_Accoount:
def __init__(self):
self.balance = 0
print("Hello! Welcome to Deposit and Withdrawal Machine")
	def deposit(self):
		amount = float(input("Enter the amount to be deposited:"))
		self.balance+ = amount
		print("\n Amount Deposited:", amount)
	
	def withdraw(self):
		amount = float(input("Enter the amount to be withdrawn:"))
		if self.amount >= amount:
			self.balance -= amount
			print("\n You withdrew:", amount)
		else:
			print("\n Insufficient Balance")
			
	def display(self):
		print("\n Net Available Balance=", self.balance)
