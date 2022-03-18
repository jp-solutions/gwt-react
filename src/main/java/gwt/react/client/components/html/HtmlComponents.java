package gwt.react.client.components.html;

import gwt.react.client.elements.ReactElement;
import gwt.react.client.proptypes.FragmentProps;
import gwt.react.client.proptypes.html.*;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

import static gwt.react.client.api.React.*;

/**
 * Set of plain html components (tags).
 */
@JsType(isNative = true)
public final class HtmlComponents {

    private HtmlComponents(){}

    @JsOverlay
    public static ReactElement fragment(FragmentProps props, ReactElement ...child) { return  createElement(Fragment, props, child); }
    @JsOverlay public static ReactElement fragment(ReactElement ...child) { return  createElement(Fragment, null, child); }

    @JsOverlay public static ReactElement strictMode(ReactElement ...child) { return  createElement(StrictMode, null, child); }

    @JsOverlay public static ReactElement a(AnchorProps props, String value) { return  createElement("a", props, value); }
    @JsOverlay public static ReactElement a(AnchorProps props, ReactElement ...child) { return  createElement("a", props, child); }

    @JsOverlay public static ReactElement article(HtmlProps props, ReactElement ...child) { return  createElement("article", props, child); }
    @JsOverlay public static ReactElement audio(AudioProps props, ReactElement ...child) { return  createElement("audio", props, child); }

    @JsOverlay public static ReactElement br(HtmlProps props) { return  createElement("br", props); }
    @JsOverlay public static ReactElement br() { return  createElement("br", null); }

    @JsOverlay public static ReactElement button(BtnProps props) { return  createElement("button", props); }
    @JsOverlay public static ReactElement button(BtnProps props, String value) { return  createElement("button", props, value); }
    @JsOverlay public static ReactElement button(BtnProps props, ReactElement ...child) { return  createElement("button", props, child); }
    @JsOverlay public static ReactElement button(String value) { return  createElement("button", null, value); }
    @JsOverlay public static ReactElement button(ReactElement ...child) { return  createElement("button", null, child); }

    @JsOverlay public static ReactElement canvas() { return  createElement("canvas"); }
    @JsOverlay public static ReactElement canvas(HtmlProps props) { return  createElement("canvas", props); }

    @JsOverlay public static ReactElement caption(String value) { return  createElement("caption", null, value); }
    @JsOverlay public static ReactElement caption(HtmlProps props, String value) { return  createElement("caption", props, value); }
    @JsOverlay public static ReactElement caption(HtmlProps props, ReactElement ...child) { return  createElement("caption", props, child); }
    @JsOverlay public static ReactElement caption(ReactElement ...child) { return  createElement("caption", null, child); }

    @JsOverlay public static ReactElement col(String value) { return  createElement("col", null, value); }
    @JsOverlay public static ReactElement col(ReactElement ...child) { return  createElement("col", null, child); }
    @JsOverlay public static ReactElement col(ColProps props, ReactElement ...child) { return  createElement("col", props, child); }
    @JsOverlay public static ReactElement col(HtmlProps props, ReactElement ...child) { return  createElement("col", props, child); }

    @JsOverlay public static ReactElement div(String value) { return  createElement("div", null, value); }
    @JsOverlay public static ReactElement div(ReactElement ...child) { return  createElement("div", null, child); }
    @JsOverlay public static ReactElement div(HtmlProps props, String value) { return  createElement("div", props, value); }
    @JsOverlay public static ReactElement div(HtmlProps props, ReactElement ...child) { return  createElement("div", props, child); }

    @JsOverlay public static ReactElement footer(String value) { return  createElement("footer", null, value); }
    @JsOverlay public static ReactElement footer(HtmlProps props, String value) { return  createElement("footer", props, value); }
    @JsOverlay public static ReactElement footer(ReactElement ...child) { return  createElement("footer", null, child); }
    @JsOverlay public static ReactElement footer(HtmlProps props, ReactElement ...child) { return  createElement("footer", props, child); }

    @JsOverlay public static ReactElement form(ReactElement ...child) { return  createElement("form", null, child); }
    @JsOverlay public static ReactElement form(FormProps props, ReactElement ...child) { return  createElement("form", props, child); }

    @JsOverlay public static ReactElement header(ReactElement ...child) { return  createElement("header", null, child); }
    @JsOverlay public static ReactElement header(HtmlProps props, ReactElement ...child) { return  createElement("header", props, child); }

    @JsOverlay public static ReactElement h1(String value) { return  createElement("h1", null, value); }
    @JsOverlay public static ReactElement h2(String value) { return  createElement("h2", null, value); }
    @JsOverlay public static ReactElement h3(String value) { return  createElement("h3", null, value); }
    @JsOverlay public static ReactElement h4(String value) { return  createElement("h4", null, value); }
    @JsOverlay public static ReactElement h5(String value) { return  createElement("h5", null, value); }
    @JsOverlay public static ReactElement h6(String value) { return  createElement("h6", null, value); }
    @JsOverlay public static ReactElement h1(HtmlProps props, String value) { return  createElement("h1", props, value); }
    @JsOverlay public static ReactElement h2(HtmlProps props, String value) { return  createElement("h2", props, value); }
    @JsOverlay public static ReactElement h3(HtmlProps props, String value) { return  createElement("h3", props, value); }
    @JsOverlay public static ReactElement h4(HtmlProps props, String value) { return  createElement("h4", props, value); }
    @JsOverlay public static ReactElement h5(HtmlProps props, String value) { return  createElement("h5", props, value); }
    @JsOverlay public static ReactElement h6(HtmlProps props, String value) { return  createElement("h6", props, value); }
    @JsOverlay public static ReactElement h1(ReactElement ...child) { return  createElement("h1", null, child); }
    @JsOverlay public static ReactElement h2(ReactElement ...child) { return  createElement("h2", null, child); }
    @JsOverlay public static ReactElement h3(ReactElement ...child) { return  createElement("h3", null, child); }
    @JsOverlay public static ReactElement h4(ReactElement ...child) { return  createElement("h4", null, child); }
    @JsOverlay public static ReactElement h5(ReactElement ...child) { return  createElement("h5", null, child); }
    @JsOverlay public static ReactElement h6(ReactElement ...child) { return  createElement("h6", null, child); }
    @JsOverlay public static ReactElement h1(HtmlProps props, ReactElement ...child) { return  createElement("h1", props, child); }
    @JsOverlay public static ReactElement h2(HtmlProps props, ReactElement ...child) { return  createElement("h2", props, child); }
    @JsOverlay public static ReactElement h3(HtmlProps props, ReactElement ...child) { return  createElement("h3", props, child); }
    @JsOverlay public static ReactElement h4(HtmlProps props, ReactElement ...child) { return  createElement("h4", props, child); }
    @JsOverlay public static ReactElement h5(HtmlProps props, ReactElement ...child) { return  createElement("h5", props, child); }
    @JsOverlay public static ReactElement h6(HtmlProps props, ReactElement ...child) { return  createElement("h6", props, child); }

    @JsOverlay public static ReactElement iframe(IFrameProps props) { return  createElement("iframe", props); }

    @JsOverlay public static ReactElement img(ImgProps props) { return  createElement("img", props); }

    @JsOverlay public static ReactElement input(InputProps props) { return  createElement("input", props); }

    @JsOverlay public static ReactElement label(LabelProps props, String value) { return  createElement("label", props, value); }

    @JsOverlay public static ReactElement li(String value) { return  createElement("li", null, value); }
    @JsOverlay public static ReactElement li(ReactElement ...child) { return  createElement("li", null, child); }
    @JsOverlay public static ReactElement li(HtmlProps props, String value) { return  createElement("li", props, value); }
    @JsOverlay public static ReactElement li(HtmlProps props, ReactElement ...child) { return  createElement("li", props, child); }

    @JsOverlay public static ReactElement ol(String value) { return  createElement("ol", null, value); }
    @JsOverlay public static ReactElement ol(ReactElement ...child) { return  createElement("ol", null, child); }
    @JsOverlay public static ReactElement ol(HtmlProps props, String value) { return  createElement("ol", props, value); }
    @JsOverlay public static ReactElement ol(HtmlProps props, ReactElement ...child) { return  createElement("ol", props, child); }

    @JsOverlay public static ReactElement option(String value) { return  createElement("option", null, value); }
    @JsOverlay public static ReactElement option(OptionProps props, String value) { return  createElement("option", props, value); }
    @JsOverlay public static ReactElement option(ReactElement ...child) { return  createElement("option", null, child); }
    @JsOverlay public static ReactElement option(OptionProps props, ReactElement ...child) { return  createElement("option", props, child); }

    @JsOverlay public static ReactElement optgroup(String value) { return  createElement("optgroup", null, value); }
    @JsOverlay public static ReactElement optgroup(ReactElement ...child) { return  createElement("optgroup", null, child); }
    @JsOverlay public static ReactElement optgroup(OptGroupProps props, String value) { return  createElement("optgroup", props, value); }
    @JsOverlay public static ReactElement optgroup(OptGroupProps props, ReactElement ...child) { return  createElement("optgroup", props, child); }

    @JsOverlay public static ReactElement p(String value) { return createElement("p", null, value); }
    @JsOverlay public static ReactElement p(ReactElement ...child) { return  createElement("p", null, child); }
    @JsOverlay public static ReactElement p(HtmlProps props, String value) { return createElement("p", props, value); }
    @JsOverlay public static ReactElement p(HtmlProps props, ReactElement ...child) { return  createElement("p", props, child); }

    @JsOverlay public static ReactElement span(String value) { return  createElement("span", null, value); }
    @JsOverlay public static ReactElement span(ReactElement child) { return  createElement("span", null, child); }
    @JsOverlay public static ReactElement span(HtmlProps props, String value) { return  createElement("span", props, value); }
    @JsOverlay public static ReactElement span(HtmlProps props, ReactElement...child) { return  createElement("span", props, child); }

    @JsOverlay public static ReactElement select(ReactElement ...child) { return  createElement("select", null, child); }
    @JsOverlay public static ReactElement select(SelectProps props, ReactElement ...child) { return  createElement("select", props, child); }

    @JsOverlay public static ReactElement section(ReactElement ...child) { return  createElement("section", null, child); }
    @JsOverlay public static ReactElement section(HtmlProps props, ReactElement ...child) { return  createElement("section", props, child); }

    @JsOverlay public static ReactElement strong(String value) { return  createElement("strong", null, value); }
    @JsOverlay public static ReactElement strong(HtmlProps props, String value) { return  createElement("strong", props, value); }
    @JsOverlay public static ReactElement strong(ReactElement ...child) { return  createElement("strong", null, child); }
    @JsOverlay public static ReactElement strong(HtmlProps props, ReactElement ...child) { return  createElement("strong", props, child); }

    @JsOverlay public static ReactElement source(SourceProps props) { return  createElement("source", props); }

    @JsOverlay public static ReactElement table(ReactElement ...child) { return  createElement("table", null, child); }
    @JsOverlay public static ReactElement table(TableProps props, ReactElement ...child) { return  createElement("table", props, child); }

    @JsOverlay public static ReactElement textarea() { return  createElement("textarea"); }
    @JsOverlay public static ReactElement textarea(TextAreaProps props) { return  createElement("textarea", props); }

    @JsOverlay public static ReactElement td(String value) { return  createElement("td", null, value); }
    @JsOverlay public static ReactElement td(ReactElement ...child) { return  createElement("td", null, child); }
    @JsOverlay public static ReactElement td(TdProps props, String value) { return  createElement("td", props, value); }
    @JsOverlay public static ReactElement td(TdProps props, ReactElement ...child) { return  createElement("td", props, child); }

    @JsOverlay public static ReactElement th(String value) { return  createElement("th", null, value); }
    @JsOverlay public static ReactElement th(ReactElement ...child) { return  createElement("th", null, child); }
    @JsOverlay public static ReactElement th(ThProps props, String value) { return  createElement("th", props, value); }
    @JsOverlay public static ReactElement th(ThProps props, ReactElement ...child) { return  createElement("th", props, child); }

    @JsOverlay public static ReactElement tr(ReactElement ...child) { return  createElement("tr", null, child); }
    @JsOverlay public static ReactElement tr(HtmlProps props, ReactElement ...child) { return  createElement("tr", props, child); }

    @JsOverlay public static ReactElement ul(ReactElement ...child) { return  createElement("ul", null, child); }
    @JsOverlay public static ReactElement ul(HtmlProps props, ReactElement ...child) { return  createElement("ul", props, child); }


    //SVG related elements
    @JsOverlay public static ReactElement svg(SvgProps props, ReactElement ...child) { return  createElement("svg", props, child); }
    @JsOverlay public static ReactElement polygon(PolygonProps props) { return  createElement("polygon", props); }
    @JsOverlay public static ReactElement circle(CircleProps props) { return  createElement("circle", props); }

}
