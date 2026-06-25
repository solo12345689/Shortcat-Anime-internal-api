package E3;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: renamed from: E3.w */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1490w {

    /* JADX INFO: renamed from: g */
    private static final String f5562g = t2.a0.H0(0);

    /* JADX INFO: renamed from: h */
    private static final String f5563h = t2.a0.H0(1);

    /* JADX INFO: renamed from: i */
    private static final String f5564i = t2.a0.H0(2);

    /* JADX INFO: renamed from: j */
    private static final String f5565j = t2.a0.H0(3);

    /* JADX INFO: renamed from: k */
    private static final String f5566k = t2.a0.H0(4);

    /* JADX INFO: renamed from: l */
    private static final String f5567l = t2.a0.H0(5);

    /* JADX INFO: renamed from: a */
    public final int f5568a;

    /* JADX INFO: renamed from: b */
    public final long f5569b;

    /* JADX INFO: renamed from: c */
    public final Object f5570c;

    /* JADX INFO: renamed from: d */
    private final int f5571d;

    /* JADX INFO: renamed from: e */
    public final Y2 f5572e;

    /* JADX INFO: renamed from: f */
    public final V6 f5573f;

    private C1490w(int i10, long j10, Y2 y22, V6 v62, Object obj, int i11) {
        this.f5568a = i10;
        this.f5569b = j10;
        this.f5572e = y22;
        this.f5573f = v62;
        this.f5570c = obj;
        this.f5571d = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static E3.C1490w a(android.os.Bundle r10, java.lang.Integer r11) {
        /*
            java.lang.String r0 = E3.C1490w.f5562g
            r1 = 0
            int r3 = r10.getInt(r0, r1)
            java.lang.String r0 = E3.C1490w.f5563h
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.getLong(r0, r4)
            java.lang.String r0 = E3.C1490w.f5564i
            android.os.Bundle r0 = r10.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r2
            goto L21
        L1c:
            E3.Y2 r0 = E3.Y2.a(r0)
            r6 = r0
        L21:
            java.lang.String r0 = E3.C1490w.f5567l
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 == 0) goto L2f
            E3.V6 r0 = E3.V6.a(r0)
        L2d:
            r7 = r0
            goto L3a
        L2f:
            if (r3 == 0) goto L39
            E3.V6 r0 = new E3.V6
            java.lang.String r7 = "no error message provided"
            r0.<init>(r3, r7)
            goto L2d
        L39:
            r7 = r2
        L3a:
            java.lang.String r0 = E3.C1490w.f5566k
            int r9 = r10.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L75
            r8 = 2
            if (r9 == r8) goto L77
            r8 = 3
            if (r9 == r8) goto L53
            r10 = 4
            if (r9 != r10) goto L4d
            goto L75
        L4d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L53:
            if (r11 == 0) goto L5b
            int r11 = r11.intValue()
            if (r11 != r8) goto L5c
        L5b:
            r1 = r0
        L5c:
            t2.AbstractC6614a.g(r1)
            java.lang.String r11 = E3.C1490w.f5565j
            android.os.IBinder r10 = androidx.core.app.h.a(r10, r11)
            if (r10 != 0) goto L68
            goto L75
        L68:
            E3.u r11 = new E3.u
            r11.<init>()
            P9.u r10 = q2.BinderC6095j.a(r10)
            P9.u r2 = t2.AbstractC6622i.d(r11, r10)
        L75:
            r8 = r2
            goto L91
        L77:
            if (r11 == 0) goto L7f
            int r11 = r11.intValue()
            if (r11 != r8) goto L80
        L7f:
            r1 = r0
        L80:
            t2.AbstractC6614a.g(r1)
            java.lang.String r11 = E3.C1490w.f5565j
            android.os.Bundle r10 = r10.getBundle(r11)
            if (r10 != 0) goto L8c
            goto L75
        L8c:
            q2.C r2 = q2.C6071C.b(r10)
            goto L75
        L91:
            E3.w r2 = new E3.w
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C1490w.a(android.os.Bundle, java.lang.Integer):E3.w");
    }

    public static C1490w b(Bundle bundle) {
        return a(bundle, null);
    }

    public static C1490w c(int i10) {
        return d(new V6(i10, "no error message provided", Bundle.EMPTY));
    }

    public static C1490w d(V6 v62) {
        return new C1490w(v62.f5008a, SystemClock.elapsedRealtime(), null, v62, null, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0045, code lost:
    
        if (r2 != 4) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle e() {
        /*
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = E3.C1490w.f5562g
            int r2 = r5.f5568a
            r0.putInt(r1, r2)
            java.lang.String r1 = E3.C1490w.f5563h
            long r2 = r5.f5569b
            r0.putLong(r1, r2)
            E3.Y2 r1 = r5.f5572e
            if (r1 == 0) goto L20
            java.lang.String r2 = E3.C1490w.f5564i
            android.os.Bundle r1 = r1.b()
            r0.putBundle(r2, r1)
        L20:
            E3.V6 r1 = r5.f5573f
            if (r1 == 0) goto L2d
            java.lang.String r2 = E3.C1490w.f5567l
            android.os.Bundle r1 = r1.b()
            r0.putBundle(r2, r1)
        L2d:
            java.lang.String r1 = E3.C1490w.f5566k
            int r2 = r5.f5571d
            r0.putInt(r1, r2)
            java.lang.Object r1 = r5.f5570c
            if (r1 != 0) goto L39
            goto L47
        L39:
            int r2 = r5.f5571d
            r3 = 1
            if (r2 == r3) goto L6c
            r3 = 2
            if (r2 == r3) goto L60
            r1 = 3
            if (r2 == r1) goto L48
            r1 = 4
            if (r2 == r1) goto L6c
        L47:
            return r0
        L48:
            java.lang.String r1 = E3.C1490w.f5565j
            q2.j r2 = new q2.j
            java.lang.Object r3 = r5.f5570c
            P9.u r3 = (P9.AbstractC2011u) r3
            E3.v r4 = new E3.v
            r4.<init>()
            P9.u r3 = t2.AbstractC6622i.i(r3, r4)
            r2.<init>(r3)
            androidx.core.app.h.b(r0, r1, r2)
            return r0
        L60:
            java.lang.String r2 = E3.C1490w.f5565j
            q2.C r1 = (q2.C6071C) r1
            android.os.Bundle r1 = r1.e()
            r0.putBundle(r2, r1)
            return r0
        L6c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C1490w.e():android.os.Bundle");
    }
}
