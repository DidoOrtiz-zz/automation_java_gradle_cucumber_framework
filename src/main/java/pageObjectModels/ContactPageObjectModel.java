package pageObjectModels;

public class ContactPageObjectModel extends PageBase{

    public ContactPageObjectModel(){

        super();
    }

    public void openPage(String urlSite){

        driver.get(urlSite);
    }


}

