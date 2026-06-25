package g1;

import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import s0.A1;
import s0.AbstractC6358h0;
import s0.C6385r0;
import s0.F1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface p {

    /* JADX INFO: renamed from: a */
    public static final a f47302a = a.f47303a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f47303a = new a();

        private a() {
        }

        public final p a(AbstractC6358h0 abstractC6358h0, float f10) {
            if (abstractC6358h0 == null) {
                return b.f47304b;
            }
            if (abstractC6358h0 instanceof F1) {
                return b(AbstractC4833m.c(((F1) abstractC6358h0).a(), f10));
            }
            if (abstractC6358h0 instanceof A1) {
                return new C4823c((A1) abstractC6358h0, f10);
            }
            throw new Td.r();
        }

        public final p b(long j10) {
            return j10 != 16 ? new C4824d(j10, null) : b.f47304b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements p {

        /* JADX INFO: renamed from: b */
        public static final b f47304b = new b();

        private b() {
        }

        @Override // g1.p
        public float a() {
            return Float.NaN;
        }

        @Override // g1.p
        public long b() {
            return C6385r0.f58985b.j();
        }

        @Override // g1.p
        public AbstractC6358h0 i() {
            return null;
        }
    }

    static float e(p pVar) {
        return ((C4823c) pVar).a();
    }

    float a();

    long b();

    default p d(InterfaceC5082a interfaceC5082a) {
        return !AbstractC5504s.c(this, b.f47304b) ? this : (p) interfaceC5082a.invoke();
    }

    default p f(p pVar) {
        boolean z10 = pVar instanceof C4823c;
        if (!z10 || !(this instanceof C4823c)) {
            return (!z10 || (this instanceof C4823c)) ? (z10 || !(this instanceof C4823c)) ? pVar.d(new InterfaceC5082a() { // from class: g1.o
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return p.g(this.f47301a);
                }
            }) : this : pVar;
        }
        C4823c c4823c = (C4823c) pVar;
        return new C4823c(c4823c.j(), AbstractC4833m.d(c4823c.a(), new InterfaceC5082a() { // from class: g1.n
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return Float.valueOf(p.e(this.f47300a));
            }
        }));
    }

    AbstractC6358h0 i();

    static p g(p pVar) {
        return pVar;
    }
}
