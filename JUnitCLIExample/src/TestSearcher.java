import org.junit.Test;
import static org.junit.Assert.*;

// for main
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// for listener
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class TestSearcher
{
    public TestSearcher() {}


    @Test
    public void emptyArrayTest(){
        int [] hayStack = new int[]{};
        Searcher s = new Searcher(hayStack);
        int actual = s.search(5);
        assertEquals(-1, actual);

    }

    @Test
    public void singleElementArrayTargetFoundTest(){
        int[] hayStack = new int[]{5};
        Searcher s = new Searcher(hayStack);
        int actual = s.search(5);
        assertEquals(0, actual);
    }

    @Test
    public void singleElementArrayTargetNotFoundTest(){
        int[] hayStack = new int[]{5};
        Searcher s = new Searcher(hayStack);
        int actual = s.search(2);
        assertEquals(-1, actual);

    }

    @Test
    public void twoElementsArrayTargetFoundInFirstElementTest(){
        int[] hayStack = new int[]{5, 10};
        Searcher s = new Searcher(hayStack);
        int actual = s.search(5);
        assertEquals(0, actual);
    }


    @Test
    public void twoElementsArrayTargetFoundInSecondElementTest(){
        int[] hayStack = new int[]{5, 10};
        Searcher s = new Searcher(hayStack);
        int actual = s.search(10);
        assertEquals(1, actual);
    }

    @Test
    public void multiElementsArrayTargetInTheMiddleTest(){
        int[] hayStack = new int[] {5, 10, 2, 4, 8};
        Searcher s = new Searcher(hayStack);
        int actual = s.search(2);
        assertEquals(2, actual);
    }


    public static void main(String[] args)
    {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new TestListener());
        Result result = runner.run(TestSearcher.class);
    }
}


class TestListener extends RunListener
{
    public void testStarted(Description description) {

        //System.out.println("Starting "+ description.getMethodName());

    }

    public void testFinished(Description description)
    {
        //System.out.println("Finished "+ description.getMethodName());
    }

    public void testRunFinished(Result result)
    {
        int ran = result.getRunCount();
        int failed = result.getFailureCount();

        System.out.println("Ran " + ran + " passed " + (ran-failed)
                + (result.wasSuccessful() ? " all passed!" : " ... Failed:"));

        for (Failure failure : result.getFailures())
            System.out.println(failure.toString());
    }
}
