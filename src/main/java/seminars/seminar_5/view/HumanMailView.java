package seminars.seminar_5.view;

public class HumanMailView implements View{
    @Override
    public void ReturnMail() {
        System.out.println("Возвращено");
    }

    @Override
    public void SendMail() {
        System.out.println("Отправлено");

    }

    @Override
    public void GetMail(String qwe) {
        System.out.println("Получено");

    }

    @Override
    public void TalkWithPostman() {
        System.out.println("Поговорил с почтальоном");

    }
}
