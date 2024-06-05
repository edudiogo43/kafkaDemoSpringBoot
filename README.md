# Kakfa Demo application with SpringBoot
This is a sample demo application of Consumer and Producer on Kafka using SpringBoot Framework

## How to Start
- First of all go to https://kafka.apache.org/quickstart and downwload the appropriated image to your PC
- Then, after you have unziped the downloaded file, you have to start the ZooKeeper service as below:
```bash
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```
- After start the zookeeper as showed above, lets change the kakfa default port, go to {YOUR_FOLDER}/config/server.properties, and update the following line:
```bash
listeners=PLAINTEXT://localhost:9092
```
- Finally, lets start Kakfa:
```bash
$ bin/kafka-server-start.sh config/server.properties
```

## How to use
Clone the repo and you will have to start the Producer project and the Consumer project. Use your favorite HTTP client and make a POST request to http://localhost:9090/pagamentos using the following JSON body:

```JSON
{
    "descricao": "qualquer descricao",
    "valor": 100
}
```

Its expected you will see the output on consumer application saying the body json was consumed successfuly!

Thanks ! <br/>
Eduardo D. Garcia