package androidx.compose.foundation;

import Td.L;
import Y.A0;
import Y.J1;
import Y.U1;
import Y.h2;
import ae.AbstractC2605b;
import h0.v;
import h0.y;
import h0.z;
import i0.AbstractC4993l;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import x.EnumC6992L;
import z.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements x {

    /* JADX INFO: renamed from: i */
    public static final c f26348i = new c(null);

    /* JADX INFO: renamed from: j */
    private static final v f26349j = y.e(a.f26358a, b.f26359a);

    /* JADX INFO: renamed from: a */
    private final A0 f26350a;

    /* JADX INFO: renamed from: e */
    private float f26354e;

    /* JADX INFO: renamed from: b */
    private final A0 f26351b = J1.a(0);

    /* JADX INFO: renamed from: c */
    private final B.m f26352c = B.l.a();

    /* JADX INFO: renamed from: d */
    private A0 f26353d = J1.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f */
    private final x f26355f = z.y.a(new f());

    /* JADX INFO: renamed from: g */
    private final h2 f26356g = U1.d(new e());

    /* JADX INFO: renamed from: h */
    private final h2 f26357h = U1.d(new d());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final a f26358a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Integer invoke(z zVar, o oVar) {
            return Integer.valueOf(oVar.m());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final b f26359a = new b();

        b() {
            super(1);
        }

        public final o a(int i10) {
            return new o(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a() {
            return o.f26349j;
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {
        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.m() > 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements InterfaceC5082a {
        e() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.m() < o.this.l());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {
        f() {
            super(1);
        }

        public final Float a(float f10) {
            float fM = o.this.m() + f10 + o.this.f26354e;
            float fL = AbstractC5874j.l(fM, 0.0f, o.this.l());
            boolean z10 = fM == fL;
            float fM2 = fL - o.this.m();
            int iRound = Math.round(fM2);
            o oVar = o.this;
            oVar.o(oVar.m() + iRound);
            o.this.f26354e = fM2 - iRound;
            if (!z10) {
                f10 = fM2;
            }
            return Float.valueOf(f10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public o(int i10) {
        this.f26350a = J1.a(i10);
    }

    public final void o(int i10) {
        this.f26350a.f(i10);
    }

    @Override // z.x
    public boolean a() {
        return this.f26355f.a();
    }

    @Override // z.x
    public Object b(EnumC6992L enumC6992L, Function2 function2, Zd.e eVar) {
        Object objB = this.f26355f.b(enumC6992L, function2, eVar);
        return objB == AbstractC2605b.f() ? objB : L.f17438a;
    }

    @Override // z.x
    public boolean c() {
        return ((Boolean) this.f26357h.getValue()).booleanValue();
    }

    @Override // z.x
    public boolean e() {
        return ((Boolean) this.f26356g.getValue()).booleanValue();
    }

    @Override // z.x
    public float f(float f10) {
        return this.f26355f.f(f10);
    }

    public final B.m k() {
        return this.f26352c;
    }

    public final int l() {
        return this.f26353d.b();
    }

    public final int m() {
        return this.f26350a.b();
    }

    public final void n(int i10) {
        this.f26353d.f(i10);
        AbstractC4993l.a aVar = AbstractC4993l.f48495e;
        AbstractC4993l abstractC4993lD = aVar.d();
        Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
        AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
        try {
            if (m() > i10) {
                o(i10);
            }
            L l10 = L.f17438a;
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
        } catch (Throwable th2) {
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
            throw th2;
        }
    }

    public final void p(int i10) {
        this.f26351b.f(i10);
    }
}
