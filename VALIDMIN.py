# cook your dish here
# cook your dish here
n = int(input())
for i in range(n):
    arr = list(map(int,input().split(" ")))
    minval = min(min(arr[0],arr[1]),min(arr[1],arr[2]))
    if((arr[0]==arr[1] and arr[0]==minval) or (arr[0] == arr[2]and arr[0]==minval) or (arr[1]==arr[2] and arr[1]==minval)):
        print("YES")
    else:
        print("NO")