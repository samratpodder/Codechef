for t in range(int(input())):
    N = int(input())
    arr= [x for x in range(0,(2**N))]
    counter=0
    for x in arr:
        if x^(x+1) == (x+2)^(x+3):
            counter+=1
    print(counter%1000000007)