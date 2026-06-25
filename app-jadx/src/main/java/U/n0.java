package U;

import Ud.AbstractC2279u;
import Y.InterfaceC2464z0;
import Y.W0;
import h0.AbstractC4893b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f18574d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h0.v f18575e = AbstractC4893b.b(a.f18579a, b.f18580a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2464z0 f18576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2464z0 f18577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2464z0 f18578c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18579a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(h0.z zVar, n0 n0Var) {
            return AbstractC2279u.p(Float.valueOf(n0Var.e()), Float.valueOf(n0Var.d()), Float.valueOf(n0Var.c()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18580a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke(List list) {
            return new n0(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h0.v a() {
            return n0.f18575e;
        }

        private c() {
        }
    }

    public n0(float f10, float f11, float f12) {
        this.f18576a = W0.a(f10);
        this.f18577b = W0.a(f12);
        this.f18578c = W0.a(f11);
    }

    public final float b() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return d() / e();
    }

    public final float c() {
        return this.f18577b.c();
    }

    public final float d() {
        return this.f18578c.c();
    }

    public final float e() {
        return this.f18576a.c();
    }

    public final float f() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return 1 - (AbstractC5874j.l(e() - c(), e(), 0.0f) / e());
    }

    public final void g(float f10) {
        this.f18577b.k(f10);
    }

    public final void h(float f10) {
        this.f18578c.k(AbstractC5874j.l(f10, e(), 0.0f));
    }

    public final void i(float f10) {
        this.f18576a.k(f10);
    }
}
