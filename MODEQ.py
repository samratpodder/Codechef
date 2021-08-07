for t in range(int(input())):
    N,M = map(int,input().split())
    pairs=[]
    for b in range(2,N+1):
        for a in range(1,b):
            if (((M % a) % b)==((M % b) % a)): 
                pairs.append((a,b))
    print(len(pairs),pairs)