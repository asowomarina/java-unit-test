@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
            { 17, false }, // Меньше 18 лет
            { 18, true },  // Ровно 18 лет
            { 19, true },  // Больше 18 лет
            { 20, true }  // Больше 18 лет
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Expected " + result + " for age " + age + ", but got " + isAdult, result, isAdult);
    }
}
