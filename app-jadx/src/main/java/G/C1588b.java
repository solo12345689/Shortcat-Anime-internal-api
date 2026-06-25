package G;

import Ud.AbstractC2279u;
import Y.C0;
import Y.b2;
import h0.AbstractC4893b;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: G.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1588b extends C {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final c f6787L = new c(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final h0.v f6788M = AbstractC4893b.b(a.f6790a, C0090b.f6791a);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private C0 f6789K;

    /* JADX INFO: renamed from: G.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6790a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(h0.z zVar, C1588b c1588b) {
            return AbstractC2279u.p(Integer.valueOf(c1588b.v()), Float.valueOf(AbstractC5874j.l(c1588b.w(), -0.5f, 0.5f)), Integer.valueOf(c1588b.F()));
        }
    }

    /* JADX INFO: renamed from: G.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0090b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0090b f6791a = new C0090b();

        /* JADX INFO: renamed from: G.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f6792a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.f6792a = list;
            }

            @Override // ie.InterfaceC5082a
            public final Integer invoke() {
                Object obj = this.f6792a.get(2);
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        }

        C0090b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1588b invoke(List list) {
            Object obj = list.get(0);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new C1588b(iIntValue, ((Float) obj2).floatValue(), new a(list));
        }
    }

    /* JADX INFO: renamed from: G.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h0.v a() {
            return C1588b.f6788M;
        }

        private c() {
        }
    }

    public C1588b(int i10, float f10, InterfaceC5082a interfaceC5082a) {
        super(i10, f10);
        this.f6789K = b2.e(interfaceC5082a, null, 2, null);
    }

    @Override // G.C
    public int F() {
        return ((Number) ((InterfaceC5082a) this.f6789K.getValue()).invoke()).intValue();
    }

    public final C0 m0() {
        return this.f6789K;
    }
}
