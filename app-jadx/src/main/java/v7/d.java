package v7;

import Df.r;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends CookieHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f61986b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CookieManager f61987a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(String str) {
            return r.B(str, "Set-cookie", true) || r.B(str, "Set-cookie2", true);
        }

        private a() {
        }
    }

    public d() {
    }

    private final void b(String str, String str2) {
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.setCookie(str, str2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Callback callback, Boolean bool) {
        callback.invoke(bool);
    }

    private final CookieManager g() {
        if (this.f61987a == null) {
            try {
                this.f61987a = CookieManager.getInstance();
            } catch (IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.f61987a;
    }

    public final void c(String url, List cookies) {
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(cookies, "cookies");
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            b(url, (String) it.next());
        }
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.flush();
        }
    }

    public final void d(final Callback callback) {
        AbstractC5504s.h(callback, "callback");
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.removeAllCookies(new ValueCallback() { // from class: v7.c
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    d.e(callback, (Boolean) obj);
                }
            });
        }
    }

    @Override // java.net.CookieHandler
    public Map get(URI uri, Map headers) {
        AbstractC5504s.h(uri, "uri");
        AbstractC5504s.h(headers, "headers");
        CookieManager cookieManagerG = g();
        String cookie = cookieManagerG != null ? cookieManagerG.getCookie(uri.toString()) : null;
        return (cookie == null || cookie.length() == 0) ? S.i() : S.f(z.a("Cookie", AbstractC2279u.e(cookie)));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map headers) {
        AbstractC5504s.h(uri, "uri");
        AbstractC5504s.h(headers, "headers");
        String string = uri.toString();
        AbstractC5504s.g(string, "toString(...)");
        for (Map.Entry entry : headers.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (f61986b.b(str)) {
                c(string, list);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(ReactContext reactContext) {
        this();
        AbstractC5504s.h(reactContext, "reactContext");
    }

    public final void f() {
    }
}
