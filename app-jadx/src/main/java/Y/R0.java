package Y;

import Td.C2160k;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class R0 implements Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f22179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC2460y f22180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2442s f22181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f22182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2398d f22184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f22185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AtomicReference f22186h = new AtomicReference(S0.f22199c);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t.e0 f22187i = t.f0.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g0.q f22188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C2441r1 f22189k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22190a;

        static {
            int[] iArr = new int[S0.values().length];
            try {
                iArr[S0.f22199c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S0.f22200d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S0.f22201e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[S0.f22202f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[S0.f22203g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[S0.f22198b.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[S0.f22197a.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f22190a = iArr;
        }
    }

    public R0(B b10, AbstractC2460y abstractC2460y, C2442s c2442s, Set set, Function2 function2, boolean z10, InterfaceC2398d interfaceC2398d, Object obj) {
        this.f22179a = b10;
        this.f22180b = abstractC2460y;
        this.f22181c = c2442s;
        this.f22182d = function2;
        this.f22183e = z10;
        this.f22184f = interfaceC2398d;
        this.f22185g = obj;
        g0.q qVar = new g0.q();
        qVar.r(set, c2442s.K0());
        this.f22188j = qVar;
        this.f22189k = new C2441r1(interfaceC2398d.a());
    }

    private final void b() {
        synchronized (this.f22185g) {
            try {
                C2441r1 c2441r1 = this.f22189k;
                InterfaceC2398d interfaceC2398d = this.f22184f;
                AbstractC5504s.f(interfaceC2398d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                c2441r1.l(interfaceC2398d, this.f22188j);
                this.f22188j.m();
                this.f22188j.n();
                this.f22188j.j();
                this.f22179a.T(null);
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                this.f22188j.j();
                this.f22179a.T(null);
                throw th2;
            }
        }
    }

    private final void f() {
        S0 s02 = S0.f22200d;
        S0 s03 = S0.f22202f;
        if (w.Y.a(this.f22186h, s02, s03)) {
            return;
        }
        V0.b("Unexpected state change from: " + s02 + " to: " + s03 + com.amazon.a.a.o.c.a.b.f34706a);
    }

    @Override // Y.Q0
    public boolean a(C1 c12) throws Exception {
        try {
            switch (a.f22190a[((S0) this.f22186h.get()).ordinal()]) {
                case 1:
                    if (this.f22183e) {
                        this.f22181c.z1();
                    }
                    try {
                        this.f22187i = this.f22180b.b(this.f22179a, c12, this.f22182d);
                        S0 s02 = S0.f22199c;
                        S0 s03 = S0.f22200d;
                        if (!w.Y.a(this.f22186h, s02, s03)) {
                            V0.b("Unexpected state change from: " + s02 + " to: " + s03 + com.amazon.a.a.o.c.a.b.f34706a);
                        }
                        if (this.f22187i.d()) {
                            f();
                        }
                        return isComplete();
                    } finally {
                        if (this.f22183e) {
                            this.f22181c.x0();
                        }
                    }
                case 2:
                    S0 s04 = S0.f22200d;
                    S0 s05 = S0.f22201e;
                    if (!w.Y.a(this.f22186h, s04, s05)) {
                        V0.b("Unexpected state change from: " + s04 + " to: " + s05 + com.amazon.a.a.o.c.a.b.f34706a);
                    }
                    try {
                        this.f22187i = this.f22180b.o(this.f22179a, c12, this.f22187i);
                        if (!w.Y.a(this.f22186h, s05, s04)) {
                            V0.b("Unexpected state change from: " + s05 + " to: " + s04 + com.amazon.a.a.o.c.a.b.f34706a);
                        }
                        if (this.f22187i.d()) {
                            f();
                        }
                        return isComplete();
                    } catch (Throwable th2) {
                        S0 s06 = S0.f22201e;
                        S0 s07 = S0.f22200d;
                        if (!w.Y.a(this.f22186h, s06, s07)) {
                            V0.b("Unexpected state change from: " + s06 + " to: " + s07 + com.amazon.a.a.o.c.a.b.f34706a);
                        }
                        throw th2;
                    }
                case 3:
                    AbstractC2454w.u("Recursive call to resume()");
                    throw new C2160k();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new Td.r();
            }
        } catch (Exception e10) {
            this.f22186h.set(S0.f22197a);
            throw e10;
        }
    }

    @Override // Y.Q0
    public void apply() throws Exception {
        try {
            switch (a.f22190a[((S0) this.f22186h.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    b();
                    S0 s02 = S0.f22202f;
                    S0 s03 = S0.f22203g;
                    if (w.Y.a(this.f22186h, s02, s03)) {
                        return;
                    }
                    V0.b("Unexpected state change from: " + s02 + " to: " + s03 + com.amazon.a.a.o.c.a.b.f34706a);
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new Td.r();
            }
        } catch (Exception e10) {
            this.f22186h.set(S0.f22197a);
            throw e10;
        }
    }

    public final C2441r1 c() {
        return this.f22189k;
    }

    @Override // Y.Q0
    public void cancel() {
        this.f22186h.set(S0.f22198b);
        t.e0 e0VarO = this.f22188j.o();
        this.f22188j.j();
        this.f22179a.T(e0VarO);
    }

    public final g0.q d() {
        return this.f22188j;
    }

    public final boolean e() {
        return this.f22186h.get() == S0.f22201e;
    }

    public final void g() {
        Object obj = this.f22186h.get();
        S0 s02 = S0.f22200d;
        if (obj == s02) {
            return;
        }
        S0 s03 = S0.f22202f;
        if (w.Y.a(this.f22186h, s03, s02)) {
            return;
        }
        V0.b("Unexpected state change from: " + s03 + " to: " + s02 + com.amazon.a.a.o.c.a.b.f34706a);
    }

    @Override // Y.Q0
    public boolean isComplete() {
        return ((S0) this.f22186h.get()).compareTo(S0.f22202f) >= 0;
    }
}
