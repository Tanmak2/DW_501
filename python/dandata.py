import csv
import random

f = open('dan.csv','r')
rdr = csv.reader(f)
wf = open('dancnt.csv','w',newline='')
wr = csv.writer(wf)

for list in rdr:
    dan_cnt = random.randrange(1,5)
    dan_level = random.randrange(1,11)
    if int(list[2]) >= 20000000:
        dan_ran = random.randrange(1000)
        if dan_ran <= 700:
            dan_cnt = random.randrange(1,3)
            i = 0;
            dan = [0,0,0,0]
            while i < dan_cnt:
                dan_idx = random.randrange(4)
                if dan[dan_idx] == 0:
                    dan[dan_idx] = random.randrange(1,4)
                    i += 1

            wr.writerow(dan)
        elif dan_ran > 700 or dan_ran <= 950:
            dan_cnt = random.randrange(2,4)
            i = 0;
            dan = [0,0,0,0]
            while i < dan_cnt:
                dan_idx = random.randrange(4)
                if dan[dan_idx] == 0:
                    dan[dan_idx] = random.randrange(1,7)
                    i += 1

            wr.writerow(dan)
        else:
            dan_cnt = random.randrange(3,5)
            i = 0;
            dan = [0,0,0,0]
            while i < dan_cnt:
                dan_idx = random.randrange(4)
                if dan[dan_idx] == 0:
                    dan[dan_idx] = random.randrange(1,11)
                    i += 1

            wr.writerow(dan)
    else:
        dan_ran = random.randrange(1000)
        if dan_ran <= 500:
            dan_cnt = random.randrange(1,3)
            i = 0;
            dan = [0,0,0,0]
            while i < dan_cnt:
                dan_idx = random.randrange(4)
                if dan[dan_idx] == 0:
                    dan[dan_idx] = random.randrange(1,4)
                    i += 1

            wr.writerow(dan)
        elif dan_ran > 500 or dan_ran <= 900:
            dan_cnt = random.randrange(2,4)
            i = 0;
            dan = [0,0,0,0]
            while i < dan_cnt:
                dan_idx = random.randrange(4)
                if dan[dan_idx] == 0:
                    dan[dan_idx] = random.randrange(1,7)
                    i += 1

            wr.writerow(dan)
        else:
            dan_cnt = random.randrange(3,5)
            i = 0;
            dan = [0,0,0,0]
            while i < dan_cnt:
                dan_idx = random.randrange(4)
                if dan[dan_idx] == 0:
                    dan[dan_idx] = random.randrange(1,11)
                    i += 1

            wr.writerow(dan)