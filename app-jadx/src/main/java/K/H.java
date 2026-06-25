package K;

import U0.C2197e;
import U0.C2215n;
import U0.C2221q;
import U0.S0;
import U0.T0;
import U0.Y0;
import U0.Z0;
import Ud.AbstractC2279u;
import Y0.AbstractC2485u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5010c;
import i1.AbstractC5026s;
import i1.C5009b;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f9758l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2197e f9759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y0 f9760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f9763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f9764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC5011d f9765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2485u.b f9766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f9767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C2221q f9768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private EnumC5027t f9769k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ H(C2197e c2197e, Y0 y02, int i10, int i11, boolean z10, int i12, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, y02, i10, i11, z10, i12, interfaceC5011d, bVar, list);
    }

    private final C2221q f() {
        C2221q c2221q = this.f9768j;
        if (c2221q != null) {
            return c2221q;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    private final C2215n n(long j10, EnumC5027t enumC5027t) {
        m(enumC5027t);
        int iN = C5009b.n(j10);
        int iL = ((this.f9763e || g1.v.g(this.f9764f, g1.v.f47323a.b())) && C5009b.h(j10)) ? C5009b.l(j10) : Integer.MAX_VALUE;
        int i10 = (this.f9763e || !g1.v.g(this.f9764f, g1.v.f47323a.b())) ? this.f9761c : 1;
        if (iN != iL) {
            iL = AbstractC5874j.m(c(), iN, iL);
        }
        return new C2215n(f(), C5009b.f48540b.b(0, iL, 0, C5009b.k(j10)), i10, g1.v.g(this.f9764f, g1.v.f47323a.b()), (DefaultConstructorMarker) null);
    }

    public final InterfaceC5011d a() {
        return this.f9765g;
    }

    public final AbstractC2485u.b b() {
        return this.f9766h;
    }

    public final int c() {
        return I.a(f().d());
    }

    public final int d() {
        return this.f9761c;
    }

    public final int e() {
        return this.f9762d;
    }

    public final int g() {
        return this.f9764f;
    }

    public final List h() {
        return this.f9767i;
    }

    public final boolean i() {
        return this.f9763e;
    }

    public final Y0 j() {
        return this.f9760b;
    }

    public final C2197e k() {
        return this.f9759a;
    }

    public final T0 l(long j10, EnumC5027t enumC5027t, T0 t02) {
        if (t02 != null && Y.a(t02, this.f9759a, this.f9760b, this.f9767i, this.f9761c, this.f9763e, this.f9764f, this.f9765g, enumC5027t, this.f9766h, j10)) {
            return t02.a(new S0(t02.l().j(), this.f9760b, t02.l().g(), t02.l().e(), t02.l().h(), t02.l().f(), t02.l().b(), t02.l().d(), t02.l().c(), j10, (DefaultConstructorMarker) null), AbstractC5010c.d(j10, AbstractC5026s.a(I.a(t02.w().E()), I.a(t02.w().k()))));
        }
        C2215n c2215nN = n(j10, enumC5027t);
        return new T0(new S0(this.f9759a, this.f9760b, this.f9767i, this.f9761c, this.f9763e, this.f9764f, this.f9765g, enumC5027t, this.f9766h, j10, (DefaultConstructorMarker) null), c2215nN, AbstractC5010c.d(j10, AbstractC5026s.a(I.a(c2215nN.E()), I.a(c2215nN.k()))), null);
    }

    public final void m(EnumC5027t enumC5027t) {
        C2221q c2221q = this.f9768j;
        if (c2221q == null || enumC5027t != this.f9769k || c2221q.a()) {
            this.f9769k = enumC5027t;
            c2221q = new C2221q(this.f9759a, Z0.d(this.f9760b, enumC5027t), this.f9767i, this.f9765g, this.f9766h);
        }
        this.f9768j = c2221q;
    }

    private H(C2197e c2197e, Y0 y02, int i10, int i11, boolean z10, int i12, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, List list) {
        this.f9759a = c2197e;
        this.f9760b = y02;
        this.f9761c = i10;
        this.f9762d = i11;
        this.f9763e = z10;
        this.f9764f = i12;
        this.f9765g = interfaceC5011d;
        this.f9766h = bVar;
        this.f9767i = list;
        if (i10 <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i11 > i10) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    public /* synthetic */ H(C2197e c2197e, Y0 y02, int i10, int i11, boolean z10, int i12, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, y02, (i13 & 4) != 0 ? Integer.MAX_VALUE : i10, (i13 & 8) != 0 ? 1 : i11, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? g1.v.f47323a.a() : i12, interfaceC5011d, bVar, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? AbstractC2279u.m() : list, null);
    }
}
