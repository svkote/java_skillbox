import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import java.awt.AWTException;

public class MyThread extends Thread
{
    public void run()
    {
        /*
        Robot имитирует движения мыши и клавиатуры. В нашем случае помогает сделать скриншот.
        Мы создали новый обьект Robot и занесли его в переменную robot.
        BufferedImage используется для обработки изображения.
        Мы создали переменную screenShot класса BufferedImage. в которой прописан метод обьекта robot createScreenCapture.
        Rectangle создает прямоугольную область на экране и с помощью Toolkit получает размеры.
        Таким образом в переменную screenshot буферизируется скриншот целого экрана.
        пакет ImageIO помогает записывать и сохранять изображения.
        С помощью метода write мы сохраняем из буфера наше изображение. В метод передается: само изображение, формат и его название(с путем).
        Последней строчкой мы выводим на экран с помощью методов getWidth и getHeight ширину и высоту соответственно.
        Дописан цикл, который в дальнейшем(как я думаю будет использован при написании.
        В данный момент он делает 20 скриншотов с соответствующим названием.
        Thread.sleep() - делает задержку в миллисекундах.
        now.format(new Date()) создает дату в формате указанным выше в переменной now.
         */

        try
        {
            for (int i = 1; i <= 20; i++)
            {
                Robot myCapt = new Robot();
                DateFormat nowTime = new SimpleDateFormat( "yyyyddMM_HHmmss");
                BufferedImage screenWorkSpace = myCapt.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                ImageIO.write(screenWorkSpace, "png", new File("./src/img/screen"+ nowTime.format(new Date()) +".png"));
                System.out.println(screenWorkSpace.getWidth() + " x " + screenWorkSpace.getHeight());
                Thread.sleep(5000);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (IOException e1)
        {
            e1.printStackTrace();
        }
        catch (AWTException e2)
        {
            e2.printStackTrace();
        }
    }
}