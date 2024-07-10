import sys
# N = int(sys.stdin.readline())
# ls = sorted(list(map(int, sys.stdin.readline().split())))
# M = int(sys.stdin.readline())

N = 5
ls = [30, 40, 70, 80, 100]
M = 450

if sum(ls) <= M : 
    print(ls[-1])
else : 
    left, right = ls[0], ls[-1]
    rs = 0
    while left <= right :
        mid = (left+right)//2
        total = sum([min(a, mid) for a in ls])

        if total <= M : 
            left = mid+1
            rs = mid
        else:
            right = mid-1

    print(rs)