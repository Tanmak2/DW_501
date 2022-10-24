import csv
import random

wf = open('gym_member.csv','w',newline='')
wr = csv.writer(wf)

i = 0;
while i < 10000:
    ran = str(random.randrange(1,941))
    num = [ran]
    wr.writerow(num)
    i += 1

wf.close();