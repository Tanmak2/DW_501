import csv
from multiprocessing import managers
import random

fn = ['김','이','박','최','정','강','조','윤','장','임','한','오','서','신','권','황','안','송','류','전','홍','고','양','손','배','조','백']
m_names = ['민준','서준','도윤','예준','시우','하준','주원','지호','지후','준우','준서','건우','도현','현우','지훈','우진','선우','서진','유준','연우']
w_names = ['서연','서윤','지우','서현','하은','하윤','민서','지유','윤서','지민','채원','수아','지아','지윤','은서','다은','예은','수빈','지안','소율']
addr = ['대전광역시', '충청남도', '충청북도']

wf = open('data.csv','a', newline='')
wr = csv.writer(wf)
mback_num = []
wback_num = []
phone_num = []
man_cnt = 0
woman_cnt = 0
while len(mback_num) < 10000:
    back_ran = random.randrange(1000000,2000000)
    if back_ran not in mback_num:
        mback_num.append(back_ran)

while len(wback_num) < 5000:
    back_ran = random.randrange(2000000,3000000)
    if back_ran not in wback_num:
        wback_num.append(back_ran)

while len(phone_num) < 10000:
    mran = random.randrange(1000,10000)
    lran = random.randrange(1000,10000)
    phone = "010-"+str(mran)+"-"+str(lran)
    if phone not in phone_num:
        phone_num.append(phone)

for i in range(10000):
    ran = random.randrange(1,1001)
    month = random.randrange(1,13)

    if month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12:
        day = random.randrange(1,32)
    elif month == 2:
        day = random.randrange(1,29)
    else:
        day = random.randrange(1,31)
    if day < 10:
        day = "0"+str(day)
    else:
        day = str(day)

    if month < 10:
        month = "0"+str(month)
    else:
        month = str(month)

    ssno_1 = str(random.randrange(60, 100)) + month + day
    ssno_2 = "0"+str(random.randrange(4)) + month + day
    birth_1 = "19" + ssno_1
    birth_2 = "20" + ssno_2
    if ran <= 800:
        name = random.choice(fn)+random.choice(m_names)
        if ran <= 200:
            wr.writerow([ssno_2+"-"+str(mback_num[man_cnt]+2000000),name,birth_2,random.choice(addr),phone_num[i],"남"])
            man_cnt += 1
        else:
            wr.writerow([ssno_1+"-"+str(mback_num[man_cnt]),name,birth_1,random.choice(addr),phone_num[i],"남"])
            man_cnt += 1
    else:
        name = random.choice(fn)+random.choice(w_names)
        if ran <= 850:
            wr.writerow([ssno_2+"-"+str(wback_num[woman_cnt]+2000000),name,birth_2,random.choice(addr),phone_num[i],"여"])
            woman_cnt += 1
        else:
            wr.writerow([ssno_1+"-"+str(wback_num[woman_cnt]),name,birth_1,random.choice(addr),phone_num[i],"여"])
            woman_cnt += 1

    #wr.writerow([ssno,name,birth,addr,phone_num,sex])

# wf.close()

# f = open('data.csv','r')
# rdr = csv.reader(f)

# for line in rdr:
#     print(line[1])

# f.close()