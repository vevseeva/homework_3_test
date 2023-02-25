import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test_homework {




  @org.junit.jupiter.api.Test
    void fillFormTest() {


    open("https://demoqa.com/automation-practice-form");

    // ввести имя
    $("[id=firstName]").setValue("Name");

    // ввести фамилию
    $("[id=lastName]").setValue("Last Name");

    // ввести email
    $("[id=userEmail]").setValue("my@email.com");

    // выбрать гендер
    $("label[for='gender-radio-2']").click();

    // написать номер телефона
    $("[id=userNumber]").setValue("1234567890");

    // выбрать дату рождения
    $("#dateOfBirthInput").click();
    $(".react-datepicker__month-select").click();
    $("option[value='8']").click();
    $(".react-datepicker__year-select").click();
    $("option[value='1997']").click();
    $("div[aria-label='Choose Thursday, September 25th, 1997']").click();

    // выбрать предметы
    $("#subjectsInput").setValue("Maths").pressEnter();

    // выбрать хобби
    $("label[for='hobbies-checkbox-3']").click();

    // загрузить фотку


    // написать адрес
    $("#currentAddress").setValue("My address");

    // выбрать штат
    $("[id=state]").click();
    $("[id=stateCity-wrapper]").$(byText("Haryana")).click();

    // выбрать город
    $("[id=city]").click();
    $("[id=stateCity-wrapper]").$(byText("Karnal")).click();

    // нажать submit
    $("[id = submit]").click();

    // убедиться что все загружено, нажать close
    $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
    $("tbody tr:nth-child(1) td:nth-child(2)").shouldHave(text("Name Last Name"));
    $("tbody tr:nth-child(2) td:nth-child(2)").shouldHave(text("my@email.com"));
    $("tbody tr:nth-child(3) td:nth-child(2)").shouldHave(text("Female"));
    $("tbody tr:nth-child(4) td:nth-child(2)").shouldHave(text("1234567890"));
    $("tbody tr:nth-child(5) td:nth-child(2)").shouldHave(text("25 September,1997"));
    $("tbody tr:nth-child(6) td:nth-child(2)").shouldHave(text("Maths"));
    $("tbody tr:nth-child(7) td:nth-child(2)").shouldHave(text("Music"));

    $("tbody tr:nth-child(9) td:nth-child(2)").shouldHave(text("My address"));
    $("tbody tr:nth-child(10) td:nth-child(2)").shouldHave(text("Haryana Karnal"));
    $("#closeLargeModal").click();


  }
}
