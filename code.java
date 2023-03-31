interface Handler {
    void setNext(Handler handler);

    void handleRequest(Request request);
}

class Request {
    private String type;
    private String content;

    public Request(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}

class EmailHandler implements Handler {
    private Handler nextHandler;

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(Request request) {
        if (request.getType().equals("email")) {
            System.out.println("Handling email request: " + request.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Unable to handle request.");
        }
    }
}

class TextHandler implements Handler {
    private Handler nextHandler;

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(Request request) {
        if (request.getType().equals("text")) {
            System.out.println("Handling text request: " + request.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Unable to handle request.");
        }
    }
}

public class Client {
    public static void main(String[] args) {
        Handler emailHandler = new EmailHandler();
        Handler textHandler = new TextHandler();

        emailHandler.setNext(textHandler);

        emailHandler.handleRequest(new Request("email", "Hello, this is an email"));
        emailHandler.handleRequest(new Request("text", "Hello, this is a text"));
    }
}
