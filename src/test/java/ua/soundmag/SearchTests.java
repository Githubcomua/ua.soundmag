package ua.soundmag;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchTests {

    @Test
    void searchProductByTitle(){
        Selenide.open("https://brain.com.ua/ukr/");

        var productName = "SENNHEISER CX 400BT TRUE WIRELESS BLACK";

        $(".header-bottom-in").$(".quick-search-input").setValue(productName).click();
        $(".qsr-form").$(".qsr-submit").click();
        $(".br-static").$(".add.br-bbb-f").click();
        $(By.xpath("//*[@id=\"checkout-modal-popup\"]/div/div[1]/div/div[1]/p/span/button")).click();
        $(By.xpath("//*[@id=\"cart_list\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/center/div/button[1]")).click();

       Selenide.sleep(4000);

    }

}
