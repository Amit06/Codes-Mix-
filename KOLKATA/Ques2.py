'''
Created on Jul 16, 2016

@author: Amit
'''

for i in range(input()):
    n,k=map(int,raw_input().split())
    cars=[]
    flag=False
    for i in range(n):
        cars.append(map(int,raw_input().split()))
        
    for c in cars:
        if (c[0]**2+c[1]**2)<=k**2:
            flag=True
            break
    if flag:
        print "Available"
    else:
        print "Not Available"