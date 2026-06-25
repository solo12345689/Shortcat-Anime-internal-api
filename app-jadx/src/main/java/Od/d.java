package Od;

import android.webkit.JavascriptInterface;
import expo.modules.webview.DomWebView;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final DomWebView f13125a;

    public d(DomWebView webView) {
        AbstractC5504s.h(webView, "webView");
        this.f13125a = webView;
    }

    @JavascriptInterface
    public final String eval(String params) {
        AbstractC5504s.h(params, "params");
        return this.f13125a.evalSync(params);
    }
}
