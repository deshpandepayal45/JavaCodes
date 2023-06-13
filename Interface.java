class Phone
{
    public void call()
    {

    }
    public void sms()
    {

    }
}

interface iCamera
{
    public void click();
    public void record();
}

interface iMusicPlayer
{
    public void play();
    public void pause();
    public void stop();
}

class smartPhone extends Phone implements iCamera,iMusicPlayer
{
    public void call()
    {
        System.out.println("Smart phone calling ");
    }
     public void sms()
    {
        System.out.println("Smart phone sending sms ");
    }
     public void click()
    {
        System.out.println("Smart phone clicking images ");
    }
     public void record()
    {
        System.out.println("Smart phone recording vdo ");
    }
     public void play()
    {
        System.out.println("Smart phone playing music ");
    }
     public void pause()
    {
        System.out.println("Smart phone pauses music ");
    }
     public void stop()
    {
        System.out.println("Smart phone stopped the music ");
    }
}

class Interface
{
    public static void main(String[] args)
    {
        smartPhone s=new smartPhone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
    }
}