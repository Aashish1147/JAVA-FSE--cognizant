package DecoratorPatternExample;

class SMSNotifierDecorator extends NotifierDecorator {

    SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send() {
        notifier.send();
        System.out.println("SMS Notification Sent");
    }

}