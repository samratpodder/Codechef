for t in range(int(input())):
    inarr = input().split()
    for i in range(len(inarr)):
        inarr[i] = int(inarr[i])
    N=inarr[0]
    K=inarr[1]
    strinp = input()
    strinp=[char for char in strinp]
    i=0
    goodness = 0
    while(i<(N//2)):
        j=N-i-1
        if strinp[i] != strinp[j]:
            # print(strinp[i],strinp[j],i,j)
            goodness+=1
        i+=1
    changes=0
    if goodness == K:
        changes =0
    else:
        if goodness>K:
            while(goodness!=K):
                i=0
                while(i<(N//2)):
                    j=N-i-1
                    if strinp[i] == strinp[j]:
                        strinp[i]=strinp[j]
                        changes+=1
                        goodness+=1
                    i+=1
        if goodness<K:
            while(goodness!=K):
                i=0
                while(i<(N//2)):
                    j=N-i-1
                    if strinp[i] != strinp[j]:
                        strinp[i]=strinp[j]
                        goodness+=1
                        changes+=1
                    i+=1
    print("Case #"+str(t+1)+": "+str(changes))

