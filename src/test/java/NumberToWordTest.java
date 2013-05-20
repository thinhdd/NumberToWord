import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 5/19/13
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumberToWordTest {
    @Test
    public void oneDigit0()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Zero",nbtw.convert(0));
    }
    @Test
    public void oneDigit1()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("One",nbtw.convert(1));
    }
    @Test
    public void oneDigit2()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Two",nbtw.convert(2));
    }
    @Test
    public void oneDigit3()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Three",nbtw.convert(3));
    }
    @Test
    public void oneDigit4()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Four",nbtw.convert(4));
    }
    @Test
    public void oneDigit5()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Five",nbtw.convert(5));
    }
    @Test
    public void oneDigit6()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Six",nbtw.convert(6));
    }
    @Test
    public void oneDigit7()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Seven",nbtw.convert(7));
    }
    @Test
    public void oneDigit8()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Eight",nbtw.convert(8));
    }
    @Test
    public void oneDigit9()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Nine",nbtw.convert(9));
    }
    @Test
    public void twoDigit10()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Ten",nbtw.convert(10));
    }
    @Test
    public void twoDigit11()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Eleven",nbtw.convert(11));
    }
    @Test
    public void twoDigit12()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Twelve",nbtw.convert(12));
    }
    @Test
    public void twoDigit13()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Thirteen",nbtw.convert(13));
    }
    @Test
    public void twoDigit14()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Fourteen",nbtw.convert(14));
    }
    @Test
    public void twoDigit15()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Fifteen",nbtw.convert(15));
    }
    @Test
    public void twoDigit16()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Sixteen",nbtw.convert(16));
    }
    @Test
     public void twoDigit20()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Twenty",nbtw.convert(20));
    }
    @Test
    public void twoDigit21()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Twenty One",nbtw.convert(21));
    }
    @Test
    public void twoDigit22()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Twenty Two",nbtw.convert(22));
    }
    @Test
    public void twoDigit23()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("One Thousands Three Hundreds Twenty Three",nbtw.convert(1323));
    }
    @Test
    public void twoDigit24()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("One Thousands Twenty",nbtw.convert(1020));
    }
    @Test
    public void twoDigit25()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("Ten Thousands Two Hundreds One",nbtw.convert(10201));
    }
    @Test
    public void twoDigit26()
    {
        NumberToWord nbtw = new NumberToWord();
        Assert.assertEquals("One Hundreds Thirty Two Thousands Eleven",nbtw.convert(132011));
    }
}
