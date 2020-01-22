import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class arListDziecko {
    WebDriver driver;

    @BeforeEach
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void driverQuit() {

        driver.quit();
    }

    @Test
    public void getElement() {
        driver.get("http://www.edziecko.pl/edziecko/0,0.html?moduleViewName_ban.init=/tpl/ads/prod/dfpHeader-2.0.jsp&dfp_target_kw=adtest-screening-adform-v2");
        WebElement first = driver.findElement(By.xpath("//div[@id=\"001-TOPBOARD\"]//span"));
        System.out.println(first.getLocation());
        System.out.println(first);jyjjjgjggujuj

    }
    /*public static void main(final String[] args) {
        List<String> kidList = Arrays.asList("http://www.edziecko.pl/edziecko/0,0.html?moduleViewName_ban.init=/tpl/ads/prod/dfpHeader-2.0.jsp&dfp_target_kw=adtest-screening-adform-v2",
                "http://www.edziecko.pl/przed_ciaza/0,0.html",
                "http://www.edziecko.pl/przed_ciaza/0,0.html?str=2_19553440",
                "http://www.edziecko.pl/przed_ciaza/0,79775.html",
                "http://www.edziecko.pl/przed_ciaza/0,79569.html",
                "http://www.edziecko.pl/przed_ciaza/0,101900.html",
                "http://www.edziecko.pl/przed_ciaza/0,87842.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,0.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,79331.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,79337.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,79533.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,145923.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,103306.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,103305.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,79473.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,79332.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,79333.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,155928,,,,imiona-dziewczynek,a.html",
                "http://www.edziecko.pl/ciaza_i_porod/0,155928,,,,imiona-chlopcow,a.html",
                "http://www.edziecko.pl/pierwszy_rok/0,0.html",
                "http://www.edziecko.pl/pierwszy_rok/0,79398,9861715.html",
                "http://www.edziecko.pl/pierwszy_rok/0,79399.html",
                "http://www.edziecko.pl/pierwszy_rok/0,79400.html",
                "http://www.edziecko.pl/pierwszy_rok/0,79402.html",
                "http://www.edziecko.pl/pierwszy_rok/0,79410.html",
                "http://www.edziecko.pl/pierwszy_rok/0,79404.html",
                "http://www.edziecko.pl/pierwszy_rok/0,79409.html",
                "http://www.edziecko.pl/male_dziecko/0,0.html",
                "http://www.edziecko.pl/male_dziecko/0,85614.html",
                "http://www.edziecko.pl/male_dziecko/0,79338.html",
                "http://www.edziecko.pl/male_dziecko/0,79340.html",
                "http://www.edziecko.pl/male_dziecko/0,79341.html",
                "http://www.edziecko.pl/male_dziecko/0,79339.html",
                "http://www.edziecko.pl/male_dziecko/0,79342.html",
                "http://www.edziecko.pl/male_dziecko/0,123925.html",
                "http://www.edziecko.pl/przedszkolak/0,0.html",
                "http://www.edziecko.pl/przedszkolak/0,88655.html",
                "http://www.edziecko.pl/przedszkolak/0,79345.html",
                "http://www.edziecko.pl/przedszkolak/0,79346.html",
                "http://www.edziecko.pl/przedszkolak/0,79344.html",
                "http://www.edziecko.pl/przedszkolak/0,79348.html",
                "http://www.edziecko.pl/przedszkolak/0,123916.html",
                "http://www.edziecko.pl/starsze_dziecko/0,0.html",
                "http://www.edziecko.pl/starsze_dziecko/0,79350.html",
                "http://www.edziecko.pl/starsze_dziecko/0,79351.html",
                "http://www.edziecko.pl/starsze_dziecko/0,79349.html",
                "http://www.edziecko.pl/starsze_dziecko/0,79352.html",
                "http://www.edziecko.pl/starsze_dziecko/0,123917.html",
                "http://www.edziecko.pl/zdrowie_dziecka/0,0.html",
                "http://www.edziecko.pl/rodzice/0,0.html",
                "http://www.edziecko.pl/Junior/0,159970.html",
                "http://www.edziecko.pl/wideo_edziecko/0,0.html",
                "http://www.edziecko.pl/edziecko/0,159711.html",
                "http://www.edziecko.pl/rodzice/0,79353.html",
                "http://www.edziecko.pl/rodzice/0,79354.html",
                "http://www.edziecko.pl/rodzice/0,133102.html",
                "http://www.edziecko.pl/rodzice/0,79361.html",
                "http://www.edziecko.pl/rodzice/0,133556.html",
                "http://www.edziecko.pl/rodzice/0,123954.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79332,24263963,czop-sluzowy-jak-wyglada-i-kiedy-odchodzi.html",
                "http://www.edziecko.pl/Junior/7,159970,24882989,matka-przecietniaka-moj-syn-nie-przyniesie-czerwonego-paska.html",
                "http://www.edziecko.pl/rodzice/7,79361,24460533,najpopularniejsze-imiona-dla-dzieci-2018-2019-w-polsce-jesli.html",
                "http://www.edziecko.pl/rodzice/7,79361,24617150,to-koniec-walk-o-promocje-w-lidlu-dyskont-uruchamia-sklep-internetowy.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,19388475,co-to-jest-badanie-ktg-plodu-na-czym-polega.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79332,20425323,objawy-porodu-pierwsze-oznaki-zblizajacego-sie-porodu.html",
                "http://www.edziecko.pl/rodzice/7,79361,24882832,podczas-lotu-4-letni-chlopiec-zwrocil-uwage-pasazerowi-za.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79332,20405738,jak-przyspieszyc-porod.html",
                "http://www.edziecko.pl/zdrowie_dziecka/7,79364,22426507,niskie-cisnienie-krwi-czy-jest-grozne-i-jak-sobie-z-nim-radzic.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79309,24767771,meghan-markle-krytykowana-za-duzy-brzuch-skad-to-durne-przekonanie.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,20595634,plamienie-implantacyjne-kiedy-ile-trwa-objawy.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,19231841,ciaza-wielkosc-plodu-tydzien-po-tygodniu.html",
                "http://www.edziecko.pl/Junior/7,160031,23781293,lalka-momo-zacheca-do-samobojstwa-i-wysyla-zdjecia.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,24216827,bol-zeber-w-ciazy-przyczyny-i-podpowiedzi-jak-sobie-z-nimi.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,103132,20557778,toksoplazmoza-w-ciazy-wyniki-badan-leczenie.html",
                "http://www.edziecko.pl/rodzice/7,79361,24473919,cukier-w-moczu-o-czym-swiadczy-obecnosc-glukozy-w-moczu.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,23531639,lozysko-budowa-funkcje-kiedy-powstaje.html",
                "http://www.edziecko.pl/starsze_dziecko/7,79351,23808182,egzamin-osmoklasisty-termin-zasady-egzaminu-na-koniec-podstawowki.html",
                "http://www.edziecko.pl/rodzice/7,79361,23318832,koperta-czyli-ile-dac-na-komunie.html",
                "http://www.edziecko.pl/rodzice/7,79361,19867918,10-najlepszych-prezentow-na-komunie-dla-dziewczynki.html",
                "http://www.edziecko.pl/zdrowie_dziecka/7,79364,20814205,rumien-zakazny-u-dzieci-objawy-i-leczenie.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,103132,20536616,paracetamol-w-ciazy-czy-mozna-go-brac-jak-dawkowac-ten-lek.html",
                "http://www.edziecko.pl/rodzice/7,79353,20346880,jak-opoznic-okres-o-kilka-dni.html",
                "http://www.edziecko.pl/rodzice/7,79361,19867988,10-najlepszych-prezentow-na-komunie-dla-chlopca.html",
                "http://www.edziecko.pl/edziecko/7,88999,21593573,rzezucha-na-wielkanoc-kiedy-i-jak-wysiac-rzezuche-na-swieta.html",
                "http://www.edziecko.pl/rodzice/7,79361,24348825,karta-duzej-rodziny-ulgi-zmiany-2019.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,20515432,zagniezdzenie-implantacja-zarodka-ile-trwa-i-jakie-sa-objawy.html",
                "http://www.edziecko.pl/rodzice/7,79361,24343836,urlop-macierzynski-2019-ile-trwa-wniosek-wynagrodzenie-komu.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,24225485,samoistne-poronienia-objawy-dlaczego-sie-zdarzaja.html",
                "http://www.edziecko.pl/rodzice/7,79361,23342967,prezenty-na-chrzest-dla-dziewczynki-i-dla-chlopca-od-chrzestnych.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,103306,20430432,usg-genetyczne-kiedy-robic-badanie-i-na-czym-polega.html",
                "http://www.edziecko.pl/przed_ciaza/7,79330,20680260,kiedy-zrobic-test-ciazowy.html",
                "http://www.edziecko.pl/rodzice/7,79353,20656378,spozniajacy-sie-okres-ile-moze-sie-spoznic-i-dlaczego.html",
                "http://www.edziecko.pl/rodzice/7,79353,24375556,progesteron-funkcje-normy-leczenie-dlaczego-progesteron.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,20483080,duphaston-co-to-za-lek-i-jaki-ma-wplyw-na-ciaze.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,20458728,okres-w-ciazy.html",
                "http://www.edziecko.pl/zdrowie_dziecka/7,79364,24200052,czerwone-policzki-u-dziecka-przyczyny-jak-zapobiegac.html",
                "http://www.edziecko.pl/rodzice/7,79361,24807848,promocja-rossmann-2-2-maj-2019-akcja-obejmuje-produkty-do-pielegnacji.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,103305,20455044,kawa-w-ciazy-czy-szkodzi.html",
                "http://www.edziecko.pl/zdrowie_dziecka/7,79364,24387121,zapalenie-pecherza-u-dzieci-przyczyny-objawy-leczenie.html",
                "http://www.edziecko.pl/przedszkolak/7,79344,20335341,kapiele-w-fontannie-moga-powodowac-grozne-choroby.html",
                "http://www.edziecko.pl/przed_ciaza/7,79330,19944218,kalkulator-plodnosci-powie-ci-ile-bedziesz-miec-dzieci.html",
                "http://www.edziecko.pl/rodzice/7,79361,20854961,zolw-domowy-rasy-i-ceny.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79309,21425905,zaszla-w-kolejna-ciaze-6-tygodni-po-porodzie-myslalam-ze-w.html",
                "http://www.edziecko.pl/rodzice/7,79353,20492751,plamienie-z-pochwy-kiedy-udac-sie-do-lekarza.html",
                "http://www.edziecko.pl/przed_ciaza/7,101900,24573701,nieplodnosc-meska-rzeczywiscie-mamy-epidemie-skad-sie-bierze.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,24750520,ciaza-mnoga-co-warto-o-niej-wiedziec.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,103306,24000707,krzywa-cukrowa-w-ciazy-co-to-za-badanie-kiedy-jest-wykonywane.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,103305,24223013,krewetki-w-ciazy-i-w-czasie-karmienia-piersia-jesc-czy-nie.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79332,24706096,test-oksytocynowy-kiedy-i-po-co-sie-go-wykonuje.html",
                "http://www.edziecko.pl/ciaza_i_porod/7,79333,24450386,wypadanie-macicy-czyli-obnizenie-narzadow-rodnych-objawy.html",
                "http://www.edziecko.pl/pierwszy_rok/7,79410,24222983,kleik-ryzowy-najlepszy-dla-niemowlat-i-nie-tylko-jak-go-przygotowac.html",
                "http://www.edziecko.pl/pierwszy_rok/7,79404,23611411,rozwoj-dziecka-skoki-rozwojowe-czego-nie-robic-jak-wspierac.html",
                "http://www.edziecko.pl/pierwszy_rok/7,79409,22677201,jak-masowac-brzuch-niemowlaka.html",
                "http://www.edziecko.pl/male_dziecko/7,79338,24537411,nauka-literek-pomysly-na-edukacyjne-gry-i-zabawy-dla-dzieci.html",
                "http://www.edziecko.pl/male_dziecko/7,79340,21685949,moje-dziecko-nie-ma-obowiazku-dzielic-sie-z-twoim-mama-bez.html",
                "http://www.edziecko.pl/male_dziecko/7,79339,24204604,dziecko-spadlo-z-lozka-jak-postapic-w-takiej-sytuacji.html",
                "http://www.edziecko.pl/male_dziecko/7,123925,23368139,wyprawka-do-zlobka-co-kupic-jaka-posciel-do-zlobka.html",
                "http://www.edziecko.pl/przedszkolak/7,79345,23341518,bunt-czterolatka-psycholog-o-trudnych-emocjach.html",
                "http://www.edziecko.pl/rodzice/7,79361,24791349,na-sor-z-dzieckiem-ktore-ma-kleszcza-cialo-obce-w-postaci.html",
                "http://www.edziecko.pl/przed_ciaza/7,101900,24573701,nieplodnosc-meska-rzeczywiscie-mamy-epidemie-skad-sie-bierze.amp",
                "http://www.edziecko.pl/ciaza_i_porod/7,79331,24750520,ciaza-mnoga-co-warto-o-niej-wiedziec.amp",
                "http://www.edziecko.pl/ciaza_i_porod/7,103306,24000707,krzywa-cukrowa-w-ciazy-co-to-za-badanie-kiedy-jest-wykonywane.amp",
                "http://www.edziecko.pl/ciaza_i_porod/7,103305,24223013,krewetki-w-ciazy-i-w-czasie-karmienia-piersia-jesc-czy-nie.amp",
                "http://www.edziecko.pl/ciaza_i_porod/7,79332,24706096,test-oksytocynowy-kiedy-i-po-co-sie-go-wykonuje.amp",
                "http://www.edziecko.pl/ciaza_i_porod/7,79333,24450386,wypadanie-macicy-czyli-obnizenie-narzadow-rodnych-objawy.amp",
                "http://www.edziecko.pl/pierwszy_rok/7,79410,24222983,kleik-ryzowy-najlepszy-dla-niemowlat-i-nie-tylko-jak-go-przygotowac.amp",
                "http://www.edziecko.pl/pierwszy_rok/7,79404,23611411,rozwoj-dziecka-skoki-rozwojowe-czego-nie-robic-jak-wspierac.amp",
                "http://www.edziecko.pl/pierwszy_rok/7,79409,22677201,jak-masowac-brzuch-niemowlaka.amp",
                "http://www.edziecko.pl/male_dziecko/7,79338,24537411,nauka-literek-pomysly-na-edukacyjne-gry-i-zabawy-dla-dzieci.amp",
                "http://www.edziecko.pl/male_dziecko/7,79340,21685949,moje-dziecko-nie-ma-obowiazku-dzielic-sie-z-twoim-mama-bez.amp",
                "http://www.edziecko.pl/male_dziecko/7,79339,24204604,dziecko-spadlo-z-lozka-jak-postapic-w-takiej-sytuacji.html",
                "http://www.edziecko.pl/male_dziecko/7,123925,23368139,wyprawka-do-zlobka-co-kupic-jaka-posciel-do-zlobka.amp",
                "http://www.edziecko.pl/przedszkolak/7,79345,23341518,bunt-czterolatka-psycholog-o-trudnych-emocjach.amp",
                "http://www.edziecko.pl/rodzice/7,79361,24791349,na-sor-z-dzieckiem-ktore-ma-kleszcza-cialo-obce-w-postaci.amp",
                "http://www.edziecko.pl/male_dziecko/56,79341,23175142,musisz-go-zostawic-zeby-troche-poplakal-11-metod-usypiania.html",
                "http://www.edziecko.pl/przedszkolak/56,88655,20630262,Jak_przetrwac_pierwsze_dni_w_przedszkolu_Poradnik.html",
                "http://www.edziecko.pl/pierwszy_rok/1,79402,15609300,Ojciec_karmiacy.html",
                "http://www.edziecko.pl/przed_ciaza/1,87842,17641828,10_lat_zmagala_sie_z_nieplodnoscia___Codziennie_doszukujesz.html",
                "http://www.edziecko.pl/przed_ciaza/1,79569,11918046,Planowanie_ciazy___krok_po_kroku.html"
                );
        kidList.add("http://www.edziecko.pl/przed_ciaza/1,79569,11918046,Planowanie_ciazy___krok_po_kroku.html");
        System.out.println(kidList);
        System
    }*/
}
