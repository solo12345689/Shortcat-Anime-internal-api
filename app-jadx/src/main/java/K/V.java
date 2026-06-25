package K;

import Ud.AbstractC2279u;
import Y.C0;
import Y.InterfaceC2464z0;
import Y.U1;
import Y.W0;
import h0.AbstractC4893b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f9868f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final h0.v f9869g = AbstractC4893b.b(a.f9875a, b.f9876a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2464z0 f9870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2464z0 f9871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C6226h f9872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0 f9874e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9875a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(h0.z zVar, V v10) {
            return AbstractC2279u.p(Float.valueOf(v10.d()), Boolean.valueOf(v10.f() == z.q.Vertical));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9876a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V invoke(List list) {
            Object obj = list.get(1);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
            z.q qVar = ((Boolean) obj).booleanValue() ? z.q.Vertical : z.q.Horizontal;
            Object obj2 = list.get(0);
            AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new V(qVar, ((Float) obj2).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h0.v a() {
            return V.f9869g;
        }

        private c() {
        }
    }

    public V(z.q qVar, float f10) {
        this.f9870a = W0.a(f10);
        this.f9871b = W0.a(0.0f);
        this.f9872c = C6226h.f58334e.a();
        this.f9873d = U0.W0.f18785b.a();
        this.f9874e = U1.h(qVar, U1.q());
    }

    private final void g(float f10) {
        this.f9871b.k(f10);
    }

    public final void b(float f10, float f11, int i10) {
        float fD = d();
        float f12 = i10;
        float f13 = fD + f12;
        h(d() + ((f11 <= f13 && (f10 >= fD || f11 - f10 <= f12)) ? (f10 >= fD || f11 - f10 > f12) ? 0.0f : f10 - fD : f11 - f13));
    }

    public final float c() {
        return this.f9871b.c();
    }

    public final float d() {
        return this.f9870a.c();
    }

    public final int e(long j10) {
        return U0.W0.n(j10) != U0.W0.n(this.f9873d) ? U0.W0.n(j10) : U0.W0.i(j10) != U0.W0.i(this.f9873d) ? U0.W0.i(j10) : U0.W0.l(j10);
    }

    public final z.q f() {
        return (z.q) this.f9874e.getValue();
    }

    public final void h(float f10) {
        this.f9870a.k(f10);
    }

    public final void i(long j10) {
        this.f9873d = j10;
    }

    public final void j(z.q qVar, C6226h c6226h, int i10, int i11) {
        float f10 = i11 - i10;
        g(f10);
        if (c6226h.i() != this.f9872c.i() || c6226h.l() != this.f9872c.l()) {
            boolean z10 = qVar == z.q.Vertical;
            b(z10 ? c6226h.l() : c6226h.i(), z10 ? c6226h.e() : c6226h.j(), i10);
            this.f9872c = c6226h;
        }
        h(AbstractC5874j.l(d(), 0.0f, f10));
    }

    public /* synthetic */ V(z.q qVar, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, (i10 & 2) != 0 ? 0.0f : f10);
    }
}
