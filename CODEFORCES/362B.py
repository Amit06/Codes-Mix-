a,b=raw_input().split('e')
d=a.split('.')

if int(b)<len(d[1]):
    ans=d[0]+d[1][:int(b)]+'.'+d[1][int(b):] 
    print ans if b!='0' or d[1]!='0' else d[0]
elif int(b)==len(d[1]):
    ans=d[0]+d[1] if d[0]!='0' else d[1]
    ans.lstrip('0')
    print ans
else:
    c=int(b)-len(d[1])
    ans=d[0]+d[1]+'0'*c if d[0]!=0 else d[1]+'0'*c
    print ans.lstrip('0')  