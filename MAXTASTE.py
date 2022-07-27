# cook your dish here
n=int(input())
for i in range(n):
    arr = list(map(int,input().split(" ")))
    print(max(arr[0],arr[1])+max(arr[2],arr[3]))