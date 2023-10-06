strs = ["flower","flow","fliwht"]
strans = ''

z = list(zip(*strs))
ans = map(lambda x: x[0] if x.count(x[0]) == len(x) else '', z)

for i in ans:
    if i=='':break
    strans+=i

print(strans)