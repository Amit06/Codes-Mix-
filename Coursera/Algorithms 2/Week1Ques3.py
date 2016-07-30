'''
Created on Jul 15, 2016

@author: Amit
'''


def prim(a,n,m):
    Nodes={}
    graph={}
    for x in range(1,n+1):
        Nodes[x]=[float('inf'),None]
        graph[x]=[]
    for x in a:
        graph[x[0]]+=[x[1]]
        graph[x[1]]+=[x[0]]
    dist={}
    for x in a:
        dist[(x[0],x[1])]=x[2]
        dist[(x[1],x[0])]=x[2]
    Nodes[a[0][0]]=[0,None]
   
    Ans={}
    
    while(Nodes):
        
        Q=sorted(Nodes,key=lambda x:Nodes[x][0])
        
        v=Q[0]
        
        Ans[v]=Nodes[v]
        u=Nodes.pop(Q.pop(0))
        
        for adj in graph[v]:
           
            if adj in Q and dist[v,adj]<Nodes[adj][0]:
                Nodes[adj]=[dist[v,adj],v]
                
    
    sum=0
    for i in Ans:
        sum+=Ans[i][0]
    print sum
        
    
def main():
    f=open('Prims.txt','r')
    a=[]
    for l in f:
        a.append(map(int,l.split()))
    
    N,M=a[0][0],a[0][1]
    a=a[1:]
    prim(a,N,M)






if __name__ == '__main__':
    main()