dp=[]
n=input()
dp.append([0]+[i for i in range(1,n+1)])
dp.append([0 for i in range(n+1)])
dp.append([0 for i in range(n+1)])
dp.append([0 for i in range(n+1)])

coins=[1,5,7,10]
for j in range(1,4):
    for i in range(1,n+1):
        
        dp[j][i]=min(dp[j-1][i],1+dp[j][i-coins[j]]) if i>=coins[j] else dp[j-1][i]

print dp[-1][-1]