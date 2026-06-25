package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6387s0;
import s0.C6385r0;
import t0.AbstractC6580c;
import w.C6912p;
import w.s0;
import w.u0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f61636a = a.f61637a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f61637a = new a();

        /* JADX INFO: renamed from: v.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0925a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0925a f61638a = new C0925a();

            C0925a() {
                super(1);
            }

            public final C6912p a(long j10) {
                long jO = C6385r0.o(j10, t0.k.f60205a.D());
                return new C6912p(C6385r0.t(jO), C6385r0.x(jO), C6385r0.w(jO), C6385r0.u(jO));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((C6385r0) obj).A());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6580c f61639a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC6580c abstractC6580c) {
                super(1);
                this.f61639a = abstractC6580c;
            }

            public final long a(C6912p c6912p) {
                float fG = c6912p.g();
                if (fG < 0.0f) {
                    fG = 0.0f;
                }
                if (fG > 1.0f) {
                    fG = 1.0f;
                }
                float fH = c6912p.h();
                if (fH < -0.5f) {
                    fH = -0.5f;
                }
                if (fH > 0.5f) {
                    fH = 0.5f;
                }
                float fI = c6912p.i();
                float f10 = fI >= -0.5f ? fI : -0.5f;
                float f11 = f10 <= 0.5f ? f10 : 0.5f;
                float f12 = c6912p.f();
                float f13 = f12 >= 0.0f ? f12 : 0.0f;
                return C6385r0.o(AbstractC6387s0.a(fG, fH, f11, f13 <= 1.0f ? f13 : 1.0f, t0.k.f60205a.D()), this.f61639a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return C6385r0.m(a((C6912p) obj));
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s0 invoke(AbstractC6580c abstractC6580c) {
            return u0.a(C0925a.f61638a, new b(abstractC6580c));
        }
    }

    public static final Function1 a(C6385r0.a aVar) {
        return f61636a;
    }
}
