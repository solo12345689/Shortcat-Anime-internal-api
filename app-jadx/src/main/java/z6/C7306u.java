package z6;

import Ud.a0;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.adjust.sdk.Constants;
import com.facebook.imagepipeline.producers.X;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u5.InterfaceC6739a;
import x6.C7055A;
import x6.C7058c;
import x6.InterfaceC7056a;
import x6.n;
import x6.x;
import z6.x;

/* JADX INFO: renamed from: z6.u */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7306u implements InterfaceC7307v {

    /* JADX INFO: renamed from: M */
    public static final b f65758M = new b(null);

    /* JADX INFO: renamed from: N */
    private static c f65759N = new c();

    /* JADX INFO: renamed from: A */
    private final Set f65760A;

    /* JADX INFO: renamed from: B */
    private final Set f65761B;

    /* JADX INFO: renamed from: C */
    private final boolean f65762C;

    /* JADX INFO: renamed from: D */
    private final t5.d f65763D;

    /* JADX INFO: renamed from: E */
    private final x f65764E;

    /* JADX INFO: renamed from: F */
    private final boolean f65765F;

    /* JADX INFO: renamed from: G */
    private final B6.a f65766G;

    /* JADX INFO: renamed from: H */
    private final x6.x f65767H;

    /* JADX INFO: renamed from: I */
    private final x6.x f65768I;

    /* JADX INFO: renamed from: J */
    private final w5.g f65769J;

    /* JADX INFO: renamed from: K */
    private final InterfaceC7056a f65770K;

    /* JADX INFO: renamed from: L */
    private final Map f65771L;

    /* JADX INFO: renamed from: a */
    private final Bitmap.Config f65772a;

    /* JADX INFO: renamed from: b */
    private final y5.n f65773b;

    /* JADX INFO: renamed from: c */
    private final x.a f65774c;

    /* JADX INFO: renamed from: d */
    private final x.a f65775d;

    /* JADX INFO: renamed from: e */
    private final n.b f65776e;

    /* JADX INFO: renamed from: f */
    private final x6.k f65777f;

    /* JADX INFO: renamed from: g */
    private final Context f65778g;

    /* JADX INFO: renamed from: h */
    private final EnumC7300n f65779h;

    /* JADX INFO: renamed from: i */
    private final y5.n f65780i;

    /* JADX INFO: renamed from: j */
    private final y5.n f65781j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC7302p f65782k;

    /* JADX INFO: renamed from: l */
    private final x6.t f65783l;

    /* JADX INFO: renamed from: m */
    private final C6.c f65784m;

    /* JADX INFO: renamed from: n */
    private final M6.d f65785n;

    /* JADX INFO: renamed from: o */
    private final y5.n f65786o;

    /* JADX INFO: renamed from: p */
    private final Integer f65787p;

    /* JADX INFO: renamed from: q */
    private final y5.n f65788q;

    /* JADX INFO: renamed from: r */
    private final t5.d f65789r;

    /* JADX INFO: renamed from: s */
    private final B5.d f65790s;

    /* JADX INFO: renamed from: t */
    private final int f65791t;

    /* JADX INFO: renamed from: u */
    private final X f65792u;

    /* JADX INFO: renamed from: v */
    private final int f65793v;

    /* JADX INFO: renamed from: w */
    private final w6.d f65794w;

    /* JADX INFO: renamed from: x */
    private final H6.D f65795x;

    /* JADX INFO: renamed from: y */
    private final C6.e f65796y;

    /* JADX INFO: renamed from: z */
    private final Set f65797z;

    /* JADX INFO: renamed from: z6.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: A */
        private boolean f65798A;

        /* JADX INFO: renamed from: B */
        private t5.d f65799B;

        /* JADX INFO: renamed from: C */
        private InterfaceC7303q f65800C;

        /* JADX INFO: renamed from: D */
        private y5.n f65801D;

        /* JADX INFO: renamed from: E */
        private int f65802E;

        /* JADX INFO: renamed from: F */
        private final x.a f65803F;

        /* JADX INFO: renamed from: G */
        private boolean f65804G;

        /* JADX INFO: renamed from: H */
        private B6.a f65805H;

        /* JADX INFO: renamed from: I */
        private x6.x f65806I;

        /* JADX INFO: renamed from: J */
        private x6.x f65807J;

        /* JADX INFO: renamed from: K */
        private w5.g f65808K;

        /* JADX INFO: renamed from: L */
        private InterfaceC7056a f65809L;

        /* JADX INFO: renamed from: M */
        private Map f65810M;

        /* JADX INFO: renamed from: a */
        private Bitmap.Config f65811a;

        /* JADX INFO: renamed from: b */
        private y5.n f65812b;

        /* JADX INFO: renamed from: c */
        private n.b f65813c;

        /* JADX INFO: renamed from: d */
        private x.a f65814d;

        /* JADX INFO: renamed from: e */
        private x.a f65815e;

        /* JADX INFO: renamed from: f */
        private x6.k f65816f;

        /* JADX INFO: renamed from: g */
        private final Context f65817g;

        /* JADX INFO: renamed from: h */
        private EnumC7300n f65818h;

        /* JADX INFO: renamed from: i */
        private y5.n f65819i;

        /* JADX INFO: renamed from: j */
        private InterfaceC7302p f65820j;

        /* JADX INFO: renamed from: k */
        private x6.t f65821k;

        /* JADX INFO: renamed from: l */
        private C6.c f65822l;

        /* JADX INFO: renamed from: m */
        private y5.n f65823m;

        /* JADX INFO: renamed from: n */
        private M6.d f65824n;

        /* JADX INFO: renamed from: o */
        private Integer f65825o;

        /* JADX INFO: renamed from: p */
        private y5.n f65826p;

        /* JADX INFO: renamed from: q */
        private t5.d f65827q;

        /* JADX INFO: renamed from: r */
        private B5.d f65828r;

        /* JADX INFO: renamed from: s */
        private Integer f65829s;

        /* JADX INFO: renamed from: t */
        private X f65830t;

        /* JADX INFO: renamed from: u */
        private w6.d f65831u;

        /* JADX INFO: renamed from: v */
        private H6.D f65832v;

        /* JADX INFO: renamed from: w */
        private C6.e f65833w;

        /* JADX INFO: renamed from: x */
        private Set f65834x;

        /* JADX INFO: renamed from: y */
        private Set f65835y;

        /* JADX INFO: renamed from: z */
        private Set f65836z;

        public a(Context context) {
            AbstractC5504s.h(context, "context");
            this.f65818h = EnumC7300n.f65735b;
            this.f65798A = true;
            this.f65802E = -1;
            this.f65803F = new x.a(this);
            this.f65804G = true;
            this.f65805H = new B6.b();
            this.f65817g = context;
        }

        public final C6.c A() {
            return this.f65822l;
        }

        public final C6.d B() {
            return null;
        }

        public final M6.d C() {
            return this.f65824n;
        }

        public final Integer D() {
            return this.f65825o;
        }

        public final t5.d E() {
            return this.f65827q;
        }

        public final Integer F() {
            return this.f65829s;
        }

        public final B5.d G() {
            return this.f65828r;
        }

        public final X H() {
            return this.f65830t;
        }

        public final w6.d I() {
            return this.f65831u;
        }

        public final H6.D J() {
            return this.f65832v;
        }

        public final C6.e K() {
            return this.f65833w;
        }

        public final Set L() {
            return this.f65835y;
        }

        public final Set M() {
            return this.f65834x;
        }

        public final boolean N() {
            return this.f65798A;
        }

        public final w5.g O() {
            return this.f65808K;
        }

        public final t5.d P() {
            return this.f65799B;
        }

        public final y5.n Q() {
            return this.f65826p;
        }

        public final a R(EnumC7300n downsampleMode) {
            AbstractC5504s.h(downsampleMode, "downsampleMode");
            this.f65818h = downsampleMode;
            return this;
        }

        public final a S(X x10) {
            this.f65830t = x10;
            return this;
        }

        public final a T(Set set) {
            this.f65834x = set;
            return this;
        }

        public final C7306u a() {
            return new C7306u(this, null);
        }

        public final x.a b() {
            return this.f65803F;
        }

        public final Bitmap.Config c() {
            return this.f65811a;
        }

        public final x6.x d() {
            return this.f65806I;
        }

        public final n.b e() {
            return this.f65813c;
        }

        public final InterfaceC7056a f() {
            return this.f65809L;
        }

        public final y5.n g() {
            return this.f65812b;
        }

        public final x.a h() {
            return this.f65814d;
        }

        public final x6.k i() {
            return this.f65816f;
        }

        public final InterfaceC6739a j() {
            return null;
        }

        public final B6.a k() {
            return this.f65805H;
        }

        public final Context l() {
            return this.f65817g;
        }

        public final Set m() {
            return this.f65836z;
        }

        public final boolean n() {
            return this.f65804G;
        }

        public final y5.n o() {
            return this.f65801D;
        }

        public final EnumC7300n p() {
            return this.f65818h;
        }

        public final Map q() {
            return this.f65810M;
        }

        public final y5.n r() {
            return this.f65823m;
        }

        public final x6.x s() {
            return this.f65807J;
        }

        public final y5.n t() {
            return this.f65819i;
        }

        public final x.a u() {
            return this.f65815e;
        }

        public final InterfaceC7302p v() {
            return this.f65820j;
        }

        public final x.a w() {
            return this.f65803F;
        }

        public final InterfaceC7303q x() {
            return this.f65800C;
        }

        public final int y() {
            return this.f65802E;
        }

        public final x6.t z() {
            return this.f65821k;
        }
    }

    /* JADX INFO: renamed from: z6.u$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t5.d f(Context context) {
            t5.d dVarN;
            if (L6.b.d()) {
                L6.b.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
                try {
                    dVarN = t5.d.m(context).n();
                } finally {
                    L6.b.b();
                }
            } else {
                dVarN = t5.d.m(context).n();
            }
            AbstractC5504s.g(dVarN, "traceSection(...)");
            return dVarN;
        }

        public final M6.d g(a aVar) {
            if (aVar.C() == null || aVar.D() == null) {
                return aVar.C();
            }
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        }

        public final int h(a aVar, x xVar) {
            Integer numF = aVar.F();
            if (numF != null) {
                return numF.intValue();
            }
            if (xVar.n() == 2 && Build.VERSION.SDK_INT >= 27) {
                return 2;
            }
            if (xVar.n() == 1) {
                return 1;
            }
            xVar.n();
            return 0;
        }

        public final void j(H5.b bVar, x xVar, H5.a aVar) {
            H5.c.f7926c = bVar;
            xVar.z();
            if (aVar != null) {
                bVar.b(aVar);
            }
        }

        public final c e() {
            return C7306u.f65759N;
        }

        public final a i(Context context) {
            AbstractC5504s.h(context, "context");
            return new a(context);
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: z6.u$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private boolean f65837a;

        public final boolean a() {
            return this.f65837a;
        }
    }

    public /* synthetic */ C7306u(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public static final c J() {
        return f65758M.e();
    }

    public static final a K(Context context) {
        return f65758M.i(context);
    }

    @Override // z6.InterfaceC7307v
    public Set A() {
        return this.f65761B;
    }

    @Override // z6.InterfaceC7307v
    public x6.t B() {
        return this.f65783l;
    }

    @Override // z6.InterfaceC7307v
    public y5.n C() {
        return this.f65788q;
    }

    @Override // z6.InterfaceC7307v
    public B5.d D() {
        return this.f65790s;
    }

    @Override // z6.InterfaceC7307v
    public EnumC7300n E() {
        return this.f65779h;
    }

    @Override // z6.InterfaceC7307v
    public InterfaceC6739a F() {
        return null;
    }

    @Override // z6.InterfaceC7307v
    public x G() {
        return this.f65764E;
    }

    @Override // z6.InterfaceC7307v
    public InterfaceC7302p H() {
        return this.f65782k;
    }

    @Override // z6.InterfaceC7307v
    public Set a() {
        return this.f65760A;
    }

    @Override // z6.InterfaceC7307v
    public X b() {
        return this.f65792u;
    }

    @Override // z6.InterfaceC7307v
    public x6.x c() {
        return this.f65768I;
    }

    @Override // z6.InterfaceC7307v
    public t5.d d() {
        return this.f65789r;
    }

    @Override // z6.InterfaceC7307v
    public Set e() {
        return this.f65797z;
    }

    @Override // z6.InterfaceC7307v
    public x.a f() {
        return this.f65775d;
    }

    @Override // z6.InterfaceC7307v
    public x.a g() {
        return this.f65774c;
    }

    @Override // z6.InterfaceC7307v
    public Context getContext() {
        return this.f65778g;
    }

    @Override // z6.InterfaceC7307v
    public C6.e h() {
        return this.f65796y;
    }

    @Override // z6.InterfaceC7307v
    public Map i() {
        return this.f65771L;
    }

    @Override // z6.InterfaceC7307v
    public t5.d j() {
        return this.f65763D;
    }

    @Override // z6.InterfaceC7307v
    public n.b k() {
        return this.f65776e;
    }

    @Override // z6.InterfaceC7307v
    public w5.g l() {
        return this.f65769J;
    }

    @Override // z6.InterfaceC7307v
    public Integer m() {
        return this.f65787p;
    }

    @Override // z6.InterfaceC7307v
    public M6.d n() {
        return this.f65785n;
    }

    @Override // z6.InterfaceC7307v
    public C6.d o() {
        return null;
    }

    @Override // z6.InterfaceC7307v
    public boolean p() {
        return this.f65765F;
    }

    @Override // z6.InterfaceC7307v
    public y5.n q() {
        return this.f65773b;
    }

    @Override // z6.InterfaceC7307v
    public C6.c r() {
        return this.f65784m;
    }

    @Override // z6.InterfaceC7307v
    public y5.n s() {
        return this.f65781j;
    }

    @Override // z6.InterfaceC7307v
    public H6.D t() {
        return this.f65795x;
    }

    @Override // z6.InterfaceC7307v
    public int u() {
        return this.f65791t;
    }

    @Override // z6.InterfaceC7307v
    public y5.n v() {
        return this.f65780i;
    }

    @Override // z6.InterfaceC7307v
    public B6.a w() {
        return this.f65766G;
    }

    @Override // z6.InterfaceC7307v
    public InterfaceC7056a x() {
        return this.f65770K;
    }

    @Override // z6.InterfaceC7307v
    public x6.k y() {
        return this.f65777f;
    }

    @Override // z6.InterfaceC7307v
    public boolean z() {
        return this.f65762C;
    }

    private C7306u(a aVar) {
        X xH;
        if (L6.b.d()) {
            L6.b.a("ImagePipelineConfig()");
        }
        this.f65764E = aVar.w().c();
        y5.n nVarG = aVar.g();
        if (nVarG == null) {
            Object systemService = aVar.l().getSystemService("activity");
            if (systemService == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            nVarG = new x6.o((ActivityManager) systemService);
        }
        this.f65773b = nVarG;
        x.a aVarH = aVar.h();
        this.f65774c = aVarH == null ? new C7058c() : aVarH;
        x.a aVarU = aVar.u();
        this.f65775d = aVarU == null ? new C7055A() : aVarU;
        this.f65776e = aVar.e();
        Bitmap.Config configC = aVar.c();
        this.f65772a = configC == null ? Bitmap.Config.ARGB_8888 : configC;
        x6.k kVarI = aVar.i();
        if (kVarI == null) {
            kVarI = x6.p.f();
            AbstractC5504s.g(kVarI, "getInstance(...)");
        }
        this.f65777f = kVarI;
        Context contextL = aVar.l();
        if (contextL == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f65778g = contextL;
        this.f65779h = aVar.p();
        y5.n nVarT = aVar.t();
        this.f65781j = nVarT == null ? new x6.q() : nVarT;
        x6.t tVarZ = aVar.z();
        if (tVarZ == null) {
            tVarZ = x6.B.o();
            AbstractC5504s.g(tVarZ, "getInstance(...)");
        }
        this.f65783l = tVarZ;
        this.f65784m = aVar.A();
        y5.n BOOLEAN_FALSE = aVar.r();
        if (BOOLEAN_FALSE == null) {
            BOOLEAN_FALSE = y5.o.f64829b;
            AbstractC5504s.g(BOOLEAN_FALSE, "BOOLEAN_FALSE");
        }
        this.f65786o = BOOLEAN_FALSE;
        b bVar = f65758M;
        this.f65785n = bVar.g(aVar);
        this.f65787p = aVar.D();
        y5.n BOOLEAN_TRUE = aVar.Q();
        if (BOOLEAN_TRUE == null) {
            BOOLEAN_TRUE = y5.o.f64828a;
            AbstractC5504s.g(BOOLEAN_TRUE, "BOOLEAN_TRUE");
        }
        this.f65788q = BOOLEAN_TRUE;
        t5.d dVarE = aVar.E();
        this.f65789r = dVarE == null ? bVar.f(aVar.l()) : dVarE;
        B5.d dVarG = aVar.G();
        if (dVarG == null) {
            dVarG = B5.e.b();
            AbstractC5504s.g(dVarG, "getInstance(...)");
        }
        this.f65790s = dVarG;
        this.f65791t = bVar.h(aVar, G());
        int iY = aVar.y() < 0 ? Constants.CONNECTION_TIMEOUT_VERIFY : aVar.y();
        this.f65793v = iY;
        if (L6.b.d()) {
            L6.b.a("ImagePipelineConfig->mNetworkFetcher");
            try {
                xH = aVar.H();
                xH = xH == null ? new com.facebook.imagepipeline.producers.D(iY) : xH;
            } finally {
                L6.b.b();
            }
        } else {
            xH = aVar.H();
            if (xH == null) {
                xH = new com.facebook.imagepipeline.producers.D(iY);
            }
        }
        this.f65792u = xH;
        this.f65794w = aVar.I();
        H6.D dJ = aVar.J();
        this.f65795x = dJ == null ? new H6.D(H6.B.n().m()) : dJ;
        C6.e eVarK = aVar.K();
        this.f65796y = eVarK == null ? new C6.g() : eVarK;
        Set setM = aVar.M();
        this.f65797z = setM == null ? a0.d() : setM;
        Set setL = aVar.L();
        this.f65760A = setL == null ? a0.d() : setL;
        Set setM2 = aVar.m();
        this.f65761B = setM2 == null ? a0.d() : setM2;
        this.f65762C = aVar.N();
        t5.d dVarP = aVar.P();
        this.f65763D = dVarP == null ? d() : dVarP;
        aVar.B();
        int iE = t().e();
        InterfaceC7302p interfaceC7302pV = aVar.v();
        this.f65782k = interfaceC7302pV == null ? new C7288b(iE) : interfaceC7302pV;
        this.f65765F = aVar.n();
        aVar.j();
        this.f65766G = aVar.k();
        this.f65767H = aVar.d();
        InterfaceC7056a interfaceC7056aF = aVar.f();
        this.f65770K = interfaceC7056aF == null ? new x6.l() : interfaceC7056aF;
        this.f65768I = aVar.s();
        this.f65769J = aVar.O();
        this.f65771L = aVar.q();
        y5.n nVarO = aVar.o();
        if (nVarO == null) {
            InterfaceC7303q interfaceC7303qX = aVar.x();
            nVarO = new C7297k(interfaceC7303qX == null ? new C7298l(new C7301o()) : interfaceC7303qX, this);
        }
        this.f65780i = nVarO;
        H5.b bVarY = G().y();
        if (bVarY != null) {
            bVar.j(bVarY, G(), new w6.c(t()));
        }
        if (L6.b.d()) {
        }
    }
}
