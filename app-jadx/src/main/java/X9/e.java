package X9;

import G1.o;
import Q8.ComponentCallbacks2C2055c;
import R8.AbstractC2113n;
import R8.AbstractC2115p;
import aa.C2595c;
import aa.C2598f;
import aa.n;
import aa.w;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import ja.InterfaceC5358c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ma.InterfaceC5655b;
import ra.C6299a;
import t.C6551a;
import w.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: k */
    private static final Object f21696k = new Object();

    /* JADX INFO: renamed from: l */
    static final Map f21697l = new C6551a();

    /* JADX INFO: renamed from: a */
    private final Context f21698a;

    /* JADX INFO: renamed from: b */
    private final String f21699b;

    /* JADX INFO: renamed from: c */
    private final k f21700c;

    /* JADX INFO: renamed from: d */
    private final n f21701d;

    /* JADX INFO: renamed from: g */
    private final w f21704g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC5655b f21705h;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f21702e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private final AtomicBoolean f21703f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    private final List f21706i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    private final List f21707j = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements ComponentCallbacks2C2055c.a {

        /* JADX INFO: renamed from: a */
        private static AtomicReference f21708a = new AtomicReference();

        private b() {
        }

        public static void c(Context context) {
            if (com.google.android.gms.common.util.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f21708a.get() == null) {
                    b bVar = new b();
                    if (Y.a(f21708a, null, bVar)) {
                        ComponentCallbacks2C2055c.c(application);
                        ComponentCallbacks2C2055c.b().a(bVar);
                    }
                }
            }
        }

        @Override // Q8.ComponentCallbacks2C2055c.a
        public void a(boolean z10) {
            synchronized (e.f21696k) {
                try {
                    for (e eVar : new ArrayList(e.f21697l.values())) {
                        if (eVar.f21702e.get()) {
                            eVar.z(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b */
        private static AtomicReference f21709b = new AtomicReference();

        /* JADX INFO: renamed from: a */
        private final Context f21710a;

        public c(Context context) {
            this.f21710a = context;
        }

        public static void b(Context context) {
            if (f21709b.get() == null) {
                c cVar = new c(context);
                if (Y.a(f21709b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f21710a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f21696k) {
                try {
                    Iterator it = e.f21697l.values().iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).s();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, k kVar) {
        this.f21698a = (Context) AbstractC2115p.l(context);
        this.f21699b = AbstractC2115p.f(str);
        this.f21700c = (k) AbstractC2115p.l(kVar);
        l lVarB = FirebaseInitProvider.b();
        va.c.b("Firebase");
        va.c.b("ComponentDiscovery");
        List listB = C2598f.c(context, ComponentDiscoveryService.class).b();
        va.c.a();
        va.c.b("Runtime");
        n.b bVarF = n.k(ba.l.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C2595c.q(context, Context.class, new Class[0])).b(C2595c.q(this, e.class, new Class[0])).b(C2595c.q(kVar, k.class, new Class[0])).f(new va.b());
        if (o.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(C2595c.q(lVarB, l.class, new Class[0]));
        }
        n nVarE = bVarF.e();
        this.f21701d = nVarE;
        va.c.a();
        this.f21704g = new w(new InterfaceC5655b() { // from class: X9.c
            @Override // ma.InterfaceC5655b
            public final Object get() {
                return e.b(this.f21693a, context);
            }
        });
        this.f21705h = nVarE.e(ka.f.class);
        g(new a() { // from class: X9.d
            @Override // X9.e.a
            public final void a(boolean z10) {
                e.a(this.f21695a, z10);
            }
        });
        va.c.a();
    }

    private void A() {
        Iterator it = this.f21707j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public static /* synthetic */ void a(e eVar, boolean z10) {
        if (z10) {
            eVar.getClass();
        } else {
            ((ka.f) eVar.f21705h.get()).h();
        }
    }

    public static /* synthetic */ C6299a b(e eVar, Context context) {
        return new C6299a(context, eVar.r(), (InterfaceC5358c) eVar.f21701d.a(InterfaceC5358c.class));
    }

    private void h() {
        AbstractC2115p.p(!this.f21703f.get(), "FirebaseApp was deleted");
    }

    private static List k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f21696k) {
            try {
                Iterator it = f21697l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).p());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List m(Context context) {
        ArrayList arrayList;
        synchronized (f21696k) {
            arrayList = new ArrayList(f21697l.values());
        }
        return arrayList;
    }

    public static e n() {
        e eVar;
        synchronized (f21696k) {
            try {
                eVar = (e) f21697l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((ka.f) eVar.f21705h.get()).h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static e o(String str) {
        e eVar;
        String str2;
        synchronized (f21696k) {
            try {
                eVar = (e) f21697l.get(y(str));
                if (eVar == null) {
                    List listK = k();
                    if (listK.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listK);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((ka.f) eVar.f21705h.get()).h();
            } finally {
            }
        }
        return eVar;
    }

    public void s() {
        if (!o.a(this.f21698a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + p());
            c.b(this.f21698a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + p());
        this.f21701d.n(x());
        ((ka.f) this.f21705h.get()).h();
    }

    public static e t(Context context) {
        synchronized (f21696k) {
            try {
                if (f21697l.containsKey("[DEFAULT]")) {
                    return n();
                }
                k kVarA = k.a(context);
                if (kVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return u(context, kVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static e u(Context context, k kVar) {
        return v(context, kVar, "[DEFAULT]");
    }

    public static e v(Context context, k kVar, String str) {
        e eVar;
        b.c(context);
        String strY = y(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f21696k) {
            Map map = f21697l;
            AbstractC2115p.p(!map.containsKey(strY), "FirebaseApp name " + strY + " already exists!");
            AbstractC2115p.m(context, "Application context cannot be null.");
            eVar = new e(context, strY, kVar);
            map.put(strY, eVar);
        }
        eVar.s();
        return eVar;
    }

    private static String y(String str) {
        return str.trim();
    }

    public void z(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f21706i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z10);
        }
    }

    public void B(boolean z10) {
        h();
        if (this.f21702e.compareAndSet(!z10, z10)) {
            boolean zD = ComponentCallbacks2C2055c.b().d();
            if (z10 && zD) {
                z(true);
            } else {
                if (z10 || !zD) {
                    return;
                }
                z(false);
            }
        }
    }

    public void C(Boolean bool) {
        h();
        ((C6299a) this.f21704g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f21699b.equals(((e) obj).p());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f21702e.get() && ComponentCallbacks2C2055c.b().d()) {
            aVar.a(true);
        }
        this.f21706i.add(aVar);
    }

    public int hashCode() {
        return this.f21699b.hashCode();
    }

    public void i() {
        if (this.f21703f.compareAndSet(false, true)) {
            synchronized (f21696k) {
                f21697l.remove(this.f21699b);
            }
            A();
        }
    }

    public Object j(Class cls) {
        h();
        return this.f21701d.a(cls);
    }

    public Context l() {
        h();
        return this.f21698a;
    }

    public String p() {
        h();
        return this.f21699b;
    }

    public k q() {
        h();
        return this.f21700c;
    }

    public String r() {
        return com.google.android.gms.common.util.c.a(p().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(q().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return AbstractC2113n.c(this).a("name", this.f21699b).a("options", this.f21700c).toString();
    }

    public boolean w() {
        h();
        return ((C6299a) this.f21704g.get()).b();
    }

    public boolean x() {
        return "[DEFAULT]".equals(p());
    }
}
