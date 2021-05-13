for t in range(int(input())):
    N,K=map(int,input().split())
    string = input()
    count=0
    maxv=-999
    for i in range(N):
        if string[i]=='*':
            count+=1
            if maxv<count:
                maxv=count
        else:
            count =0
    if maxv>=K:
        print("yes")
    else:
        print("no")