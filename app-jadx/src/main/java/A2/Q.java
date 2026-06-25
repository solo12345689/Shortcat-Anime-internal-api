package A2;

import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q f166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q f168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Q f169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Q f170g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f172b;

    static {
        Q q10 = new Q(0L, 0L);
        f166c = q10;
        f167d = new Q(Long.MAX_VALUE, Long.MAX_VALUE);
        f168e = new Q(Long.MAX_VALUE, 0L);
        f169f = new Q(0L, Long.MAX_VALUE);
        f170g = q10;
    }

    public Q(long j10, long j11) {
        AbstractC6614a.a(j10 >= 0);
        AbstractC6614a.a(j11 >= 0);
        this.f171a = j10;
        this.f172b = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(long r9, long r11, long r13) {
        /*
            r8 = this;
            long r2 = r8.f171a
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r8.f172b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return r9
        Lf:
            r4 = -9223372036854775808
            r0 = r9
            long r9 = t2.a0.y1(r0, r2, r4)
            long r2 = r8.f172b
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = t2.a0.f(r0, r2, r4)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 > 0) goto L2d
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 > 0) goto L2d
            r4 = r6
            goto L2e
        L2d:
            r4 = r5
        L2e:
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 > 0) goto L37
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L37
            r5 = r6
        L37:
            if (r4 == 0) goto L4c
            if (r5 == 0) goto L4c
            long r9 = r11 - r0
            long r9 = java.lang.Math.abs(r9)
            long r0 = r13 - r0
            long r0 = java.lang.Math.abs(r0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L51
            goto L4e
        L4c:
            if (r4 == 0) goto L4f
        L4e:
            return r11
        L4f:
            if (r5 == 0) goto L52
        L51:
            return r13
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.Q.a(long, long, long):long");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q.class == obj.getClass()) {
            Q q10 = (Q) obj;
            if (this.f171a == q10.f171a && this.f172b == q10.f172b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f171a) * 31) + ((int) this.f172b);
    }
}
