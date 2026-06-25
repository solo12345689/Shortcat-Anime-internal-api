package A;

import G.A;
import G.C;
import G.n;
import G.o;
import Td.z;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.Pair;
import oe.AbstractC5874j;
import r0.C6224f;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f47a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f48b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ A f49c;

        a(C c10, InterfaceC5096o interfaceC5096o, A a10) {
            this.f47a = c10;
            this.f48b = interfaceC5096o;
            this.f49c = a10;
        }

        private final Pair e(k kVar) {
            float f10;
            List listI = c().i();
            C c10 = this.f47a;
            int size = listI.size();
            float f11 = Float.NEGATIVE_INFINITY;
            float f12 = Float.POSITIVE_INFINITY;
            int i10 = 0;
            while (true) {
                f10 = 0.0f;
                if (i10 >= size) {
                    break;
                }
                G.f fVar = (G.f) listI.get(i10);
                float fA = l.a(o.a(c()), c().e(), c().c(), c().h(), fVar.getOffset(), fVar.getIndex(), kVar, c10.F());
                if (fA <= 0.0f && fA > f11) {
                    f11 = fA;
                }
                if (fA >= 0.0f && fA < f12) {
                    f12 = fA;
                }
                i10++;
            }
            if (f11 == Float.NEGATIVE_INFINITY) {
                f11 = f12;
            }
            if (f12 == Float.POSITIVE_INFINITY) {
                f12 = f11;
            }
            boolean z10 = g.e(this.f47a) == 0.0f;
            if (!this.f47a.e()) {
                if (z10 || !g.g(this.f47a)) {
                    f12 = 0.0f;
                } else {
                    f11 = 0.0f;
                    f12 = 0.0f;
                }
            }
            if (this.f47a.c()) {
                f10 = f11;
            } else if (!z10 && !g.g(this.f47a)) {
                f12 = 0.0f;
            }
            return z.a(Float.valueOf(f10), Float.valueOf(f12));
        }

        @Override // A.j
        public float a(float f10) {
            Pair pairE = e(this.f47a.C().l());
            float fFloatValue = ((Number) pairE.getFirst()).floatValue();
            float fFloatValue2 = ((Number) pairE.getSecond()).floatValue();
            float fFloatValue3 = ((Number) this.f48b.invoke(Float.valueOf(f10), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
            if (fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f) {
                if (d(fFloatValue3)) {
                    return fFloatValue3;
                }
                return 0.0f;
            }
            throw new IllegalStateException(("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0").toString());
        }

        @Override // A.j
        public float b(float f10, float f11) {
            int iG = this.f47a.G() + this.f47a.I();
            if (iG == 0) {
                return 0.0f;
            }
            int iY = f10 < 0.0f ? this.f47a.y() + 1 : this.f47a.y();
            int iE = AbstractC5874j.e(Math.abs((AbstractC5874j.m(this.f49c.a(iY, AbstractC5874j.m(((int) (f11 / iG)) + iY, 0, this.f47a.F()), f10, this.f47a.G(), this.f47a.I()), 0, this.f47a.F()) - iY) * iG) - iG, 0);
            return iE == 0 ? iE : iE * Math.signum(f10);
        }

        public final n c() {
            return this.f47a.C();
        }

        public final boolean d(float f10) {
            return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    public static final j a(C c10, A a10, InterfaceC5096o interfaceC5096o) {
        return new a(c10, interfaceC5096o, a10);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float d(G.C r5, i1.EnumC5027t r6, float r7, float r8, float r9, float r10) {
        /*
            G.n r0 = r5.C()
            z.q r0 = r0.a()
            z.q r1 = z.q.Vertical
            if (r0 != r1) goto L11
            boolean r6 = g(r5)
            goto L23
        L11:
            i1.t r0 = i1.EnumC5027t.f48573a
            if (r6 != r0) goto L1a
            boolean r6 = g(r5)
            goto L23
        L1a:
            boolean r6 = g(r5)
            if (r6 != 0) goto L22
            r6 = 1
            goto L23
        L22:
            r6 = 0
        L23:
            G.n r0 = r5.C()
            int r0 = r0.h()
            r1 = 0
            if (r0 != 0) goto L30
            r2 = r1
            goto L36
        L30:
            float r2 = e(r5)
            float r0 = (float) r0
            float r2 = r2 / r0
        L36:
            int r0 = (int) r2
            float r0 = (float) r0
            float r0 = r2 - r0
            i1.d r3 = r5.x()
            int r8 = A.f.a(r3, r8)
            A.d$a r3 = A.d.f43a
            int r4 = r3.a()
            boolean r4 = A.d.e(r8, r4)
            if (r4 == 0) goto L79
            float r8 = java.lang.Math.abs(r0)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 <= 0) goto L59
            if (r6 == 0) goto L8e
            goto L83
        L59:
            float r7 = java.lang.Math.abs(r2)
            float r5 = r5.L()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 < 0) goto L6c
            if (r6 == 0) goto L83
            goto L8e
        L6c:
            float r5 = java.lang.Math.abs(r9)
            float r6 = java.lang.Math.abs(r10)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L83
            goto L8e
        L79:
            int r5 = r3.b()
            boolean r5 = A.d.e(r8, r5)
            if (r5 == 0) goto L84
        L83:
            return r10
        L84:
            int r5 = r3.c()
            boolean r5 = A.d.e(r8, r5)
            if (r5 == 0) goto L8f
        L8e:
            return r9
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A.g.d(G.C, i1.t, float, float, float, float):float");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(C c10) {
        return c10.C().a() == q.Horizontal ? C6224f.m(c10.R()) : C6224f.n(c10.R());
    }

    private static final boolean f(C c10) {
        return e(c10) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(C c10) {
        boolean zG = c10.C().g();
        if (f(c10) && zG) {
            return true;
        }
        return (f(c10) || zG) ? false : true;
    }
}
