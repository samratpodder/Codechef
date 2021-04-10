import math
def position(pos,N):
    if pos>N-1:
        return N-1
    else:
        return pos
def elemleft(inlist,data):
    return len(inlist)-inlist.index(data)
for t in range(int(input())):
    n= input()
    N=int(n)
    w=input().split(" ")
    l=input().split(" ")
    for i in range(len(w)):
        w[i] = int(w[i])
        l[i] = int(l[i])
    ind={}
    s=0
    for i in range(1,N+1):
        ind[i]=w.index(i)
    for i in range(2,N+1):
        temp1=ind[i]
        temp2=ind[i-1]
        temp=0
        if temp1<=temp2:
            temp=(math.ceil((temp2+1-temp1)/l[temp1]))
        s+=temp
        ind[i]=temp*(l[temp1])
    print(s)