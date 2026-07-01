package DecoratorPatternExample;

class SlackNotifierDecorator extends NotifierDecorator {

    SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send() {
        notifier.send();
        System.out.println("Slack Notification Sent");
    }

}