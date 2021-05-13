for t in range(int(input())):
    k1,k2,k3,v = map(float,input().split())
    factors = k1*k2*k3*v
    if(round(100/factors,2) < 9.58):
        print("yes")
    else:
        print("no")