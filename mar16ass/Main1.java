interface Notification
{
    void send();
}

class Email implements Notification
{
    public void send()
    {
        System.out.println("Email Notification Sent");
    }
}

class SMS implements Notification
{
    public void send()
    {
        System.out.println("SMS Notification Sent");
    }
}

class WhatsApp implements Notification
{
    public void send()
    {
        System.out.println("WhatsApp Notification Sent");
    }
}

class Service
{
    static void alert(Notification n)
    {
        n.send();
    }
}

class Main
{
    public static void main(String[] args)
    {
        Email e = new Email();
        SMS s = new SMS();
        WhatsApp w = new WhatsApp();

        Service.alert(e);
        Service.alert(s);
        Service.alert(w);
    }
}