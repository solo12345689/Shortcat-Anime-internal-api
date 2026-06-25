package expo.modules.updates;

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
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.updates.c;
import expo.modules.updates.d;
import expo.modules.updates.db.UpdatesDatabase;
import ie.InterfaceC5082a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.C5996a;
import pd.C5998c;
import rb.AbstractC6300a;
import ud.C6767c;
import ud.InterfaceC6765a;
import vd.InterfaceC6861b;
import xd.C7134e;
import xd.C7136g;
import xd.EnumC7131b;
import yd.C7221a;
import yd.k;
import zd.C7356a;
import zd.C7359d;
import zd.C7361f;
import zd.C7363h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements expo.modules.updates.c, Ed.b {

    /* JADX INFO: renamed from: v */
    public static final a f46334v = new a(null);

    /* JADX INFO: renamed from: w */
    private static final String f46335w = b.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    private final Context f46336a;

    /* JADX INFO: renamed from: b */
    private expo.modules.updates.d f46337b;

    /* JADX INFO: renamed from: c */
    private final File f46338c;

    /* JADX INFO: renamed from: d */
    private WeakReference f46339d;

    /* JADX INFO: renamed from: e */
    private final C7136g f46340e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6765a f46341f;

    /* JADX INFO: renamed from: g */
    private final O f46342g;

    /* JADX INFO: renamed from: h */
    private final Cd.g f46343h;

    /* JADX INFO: renamed from: i */
    private final C5998c f46344i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1642x f46345j;

    /* JADX INFO: renamed from: k */
    private final Pf.a f46346k;

    /* JADX INFO: renamed from: l */
    private final Ad.d f46347l;

    /* JADX INFO: renamed from: m */
    private WeakReference f46348m;

    /* JADX INFO: renamed from: n */
    private final Map f46349n;

    /* JADX INFO: renamed from: o */
    private boolean f46350o;

    /* JADX INFO: renamed from: p */
    private boolean f46351p;

    /* JADX INFO: renamed from: q */
    private Long f46352q;

    /* JADX INFO: renamed from: r */
    private Long f46353r;

    /* JADX INFO: renamed from: s */
    private final C7363h f46354s;

    /* JADX INFO: renamed from: t */
    private final boolean f46355t;

    /* JADX INFO: renamed from: u */
    private final boolean f46356u;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: expo.modules.updates.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0737b implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1623n f46357a;

        C0737b(InterfaceC1623n interfaceC1623n) {
            this.f46357a = interfaceC1623n;
        }

        public final void a(c.a it) {
            AbstractC5504s.h(it, "it");
            this.f46357a.resumeWith(u.b(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c.a) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1623n f46358a;

        c(InterfaceC1623n interfaceC1623n) {
            this.f46358a = interfaceC1623n;
        }

        public final void a(c.b it) {
            AbstractC5504s.h(it, "it");
            this.f46358a.resumeWith(u.b(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c.b) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46359a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC1623n f46361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1623n interfaceC1623n, Zd.e eVar) {
            super(2, eVar);
            this.f46361c = interfaceC1623n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return b.this.new d(this.f46361c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CodedException unexpectedException;
            CodedException codedException;
            Bundle bundle;
            AbstractC2605b.f();
            if (this.f46359a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                Map mapD = k.f65039a.d(b.this.f46344i.c(), b.this.f46337b);
                if (mapD == null) {
                    bundle = new Bundle();
                } else {
                    Bundle bundle2 = new Bundle();
                    for (Map.Entry entry : mapD.entrySet()) {
                        bundle2.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle = bundle2;
                }
                this.f46361c.resumeWith(u.b(bundle));
            } catch (Exception e10) {
                InterfaceC1623n interfaceC1623n = this.f46361c;
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
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46362a;

        e(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return b.this.new e(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46362a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = b.this.f46345j;
                this.f46362a = 1;
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
    static final class f extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f46364a;

        /* JADX INFO: renamed from: b */
        Object f46365b;

        /* JADX INFO: renamed from: c */
        int f46366c;

        f(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return b.this.new f(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Pf.a aVar;
            b bVar;
            Object objF = AbstractC2605b.f();
            int i10 = this.f46366c;
            if (i10 == 0) {
                v.b(obj);
                aVar = b.this.f46346k;
                b bVar2 = b.this;
                this.f46364a = aVar;
                this.f46365b = bVar2;
                this.f46366c = 1;
                if (aVar.c(null, this) == objF) {
                    return objF;
                }
                bVar = bVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) this.f46365b;
                aVar = (Pf.a) this.f46364a;
                v.b(obj);
            }
            try {
                if (!bVar.f46345j.j()) {
                    bVar.f46345j.O(L.f17438a);
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
    public static final class g extends CodedException {
        g() {
            super("ERR_UPDATES_RELOAD", "Cannot relaunch without a launched update.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC6861b.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1623n f46368a;

        h(InterfaceC1623n interfaceC1623n) {
            this.f46368a = interfaceC1623n;
        }

        @Override // vd.InterfaceC6861b.a
        public void a() {
            InterfaceC1623n interfaceC1623n = this.f46368a;
            u.a aVar = u.f17466b;
            interfaceC1623n.resumeWith(u.b(L.f17438a));
        }

        @Override // vd.InterfaceC6861b.a
        public void onFailure(Exception e10) {
            CodedException unexpectedException;
            CodedException codedException;
            AbstractC5504s.h(e10, "e");
            InterfaceC1623n interfaceC1623n = this.f46368a;
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

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46369a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f46370b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f46372d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f46373e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC1623n f46374f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, String str2, InterfaceC1623n interfaceC1623n, Zd.e eVar) {
            super(2, eVar);
            this.f46372d = str;
            this.f46373e = str2;
            this.f46374f = interfaceC1623n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            i iVar = b.this.new i(this.f46372d, this.f46373e, this.f46374f, eVar);
            iVar.f46370b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((i) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            CodedException unexpectedException;
            CodedException codedException;
            AbstractC2605b.f();
            if (this.f46369a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            b bVar = b.this;
            String str = this.f46372d;
            String str2 = this.f46373e;
            InterfaceC1623n interfaceC1623n = this.f46374f;
            try {
                u.a aVar = u.f17466b;
                k.f65039a.i(bVar.f46344i.c(), bVar.f46337b, str, str2);
                L l10 = L.f17438a;
                interfaceC1623n.resumeWith(u.b(l10));
                objB = u.b(l10);
            } catch (Throwable th2) {
                u.a aVar2 = u.f17466b;
                objB = u.b(v.a(th2));
            }
            InterfaceC1623n interfaceC1623n2 = this.f46374f;
            Throwable thE = u.e(objB);
            if (thE != null) {
                if (thE instanceof CodedException) {
                    codedException = (CodedException) thE;
                } else {
                    if (thE instanceof AbstractC6300a) {
                        AbstractC6300a abstractC6300a = (AbstractC6300a) thE;
                        String strA = abstractC6300a.a();
                        AbstractC5504s.g(strA, "getCode(...)");
                        unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(thE);
                    }
                    codedException = unexpectedException;
                }
                interfaceC1623n2.resumeWith(u.b(v.a(codedException)));
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements C7363h.a {
        j() {
        }

        @Override // zd.C7363h.a
        public void a() {
            b.this.R();
        }

        @Override // zd.C7363h.a
        public void b(boolean z10, InterfaceC6861b.a callback) {
            AbstractC5504s.h(callback, "callback");
            b.this.U(z10, callback);
        }
    }

    public b(Context context, expo.modules.updates.d updatesConfiguration, File updatesDirectory) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(updatesConfiguration, "updatesConfiguration");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
        this.f46336a = context;
        this.f46337b = updatesConfiguration;
        this.f46338c = updatesDirectory;
        File filesDir = context.getFilesDir();
        AbstractC5504s.g(filesDir, "getFilesDir(...)");
        C7136g c7136g = new C7136g(filesDir);
        this.f46340e = c7136g;
        this.f46341f = new C6767c(c7136g);
        O oA = P.a(X0.b(null, 1, null).w(C1608f0.b()));
        this.f46342g = oA;
        this.f46343h = new Cd.g(c7136g, d(), AbstractC2279u.f1(Cd.h.b()), oA);
        C5998c c5998c = new C5998c(UpdatesDatabase.INSTANCE.c(context, C1608f0.b()));
        this.f46344i = c5998c;
        this.f46345j = AbstractC1646z.b(null, 1, null);
        this.f46346k = Pf.g.b(false, 1, null);
        this.f46347l = new Ad.d();
        this.f46348m = new WeakReference(null);
        this.f46349n = new LinkedHashMap();
        this.f46354s = new C7363h(context, this.f46337b, c5998c, P(), J(), N(), c7136g, new j(), oA);
        this.f46355t = true;
        this.f46356u = true;
    }

    private final rd.d I() {
        yd.d dVarB = C7221a.f64999a.b(this.f46336a, this.f46337b);
        if (dVarB != null) {
            return dVarB.c();
        }
        return null;
    }

    public final wd.g J() {
        File filesDir = this.f46336a.getFilesDir();
        AbstractC5504s.g(filesDir, "getFilesDir(...)");
        String string = new Ab.b(this.f46336a).b().toString();
        AbstractC5504s.g(string, "toString(...)");
        return new wd.g(filesDir, string, this.f46337b, this.f46340e, this.f46344i.c());
    }

    private final Ef.a K() {
        Long l10 = this.f46352q;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            Long l11 = this.f46353r;
            if (l11 != null) {
                return Ef.a.k(Ef.c.t(l11.longValue() - jLongValue, Ef.d.f5970d));
            }
        }
        return null;
    }

    public final rd.d L() {
        return this.f46354s.x();
    }

    private final Map M() {
        return this.f46354s.z();
    }

    public final Bd.h N() {
        return Bd.i.a(this.f46337b.q(), this.f46337b);
    }

    private final boolean Q() {
        return this.f46354s.B();
    }

    public final synchronized void R() {
        AbstractC1617k.d(this.f46342g, null, null, new f(null), 3, null);
        this.f46351p = true;
        this.f46353r = Long.valueOf(System.currentTimeMillis());
    }

    private final void S() {
        File filesDir = this.f46336a.getFilesDir();
        AbstractC5504s.g(filesDir, "getFilesDir(...)");
        C7134e.f(new C7134e(filesDir), null, new Function1() { // from class: nd.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return expo.modules.updates.b.T(this.f54116a, (Exception) obj);
            }
        }, 1, null);
    }

    public static final L T(b bVar, Exception exc) {
        if (exc != null) {
            bVar.f46340e.f("UpdatesLogReader: error in purgeLogEntries", exc, EnumC7131b.f64350l);
        }
        return L.f17438a;
    }

    public final void U(boolean z10, InterfaceC6861b.a aVar) {
        this.f46343h.f(new C7361f(this.f46336a, this.f46339d, this.f46337b, this.f46340e, this.f46344i, P(), J(), N(), new InterfaceC5082a() { // from class: nd.b
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return expo.modules.updates.b.V(this.f54117a);
            }
        }, new Function1() { // from class: nd.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return expo.modules.updates.b.W(this.f54118a, (InterfaceC6861b) obj);
            }
        }, z10, k(), aVar, this.f46342g));
    }

    public static final InterfaceC6861b V(b bVar) {
        InterfaceC6861b interfaceC6861bY = bVar.f46354s.y();
        AbstractC5504s.e(interfaceC6861bY);
        return interfaceC6861bY;
    }

    public static final L W(b bVar, InterfaceC6861b currentLauncher) {
        AbstractC5504s.h(currentLauncher, "currentLauncher");
        bVar.f46354s.F(currentLauncher);
        return L.f17438a;
    }

    public final Map O() {
        return this.f46349n;
    }

    public File P() {
        return this.f46338c;
    }

    @Override // expo.modules.updates.c
    public void a(c7.f devSupportManager) {
        AbstractC5504s.h(devSupportManager, "devSupportManager");
        this.f46354s.D(devSupportManager);
    }

    @Override // expo.modules.updates.c
    public String b() {
        AbstractC1615j.b(null, new e(null), 1, null);
        return this.f46354s.w();
    }

    @Override // expo.modules.updates.c
    public String c() {
        return this.f46354s.u();
    }

    @Override // expo.modules.updates.c
    public InterfaceC6765a d() {
        return this.f46341f;
    }

    @Override // expo.modules.updates.c
    public Object e(Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        if (L() != null) {
            U(true, new h(c1627p));
        } else {
            u.a aVar = u.f17466b;
            c1627p.resumeWith(u.b(v.a(new g())));
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    @Override // expo.modules.updates.c
    public boolean f() {
        return this.f46355t;
    }

    @Override // expo.modules.updates.c
    public void g(Map map) throws CodedException {
        d.b bVar = expo.modules.updates.d.f46408u;
        if (bVar.u(this.f46337b.m(), map)) {
            this.f46337b = bVar.i(this.f46336a, this.f46337b, expo.modules.updates.e.f46451c.d(this.f46336a, map));
        } else {
            throw new CodedException("ERR_UPDATES_RUNTIME_OVERRIDE", "Invalid update requestHeaders override: " + map, null);
        }
    }

    @Override // expo.modules.updates.c
    public WeakReference getReactHost() {
        return this.f46348m;
    }

    @Override // expo.modules.updates.c
    public Object h(String str, String str2, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        AbstractC1617k.d(this.f46342g, null, null, new i(str, str2, c1627p, null), 3, null);
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    @Override // expo.modules.updates.c
    public Object i(Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        this.f46343h.f(new C7356a(this.f46336a, this.f46337b, this.f46344i, this.f46340e, J(), N(), L(), new C0737b(c1627p)));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    @Override // expo.modules.updates.c
    public c.C0742c j() {
        return new c.C0742c(L(), K(), I(), this.f46354s.v(), true, Q(), this.f46337b.r(), this.f46337b.e(), this.f46337b.p(), M(), false, this.f46343h.d(), null);
    }

    @Override // expo.modules.updates.c
    public Ad.d k() {
        return this.f46347l;
    }

    @Override // expo.modules.updates.c
    public void l(WeakReference weakReference) {
        AbstractC5504s.h(weakReference, "<set-?>");
        this.f46348m = weakReference;
    }

    @Override // expo.modules.updates.c
    public void m(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        this.f46339d = new WeakReference(reactContext.getCurrentActivity());
    }

    @Override // expo.modules.updates.c
    public void n() {
        this.f46343h.h();
    }

    @Override // expo.modules.updates.c
    public void o(Exception exception) {
        AbstractC5504s.h(exception, "exception");
        this.f46354s.E(exception);
    }

    @Override // expo.modules.updates.c
    public Object p(Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        AbstractC1617k.d(this.f46342g, null, null, new d(c1627p, null), 3, null);
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    @Override // expo.modules.updates.c
    public Object q(Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        this.f46343h.f(new C7359d(this.f46336a, this.f46337b, this.f46340e, this.f46344i, P(), J(), N(), L(), new c(c1627p)));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    @Override // expo.modules.updates.c
    public void r(expo.modules.updates.e eVar) throws CodedException {
        if (!this.f46337b.g()) {
            throw new CodedException("ERR_UPDATES_RUNTIME_OVERRIDE", "Must set disableAntiBrickingMeasures configuration to use updates overriding", null);
        }
        expo.modules.updates.e.f46451c.c(this.f46336a, eVar);
        this.f46337b = expo.modules.updates.d.f46408u.i(this.f46336a, this.f46337b, eVar);
    }

    @Override // expo.modules.updates.c
    public synchronized void start() {
        try {
            if (this.f46350o) {
                return;
            }
            this.f46350o = true;
            this.f46352q = Long.valueOf(System.currentTimeMillis());
            S();
            if (!this.f46337b.k()) {
                C5996a.f55984a.c(this.f46337b, this.f46344i.c());
            }
            this.f46343h.f(this.f46354s);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
