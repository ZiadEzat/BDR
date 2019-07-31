import http.server
import socketserver
import RPi.GPIO as GPIO
from threading import *
import time
x = 0
out1 = 13
out2 = 11
out3 = 15
out4 = 12
out5 = 32
out6 = 31
out7 = 29
out8 = 36
GPIO.setmode(GPIO.BOARD)
GPIO.setup(out1,GPIO.OUT)
GPIO.setup(out2,GPIO.OUT)
GPIO.setup(out3,GPIO.OUT)
GPIO.setup(out4,GPIO.OUT)
GPIO.setup(out5,GPIO.OUT)
GPIO.setup(out6,GPIO.OUT)
GPIO.setup(out7,GPIO.OUT)
GPIO.setup(out8,GPIO.OUT)

def forward():
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)
def forward2(out5,out6,out7,out8):
GPIO.output(out5,GPIO.HIGH)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out5,GPIO.HIGH)
GPIO.output(out6,GPIO.HIGH)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.HIGH)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.HIGH)
GPIO.output(out7,GPIO.HIGH)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.HIGH)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)
GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.HIGH)
GPIO.output(out8,GPIO.HIGH)
time.sleep(0.003)
GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.HIGH)
time.sleep(0.003)
GPIO.output(out5,GPIO.HIGH)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.HIGH)
time.sleep(0.003)
def backward():
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)

GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)

GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)

GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)

GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)

GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)

GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)

GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)

def backward2(out5,out6,out7,out8):
GPIO.output(out5,GPIO.HIGH)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.HIGH)
time.sleep(0.003)

GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.HIGH)
time.sleep(0.003)

GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.HIGH)
GPIO.output(out8,GPIO.HIGH)
time.sleep(0.003)

GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.HIGH)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)

GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.HIGH)
GPIO.output(out7,GPIO.HIGH)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)

GPIO.output(out5,GPIO.LOW)
GPIO.output(out6,GPIO.HIGH)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)

GPIO.output(out5,GPIO.HIGH)
GPIO.output(out6,GPIO.HIGH)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)

GPIO.output(out5,GPIO.HIGH)
GPIO.output(out6,GPIO.LOW)
GPIO.output(out7,GPIO.LOW)
GPIO.output(out8,GPIO.LOW)
time.sleep(0.003)

def pose(x,out1,out2,out3,out4):
if x>0 and x<=400:
for y in range(x,0,-1):
if negative==1:
if i==7:
i=0
else:
i=i+1
y=y+2
negative=0
positive=1
#print((x+1)-y)
if i==0:
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==1:
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==2: 
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==3: 
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==4: 
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==5:
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)
#time.sleep(1)
elif i==6: 
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)
#time.sleep(1)
elif i==7: 
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)
#time.sleep(1)
if i==7:
i=0
continue
i=i+1


elif x<0 and x>=-400:
x=x*-1
for y in range(x,0,-1):
if positive==1:
if i==0:
i=7
else:
i=i-1
y=y+3
positive=0
negative=1
#print((x+1)-y) 
if i==0:
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==1:
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==2: 
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==3: 
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.HIGH)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==4: 
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.LOW)
time.sleep(0.003)
#time.sleep(1)
elif i==5:
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.HIGH)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)
#time.sleep(1)
elif i==6: 
GPIO.output(out1,GPIO.LOW)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)
#time.sleep(1)
elif i==7: 
GPIO.output(out1,GPIO.HIGH)
GPIO.output(out2,GPIO.LOW)
GPIO.output(out3,GPIO.LOW)
GPIO.output(out4,GPIO.HIGH)
time.sleep(0.003)
#time.sleep(1)
if i==0:
i=7
continue
i=i-1
 

class response(Thread):
def run(self):
while True:
if (x == "/motor1up"):
forward()
if (x == "/motor1down"):
backward()
if (x == "/motor2up"):
forward2(32,31,29,36)
if (x == "motor2down"):
backward2(32,31,29,36)

class Handler(http.server.BaseHTTPRequestHandler):
def do_GET(self):
global x
self.send_response(200)
self.end_headers()
x = self.path
print(x)
print(self.path)
return
 
if __name__ == '__main__':
smth = response()
smth.start()
server = socketserver.TCPServer(("", 8082), Handler)
print ('Starting server, use <Ctrl-C> to stop')
server.serve_forever()
