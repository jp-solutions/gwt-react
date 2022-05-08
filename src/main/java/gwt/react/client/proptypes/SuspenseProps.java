package gwt.react.client.proptypes;

import gwt.react.client.elements.ReactElement;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="Object")
public class SuspenseProps extends BaseProps{

    public ReactElement fallback;

}
