package t0;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6387s0;
import s0.C6385r0;
import t0.AbstractC6579b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f60231g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6580c f60232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6580c f60233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6580c f60234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC6580c f60235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f60236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f60237f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(AbstractC6580c abstractC6580c, AbstractC6580c abstractC6580c2, int i10) {
            if (!r.e(i10, r.f60259a.a())) {
                return null;
            }
            long jE = abstractC6580c.e();
            AbstractC6579b.a aVar = AbstractC6579b.f60193a;
            boolean zE = AbstractC6579b.e(jE, aVar.b());
            boolean zE2 = AbstractC6579b.e(abstractC6580c2.e(), aVar.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                abstractC6580c = abstractC6580c2;
            }
            AbstractC5504s.f(abstractC6580c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            F f10 = (F) abstractC6580c;
            float[] fArrC = zE ? f10.F().c() : o.f60242a.c();
            float[] fArrC2 = zE2 ? f10.F().c() : o.f60242a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final l c(AbstractC6580c abstractC6580c) {
            return new C0905a(abstractC6580c, r.f60259a.c());
        }

        private a() {
        }

        /* JADX INFO: renamed from: t0.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0905a extends l {
            C0905a(AbstractC6580c abstractC6580c, int i10) {
                super(abstractC6580c, abstractC6580c, i10, null);
            }

            @Override // t0.l
            public long a(long j10) {
                return j10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final F f60238h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final F f60239i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f60240j;

        public /* synthetic */ b(F f10, F f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, i10);
        }

        private final float[] b(F f10, F f11, int i10) {
            if (AbstractC6581d.f(f10.F(), f11.F())) {
                return AbstractC6581d.l(f11.y(), f10.E());
            }
            float[] fArrE = f10.E();
            float[] fArrY = f11.y();
            float[] fArrC = f10.F().c();
            float[] fArrC2 = f11.F().c();
            I iF = f10.F();
            o oVar = o.f60242a;
            if (!AbstractC6581d.f(iF, oVar.b())) {
                fArrE = AbstractC6581d.l(AbstractC6581d.e(AbstractC6578a.f60188b.a().b(), fArrC, oVar.f()), f10.E());
            }
            if (!AbstractC6581d.f(f11.F(), oVar.b())) {
                fArrY = AbstractC6581d.k(AbstractC6581d.l(AbstractC6581d.e(AbstractC6578a.f60188b.a().b(), fArrC2, oVar.f()), f11.E()));
            }
            if (r.e(i10, r.f60259a.a())) {
                fArrE = AbstractC6581d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, fArrE);
            }
            return AbstractC6581d.l(fArrY, fArrE);
        }

        @Override // t0.l
        public long a(long j10) {
            float fX = C6385r0.x(j10);
            float fW = C6385r0.w(j10);
            float fU = C6385r0.u(j10);
            float fT = C6385r0.t(j10);
            float fA = (float) this.f60238h.w().a(fX);
            float fA2 = (float) this.f60238h.w().a(fW);
            float fA3 = (float) this.f60238h.w().a(fU);
            float[] fArr = this.f60240j;
            return AbstractC6387s0.a((float) this.f60239i.A().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.f60239i.A().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.f60239i.A().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fT, this.f60239i);
        }

        private b(F f10, F f11, int i10) {
            super(f10, f11, f10, f11, i10, null, null);
            this.f60238h = f10;
            this.f60239i = f11;
            this.f60240j = b(f10, f11, i10);
        }
    }

    public /* synthetic */ l(AbstractC6580c abstractC6580c, AbstractC6580c abstractC6580c2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6580c, abstractC6580c2, i10);
    }

    public long a(long j10) {
        float fX = C6385r0.x(j10);
        float fW = C6385r0.w(j10);
        float fU = C6385r0.u(j10);
        float fT = C6385r0.t(j10);
        long jH = this.f60234c.h(fX, fW, fU);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fI = this.f60234c.i(fX, fW, fU);
        float[] fArr = this.f60237f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fI *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        return this.f60235d.j(f10, fIntBitsToFloat2, fI, fT, this.f60233b);
    }

    public /* synthetic */ l(AbstractC6580c abstractC6580c, AbstractC6580c abstractC6580c2, AbstractC6580c abstractC6580c3, AbstractC6580c abstractC6580c4, int i10, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6580c, abstractC6580c2, abstractC6580c3, abstractC6580c4, i10, fArr);
    }

    private l(AbstractC6580c abstractC6580c, AbstractC6580c abstractC6580c2, AbstractC6580c abstractC6580c3, AbstractC6580c abstractC6580c4, int i10, float[] fArr) {
        this.f60232a = abstractC6580c;
        this.f60233b = abstractC6580c2;
        this.f60234c = abstractC6580c3;
        this.f60235d = abstractC6580c4;
        this.f60236e = i10;
        this.f60237f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private l(AbstractC6580c abstractC6580c, AbstractC6580c abstractC6580c2, int i10) {
        long jE = abstractC6580c.e();
        AbstractC6579b.a aVar = AbstractC6579b.f60193a;
        this(abstractC6580c, abstractC6580c2, AbstractC6579b.e(jE, aVar.b()) ? AbstractC6581d.d(abstractC6580c, o.f60242a.b(), null, 2, null) : abstractC6580c, AbstractC6579b.e(abstractC6580c2.e(), aVar.b()) ? AbstractC6581d.d(abstractC6580c2, o.f60242a.b(), null, 2, null) : abstractC6580c2, i10, f60231g.b(abstractC6580c, abstractC6580c2, i10), null);
    }
}
