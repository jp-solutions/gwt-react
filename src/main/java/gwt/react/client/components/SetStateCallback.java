package gwt.react.client.components;

import elemental2.core.JsObject;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface SetStateCallback<S extends JsObject, P extends BaseProps> {
    S onSetState(S previousState, P currentProps);
}
