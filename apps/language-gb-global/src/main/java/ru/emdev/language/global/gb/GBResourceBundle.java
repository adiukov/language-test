package ru.emdev.language.global.gb;

import com.liferay.portal.kernel.language.UTF8Control;
import org.osgi.service.component.annotations.Component;

import java.util.Enumeration;
import java.util.ResourceBundle;

@Component(
        property = {"language.id=en_GB"},
        service = java.util.ResourceBundle.class)
public class GBResourceBundle extends ResourceBundle {

    private final ResourceBundle resourceBundle = ResourceBundle.getBundle(
            "content.Language", UTF8Control.INSTANCE);

    @Override
    protected Object handleGetObject(String key) { return resourceBundle.getObject(key);
    }

    @Override
    public Enumeration<String> getKeys() {
        return resourceBundle.getKeys();
    }
}
