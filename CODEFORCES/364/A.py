n=input()
c=map(int,raw_input().split())
sumi=sum(c)/(n/2)
#print sumi
c=[[i,False] for i in c]
#print c
d={}
for i in range(n):
    #print i
    if c[i][1]==True:
        #print i,'here'
       
        continue
    for j in range(n) :
        #print j
        if c[j][1]==True:
            continue
        if c[i][0]+c[j][0]==sumi and i!=j and c[i][1]!=True and c[j][1]==False:
            #print "yes",i,j
            c[i][1]=True
            c[j][1]=True
            d[i]=j
            break
#print d
for keys in d:
    print (keys+1),d[keys]+1

            
        