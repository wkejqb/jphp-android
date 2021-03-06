package org.venity.jphp.ext.android.fx.classes;

import javafx.scene.control.PasswordField;
import org.venity.jphp.ext.android.AndroidExtension;
import org.venity.jphp.ext.android.fx.JavaFXExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name("UXPasswordField")
@Reflection.Namespace(AndroidExtension.NS_FX)
public class UXPasswordField extends UXTextField {
    public UXPasswordField(Environment env, PasswordField wrappedObject) {
        super(env, wrappedObject);
    }

    public UXPasswordField(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public PasswordField getWrappedObject() {
        return (PasswordField) super.getWrappedObject();
    }

    @Override
    @Signature
    public void __construct() {
        __wrappedObject = new PasswordField();
    }

    @Override
    public void __construct(String text) {
        __wrappedObject = new PasswordField();
        getWrappedObject().setText(text);
    }
}
