package Fd;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import v2.InterfaceC6838b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f6613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6838b f6614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f6615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x2.p f6616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x2.r f6617e;

    public E(Context context) {
        AbstractC5504s.h(context, "context");
        this.f6613a = new WeakReference(context);
        v2.c cVar = new v2.c(context);
        this.f6614b = cVar;
        this.f6615c = context.getSharedPreferences("ExpoVideoCache", 0);
        this.f6616d = new x2.p(m());
        this.f6617e = new x2.r(f(), this.f6616d, cVar);
    }

    private final void c() throws F {
        if (Id.m.f9065a.g()) {
            throw new F("Cannot clear cache while there are active players", null, 2, null);
        }
        if (AbstractC5504s.c(Looper.myLooper(), Looper.getMainLooper())) {
            Log.w("ExpoVideo", "Clearing cache on the main thread, this might cause performance issues");
        }
    }

    private final String e() {
        String string = UUID.randomUUID().toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    private final File f() {
        String string = this.f6615c.getString("cacheDir", null);
        if (string == null) {
            string = e();
            this.f6615c.edit().putString("cacheDir", string).commit();
        }
        File file = new File(new File(g().getCacheDir(), "ExpoVideoCache"), string);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final Context g() throws cc.i {
        Context context = (Context) this.f6613a.get();
        if (context != null) {
            return context;
        }
        throw new cc.i();
    }

    private final long i(File file) {
        return Cf.l.P(Cf.l.K(Cf.l.z(fe.k.s(file), new Function1() { // from class: Fd.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(E.j((File) obj));
            }
        }), new Function1() { // from class: Fd.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(E.k((File) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(File it) {
        AbstractC5504s.h(it, "it");
        return it.isFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(File it) {
        AbstractC5504s.h(it, "it");
        return it.length();
    }

    private final long m() {
        return this.f6615c.getLong("cacheSize", 1073741824L);
    }

    public final void d() throws F {
        c();
        File fileF = f();
        x2.r rVar = this.f6617e;
        this.f6615c.edit().putString("cacheDir", e()).apply();
        this.f6617e = new x2.r(f(), this.f6616d, this.f6614b);
        rVar.x();
        fe.k.z(fileF);
    }

    public final long h() {
        return i(f());
    }

    public final x2.r l() {
        return this.f6617e;
    }

    public final void n() {
        this.f6617e.x();
    }

    public final void o(long j10) throws F {
        c();
        this.f6617e.x();
        this.f6615c.edit().putLong("cacheSize", j10).apply();
        this.f6616d = new x2.p(j10);
        this.f6617e = new x2.r(f(), this.f6616d, this.f6614b);
    }
}
