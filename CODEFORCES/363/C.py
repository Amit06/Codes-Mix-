n=input()
a=map(int,raw_input().split())
prev=[]
ctr=0
i=a[0]
if i==0:
    ctr+=1
    #print "1i--",i
    prev.append('R')
elif i==1:
    prev.append('C')
elif i==2:
    prev.append('G')
elif i==3:
    prev.append('S')
#print prev
for i in a[1:]:
    if i==0 :
        ctr+=1
        #print "2i--",i
        prev.append('R')
    elif i==1 and prev[-1]!='C':
        prev.append('C')
    elif i==2 and prev[-1]!='G':
        prev.append('G')
    elif i==3 and prev[-1]=='C':
        prev.append('G')
    elif i==3 and prev[-1]=='G':
        prev.append('C')
    elif i==3 and (prev[-1]=='S' or prev[-1]=='R'):
        prev.append('S')
    else:
        ctr+=1
        prev.append('R')
        #print "3i--",i
    #print prev
print ctr
