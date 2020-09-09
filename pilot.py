altitude=input("enter the current altitude:")
altitude=int(altitude)
if altitude==1000:
    print("safe to land")
elif altitude<=4500:
    print("bring down to 1000")
else:
    print("turn around")
