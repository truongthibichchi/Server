package connection;

public class NetworkMessage {
    private MessageType type;
    private Object content;

    public NetworkMessage(MessageType type, Object content){
        this.type=type;
        this.content=content;
    }
    public MessageType getType(){return type;}
    public Object getContent(){return content;}

    public void setContent (Object content){
        this.content=content;
    }

    public void setType (MessageType type){
        this.type=type;
    }
}
