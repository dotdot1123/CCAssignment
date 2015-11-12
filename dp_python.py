# coding:utf-8

# first one

# version one   (lost one case)

# Enter your code here. Read input from STDIN. Print output to STDOUT

R = [0]*100005
MOD = 1000000007

def findPath(A, target):
    if target == 0:
        return 1
    
    if R[target] == 0:
        for i in range(0, len(A)):
            if target - A[i] >= 0:
                R[target] = R[target] + findPath(A, target - A[i])%MOD
    else:
        return R[target]%MOD
    return R[target]%MOD

def countPath(A, T):
    ret = [0]*len(T)
    for i in range(0, len(T)):
        ret[i] = findPath(A, T[i])
    return ret

def main():
    
    input = raw_input()
    strA = input.split(' ')
    A = []
    for i in range(0, len(strA)):
        if strA[i] != '':
            A.append(int(strA[i]))

tLen = int(raw_input())  # get the length of T
    
    T = []
    for i in range(0, tLen):
        T.append(int(raw_input()))     # get the array of T
    
    #A means the steps, T is length of target
    
    result = countPath(A, T)
    for i in range(0, len(result)):
        print result[i]


if __name__=="__main__":
    
    main()

# version 2

# Enter your code here. Read input from STDIN. Print output to STDOUT

def countPath(A, maxT):
    ways = [0] * (maxT + 1)
    ways[0] = 1
    
    for i in range(1, maxT + 1):
        for j in range(0, len(A)):
            if A[j] <= i:
                ways[i] = ways[i] + ways[i - A[j]]
                ways[i] = ways[i] % 1000000007
    return ways

def countPaths(A, T):
    maxT = -1
    for i in range(0,len(T)):
        if T[i] > maxT:
            maxT = T[i]

ways = countPath(A, maxT)
    result = [0]*len(T)
    
    for i in range(0, len(T)):
        result[i] = ways[T[i]]
return result

def main():
    
    input = raw_input()
    strA = input.split(' ')
    A = []
    for i in range(0, len(strA)):
        if strA[i] != '':
            A.append(int(strA[i]))

tLen = int(raw_input())  # get the length of T
    
    T = []
    for i in range(0, tLen):
        T.append(int(raw_input()))     # get the array of T
    #print T

    #A means the steps, T is length of target
    A = sorted(A)

a = countPaths(A, T)
    for i in range(0, len(a)):
        print a[i]


if __name__=="__main__":
    
    main()












#  second one

# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import deque

MOD = 1000000007
input = raw_input()
input = input.split(' ')
L = int(input[0])
C = int(input[1])

map1 = [[0 for i in range(C)] for j in range(L)]
steps = [[0 for i in range(C)] for j in range(L)]

class Position:
    
    def __init__(self, x, y):
        self.x = x
        self.y = y

q = deque()

def check(x, y, lastStep, lastCount):
    if x < 0 or x >= L:   # out of boundary
        return
    
    if y < 0 or y >= C:
        return
    
    if map1[x][y] == -2:
        return           # no way to go
    
    if map1[x][y] > 0:
        if lastStep + 1 == steps[x][y]:
            map1[x][y] += lastCount % MOD

if map1[x][y] == -1:
    q.append(Position(x, y))
        map1[x][y] = lastCount % MOD
        steps[x][y] = lastStep + 1

def findPath():
    q.append(Position(0,0))
    map1[0][0] = 1
    steps[0][0] = 0
    #print q
    
    while len(q) != 0:
        temp = q.popleft()
        x = temp.x
        y = temp.y
        
        if x == L-1 and  y == C-1:
            return
        
        lastStep = steps[x][y]
        lastCount = map1[x][y]
        check( x-1, y, lastStep, lastCount)
        check( x+1, y, lastStep, lastCount)
        check( x, y-1, lastStep, lastCount)
        check( x, y+1, lastStep, lastCount)

def main():
    mapRead = []
    for i in range(0, L):
        mapRead.append(raw_input())
    
    for i in range(0, L):
        for j in range(0, C):
            if mapRead[i][j] == 'o':
                map1[i][j] = -1
            else:
                map1[i][j] = -2
            steps[i][j] = -1

findPath()
    
    if map1[L-1][C-1] < 0:
        map1[L-1][C-1] = 0

print map1[L-1][C-1]%MOD
    print steps[L-1][C-1]


if __name__=="__main__":
    
    main()


# third one

# Enter your code here. Read input from STDIN. Print output to STDOUT


def countCombine(C, T):
    ways = [0] * (T + 1)
    ways[0] = 1
    
    for i in range(0, len(C)):
        for j in range(0, T + 1):
            if j - C[i] >= 0:
                ways[j] = ways[j] + ways[j - C[i]]
                ways[j] = ways[j] % 1000000007
    return ways

def countCombines(A, T):
    maxT = -1
    for i in range(0,len(T)):
        if T[i] > maxT:
            maxT = T[i]

ways = countCombine(A, maxT)
    result = [0]*len(T)
    
    for i in range(0, len(T)):
        result[i] = ways[T[i]]
return result



def main():
    
    input = raw_input()
    strA = input.split(' ')
    A = []
    for i in range(0, len(strA)):
        if strA[i] != '':
            A.append(int(strA[i]))

tLen = int(raw_input())  # get the length of T
    
    T = []
    for i in range(0, tLen):
        T.append(int(raw_input()))     # get the array of T
    
    #A means the steps, T is length of target
    
    result = countCombines(A, T)
    for i in range(0, len(result)):
        print result[i]


if __name__=="__main__":
    
    main()


# fourth one

# Enter your code here. Read input from STDIN. Print output to STDOUT
from operator import itemgetter, attrgetter

def highestStack(boxes):      # boxes has sorted by width
    highest = [0]*len(boxes)
    for i in range(0,len(highest)):
        temph = boxes[i][2]
        for j in range(0,i):
            if (boxes[j][0] > boxes[i][0]) and (boxes[j][1] > boxes[i][1]):
                attemp = boxes[i][2] + highest[j]
                if attemp > temph:
                    temph = attemp
        highest[i] = temph
    #print highest
    r = 0
    for i in range(0, len(highest)):
        if highest[i] > r:
            r = highest[i]
    return r


#for i in range(0, len)
#for i in range(0, N)



def main():
    
    input = raw_input()
    N = int(input)
    boxes = [[0 for i in range(3)] for j in range(N)]  # W L H
    
    for i in range(0, N):
        input = raw_input()
        split = input.split(' ')
        for j in range(0, len(split)):
            boxes[i][j] = int(split[j])     # boxes is N*3 array  each row is a box
    boxes = sorted(boxes, key = itemgetter(0), reverse=True)   # according W to sorted the array, so got sorted array
    #print boxes
    #print len(boxes)
    print highestStack(boxes)



if __name__=="__main__":
    
    main()
















