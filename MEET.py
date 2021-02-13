def convert24(time):
    result=""
    if time[6] == 'A':
        hour = time[0:2]
        minutes=time[3:5]
        hr = int(hour)
        if(hr==12):
            return "00"+minutes
        if hr < 10:
            return "0"+str(hr)+minutes

        result =  str(hr)+minutes
    if time[6] == 'P':
        hour = time[0:2]
        hr = int(hour)
        if hr==12:
            hr=0
        hr+=12
        minutes=time[3:5]
        # print()
        result = str(hr)+str(minutes)
    # print(result)
    return result

# print(convert24("10:40 AM"))
for t in range(int(input())):
    mytime=input()
    # print(convert24(mytime))
    n = int(input())
    for i in range(n):
        LRTIME = input()
        # print(LRTIME[0:8])
        ltime = LRTIME[0:8]
        rtime = LRTIME[9:]
        # print(ltime)
        # print(rtime)
        ltime24 = int(convert24(ltime))
        rtime24 = int(convert24(rtime))
        # print(ltime24)
        # print(rtime24)
        mytime24 = int(convert24(mytime))
        # print(mytime24)
        if ltime24<=mytime24 and mytime24<=rtime24:
            print('1',end="")
        else:
            print("0",end="")
    print("\n")