package ka;

import aa.C2591D;
import aa.C2595c;
import aa.InterfaceC2596d;
import android.content.Context;
import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import ka.j;
import ma.InterfaceC5655b;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5655b f52159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f52160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5655b f52161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f52162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f52163e;

    private f(final Context context, final String str, Set set, InterfaceC5655b interfaceC5655b, Executor executor) {
        this(new aa.w(new InterfaceC5655b() { // from class: ka.c
            @Override // ma.InterfaceC5655b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, interfaceC5655b, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                v vVar = (v) fVar.f52159a.get();
                List listG = vVar.g();
                vVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listG.size(); i10++) {
                    w wVar = (w) listG.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", wVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) wVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put(DiagnosticsEntry.VERSION_KEY, "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString(Constants.ENCODING);
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    public static /* synthetic */ v d(Context context, String str) {
        return new v(context, str);
    }

    public static /* synthetic */ f e(C2591D c2591d, InterfaceC2596d interfaceC2596d) {
        return new f((Context) interfaceC2596d.a(Context.class), ((X9.e) interfaceC2596d.a(X9.e.class)).r(), interfaceC2596d.c(g.class), interfaceC2596d.e(ua.i.class), (Executor) interfaceC2596d.f(c2591d));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            ((v) fVar.f52159a.get()).o(System.currentTimeMillis(), ((ua.i) fVar.f52161c.get()).a());
        }
        return null;
    }

    public static C2595c g() {
        final C2591D c2591dA = C2591D.a(Z9.a.class, Executor.class);
        return C2595c.f(f.class, i.class, j.class).b(aa.q.k(Context.class)).b(aa.q.k(X9.e.class)).b(aa.q.m(g.class)).b(aa.q.l(ua.i.class)).b(aa.q.j(c2591dA)).f(new aa.g() { // from class: ka.b
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return f.e(c2591dA, interfaceC2596d);
            }
        }).d();
    }

    @Override // ka.i
    public n9.i a() {
        return !G1.o.a(this.f52160b) ? n9.l.f("") : n9.l.d(this.f52163e, new Callable() { // from class: ka.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f52157a);
            }
        });
    }

    @Override // ka.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        v vVar = (v) this.f52159a.get();
        if (!vVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        vVar.k();
        return j.a.GLOBAL;
    }

    public n9.i h() {
        return this.f52162d.size() <= 0 ? n9.l.f(null) : !G1.o.a(this.f52160b) ? n9.l.f(null) : n9.l.d(this.f52163e, new Callable() { // from class: ka.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.f(this.f52158a);
            }
        });
    }

    f(InterfaceC5655b interfaceC5655b, Set set, Executor executor, InterfaceC5655b interfaceC5655b2, Context context) {
        this.f52159a = interfaceC5655b;
        this.f52162d = set;
        this.f52163e = executor;
        this.f52161c = interfaceC5655b2;
        this.f52160b = context;
    }
}
