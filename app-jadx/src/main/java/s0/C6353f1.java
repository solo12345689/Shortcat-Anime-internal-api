package s0;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: renamed from: s0.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6353f1 extends A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f58942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f58943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f58944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f58945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f58946e;

    public /* synthetic */ C6353f1(List list, List list2, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, j11, i10);
    }

    @Override // s0.A1
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo483createShaderuvyYCjk(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f58944c >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.f58944c >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f58944c & 4294967295L)) == Float.POSITIVE_INFINITY ? j10 & 4294967295L : this.f58944c & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f58945d >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.f58945d >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f58945d & 4294967295L)) == Float.POSITIVE_INFINITY ? j10 & 4294967295L : this.f58945d & 4294967295L));
        List list = this.f58942a;
        List list2 = this.f58943b;
        return B1.a(C6224f.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)), C6224f.e((((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32)), list, list2, this.f58946e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6353f1)) {
            return false;
        }
        C6353f1 c6353f1 = (C6353f1) obj;
        return AbstractC5504s.c(this.f58942a, c6353f1.f58942a) && AbstractC5504s.c(this.f58943b, c6353f1.f58943b) && C6224f.j(this.f58944c, c6353f1.f58944c) && C6224f.j(this.f58945d, c6353f1.f58945d) && I1.f(this.f58946e, c6353f1.f58946e);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    @Override // s0.AbstractC6358h0
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo968getIntrinsicSizeNHjbRc() {
        /*
            r8 = this;
            long r0 = r8.f58944c
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r3 = 2143289344(0x7fc00000, float:NaN)
            if (r1 != 0) goto L42
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L42
            long r0 = r8.f58945d
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L42
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L42
            long r0 = r8.f58944c
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r8.f58945d
            long r4 = r4 >> r2
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            goto L43
        L42:
            r0 = r3
        L43:
            long r4 = r8.f58944c
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L85
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L85
            long r4 = r8.f58945d
            long r4 = r4 & r6
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L85
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L85
            long r3 = r8.f58944c
            long r3 = r3 & r6
            int r1 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r3 = r8.f58945d
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r1 = r1 - r3
            float r3 = java.lang.Math.abs(r1)
        L85:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            long r0 = r0 << r2
            long r2 = r3 & r6
            long r0 = r0 | r2
            long r0 = r0.C6230l.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C6353f1.mo968getIntrinsicSizeNHjbRc():long");
    }

    public int hashCode() {
        int iHashCode = this.f58942a.hashCode() * 31;
        List list = this.f58943b;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C6224f.o(this.f58944c)) * 31) + C6224f.o(this.f58945d)) * 31) + I1.g(this.f58946e);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.f58944c & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) C6224f.s(this.f58944c)) + ", ";
        } else {
            str = "";
        }
        if ((((9187343241974906880L ^ (this.f58945d & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C6224f.s(this.f58945d)) + ", ";
        }
        return "LinearGradient(colors=" + this.f58942a + ", stops=" + this.f58943b + ", " + str + str2 + "tileMode=" + ((Object) I1.h(this.f58946e)) + ')';
    }

    private C6353f1(List list, List list2, long j10, long j11, int i10) {
        this.f58942a = list;
        this.f58943b = list2;
        this.f58944c = j10;
        this.f58945d = j11;
        this.f58946e = i10;
    }
}
