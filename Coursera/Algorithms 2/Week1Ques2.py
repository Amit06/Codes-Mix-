f=open('Jobs.txt','r')
n=[]
for line in f:
    n.append(map(int,line.split()))
n=n[1:]

s=sorted(n,key=lambda x: x[0]/float(x[1]),reverse=True)
ti=0
sum=0
while s:
    j=s.pop(0)
    sum+=(ti+j[1])*j[0]
    ti+=j[1]
print sum