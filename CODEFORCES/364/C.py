n=input()
s=[i for i in raw_input()]
d={}
for k in s:
    d[k]=0
tot=len(d)

start=0
d[s[0]]+=1
now=1
j=1
ans=len(s)
while True:
    while now<tot:
        if j>=n:
            break
        if d[s[j]]==0:
            now+=1  
        d[s[j]]+=1
        j+=1
    if ans>j-start:
        ans=j-start
    
    d[s[start]]-=1
    if d[s[start]]==0:
        now-=1
    if now<tot and j>=n:
        break
    start+=1
print ansa