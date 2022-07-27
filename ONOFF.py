# cook your dish here
tc = int(input())
for i in range(tc):
    l = int(input())
    ar1 = input()
    ar2 = input()
    ar1=[int(char) for char in ar1]
    ar2=[int(char) for char in ar2]
    sum = 0
    for i in range(l):
        sum= sum+abs(ar2[i]-ar1[i])
    if(sum%2==1):
        print(0)
    else:
        print(1)