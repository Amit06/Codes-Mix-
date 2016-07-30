'''
Created on Jul 27, 2016

@author: Amit
'''

class BinHeap():
    
    def __init__(self,heap,size):
        self.heap=heap
        self.size=size
        
    def buildHeap(self,a):
        self.heap=a.clone()
        self.size=len(a)
        for i in range(self.size/2-1,-1,-1):
            self.down(i)
        
    def removeMin(self):
        if self.size==0:
            "Print Empty heap"
            return
        removed=self.heap[0]
        self.heap[0]=self.heap[self.size-1]
        self.size-=1
        self.down(0)
        return removed
    
    def add(self,a):
        self.size+=1
        self.heap[self.size-1]=a
        self.up(self.size-1)
    
    def up(self,i):
        while i>0:
            p=(i-1)/2
            if self.heap[i]>=self.heap[p]:
                break
            self.heap[p],self.heap[i]=self.heap[i],self.heap[p]
            i=p
    def down(self,i):
        while True:
            child=2*i+1
            if child>=self.size:
                break
            if child+1<self.size and self.heap[child+1]<self.heap[child]:
                child+=1
            if self.heap[i]<=self.heap[child]:
                break
            self.heap[child],self.heap[i]=self.heap[i],self.heap[child]
            i=child
            
        
        