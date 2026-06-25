package Od;

import expo.modules.webview.DomWebView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a */
    public static final f f13149a = new f();

    /* JADX INFO: renamed from: b */
    private static final C6551a f13150b = new C6551a();

    /* JADX INFO: renamed from: c */
    private static int f13151c;

    private f() {
    }

    public final synchronized int a(DomWebView webView) {
        int i10;
        AbstractC5504s.h(webView, "webView");
        i10 = f13151c;
        f13150b.put(Integer.valueOf(i10), new h(new WeakReference(webView)));
        f13151c++;
        return i10;
    }

    public final synchronized DomWebView b(int i10) {
        h hVar;
        WeakReference weakReferenceA;
        hVar = (h) f13150b.get(Integer.valueOf(i10));
        return (hVar == null || (weakReferenceA = hVar.a()) == null) ? null : (DomWebView) weakReferenceA.get();
    }

    public final synchronized void c() {
        f13150b.clear();
        f13151c = 0;
    }
}
