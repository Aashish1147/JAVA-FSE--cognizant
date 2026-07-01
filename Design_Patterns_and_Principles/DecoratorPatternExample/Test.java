package DecoratorPatternExample;

public class Test {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        System.out.println("Email Only:");
        notifier.send();

        System.out.println();

        System.out.println("Email + SMS:");
        notifier = new SMSNotifierDecorator(new EmailNotifier());
        notifier.send();

        System.out.println();

        System.out.println("Email + SMS + Slack:");
        notifier = new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));
        notifier.send();

    }

}