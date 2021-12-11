
tc = int(input())
while(tc>0):
    tc=tc-1
    n=int(input())
    arr = map(int,input().split(" "))
    if(n==1):
    	print("0")
    	continue
    freq = {}
    maxi = 0
    maxitem=0
    for item in arr:
        if (item in freq):
            freq[item] += 1
            if(freq[item]>maxi):
                maxi=freq[item]
                maxitem = item
        else:
            freq[item] = 1
            if(maxi==0):
            	maxi=1
            	maxitem=item
    if(maxi==1):
    	print("-1")
    	continue
    print(n-maxi+1)    