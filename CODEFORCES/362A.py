t,s,x=map(int,raw_input().split())
flag=True
for i in range(t,x+1,s):
        
        if i>t and (x==i or x==i+1):
            print 'YES'
            flag=False
            break
        elif i==t and x==i:
            print 'YES'
            flag=False
            break
        elif i>t and i+1>x:
            break       
if flag==True:
    print "NO"