package w;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.AbstractC6563m;
import t.AbstractC6565o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6563m f62338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6565o f62339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6875D f62342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f62343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f62344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f62345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC6913q f62346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AbstractC6913q f62347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AbstractC6913q f62348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AbstractC6913q f62349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float[] f62350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f62351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C6916u f62352o;

    public /* synthetic */ E0(AbstractC6563m abstractC6563m, AbstractC6565o abstractC6565o, int i10, int i11, InterfaceC6875D interfaceC6875D, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6563m, abstractC6565o, i10, i11, interfaceC6875D, i12);
    }

    private final int h(int i10) {
        int iB = AbstractC6887P.b(this.f62338a, i10, 0, 0, 6, null);
        return iB < -1 ? -(iB + 2) : iB;
    }

    private final float i(int i10) {
        return j(h(i10), i10, false);
    }

    private final float j(int i10, int i11, boolean z10) {
        InterfaceC6875D interfaceC6875DB;
        float f10;
        AbstractC6563m abstractC6563m = this.f62338a;
        if (i10 >= abstractC6563m.f60103b - 1) {
            f10 = i11;
        } else {
            int iB = abstractC6563m.b(i10);
            int iB2 = this.f62338a.b(i10 + 1);
            if (i11 == iB) {
                f10 = iB;
            } else {
                int i12 = iB2 - iB;
                D0 d02 = (D0) this.f62339b.c(iB);
                if (d02 == null || (interfaceC6875DB = d02.b()) == null) {
                    interfaceC6875DB = this.f62342e;
                }
                float f11 = i12;
                float fA = interfaceC6875DB.a((i11 - iB) / f11);
                if (z10) {
                    return fA;
                }
                f10 = (f11 * fA) + iB;
            }
        }
        return f10 / 1000;
    }

    private final void k(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        float[] fArr;
        float[] fArr2;
        boolean z10 = this.f62352o != null;
        if (this.f62346i == null) {
            this.f62346i = r.g(abstractC6913q);
            this.f62347j = r.g(abstractC6913q3);
            int iC = this.f62338a.c();
            float[] fArr3 = new float[iC];
            for (int i10 = 0; i10 < iC; i10++) {
                fArr3[i10] = this.f62338a.b(i10) / 1000;
            }
            this.f62345h = fArr3;
            int iC2 = this.f62338a.c();
            int[] iArr = new int[iC2];
            for (int i11 = 0; i11 < iC2; i11++) {
                D0 d02 = (D0) this.f62339b.c(this.f62338a.b(i11));
                int iA = d02 != null ? d02.a() : this.f62343f;
                if (!AbstractC6915t.c(iA, AbstractC6915t.f62668a.a())) {
                    z10 = true;
                }
                iArr[i11] = iA;
            }
            this.f62344g = iArr;
        }
        if (z10) {
            float[] fArr4 = null;
            if (this.f62352o != null) {
                AbstractC6913q abstractC6913q4 = this.f62348k;
                if (abstractC6913q4 == null) {
                    AbstractC5504s.u("lastInitialValue");
                    abstractC6913q4 = null;
                }
                if (AbstractC5504s.c(abstractC6913q4, abstractC6913q)) {
                    AbstractC6913q abstractC6913q5 = this.f62349l;
                    if (abstractC6913q5 == null) {
                        AbstractC5504s.u("lastTargetValue");
                        abstractC6913q5 = null;
                    }
                    if (AbstractC5504s.c(abstractC6913q5, abstractC6913q2)) {
                        return;
                    }
                }
            }
            this.f62348k = abstractC6913q;
            this.f62349l = abstractC6913q2;
            int iB = (abstractC6913q.b() % 2) + abstractC6913q.b();
            this.f62350m = new float[iB];
            this.f62351n = new float[iB];
            int iC3 = this.f62338a.c();
            float[][] fArr5 = new float[iC3][];
            for (int i12 = 0; i12 < iC3; i12++) {
                int iB2 = this.f62338a.b(i12);
                if (iB2 != 0) {
                    if (iB2 != c()) {
                        fArr = new float[iB];
                        Object objC = this.f62339b.c(iB2);
                        AbstractC5504s.e(objC);
                        AbstractC6913q abstractC6913qC = ((D0) objC).c();
                        for (int i13 = 0; i13 < iB; i13++) {
                            fArr[i13] = abstractC6913qC.a(i13);
                        }
                    } else if (this.f62339b.a(iB2)) {
                        fArr = new float[iB];
                        Object objC2 = this.f62339b.c(iB2);
                        AbstractC5504s.e(objC2);
                        AbstractC6913q abstractC6913qC2 = ((D0) objC2).c();
                        for (int i14 = 0; i14 < iB; i14++) {
                            fArr[i14] = abstractC6913qC2.a(i14);
                        }
                    } else {
                        fArr2 = new float[iB];
                        for (int i15 = 0; i15 < iB; i15++) {
                            fArr2[i15] = abstractC6913q2.a(i15);
                        }
                    }
                    fArr2 = fArr;
                } else if (this.f62339b.a(iB2)) {
                    fArr = new float[iB];
                    Object objC3 = this.f62339b.c(iB2);
                    AbstractC5504s.e(objC3);
                    AbstractC6913q abstractC6913qC3 = ((D0) objC3).c();
                    for (int i16 = 0; i16 < iB; i16++) {
                        fArr[i16] = abstractC6913qC3.a(i16);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr2[i17] = abstractC6913q.a(i17);
                    }
                }
                fArr5[i12] = fArr2;
            }
            int[] iArr2 = this.f62344g;
            if (iArr2 == null) {
                AbstractC5504s.u("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.f62345h;
            if (fArr6 == null) {
                AbstractC5504s.u("times");
            } else {
                fArr4 = fArr6;
            }
            this.f62352o = new C6916u(iArr2, fArr4, fArr5);
        }
    }

    @Override // w.y0
    public int c() {
        return this.f62340c;
    }

    @Override // w.v0
    public AbstractC6913q d(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        int iB = (int) w0.b(this, j10 / 1000000);
        if (this.f62339b.a(iB)) {
            Object objC = this.f62339b.c(iB);
            AbstractC5504s.e(objC);
            return ((D0) objC).c();
        }
        if (iB >= c()) {
            return abstractC6913q2;
        }
        if (iB <= 0) {
            return abstractC6913q;
        }
        k(abstractC6913q, abstractC6913q2, abstractC6913q3);
        int i10 = 0;
        if (this.f62352o == null) {
            int iH = h(iB);
            float fJ = j(iH, iB, true);
            int iB2 = this.f62338a.b(iH);
            if (this.f62339b.a(iB2)) {
                Object objC2 = this.f62339b.c(iB2);
                AbstractC5504s.e(objC2);
                abstractC6913q = ((D0) objC2).c();
            }
            int iB3 = this.f62338a.b(iH + 1);
            if (this.f62339b.a(iB3)) {
                Object objC3 = this.f62339b.c(iB3);
                AbstractC5504s.e(objC3);
                abstractC6913q2 = ((D0) objC3).c();
            }
            AbstractC6913q abstractC6913q4 = this.f62346i;
            if (abstractC6913q4 == null) {
                AbstractC5504s.u("valueVector");
                abstractC6913q4 = null;
            }
            int iB4 = abstractC6913q4.b();
            while (i10 < iB4) {
                AbstractC6913q abstractC6913q5 = this.f62346i;
                if (abstractC6913q5 == null) {
                    AbstractC5504s.u("valueVector");
                    abstractC6913q5 = null;
                }
                abstractC6913q5.e(i10, u0.k(abstractC6913q.a(i10), abstractC6913q2.a(i10), fJ));
                i10++;
            }
            AbstractC6913q abstractC6913q6 = this.f62346i;
            if (abstractC6913q6 != null) {
                return abstractC6913q6;
            }
            AbstractC5504s.u("valueVector");
            return null;
        }
        float fI = i(iB);
        C6916u c6916u = this.f62352o;
        if (c6916u == null) {
            AbstractC5504s.u("arcSpline");
            c6916u = null;
        }
        float[] fArr = this.f62350m;
        if (fArr == null) {
            AbstractC5504s.u("posArray");
            fArr = null;
        }
        c6916u.a(fI, fArr);
        float[] fArr2 = this.f62350m;
        if (fArr2 == null) {
            AbstractC5504s.u("posArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i10 < length) {
            AbstractC6913q abstractC6913q7 = this.f62346i;
            if (abstractC6913q7 == null) {
                AbstractC5504s.u("valueVector");
                abstractC6913q7 = null;
            }
            float[] fArr3 = this.f62350m;
            if (fArr3 == null) {
                AbstractC5504s.u("posArray");
                fArr3 = null;
            }
            abstractC6913q7.e(i10, fArr3[i10]);
            i10++;
        }
        AbstractC6913q abstractC6913q8 = this.f62346i;
        if (abstractC6913q8 != null) {
            return abstractC6913q8;
        }
        AbstractC5504s.u("valueVector");
        return null;
    }

    @Override // w.v0
    public AbstractC6913q e(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        long jB = w0.b(this, j10 / 1000000);
        if (jB < 0) {
            return abstractC6913q3;
        }
        k(abstractC6913q, abstractC6913q2, abstractC6913q3);
        int i10 = 0;
        if (this.f62352o == null) {
            AbstractC6913q abstractC6913qD = w0.d(this, jB - 1, abstractC6913q, abstractC6913q2, abstractC6913q3);
            AbstractC6913q abstractC6913qD2 = w0.d(this, jB, abstractC6913q, abstractC6913q2, abstractC6913q3);
            int iB = abstractC6913qD.b();
            while (i10 < iB) {
                AbstractC6913q abstractC6913q4 = this.f62347j;
                if (abstractC6913q4 == null) {
                    AbstractC5504s.u("velocityVector");
                    abstractC6913q4 = null;
                }
                abstractC6913q4.e(i10, (abstractC6913qD.a(i10) - abstractC6913qD2.a(i10)) * 1000.0f);
                i10++;
            }
            AbstractC6913q abstractC6913q5 = this.f62347j;
            if (abstractC6913q5 != null) {
                return abstractC6913q5;
            }
            AbstractC5504s.u("velocityVector");
            return null;
        }
        float fI = i((int) jB);
        C6916u c6916u = this.f62352o;
        if (c6916u == null) {
            AbstractC5504s.u("arcSpline");
            c6916u = null;
        }
        float[] fArr = this.f62351n;
        if (fArr == null) {
            AbstractC5504s.u("slopeArray");
            fArr = null;
        }
        c6916u.b(fI, fArr);
        float[] fArr2 = this.f62351n;
        if (fArr2 == null) {
            AbstractC5504s.u("slopeArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i10 < length) {
            AbstractC6913q abstractC6913q6 = this.f62347j;
            if (abstractC6913q6 == null) {
                AbstractC5504s.u("velocityVector");
                abstractC6913q6 = null;
            }
            float[] fArr3 = this.f62351n;
            if (fArr3 == null) {
                AbstractC5504s.u("slopeArray");
                fArr3 = null;
            }
            abstractC6913q6.e(i10, fArr3[i10]);
            i10++;
        }
        AbstractC6913q abstractC6913q7 = this.f62347j;
        if (abstractC6913q7 != null) {
            return abstractC6913q7;
        }
        AbstractC5504s.u("velocityVector");
        return null;
    }

    @Override // w.y0
    public int f() {
        return this.f62341d;
    }

    private E0(AbstractC6563m abstractC6563m, AbstractC6565o abstractC6565o, int i10, int i11, InterfaceC6875D interfaceC6875D, int i12) {
        this.f62338a = abstractC6563m;
        this.f62339b = abstractC6565o;
        this.f62340c = i10;
        this.f62341d = i11;
        this.f62342e = interfaceC6875D;
        this.f62343f = i12;
    }
}
