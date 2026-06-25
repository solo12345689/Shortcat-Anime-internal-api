package Od;

import android.webkit.JavascriptInterface;
import expo.modules.webview.DomWebView;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DomWebView f13152a;

    public g(DomWebView webView) {
        AbstractC5504s.h(webView, "webView");
        this.f13152a = webView;
    }

    @JavascriptInterface
    public final void postMessage(String message) {
        AbstractC5504s.h(message, "message");
        this.f13152a.dispatchMessageEvent(message);
    }
}
