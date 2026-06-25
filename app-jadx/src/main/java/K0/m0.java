package K0;

import a0.C2507c;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10784c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10785d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2507c f10786a = new C2507c(new J[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private J[] f10787b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: K0.m0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0168a implements Comparator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0168a f10788a = new C0168a();

            private C0168a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(J j10, J j11) {
                int i10 = AbstractC5504s.i(j11.S(), j10.S());
                return i10 != 0 ? i10 : AbstractC5504s.i(j10.hashCode(), j11.hashCode());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void b(J j10) {
        if (j10.U() > 0) {
            j10.H();
            j10.U1(false);
            C2507c c2507cI0 = j10.I0();
            Object[] objArr = c2507cI0.f23496a;
            int iP = c2507cI0.p();
            for (int i10 = 0; i10 < iP; i10++) {
                b((J) objArr[i10]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r5 = this;
            a0.c r0 = r5.f10786a
            K0.m0$a$a r1 = K0.m0.a.C0168a.f10788a
            r0.G(r1)
            a0.c r0 = r5.f10786a
            int r0 = r0.p()
            K0.J[] r1 = r5.f10787b
            if (r1 == 0) goto L14
            int r2 = r1.length
            if (r2 >= r0) goto L22
        L14:
            a0.c r1 = r5.f10786a
            int r1 = r1.p()
            r2 = 16
            int r1 = java.lang.Math.max(r2, r1)
            K0.J[] r1 = new K0.J[r1]
        L22:
            r2 = 0
            r5.f10787b = r2
            r3 = 0
        L26:
            if (r3 >= r0) goto L33
            a0.c r4 = r5.f10786a
            java.lang.Object[] r4 = r4.f23496a
            r4 = r4[r3]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L26
        L33:
            a0.c r3 = r5.f10786a
            r3.i()
            int r0 = r0 + (-1)
        L3a:
            r3 = -1
            if (r3 >= r0) goto L50
            r3 = r1[r0]
            kotlin.jvm.internal.AbstractC5504s.e(r3)
            boolean r4 = r3.s0()
            if (r4 == 0) goto L4b
            r5.b(r3)
        L4b:
            r1[r0] = r2
            int r0 = r0 + (-1)
            goto L3a
        L50:
            r5.f10787b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.m0.a():void");
    }

    public final boolean c() {
        return this.f10786a.p() != 0;
    }

    public final void d(J j10) {
        if (j10.U() > 0) {
            this.f10786a.c(j10);
            j10.U1(true);
        }
    }

    public final void e(J j10) {
        if (j10.U() > 0) {
            this.f10786a.i();
            this.f10786a.c(j10);
            j10.U1(true);
        }
    }

    public final void f(J j10) {
        this.f10786a.w(j10);
    }
}
