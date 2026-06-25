package x;

import E0.InterfaceC1292b;
import E0.V;
import Y.C0;
import Y.U1;
import ae.AbstractC2605b;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import i1.AbstractC5026s;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6225g;
import r0.AbstractC6231m;
import r0.C6224f;
import r0.C6230l;
import s0.AbstractC6387s0;

/* JADX INFO: renamed from: x.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7003a implements InterfaceC6999T {

    /* JADX INFO: renamed from: a */
    private C6224f f63300a;

    /* JADX INFO: renamed from: b */
    private final C7025w f63301b;

    /* JADX INFO: renamed from: c */
    private final C0 f63302c;

    /* JADX INFO: renamed from: d */
    private boolean f63303d;

    /* JADX INFO: renamed from: e */
    private boolean f63304e;

    /* JADX INFO: renamed from: f */
    private long f63305f;

    /* JADX INFO: renamed from: g */
    private E0.B f63306g;

    /* JADX INFO: renamed from: h */
    private final androidx.compose.ui.e f63307h;

    /* JADX INFO: renamed from: x.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0954a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f63308a;

        /* JADX INFO: renamed from: b */
        long f63309b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f63310c;

        /* JADX INFO: renamed from: e */
        int f63312e;

        C0954a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63310c = obj;
            this.f63312e |= Integer.MIN_VALUE;
            return C7003a.this.d(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: x.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f63313a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f63314b;

        /* JADX INFO: renamed from: x.a$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0955a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: a */
            int f63316a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Object f63317b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C7003a f63318c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0955a(C7003a c7003a, Zd.e eVar) {
                super(2, eVar);
                this.f63318c = c7003a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                C0955a c0955a = new C0955a(this.f63318c, eVar);
                c0955a.f63317b = obj;
                return c0955a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC1292b interfaceC1292b, Zd.e eVar) {
                return ((C0955a) create(interfaceC1292b, eVar)).invokeSuspend(Td.L.f17438a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:61:0x0066, code lost:
            
                if (r14 != r0) goto L63;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0066 -> B:63:0x0069). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instruction units count: 234
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: x.C7003a.b.C0955a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = C7003a.this.new b(eVar);
            bVar.f63314b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E0.L l10, Zd.e eVar) {
            return ((b) create(l10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f63313a;
            if (i10 == 0) {
                Td.v.b(obj);
                E0.L l10 = (E0.L) this.f63314b;
                C0955a c0955a = new C0955a(C7003a.this, null);
                this.f63313a = 1;
                if (z.o.c(l10, c0955a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: x.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC5506u implements Function1 {
        public c() {
            super(1);
        }

        public final void a(V0 v02) {
            v02.d("overscroll");
            v02.e(C7003a.this);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: x.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC5506u implements Function1 {
        public d() {
            super(1);
        }

        public final void a(V0 v02) {
            v02.d("overscroll");
            v02.e(C7003a.this);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return Td.L.f17438a;
        }
    }

    public C7003a(Context context, C6997Q c6997q) {
        androidx.compose.ui.e c7017o;
        C7025w c7025w = new C7025w(context, AbstractC6387s0.k(c6997q.b()));
        this.f63301b = c7025w;
        Td.L l10 = Td.L.f17438a;
        this.f63302c = U1.h(l10, U1.j());
        this.f63303d = true;
        this.f63305f = C6230l.f58350b.b();
        androidx.compose.ui.e eVarThen = androidx.compose.ui.e.f26613a.then(new SuspendPointerInputElement(l10, null, null, new V.a(new b(null)), 6, null));
        if (Build.VERSION.SDK_INT >= 31) {
            c7017o = new C7023u(this, c7025w, T0.b() ? new c() : T0.a());
        } else {
            c7017o = new C7017o(this, c7025w, c6997q, T0.b() ? new d() : T0.a());
        }
        this.f63307h = eVarThen.then(c7017o);
    }

    private final void h() {
        boolean zIsFinished;
        C7025w c7025w = this.f63301b;
        EdgeEffect edgeEffect = c7025w.f63381d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = c7025w.f63382e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = c7025w.f63383f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = c7025w.f63384g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            k();
        }
    }

    private final float l(long j10) {
        float fM = C6224f.m(i());
        float fN = C6224f.n(j10) / C6230l.g(this.f63305f);
        EdgeEffect edgeEffectF = this.f63301b.f();
        C7024v c7024v = C7024v.f63377a;
        return c7024v.b(edgeEffectF) == 0.0f ? (-c7024v.d(edgeEffectF, -fN, 1 - fM)) * C6230l.g(this.f63305f) : C6224f.n(j10);
    }

    private final float m(long j10) {
        float fN = C6224f.n(i());
        float fM = C6224f.m(j10) / C6230l.i(this.f63305f);
        EdgeEffect edgeEffectH = this.f63301b.h();
        C7024v c7024v = C7024v.f63377a;
        return c7024v.b(edgeEffectH) == 0.0f ? c7024v.d(edgeEffectH, fM, 1 - fN) * C6230l.i(this.f63305f) : C6224f.m(j10);
    }

    private final float n(long j10) {
        float fN = C6224f.n(i());
        float fM = C6224f.m(j10) / C6230l.i(this.f63305f);
        EdgeEffect edgeEffectJ = this.f63301b.j();
        C7024v c7024v = C7024v.f63377a;
        return c7024v.b(edgeEffectJ) == 0.0f ? (-c7024v.d(edgeEffectJ, -fM, fN)) * C6230l.i(this.f63305f) : C6224f.m(j10);
    }

    private final float o(long j10) {
        float fM = C6224f.m(i());
        float fN = C6224f.n(j10) / C6230l.g(this.f63305f);
        EdgeEffect edgeEffectL = this.f63301b.l();
        C7024v c7024v = C7024v.f63377a;
        return c7024v.b(edgeEffectL) == 0.0f ? c7024v.d(edgeEffectL, fN, fM) * C6230l.g(this.f63305f) : C6224f.n(j10);
    }

    private final boolean p(long j10) {
        boolean z10;
        if (!this.f63301b.r() || C6224f.m(j10) >= 0.0f) {
            z10 = false;
        } else {
            C7024v.f63377a.e(this.f63301b.h(), C6224f.m(j10));
            z10 = !this.f63301b.r();
        }
        if (this.f63301b.u() && C6224f.m(j10) > 0.0f) {
            C7024v.f63377a.e(this.f63301b.j(), C6224f.m(j10));
            z10 = z10 || !this.f63301b.u();
        }
        if (this.f63301b.y() && C6224f.n(j10) < 0.0f) {
            C7024v.f63377a.e(this.f63301b.l(), C6224f.n(j10));
            z10 = z10 || !this.f63301b.y();
        }
        if (!this.f63301b.o() || C6224f.n(j10) <= 0.0f) {
            return z10;
        }
        C7024v.f63377a.e(this.f63301b.f(), C6224f.n(j10));
        return z10 || !this.f63301b.o();
    }

    private final boolean q() {
        boolean z10;
        if (this.f63301b.t()) {
            m(C6224f.f58329b.c());
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f63301b.w()) {
            n(C6224f.f58329b.c());
            z10 = true;
        }
        if (this.f63301b.A()) {
            o(C6224f.f58329b.c());
            z10 = true;
        }
        if (!this.f63301b.q()) {
            return z10;
        }
        l(C6224f.f58329b.c());
        return true;
    }

    @Override // x.InterfaceC6999T
    public boolean a() {
        C7025w c7025w = this.f63301b;
        EdgeEffect edgeEffect = c7025w.f63381d;
        if (edgeEffect != null && C7024v.f63377a.b(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = c7025w.f63382e;
        if (edgeEffect2 != null && C7024v.f63377a.b(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = c7025w.f63383f;
        if (edgeEffect3 != null && C7024v.f63377a.b(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = c7025w.f63384g;
        return (edgeEffect4 == null || C7024v.f63377a.b(edgeEffect4) == 0.0f) ? false : true;
    }

    @Override // x.InterfaceC6999T
    public androidx.compose.ui.e b() {
        return this.f63307h;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x002a  */
    @Override // x.InterfaceC6999T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long c(long r11, int r13, kotlin.jvm.functions.Function1 r14) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C7003a.c(long, int, kotlin.jvm.functions.Function1):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0055, code lost:
    
        if (r13.invoke(r11, r0) == r1) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0013  */
    @Override // x.InterfaceC6999T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(long r11, kotlin.jvm.functions.Function2 r13, Zd.e r14) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C7003a.d(long, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }

    public final long i() {
        C6224f c6224f = this.f63300a;
        long jU = c6224f != null ? c6224f.u() : AbstractC6231m.b(this.f63305f);
        return AbstractC6225g.a(C6224f.m(jU) / C6230l.i(this.f63305f), C6224f.n(jU) / C6230l.g(this.f63305f));
    }

    public final C0 j() {
        return this.f63302c;
    }

    public final void k() {
        if (this.f63303d) {
            this.f63302c.setValue(Td.L.f17438a);
        }
    }

    public final void r(long j10) {
        boolean zF = C6230l.f(this.f63305f, C6230l.f58350b.b());
        boolean zF2 = C6230l.f(j10, this.f63305f);
        this.f63305f = j10;
        if (!zF2) {
            this.f63301b.B(AbstractC5026s.a(AbstractC5466a.d(C6230l.i(j10)), AbstractC5466a.d(C6230l.g(j10))));
        }
        if (zF || zF2) {
            return;
        }
        k();
        h();
    }
}
