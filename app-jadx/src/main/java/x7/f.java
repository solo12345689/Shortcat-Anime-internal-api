package x7;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f64028g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f64029h = f.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f64030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f64031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f64032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f64033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function1 f64034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f64035f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(Context appContext) {
        AbstractC5504s.h(appContext, "appContext");
        this.f64030a = appContext;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(appContext);
        AbstractC5504s.g(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f64031b = defaultSharedPreferences;
        String packageName = appContext.getPackageName();
        AbstractC5504s.g(packageName, "getPackageName(...)");
        this.f64032c = packageName;
        this.f64033d = new LinkedHashMap();
        this.f64034e = new Function1() { // from class: x7.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.b((Map) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(Map it) {
        AbstractC5504s.h(it, "it");
        return it;
    }

    public final Map c() {
        return this.f64033d;
    }

    public String d() {
        String str = this.f64035f;
        if (str != null) {
            return str;
        }
        String string = this.f64031b.getString("debug_http_host", null);
        if (string != null && string.length() != 0) {
            return string;
        }
        String strI = com.facebook.react.modules.systeminfo.a.i(this.f64030a);
        if (AbstractC5504s.c(strI, "localhost")) {
            AbstractC7283a.I(f64029h, "You seem to be running on device. Run '" + com.facebook.react.modules.systeminfo.a.b(this.f64030a) + "' to forward the debug server's port to the device.");
        }
        this.f64035f = strI;
        return strI;
    }

    public final String e() {
        return this.f64032c;
    }

    public void f(String host) {
        AbstractC5504s.h(host, "host");
        if (host.length() == 0) {
            this.f64035f = null;
        } else {
            this.f64035f = host;
        }
    }

    public final void g(Function1 queryMapper) {
        AbstractC5504s.h(queryMapper, "queryMapper");
        this.f64034e = queryMapper;
    }

    public final Map h(Map options) {
        AbstractC5504s.h(options, "options");
        return (Map) this.f64034e.invoke(options);
    }
}
