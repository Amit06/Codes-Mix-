n,m=map(int,raw_input().split())
x=[0 for _ in range(n)]
y=[0 for _ in range(n)]
noc,nor=0,0
z=[]
count=n**2
i=0
for col in range(m):
    p,q=map(int, raw_input().split())
    if x[p-1]==0 and y[q-1]==0:
        count-=2*n-1
        count+=noc+nor
        noc+=1
        nor+=1
        x[p-1]+=1
        y[q-1]+=1
        count=count
    elif x[p-1]>0 and y[q-1]==0:
        count-=n-1
        count+=(nor-1)
        noc+=1
        y[q-1]+=1
    elif y[q-1]>0 and x[p-1]==0:
        count-=n-1
        count+=(noc-1)
        nor+=1
        x[p-1]+=1
    print count