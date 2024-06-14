package src.AbstractFactory;


import src.Interface_ConcreteProducts.Interface_ProductTypeA_Notificacion;
import src.Interface_ConcreteProducts.Interface_ProductTypeB_Alertas;
import src.Interface_ConcreteProducts.Interface_ProductTypeC_saveFile;

public abstract class AbstractFactory_system {
    
    public abstract Interface_ProductTypeA_Notificacion createNotification();
    public abstract Interface_ProductTypeB_Alertas createAlerta();
    public abstract Interface_ProductTypeC_saveFile createSaveFile();

}
