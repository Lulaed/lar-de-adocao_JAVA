package com.mycompany.adocao;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Connection {
    private final MongoClient client;
    private final MongoDatabase banco;
    
    public Connection(){
    client= new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
    System.out.println("Conexão criada com sucesso");
    
    banco = client.getDatabase("Adocao");
    System.out.println("Banco puxado com sucesso");
    }
    
    public MongoDatabase getBanco(){
    return banco;
    }
    public static void main(String[] args) {
        Connection c = new Connection();
    }
}

