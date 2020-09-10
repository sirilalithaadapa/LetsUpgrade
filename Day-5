Question 1:
              Write a program to identify sub list [1,1,5] is there in the given list in the same order, if yes print
              “it’s a Match” if no then print “it’s Gone” in function.
Example -
              Listy =[1,5,6,4,1,2,3,5] - it’s a Match
              Listy = [1,5,6,5,1,2,3.6] - it’s Gone
              
Solution:       
                 x=[1,5,5,6,62,1,4,1,8,5]
y=[1,1,5]

def check(a,b):
    for i in a:
        for j in b:
            if(len(b)>=0 and j == i):
                b.pop(0)
            else:
                break
    return b

if len(check(x,y))==0:
    print("Its a match")
else: print("Its gone")
    
check(x,y)

Output:- 
Its a match

            
Question 2:
Make a Function for prime numbers and use Filter to filter out all the prime numbers from 1-2500

for i in range(1,201):
    count=0
    for j in range(1,i+1):
        if(i%j==0):
            count=count+1
    if(count==2):
        print(i)

