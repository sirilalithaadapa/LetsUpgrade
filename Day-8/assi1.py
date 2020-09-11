def smart_divide(func):
    def inner(a, b):
		a= int(input("Enter a:"))
		b= int(input("Enter b:"))
        print("I am going to divide", a, "and", b)
        if b == 0:
            print("OOPs! cannot divide")
            return

        return func(a, b)
    return inner

def divide(a, b):
    print(a/b)
