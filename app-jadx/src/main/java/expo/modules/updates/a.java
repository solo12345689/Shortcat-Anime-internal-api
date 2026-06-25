package expo.modules.updates;

import Cd.h;
import Gf.AbstractC1615j;
import Gf.AbstractC1617k;
import Gf.AbstractC1646z;
import Gf.C1608f0;
import Gf.C1627p;
import Gf.InterfaceC1623n;
import Gf.InterfaceC1642x;
import Gf.O;
import Gf.P;
import Gf.X0;
import Td.L;
import Td.u;
import Td.v;
import Ud.S;
import Ud.a0;
import ae.AbstractC2605b;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.updates.c;
import expo.modules.updates.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rb.AbstractC6300a;
import ud.C6767c;
import ud.InterfaceC6765a;
import vd.C6862c;
import vd.InterfaceC6861b;
import xd.C7136g;
import zd.C7360e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements expo.modules.updates.c, Ed.b {

    /* JADX INFO: renamed from: p */
    public static final C0736a f46310p = new C0736a(null);

    /* JADX INFO: renamed from: q */
    private static final String f46311q = a.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    private final Context f46312a;

    /* JADX INFO: renamed from: b */
    private final Exception f46313b;

    /* JADX INFO: renamed from: c */
    private WeakReference f46314c;

    /* JADX INFO: renamed from: d */
    private final O f46315d;

    /* JADX INFO: renamed from: e */
    private final C7136g f46316e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6765a f46317f;

    /* JADX INFO: renamed from: g */
    private final Cd.g f46318g;

    /* JADX INFO: renamed from: h */
    private boolean f46319h;

    /* JADX INFO: renamed from: i */
    private Long f46320i;

    /* JADX INFO: renamed from: j */
    private Long f46321j;

    /* JADX INFO: renamed from: k */
    private InterfaceC6861b f46322k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC1642x f46323l;

    /* JADX INFO: renamed from: m */
    private final Pf.a f46324m;

    /* JADX INFO: renamed from: n */
    private WeakReference f46325n;

    /* JADX INFO: renamed from: o */
    private final boolean f46326o;

    /* JADX INFO: renamed from: expo.modules.updates.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0736a {
        public /* synthetic */ C0736a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0736a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends CodedException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String message) {
            super(message, null, 2, null);
            AbstractC5504s.h(message, "message");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46327a;

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46327a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = a.this.f46323l;
                this.f46327a = 1;
                if (interfaceC1642x.M0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f46329a;

        /* JADX INFO: renamed from: b */
        Object f46330b;

        /* JADX INFO: renamed from: c */
        int f46331c;

        d(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new d(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Pf.a aVar;
            a aVar2;
            Object objF = AbstractC2605b.f();
            int i10 = this.f46331c;
            if (i10 == 0) {
                v.b(obj);
                aVar = a.this.f46324m;
                a aVar3 = a.this;
                this.f46329a = aVar;
                this.f46330b = aVar3;
                this.f46331c = 1;
                if (aVar.c(null, this) == objF) {
                    return objF;
                }
                aVar2 = aVar3;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (a) this.f46330b;
                aVar = (Pf.a) this.f46329a;
                v.b(obj);
            }
            try {
                if (!aVar2.f46323l.j()) {
                    if (aVar2.f46322k == null) {
                        throw new AssertionError("UpdatesController.notifyController was called with a null launcher, which is an error. This method should only be called when an update is ready to launch.");
                    }
                    aVar2.f46323l.O(L.f17438a);
                }
                L l10 = L.f17438a;
                aVar.e(null);
                return L.f17438a;
            } catch (Throwable th2) {
                aVar.e(null);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC6861b.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1623n f46333a;

        e(InterfaceC1623n interfaceC1623n) {
            this.f46333a = interfaceC1623n;
        }

        @Override // vd.InterfaceC6861b.a
        public void a() {
            InterfaceC1623n interfaceC1623n = this.f46333a;
            u.a aVar = u.f17466b;
            interfaceC1623n.resumeWith(u.b(L.f17438a));
        }

        @Override // vd.InterfaceC6861b.a
        public void onFailure(Exception e10) {
            CodedException unexpectedException;
            CodedException codedException;
            AbstractC5504s.h(e10, "e");
            InterfaceC1623n interfaceC1623n = this.f46333a;
            if (e10 instanceof CodedException) {
                codedException = (CodedException) e10;
            } else {
                if (e10 instanceof AbstractC6300a) {
                    AbstractC6300a abstractC6300a = (AbstractC6300a) e10;
                    String strA = abstractC6300a.a();
                    AbstractC5504s.g(strA, "getCode(...)");
                    unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
                } else {
                    unexpectedException = new UnexpectedException(e10);
                }
                codedException = unexpectedException;
            }
            u.a aVar = u.f17466b;
            interfaceC1623n.resumeWith(u.b(v.a(codedException)));
        }
    }

    public a(Context context, Exception exc) {
        AbstractC5504s.h(context, "context");
        this.f46312a = context;
        this.f46313b = exc;
        O oA = P.a(X0.b(null, 1, null).w(C1608f0.b()));
        this.f46315d = oA;
        File filesDir = context.getFilesDir();
        AbstractC5504s.g(filesDir, "getFilesDir(...)");
        C7136g c7136g = new C7136g(filesDir);
        this.f46316e = c7136g;
        this.f46317f = new C6767c(c7136g);
        this.f46318g = new Cd.g(c7136g, d(), a0.h(h.f3069b, h.f3072e), oA);
        this.f46323l = AbstractC1646z.b(null, 1, null);
        this.f46324m = Pf.g.b(false, 1, null);
        this.f46325n = new WeakReference(null);
    }

    private final synchronized void A() {
        AbstractC1617k.d(this.f46315d, null, null, new d(null), 3, null);
    }

    private final Ef.a z() {
        Long l10 = this.f46320i;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            Long l11 = this.f46321j;
            if (l11 != null) {
                return Ef.a.k(Ef.c.t(l11.longValue() - jLongValue, Ef.d.f5970d));
            }
        }
        return null;
    }

    @Override // expo.modules.updates.c
    public void a(c7.f devSupportManager) {
        AbstractC5504s.h(devSupportManager, "devSupportManager");
    }

    @Override // expo.modules.updates.c
    public String b() {
        AbstractC1615j.b(null, new c(null), 1, null);
        InterfaceC6861b interfaceC6861b = this.f46322k;
        if (interfaceC6861b != null) {
            return interfaceC6861b.b();
        }
        return null;
    }

    @Override // expo.modules.updates.c
    public String c() {
        InterfaceC6861b interfaceC6861b = this.f46322k;
        if (interfaceC6861b != null) {
            return interfaceC6861b.c();
        }
        return null;
    }

    @Override // expo.modules.updates.c
    public InterfaceC6765a d() {
        return this.f46317f;
    }

    @Override // expo.modules.updates.c
    public Object e(Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        this.f46318g.f(new C7360e(this.f46312a, this.f46314c, new e(c1627p), this.f46315d));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    @Override // expo.modules.updates.c
    public boolean f() {
        return this.f46326o;
    }

    @Override // expo.modules.updates.c
    public void g(Map map) throws b {
        throw new b("Updates.setUpdateRequestHeadersOverride() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.c
    public WeakReference getReactHost() {
        return this.f46325n;
    }

    @Override // expo.modules.updates.c
    public Object h(String str, String str2, Zd.e eVar) throws b {
        throw new b("Updates.setExtraParamAsync() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.c
    public Object i(Zd.e eVar) throws b {
        throw new b("Updates.checkForUpdateAsync() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.c
    public c.C0742c j() {
        rd.d dVarD;
        Map mapA;
        InterfaceC6861b interfaceC6861b = this.f46322k;
        if (interfaceC6861b != null) {
            dVarD = interfaceC6861b.d();
            mapA = null;
        } else {
            dVarD = null;
            mapA = null;
        }
        Ef.a aVarZ = z();
        Exception exc = this.f46313b;
        InterfaceC6861b interfaceC6861b2 = this.f46322k;
        boolean zE = interfaceC6861b2 != null ? interfaceC6861b2.e() : false;
        d.a aVar = d.a.f46430a;
        Map mapI = S.i();
        InterfaceC6861b interfaceC6861b3 = this.f46322k;
        if (interfaceC6861b3 != null) {
            mapA = interfaceC6861b3.a();
        }
        return new c.C0742c(dVarD, aVarZ, null, exc, false, zE, null, aVar, mapI, mapA, false, this.f46318g.d(), null);
    }

    @Override // expo.modules.updates.c
    public Ad.d k() {
        return null;
    }

    @Override // expo.modules.updates.c
    public void l(WeakReference weakReference) {
        AbstractC5504s.h(weakReference, "<set-?>");
        this.f46325n = weakReference;
    }

    @Override // expo.modules.updates.c
    public void m(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        this.f46314c = new WeakReference(reactContext.getCurrentActivity());
    }

    @Override // expo.modules.updates.c
    public void n() {
        this.f46318g.h();
    }

    @Override // expo.modules.updates.c
    public void o(Exception exception) {
        AbstractC5504s.h(exception, "exception");
    }

    @Override // expo.modules.updates.c
    public Object p(Zd.e eVar) throws b {
        throw new b("Updates.getExtraParamsAsync() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.c
    public Object q(Zd.e eVar) throws b {
        throw new b("Updates.fetchUpdateAsync() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.c
    public void r(expo.modules.updates.e eVar) throws b {
        throw new b("Updates.setUpdateURLAndRequestHeadersOverride() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.c
    public synchronized void start() {
        if (this.f46319h) {
            return;
        }
        this.f46319h = true;
        this.f46320i = Long.valueOf(System.currentTimeMillis());
        this.f46322k = new C6862c(this.f46312a, this.f46316e, this.f46313b, this.f46315d);
        this.f46321j = Long.valueOf(System.currentTimeMillis());
        A();
    }
}
