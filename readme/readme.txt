1) STOMP
------------
Streaming Text Oriented Messaging Protocol

The protocol is broadly similar to HTTP, and works over TCP using the following commands:

CONNECT
SEND
SUBSCRIBE
UNSUBSCRIBE
BEGIN
COMMIT
ABORT
ACK
NACK
DISCONNECT

Communication between client and server is through a "frame" consisting of a number of lines. The first line contains the command,
followed by headers in the form <key>: <value> (one per line), followed by a blank line and then the body content,
ending in a null character.

Communication between server and client is through a MESSAGE, RECEIPT or ERROR frame with a
similar format of headers and body content.

2) Example not working
--------------------------
This example is not working because the STOMP server on tutorialspoint is down.

3) URI
------------
http://localhost:7000/index.html
