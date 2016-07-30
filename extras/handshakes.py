'''
   author:ph0enix
'''
import math

def nCr(n,r):
    f = math.factorial
    return f(n) / f(r) / f(n-r) if n-r>=0 else 0

for i in range(input()):
    n=input()
    a=map(int,raw_input().split())
    c=[0,0,0]
    for j in a:
        c[j%3]+=1
    ctr=0
    if c[0]>0 and c[1]>0:
        
        if c[2]>0:
            ctr+=c[0]*c[1]*c[2]
    ctr+=nCr(c[0],3)+nCr(c[1],3)+nCr(c[2],3)
    print ctr