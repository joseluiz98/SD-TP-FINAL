#!/usr/bin/env python
import pika
import sys
import subprocess

connection = pika.BlockingConnection(pika.ConnectionParameters(host='localhost'))
channel = connection.channel()

channel.exchange_declare(exchange='topic_logs',
                         exchange_type='topic')

# Pega info do SO
output = subprocess.Popen(["uname", "-a"], stdout=subprocess.PIPE)
output, err = output.communicate()

with open("logs/nip.log", "w+") as arquivo:
    print >> arquivo, "{}\n".format(output)  # Python 2.x

with open("logs/nip.log") as arquivo:
    info = str(arquivo.readlines())
            
print(" [x] Enviando log... ")

routing_key = 'so';
channel.basic_publish(exchange='topic_logs',
                      routing_key=routing_key,
                      body=info)
print(" [x] Sent to %r subscribers" % (routing_key))
connection.close()