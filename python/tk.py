from tkinter import *
import win32gui as wg
import win32ui as wu


hwndname = "계산기"
hwnd = wg.FindWindow(None, hwndname)

def clear():
    entry.delete(0, "end")

def textadd(text):
    entry.insert(999999, text)

def testset():
    print("버튼클릭")


win = Tk()
win.title("Test")
win.geometry("300x150")
frame_top = Frame(win)
frame_top.pack(side="top")
entry = Entry(frame_top, width=22)
entry.pack(side="left")
btn_clear = Button(frame_top, text="지우기", width=10, command=clear)
btn_clear.pack(side="right")

frame_bot = Frame(win)
frame_bot.pack(side="top")

btn_min = Button(frame_bot, text="-", width=10)
btn_plus = Button(frame_bot, text="+", width=10)
btn0 = Button(frame_bot, text="0", width=10, command=lambda:textadd(0))
btn1 = Button(frame_bot, text="1", width=10, command=lambda:textadd(1))
btn2 = Button(frame_bot, text="2", width=10, command=lambda:textadd(2))
btn3 = Button(frame_bot, text="3", width=10, command=lambda:textadd(3))
btn4 = Button(frame_bot, text="4", width=10, command=lambda:textadd(4))
btn5 = Button(frame_bot, text="5", width=10, command=lambda:textadd(5))
btn6 = Button(frame_bot, text="6", width=10, command=lambda:textadd(6))
btn7 = Button(frame_bot, text="7", width=10, command=lambda:textadd(7))
btn8 = Button(frame_bot, text="8", width=10, command=lambda:textadd(8))
btn9 = Button(frame_bot, text="9", width=10, command=lambda:textadd(9))

btn_min.grid(row=4, column=1)
btn_plus.grid(row=4, column=3)

btn0.grid(row=4, column=2)
btn1.grid(row=3, column=1)
btn2.grid(row=3, column=2)
btn3.grid(row=3, column=3)
btn4.grid(row=2, column=1)
btn5.grid(row=2, column=2)
btn6.grid(row=2, column=3)
btn7.grid(row=1, column=1)
btn8.grid(row=1, column=2)
btn9.grid(row=1, column=3)


win.mainloop()