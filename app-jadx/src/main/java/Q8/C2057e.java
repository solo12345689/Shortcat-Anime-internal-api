package Q8;

import R8.AbstractC2107h;
import R8.AbstractC2119u;
import R8.C2112m;
import R8.C2116q;
import R8.C2118t;
import R8.InterfaceC2120v;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C3333a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import t.C6552b;

/* JADX INFO: renamed from: Q8.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2057e implements Handler.Callback {

    /* JADX INFO: renamed from: p */
    public static final Status f14464p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: q */
    private static final Status f14465q = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: r */
    private static final Object f14466r = new Object();

    /* JADX INFO: renamed from: s */
    private static C2057e f14467s;

    /* JADX INFO: renamed from: c */
    private C2118t f14470c;

    /* JADX INFO: renamed from: d */
    private InterfaceC2120v f14471d;

    /* JADX INFO: renamed from: e */
    private final Context f14472e;

    /* JADX INFO: renamed from: f */
    private final C3333a f14473f;

    /* JADX INFO: renamed from: g */
    private final R8.H f14474g;

    /* JADX INFO: renamed from: n */
    private final Handler f14481n;

    /* JADX INFO: renamed from: o */
    private volatile boolean f14482o;

    /* JADX INFO: renamed from: a */
    private long f14468a = 10000;

    /* JADX INFO: renamed from: b */
    private boolean f14469b = false;

    /* JADX INFO: renamed from: h */
    private final AtomicInteger f14475h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i */
    private final AtomicInteger f14476i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    private final Map f14477j = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: k */
    private C2074w f14478k = null;

    /* JADX INFO: renamed from: l */
    private final Set f14479l = new C6552b();

    /* JADX INFO: renamed from: m */
    private final Set f14480m = new C6552b();

    private C2057e(Context context, Looper looper, C3333a c3333a) {
        this.f14482o = true;
        this.f14472e = context;
        d9.h hVar = new d9.h(looper, this);
        this.f14481n = hVar;
        this.f14473f = c3333a;
        this.f14474g = new R8.H(c3333a);
        if (com.google.android.gms.common.util.h.a(context)) {
            this.f14482o = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f14466r) {
            try {
                C2057e c2057e = f14467s;
                if (c2057e != null) {
                    c2057e.f14476i.incrementAndGet();
                    Handler handler = c2057e.f14481n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status g(C2054b c2054b, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + c2054b.b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    private final E h(P8.e eVar) {
        Map map = this.f14477j;
        C2054b c2054bO = eVar.o();
        E e10 = (E) map.get(c2054bO);
        if (e10 == null) {
            e10 = new E(this, eVar);
            this.f14477j.put(c2054bO, e10);
        }
        if (e10.a()) {
            this.f14480m.add(c2054bO);
        }
        e10.E();
        return e10;
    }

    private final InterfaceC2120v i() {
        if (this.f14471d == null) {
            this.f14471d = AbstractC2119u.a(this.f14472e);
        }
        return this.f14471d;
    }

    private final void j() {
        C2118t c2118t = this.f14470c;
        if (c2118t != null) {
            if (c2118t.c() > 0 || e()) {
                i().c(c2118t);
            }
            this.f14470c = null;
        }
    }

    private final void k(n9.j jVar, int i10, P8.e eVar) {
        O oB;
        if (i10 == 0 || (oB = O.b(this, i10, eVar.o())) == null) {
            return;
        }
        n9.i iVarA = jVar.a();
        final Handler handler = this.f14481n;
        handler.getClass();
        iVarA.b(new Executor() { // from class: Q8.y
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, oB);
    }

    public static C2057e u(Context context) {
        C2057e c2057e;
        synchronized (f14466r) {
            try {
                if (f14467s == null) {
                    f14467s = new C2057e(context.getApplicationContext(), AbstractC2107h.c().getLooper(), C3333a.n());
                }
                c2057e = f14467s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2057e;
    }

    public final void A(P8.e eVar, int i10, com.google.android.gms.common.api.internal.a aVar) {
        this.f14481n.sendMessage(this.f14481n.obtainMessage(4, new Q(new Z(i10, aVar), this.f14476i.get(), eVar)));
    }

    public final void B(P8.e eVar, int i10, r rVar, n9.j jVar, InterfaceC2068p interfaceC2068p) {
        k(jVar, rVar.d(), eVar);
        this.f14481n.sendMessage(this.f14481n.obtainMessage(4, new Q(new a0(i10, rVar, jVar, interfaceC2068p), this.f14476i.get(), eVar)));
    }

    final void C(C2112m c2112m, int i10, long j10, int i11) {
        this.f14481n.sendMessage(this.f14481n.obtainMessage(18, new P(c2112m, i10, j10, i11)));
    }

    public final void D(ConnectionResult connectionResult, int i10) {
        if (f(connectionResult, i10)) {
            return;
        }
        Handler handler = this.f14481n;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    public final void E() {
        Handler handler = this.f14481n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void F(P8.e eVar) {
        Handler handler = this.f14481n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(C2074w c2074w) {
        synchronized (f14466r) {
            try {
                if (this.f14478k != c2074w) {
                    this.f14478k = c2074w;
                    this.f14479l.clear();
                }
                this.f14479l.addAll(c2074w.t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void c(C2074w c2074w) {
        synchronized (f14466r) {
            try {
                if (this.f14478k == c2074w) {
                    this.f14478k = null;
                    this.f14479l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean e() {
        if (this.f14469b) {
            return false;
        }
        R8.r rVarA = C2116q.b().a();
        if (rVarA != null && !rVarA.e()) {
            return false;
        }
        int iA = this.f14474g.a(this.f14472e, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean f(ConnectionResult connectionResult, int i10) {
        return this.f14473f.y(this.f14472e, connectionResult, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        E e10 = null;
        switch (i10) {
            case 1:
                this.f14468a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f14481n.removeMessages(12);
                for (C2054b c2054b : this.f14477j.keySet()) {
                    Handler handler = this.f14481n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c2054b), this.f14468a);
                }
                return true;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (E e11 : this.f14477j.values()) {
                    e11.D();
                    e11.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                Q q10 = (Q) message.obj;
                E eH = (E) this.f14477j.get(q10.f14434c.o());
                if (eH == null) {
                    eH = h(q10.f14434c);
                }
                if (!eH.a() || this.f14476i.get() == q10.f14433b) {
                    eH.F(q10.f14432a);
                } else {
                    q10.f14432a.a(f14464p);
                    eH.K();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.f14477j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        E e12 = (E) it.next();
                        if (e12.s() == i11) {
                            e10 = e12;
                        }
                    }
                }
                if (e10 == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.d() == 13) {
                    e10.g(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f14473f.e(connectionResult.d()) + ": " + connectionResult.e()));
                } else {
                    e10.g(g(e10.f14398c, connectionResult));
                }
                return true;
            case 6:
                if (this.f14472e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C2055c.c((Application) this.f14472e.getApplicationContext());
                    ComponentCallbacks2C2055c.b().a(new C2077z(this));
                    if (!ComponentCallbacks2C2055c.b().e(true)) {
                        this.f14468a = 300000L;
                    }
                }
                return true;
            case 7:
                h((P8.e) message.obj);
                return true;
            case 9:
                if (this.f14477j.containsKey(message.obj)) {
                    ((E) this.f14477j.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.f14480m.iterator();
                while (it2.hasNext()) {
                    E e13 = (E) this.f14477j.remove((C2054b) it2.next());
                    if (e13 != null) {
                        e13.K();
                    }
                }
                this.f14480m.clear();
                return true;
            case 11:
                if (this.f14477j.containsKey(message.obj)) {
                    ((E) this.f14477j.get(message.obj)).L();
                }
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (this.f14477j.containsKey(message.obj)) {
                    ((E) this.f14477j.get(message.obj)).b();
                }
                return true;
            case 14:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 15:
                G g10 = (G) message.obj;
                if (this.f14477j.containsKey(g10.f14409a)) {
                    E.B((E) this.f14477j.get(g10.f14409a), g10);
                }
                return true;
            case 16:
                G g11 = (G) message.obj;
                if (this.f14477j.containsKey(g11.f14409a)) {
                    E.C((E) this.f14477j.get(g11.f14409a), g11);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                P p10 = (P) message.obj;
                if (p10.f14430c == 0) {
                    i().c(new C2118t(p10.f14429b, Arrays.asList(p10.f14428a)));
                } else {
                    C2118t c2118t = this.f14470c;
                    if (c2118t != null) {
                        List listD = c2118t.d();
                        if (c2118t.c() != p10.f14429b || (listD != null && listD.size() >= p10.f14431d)) {
                            this.f14481n.removeMessages(17);
                            j();
                        } else {
                            this.f14470c.e(p10.f14428a);
                        }
                    }
                    if (this.f14470c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(p10.f14428a);
                        this.f14470c = new C2118t(p10.f14429b, arrayList);
                        Handler handler2 = this.f14481n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), p10.f14430c);
                    }
                }
                return true;
            case 19:
                this.f14469b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int l() {
        return this.f14475h.getAndIncrement();
    }

    final E t(C2054b c2054b) {
        return (E) this.f14477j.get(c2054b);
    }
}
