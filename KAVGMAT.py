def subsum(aux,tli,tlj,rbi,rbj):
    res = aux[rbi][rbj]
    if (tli > 0):
        res = res - aux[tli - 1][rbj]
    if (tlj > 0):
        res = res - aux[rbi][tlj - 1]
    if (tli > 0 and tlj > 0):
        res = res + aux[tli - 1][tlj - 1]
  
    return res
for t in range(int(input())):
    N,M,K = map(int,input().split())
    matrix = []
    for i in range(M):
        arr=[]
        arr = (input().split())
        for k in range(N):
            arr[k] = int(arr[k])
        
        matrix.append(arr)
    aux=[[0 for i in range(N)] for j in range(M)]
    for i in range(N):
        aux[0][i] = matrix[0][i]
    for i in range(1,M):
        for j in range(0,N):
            aux[i][j] = matrix[i][j]+aux[i-1][j]
    for i in range(0,M):
        for j in range(1,N):
            aux[i][j]+=aux[i][j-1]
    counter=0
    for lists in matrix:
        for elems in lists:
            if elems > K:
                counter+=1
    for offset in range(1,M-1):
        for i in range(0,M-1):
            for j in range(0,N-1):
                tli,tlj,rbi,rbj=i,j,i+offset,j+offset
                sum=subsum(aux,tli,tlj,rbi,rbj)
                avg = sum/ ((rbi-tli)+1)*((rbj-tlj)+1)
                if avg >=K:
                    counter+=1
    print(counter)