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
            { 17, false }, // ������ 18 ���
            { 18, true },  // ����� 18 ���
            { 19, true },  // ������ 18 ���
            { 20, true }  // ������ 18 ���
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Expected " + result + " for age " + age + ", but got " + isAdult, result, isAdult);
    }
}
