import csv
import random

fn = ['김','이','박','최','정','강','조','윤','장','임','한','오','서','신','권','황','안','송','류','전','홍','고','양','손','배','조','백']
names = ['민준','서준','도윤','예준','시우','하준','주원','지호','지후','준우','준서','건우','도현','현우','지훈','우진','선우','서진','유준','연우','서연','서윤','지우','서현','하은','하윤','민서','지유','윤서','지민','채원','수아','지아','지윤','은서','다은','예은','수빈','지안','소율']
wf = open('data.csv','a', newline='')
wr = csv.writer(wf)
for i in range(1, 101):
    name = random.choice(fn)+random.choice(names)
    wr.writerow([i,name,i,'남'])

wf.close()

f = open('data.csv','r')
rdr = csv.reader(f)

for line in rdr:
    print(line[1])

f.close()