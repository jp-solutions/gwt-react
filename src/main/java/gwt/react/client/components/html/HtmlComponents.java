package gwt.react.client.components.html;

import gwt.react.client.elements.ReactElement;
import gwt.react.client.proptypes.FragmentProps;
import gwt.react.client.proptypes.SuspenseProps;
import gwt.react.client.proptypes.html.*;

import static gwt.react.client.api.React.*;

/**
 * Set of plain html components (tags).
 */
public final class HtmlComponents {

    private HtmlComponents(){}

    public static ReactElement fragment(FragmentProps props, ReactElement ...child) { return  createElement(Fragment, props, child); }
    public static ReactElement fragment(ReactElement ...child) { return  createElement(Fragment, null, child); }

    public static ReactElement strictMode(ReactElement ...child) { return  createElement(StrictMode, null, child); }

    public static ReactElement suspense(ReactElement ...child) { return  createElement(Suspense, null, child); }
    public static ReactElement suspense(SuspenseProps props, ReactElement ...child) { return  createElement(Suspense, props, child); }

    public static ReactElement a(AnchorProps props, String value) { return  createElement("a", props, value); }
    public static ReactElement a(AnchorProps props, ReactElement ...child) { return  createElement("a", props, child); }

    public static ReactElement article(HtmlProps props, ReactElement ...child) { return  createElement("article", props, child); }
    public static ReactElement audio(AudioProps props, ReactElement ...child) { return  createElement("audio", props, child); }

    public static ReactElement br(HtmlProps props) { return  createElement("br", props); }
    public static ReactElement br() { return  createElement("br", null); }

    public static ReactElement button(BtnProps props) { return  createElement("button", props); }
    public static ReactElement button(BtnProps props, String value) { return  createElement("button", props, value); }
    public static ReactElement button(BtnProps props, ReactElement ...child) { return  createElement("button", props, child); }
    public static ReactElement button(String value) { return  createElement("button", null, value); }
    public static ReactElement button(ReactElement ...child) { return  createElement("button", null, child); }

    public static ReactElement canvas() { return  createElement("canvas"); }
    public static ReactElement canvas(HtmlProps props) { return  createElement("canvas", props); }

    public static ReactElement caption(String value) { return  createElement("caption", null, value); }
    public static ReactElement caption(HtmlProps props, String value) { return  createElement("caption", props, value); }
    public static ReactElement caption(HtmlProps props, ReactElement ...child) { return  createElement("caption", props, child); }
    public static ReactElement caption(ReactElement ...child) { return  createElement("caption", null, child); }

    public static ReactElement code(String value) { return  createElement("code", null, value); }
    public static ReactElement code(HtmlProps props, String value) { return  createElement("code", props, value); }
    public static ReactElement code(HtmlProps props, ReactElement ...child) { return  createElement("code", props, child); }
    public static ReactElement code(ReactElement ...child) { return  createElement("code", null, child); }

    public static ReactElement pre(String...value) { return  createElement("pre", null, value); }
    public static ReactElement pre(HtmlProps props, String value) { return  createElement("pre", props, value); }
    public static ReactElement pre(HtmlProps props, ReactElement ...child) { return  createElement("pre", props, child); }
    public static ReactElement pre(ReactElement ...child) { return  createElement("pre", null, child); }

    public static ReactElement col(String value) { return  createElement("col", null, value); }
    public static ReactElement col(ReactElement ...child) { return  createElement("col", null, child); }
    public static ReactElement col(ColProps props, ReactElement ...child) { return  createElement("col", props, child); }
    public static ReactElement col(HtmlProps props, ReactElement ...child) { return  createElement("col", props, child); }

    public static ReactElement div(String value) { return  createElement("div", null, value); }
    public static ReactElement div(ReactElement ...child) { return  createElement("div", null, child); }
    public static ReactElement div(HtmlProps props, String value) { return  createElement("div", props, value); }
    public static ReactElement div(HtmlProps props, ReactElement ...child) { return  createElement("div", props, child); }

    public static ReactElement main(String value) { return  createElement("main", null, value); }
    public static ReactElement main(ReactElement ...child) { return  createElement("main", null, child); }
    public static ReactElement main(HtmlProps props, String value) { return  createElement("main", props, value); }
    public static ReactElement main(HtmlProps props, ReactElement ...child) { return  createElement("main", props, child); }

    public static ReactElement nav(String value) { return  createElement("nav", null, value); }
    public static ReactElement nav(ReactElement ...child) { return  createElement("nav", null, child); }
    public static ReactElement nav(HtmlProps props, String value) { return  createElement("nav", props, value); }
    public static ReactElement nav(HtmlProps props, ReactElement ...child) { return  createElement("nav", props, child); }

    public static ReactElement footer(String value) { return  createElement("footer", null, value); }
    public static ReactElement footer(HtmlProps props, String value) { return  createElement("footer", props, value); }
    public static ReactElement footer(ReactElement ...child) { return  createElement("footer", null, child); }
    public static ReactElement footer(HtmlProps props, ReactElement ...child) { return  createElement("footer", props, child); }

    public static ReactElement form(ReactElement ...child) { return  createElement("form", null, child); }
    public static ReactElement form(FormProps props, ReactElement ...child) { return  createElement("form", props, child); }

    public static ReactElement header(ReactElement ...child) { return  createElement("header", null, child); }
    public static ReactElement header(HtmlProps props, ReactElement ...child) { return  createElement("header", props, child); }

    public static ReactElement h1(String value) { return  createElement("h1", null, value); }
    public static ReactElement h2(String value) { return  createElement("h2", null, value); }
    public static ReactElement h3(String value) { return  createElement("h3", null, value); }
    public static ReactElement h4(String value) { return  createElement("h4", null, value); }
    public static ReactElement h5(String value) { return  createElement("h5", null, value); }
    public static ReactElement h6(String value) { return  createElement("h6", null, value); }
    public static ReactElement h1(HtmlProps props, String value) { return  createElement("h1", props, value); }
    public static ReactElement h2(HtmlProps props, String value) { return  createElement("h2", props, value); }
    public static ReactElement h3(HtmlProps props, String value) { return  createElement("h3", props, value); }
    public static ReactElement h4(HtmlProps props, String value) { return  createElement("h4", props, value); }
    public static ReactElement h5(HtmlProps props, String value) { return  createElement("h5", props, value); }
    public static ReactElement h6(HtmlProps props, String value) { return  createElement("h6", props, value); }
    public static ReactElement h1(ReactElement ...child) { return  createElement("h1", null, child); }
    public static ReactElement h2(ReactElement ...child) { return  createElement("h2", null, child); }
    public static ReactElement h3(ReactElement ...child) { return  createElement("h3", null, child); }
    public static ReactElement h4(ReactElement ...child) { return  createElement("h4", null, child); }
    public static ReactElement h5(ReactElement ...child) { return  createElement("h5", null, child); }
    public static ReactElement h6(ReactElement ...child) { return  createElement("h6", null, child); }
    public static ReactElement h1(HtmlProps props, ReactElement ...child) { return  createElement("h1", props, child); }
    public static ReactElement h2(HtmlProps props, ReactElement ...child) { return  createElement("h2", props, child); }
    public static ReactElement h3(HtmlProps props, ReactElement ...child) { return  createElement("h3", props, child); }
    public static ReactElement h4(HtmlProps props, ReactElement ...child) { return  createElement("h4", props, child); }
    public static ReactElement h5(HtmlProps props, ReactElement ...child) { return  createElement("h5", props, child); }
    public static ReactElement h6(HtmlProps props, ReactElement ...child) { return  createElement("h6", props, child); }

    public static ReactElement iframe(IFrameProps props) { return  createElement("iframe", props); }

    public static ReactElement img(ImgProps props) { return  createElement("img", props); }

    public static ReactElement input(InputProps props) { return  createElement("input", props); }

    public static ReactElement label(LabelProps props, String value) { return  createElement("label", props, value); }

    public static ReactElement li(String value) { return  createElement("li", null, value); }
    public static ReactElement li(ReactElement ...child) { return  createElement("li", null, child); }
    public static ReactElement li(HtmlProps props, String value) { return  createElement("li", props, value); }
    public static ReactElement li(HtmlProps props, ReactElement ...child) { return  createElement("li", props, child); }

    public static ReactElement ol(String value) { return  createElement("ol", null, value); }
    public static ReactElement ol(ReactElement ...child) { return  createElement("ol", null, child); }
    public static ReactElement ol(HtmlProps props, String value) { return  createElement("ol", props, value); }
    public static ReactElement ol(HtmlProps props, ReactElement ...child) { return  createElement("ol", props, child); }

    public static ReactElement option(String value) { return  createElement("option", null, value); }
    public static ReactElement option(OptionProps props, String value) { return  createElement("option", props, value); }
    public static ReactElement option(ReactElement ...child) { return  createElement("option", null, child); }
    public static ReactElement option(OptionProps props, ReactElement ...child) { return  createElement("option", props, child); }

    public static ReactElement optgroup(String value) { return  createElement("optgroup", null, value); }
    public static ReactElement optgroup(ReactElement ...child) { return  createElement("optgroup", null, child); }
    public static ReactElement optgroup(OptGroupProps props, String value) { return  createElement("optgroup", props, value); }
    public static ReactElement optgroup(OptGroupProps props, ReactElement ...child) { return  createElement("optgroup", props, child); }

    public static ReactElement p(String value) { return createElement("p", null, value); }
    public static ReactElement p(ReactElement ...child) { return  createElement("p", null, child); }
    public static ReactElement p(HtmlProps props, String value) { return createElement("p", props, value); }
    public static ReactElement p(HtmlProps props, ReactElement ...child) { return  createElement("p", props, child); }

    public static ReactElement span(String value) { return  createElement("span", null, value); }
    public static ReactElement span(ReactElement child) { return  createElement("span", null, child); }
    public static ReactElement span(HtmlProps props, String value) { return  createElement("span", props, value); }
    public static ReactElement span(HtmlProps props, ReactElement...child) { return  createElement("span", props, child); }

    public static ReactElement select(ReactElement ...child) { return  createElement("select", null, child); }
    public static ReactElement select(SelectProps props, ReactElement ...child) { return  createElement("select", props, child); }

    public static ReactElement section(ReactElement ...child) { return  createElement("section", null, child); }
    public static ReactElement section(HtmlProps props, ReactElement ...child) { return  createElement("section", props, child); }

    public static ReactElement strong(String value) { return  createElement("strong", null, value); }
    public static ReactElement strong(HtmlProps props, String value) { return  createElement("strong", props, value); }
    public static ReactElement strong(ReactElement ...child) { return  createElement("strong", null, child); }
    public static ReactElement strong(HtmlProps props, ReactElement ...child) { return  createElement("strong", props, child); }

    public static ReactElement source(SourceProps props) { return  createElement("source", props); }

    public static ReactElement table(ReactElement ...child) { return  createElement("table", null, child); }
    public static ReactElement table(TableProps props, ReactElement ...child) { return  createElement("table", props, child); }

    public static ReactElement textarea() { return  createElement("textarea"); }
    public static ReactElement textarea(TextAreaProps props) { return  createElement("textarea", props); }

    public static ReactElement td(String value) { return  createElement("td", null, value); }
    public static ReactElement td(ReactElement ...child) { return  createElement("td", null, child); }
    public static ReactElement td(TdProps props, String value) { return  createElement("td", props, value); }
    public static ReactElement td(TdProps props, ReactElement ...child) { return  createElement("td", props, child); }

    public static ReactElement th(String value) { return  createElement("th", null, value); }
    public static ReactElement th(ReactElement ...child) { return  createElement("th", null, child); }
    public static ReactElement th(ThProps props, String value) { return  createElement("th", props, value); }
    public static ReactElement th(ThProps props, ReactElement ...child) { return  createElement("th", props, child); }

    public static ReactElement tr(ReactElement ...child) { return  createElement("tr", null, child); }
    public static ReactElement tr(HtmlProps props, ReactElement ...child) { return  createElement("tr", props, child); }

    public static ReactElement ul(ReactElement ...child) { return  createElement("ul", null, child); }
    public static ReactElement ul(HtmlProps props, ReactElement ...child) { return  createElement("ul", props, child); }

    public static ReactElement svg(SvgProps props, ReactElement ...child) { return  createElement("svg", props, child); }
    public static ReactElement polygon(PolygonProps props) { return  createElement("polygon", props); }
    public static ReactElement circle(CircleProps props) { return  createElement("circle", props); }

}
