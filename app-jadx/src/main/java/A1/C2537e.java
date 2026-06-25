package a1;

import E0.InterfaceC1298h;
import U0.T0;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6226h;
import s0.C6356g1;

/* JADX INFO: renamed from: a1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2537e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1298h f23586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2554v f23587b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C2527U f23595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private T0 f23596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC2517J f23597l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C6226h f23599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C6226h f23600o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f23588c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Function1 f23598m = b.f23605a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final CursorAnchorInfo.Builder f23601p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float[] f23602q = C6356g1.c(null, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Matrix f23603r = new Matrix();

    public C2537e(InterfaceC1298h interfaceC1298h, InterfaceC2554v interfaceC2554v) {
        this.f23586a = interfaceC1298h;
        this.f23587b = interfaceC2554v;
    }

    private final void c() {
        if (this.f23587b.b()) {
            this.f23598m.invoke(C6356g1.a(this.f23602q));
            this.f23586a.m(this.f23602q);
            s0.P.a(this.f23603r, this.f23602q);
            InterfaceC2554v interfaceC2554v = this.f23587b;
            CursorAnchorInfo.Builder builder = this.f23601p;
            C2527U c2527u = this.f23595j;
            AbstractC5504s.e(c2527u);
            InterfaceC2517J interfaceC2517J = this.f23597l;
            AbstractC5504s.e(interfaceC2517J);
            T0 t02 = this.f23596k;
            AbstractC5504s.e(t02);
            Matrix matrix = this.f23603r;
            C6226h c6226h = this.f23599n;
            AbstractC5504s.e(c6226h);
            C6226h c6226h2 = this.f23600o;
            AbstractC5504s.e(c6226h2);
            interfaceC2554v.updateCursorAnchorInfo(AbstractC2536d.b(builder, c2527u, interfaceC2517J, t02, matrix, c6226h, c6226h2, this.f23591f, this.f23592g, this.f23593h, this.f23594i));
            this.f23590e = false;
        }
    }

    public final void a() {
        synchronized (this.f23588c) {
            this.f23595j = null;
            this.f23597l = null;
            this.f23596k = null;
            this.f23598m = a.f23604a;
            this.f23599n = null;
            this.f23600o = null;
            Td.L l10 = Td.L.f17438a;
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f23588c) {
            try {
                this.f23591f = z12;
                this.f23592g = z13;
                this.f23593h = z14;
                this.f23594i = z15;
                if (z10) {
                    this.f23590e = true;
                    if (this.f23595j != null) {
                        c();
                    }
                }
                this.f23589d = z11;
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(C2527U c2527u, InterfaceC2517J interfaceC2517J, T0 t02, Function1 function1, C6226h c6226h, C6226h c6226h2) {
        synchronized (this.f23588c) {
            try {
                this.f23595j = c2527u;
                this.f23597l = interfaceC2517J;
                this.f23596k = t02;
                this.f23598m = function1;
                this.f23599n = c6226h;
                this.f23600o = c6226h2;
                if (this.f23590e || this.f23589d) {
                    c();
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a1.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23604a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6356g1) obj).p());
            return Td.L.f17438a;
        }

        public final void a(float[] fArr) {
        }
    }

    /* JADX INFO: renamed from: a1.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23605a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6356g1) obj).p());
            return Td.L.f17438a;
        }

        public final void a(float[] fArr) {
        }
    }
}
