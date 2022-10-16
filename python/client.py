from socket import *
import threading
import time
from tkinter import *

root = Tk()
root.title('대화방')
root.geometry("300x300+100+100")
scroll = Scrollbar(root)
scroll.pack(side="right")
list = Listbox(root, width=200, height=280)
list.pack()

def send(sock):
    while True:
        sendData = input('>>>')
        sock.send(sendData.encode('utf-8'))
        if sendData != "":            
            list.insert(END, '나 : '+sendData)
            list.see(END)


def receive(sock):
    while True:
        recvData = sock.recv(1024)
        list.insert(END, '상대방 : '+recvData.decode('utf-8'))
        list.see(END)


port = 9080

clientSock = socket(AF_INET, SOCK_STREAM)
clientSock.connect(('192.168.0.60', port))

print('접속 완료')

sender = threading.Thread(target=send, args=(clientSock,))
receiver = threading.Thread(target=receive, args=(clientSock,))

sender.start()
receiver.start()
root.mainloop()

while True:
    time.sleep(1)
    pass
 