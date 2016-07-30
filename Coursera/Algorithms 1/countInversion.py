def msort(a):
    if len(a)>1:
        mid=len(a)//2
        L=a[:mid]
        R=a[mid:]
        x=msort(L)
        y=msort(R) 
        z=merge(a,L,R)
        c=x[0]+y[0]+z
        return (c,a)
    else:
        return (0,a)
        
def merge(a,L,R):
    i=0
    j=0
    k=0
    ctr=0
    while i<len(L) and j<len(R):
        if L[i]<=R[j]:
            a[k]=L[i]
            i+=1
        else:
            a[k]=R[j]
            j+=1
            ctr+=len(L)-i  
        k+=1
    while i<len(L):
        a[k]=L[i]
        k+=1
        i+=1
    while j<len(R):
        a[k]=R[j]
        k+=1
        j+=1
    return ctr
  
f=open('D:\Integer.txt','r')
a=[]
for line in f:
    a.append(int(line))
print msort(a)[0]