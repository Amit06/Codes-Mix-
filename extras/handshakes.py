
for i in range(input()):
    n=input()
    c=map(int,raw_input().split())
    ans=0;
    cb=[0]*n
    cr=[0]*n
    for i in range(n):
        if cb[i]!=0:
            continue
        
        cb[i]=i+1
        k=(i+c[i]+1) % n
        ctr=0
        kr=0
        while(kr<=n):
            kr+=1
            if (cb[k]==(i+1)):
                ans+=(1+ctr-cr[k])
                break
            
            elif (cb[k]!=0):
                break
            ctr+=1
            cr[k]=ctr
            cb[k]=i+1;
            k=(k+c[k]+1) % n;
    print ans