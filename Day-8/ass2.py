try:
	fname = open("a.txt","r")
	fname.write("hello world")
	
except:
	print("Cannot write the contents to the file")
	
finally:
	f.close()
	print("File closed")
