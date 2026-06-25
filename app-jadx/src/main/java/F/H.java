package F;

import F.InterfaceC1533d;
import Ud.AbstractC2273n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import oe.C5870f;
import t.C6545K;
import t.T;
import t.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H implements androidx.compose.foundation.lazy.layout.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f6012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f6013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6014d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6545K f6017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ H f6018d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, C6545K c6545k, H h10) {
            super(1);
            this.f6015a = i10;
            this.f6016b = i11;
            this.f6017c = c6545k;
            this.f6018d = h10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(F.InterfaceC1533d.a r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r7.c()
                F.m$a r0 = (F.AbstractC1542m.a) r0
                kotlin.jvm.functions.Function1 r0 = r0.getKey()
                int r1 = r6.f6015a
                int r2 = r7.b()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f6016b
                int r3 = r7.b()
                int r4 = r7.a()
                int r3 = r3 + r4
                int r3 = r3 + (-1)
                int r2 = java.lang.Math.min(r2, r3)
                if (r1 > r2) goto L57
            L27:
                if (r0 == 0) goto L39
                int r3 = r7.b()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L3d
            L39:
                java.lang.Object r3 = F.F.a(r1)
            L3d:
                t.K r4 = r6.f6017c
                r4.u(r3, r1)
                F.H r4 = r6.f6018d
                java.lang.Object[] r4 = F.H.a(r4)
                F.H r5 = r6.f6018d
                int r5 = F.H.b(r5)
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L57
                int r1 = r1 + 1
                goto L27
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: F.H.a.a(F.d$a):void");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1533d.a) obj);
            return Td.L.f17438a;
        }
    }

    public H(C5870f c5870f, AbstractC1542m abstractC1542m) {
        InterfaceC1533d interfaceC1533dG = abstractC1542m.g();
        int iF = c5870f.f();
        if (iF < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        int iMin = Math.min(c5870f.i(), interfaceC1533dG.getSize() - 1);
        if (iMin < iF) {
            this.f6012b = U.a();
            this.f6013c = new Object[0];
            this.f6014d = 0;
        } else {
            int i10 = (iMin - iF) + 1;
            this.f6013c = new Object[i10];
            this.f6014d = iF;
            C6545K c6545k = new C6545K(i10);
            interfaceC1533dG.a(iF, iMin, new a(iF, iMin, c6545k, this));
            this.f6012b = c6545k;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public int c(Object obj) {
        T t10 = this.f6012b;
        int iB = t10.b(obj);
        if (iB >= 0) {
            return t10.f60002c[iB];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public Object d(int i10) {
        Object[] objArr = this.f6013c;
        int i11 = i10 - this.f6014d;
        if (i11 < 0 || i11 > AbstractC2273n.f0(objArr)) {
            return null;
        }
        return objArr[i11];
    }
}
