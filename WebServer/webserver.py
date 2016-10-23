<<<<<<< HEAD
import socket
import re

# Standard socket stuff:
host = '' # do we need socket.gethostname() ?
port = 6969
sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
sock.bind((host, port))
sock.listen(1) # don't queue up any requests

print ("Listenening on %s %s"%( str(socket.AF_INET) , str(port)))
# Loop forever, listening for requests:
while True:
    csock, caddr = sock.accept()
    print ("Connection from: " + str(caddr))
    req = csock.recv(1024) # get the request, 1kB max
    print (req)
    # Look in the first line of the request for a move command
    # A move command should be e.g. 'http://server/move?a=90'
    #match = re.match('GET /t', req)
    #if match:
        #print (match)
    mes = ("""HTTP/1.0 200 OK
Content-Type: text/plain

lol e ok
""")
    csock.sendall(mes.encode())
    csock.close()
=======

>>>>>>> origin/master
