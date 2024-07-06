import sys

N = int(input())
cards = list(set(map(int, sys.stdin.readline().split())))

print(cards)
