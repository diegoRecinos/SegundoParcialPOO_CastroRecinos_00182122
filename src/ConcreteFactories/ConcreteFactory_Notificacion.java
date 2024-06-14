package src.ConcreteFactories;

import src.AbstractFactory.AbstractFactory_system;
import src.Interface_ConcreteProducts.Interface_ProductTypeA_Notificacion;
import src.Interface_ConcreteProducts.Interface_ProductTypeB_Alertas;
import src.Interface_ConcreteProducts.Interface_ProductTypeC_saveFile;


public class ConcreteFactory_Notificacion extends AbstractFactory_system{

    @Override
    public Interface_ProductTypeA_Notificacion createNotification() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createNotification'");
    }

    @Override
    public Interface_ProductTypeB_Alertas createAlerta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAlerta'");
    }

    @Override
    public Interface_ProductTypeC_saveFile createSaveFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createSaveFile'");
    }


    
}
