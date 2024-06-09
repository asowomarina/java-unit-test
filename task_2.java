@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}

@Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertEquals("Expected false for age 17, but got true", false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("Expected true for age 18, but got false", true, isAdult);
    }
