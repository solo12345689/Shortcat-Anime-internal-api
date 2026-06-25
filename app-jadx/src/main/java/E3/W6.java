package E3;

import android.os.Bundle;
import java.util.Objects;
import q2.InterfaceC6084P;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class W6 {

    /* JADX INFO: renamed from: k */
    public static final InterfaceC6084P.e f5030k;

    /* JADX INFO: renamed from: l */
    public static final W6 f5031l;

    /* JADX INFO: renamed from: m */
    static final String f5032m;

    /* JADX INFO: renamed from: n */
    private static final String f5033n;

    /* JADX INFO: renamed from: o */
    private static final String f5034o;

    /* JADX INFO: renamed from: p */
    private static final String f5035p;

    /* JADX INFO: renamed from: q */
    static final String f5036q;

    /* JADX INFO: renamed from: r */
    private static final String f5037r;

    /* JADX INFO: renamed from: s */
    private static final String f5038s;

    /* JADX INFO: renamed from: t */
    private static final String f5039t;

    /* JADX INFO: renamed from: u */
    private static final String f5040u;

    /* JADX INFO: renamed from: v */
    static final String f5041v;

    /* JADX INFO: renamed from: a */
    public final InterfaceC6084P.e f5042a;

    /* JADX INFO: renamed from: b */
    public final boolean f5043b;

    /* JADX INFO: renamed from: c */
    public final long f5044c;

    /* JADX INFO: renamed from: d */
    public final long f5045d;

    /* JADX INFO: renamed from: e */
    public final long f5046e;

    /* JADX INFO: renamed from: f */
    public final int f5047f;

    /* JADX INFO: renamed from: g */
    public final long f5048g;

    /* JADX INFO: renamed from: h */
    public final long f5049h;

    /* JADX INFO: renamed from: i */
    public final long f5050i;

    /* JADX INFO: renamed from: j */
    public final long f5051j;

    static {
        InterfaceC6084P.e eVar = new InterfaceC6084P.e(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f5030k = eVar;
        f5031l = new W6(eVar, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        f5032m = t2.a0.H0(0);
        f5033n = t2.a0.H0(1);
        f5034o = t2.a0.H0(2);
        f5035p = t2.a0.H0(3);
        f5036q = t2.a0.H0(4);
        f5037r = t2.a0.H0(5);
        f5038s = t2.a0.H0(6);
        f5039t = t2.a0.H0(7);
        f5040u = t2.a0.H0(8);
        f5041v = t2.a0.H0(9);
    }

    public W6(InterfaceC6084P.e eVar, boolean z10, long j10, long j11, long j12, int i10, long j13, long j14, long j15, long j16) {
        AbstractC6614a.a(z10 == (eVar.f56625i != -1));
        this.f5042a = eVar;
        this.f5043b = z10;
        this.f5044c = j10;
        this.f5045d = j11;
        this.f5046e = j12;
        this.f5047f = i10;
        this.f5048g = j13;
        this.f5049h = j14;
        this.f5050i = j15;
        this.f5051j = j16;
    }

    public static W6 b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f5032m);
        return new W6(bundle2 == null ? f5030k : InterfaceC6084P.e.c(bundle2), bundle.getBoolean(f5033n, false), bundle.getLong(f5034o, -9223372036854775807L), bundle.getLong(f5035p, -9223372036854775807L), bundle.getLong(f5036q, 0L), bundle.getInt(f5037r, 0), bundle.getLong(f5038s, 0L), bundle.getLong(f5039t, -9223372036854775807L), bundle.getLong(f5040u, -9223372036854775807L), bundle.getLong(f5041v, 0L));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public E3.W6 a(boolean r24, boolean r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            if (r1 == 0) goto Lb
            if (r2 == 0) goto Lb
            return r0
        Lb:
            E3.W6 r3 = new E3.W6
            q2.P$e r4 = r0.f5042a
            q2.P$e r2 = r4.b(r1, r2)
            r4 = 0
            if (r1 == 0) goto L1c
            boolean r5 = r0.f5043b
            if (r5 == 0) goto L1c
            r5 = 1
            goto L1d
        L1c:
            r5 = r4
        L1d:
            long r6 = r0.f5044c
            if (r1 == 0) goto L24
            long r10 = r0.f5045d
            goto L29
        L24:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L29:
            if (r1 == 0) goto L2e
            long r14 = r0.f5046e
            goto L30
        L2e:
            r14 = 0
        L30:
            if (r1 == 0) goto L34
            int r4 = r0.f5047f
        L34:
            if (r1 == 0) goto L39
            long r8 = r0.f5048g
            goto L3b
        L39:
            r8 = 0
        L3b:
            if (r1 == 0) goto L40
            long r12 = r0.f5049h
            goto L45
        L40:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L45:
            r25 = r2
            if (r1 == 0) goto L4e
            long r1 = r0.f5050i
            r16 = r1
            goto L53
        L4e:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L53:
            if (r24 == 0) goto L70
            long r1 = r0.f5051j
            r19 = r1
            r1 = r3
            r3 = r5
            r21 = r10
            r10 = r4
            r4 = r6
            r6 = r21
            r21 = r16
            r17 = r19
            r19 = r12
            r11 = r8
            r8 = r14
            r15 = r21
        L6b:
            r2 = r25
            r13 = r19
            goto L81
        L70:
            r1 = r3
            r3 = r5
            r19 = r10
            r10 = r4
            r4 = r6
            r6 = r19
            r19 = r12
            r11 = r8
            r8 = r14
            r15 = r16
            r17 = 0
            goto L6b
        L81:
            r1.<init>(r2, r3, r4, r6, r8, r10, r11, r13, r15, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.W6.a(boolean, boolean):E3.W6");
    }

    public Bundle c(int i10) {
        Bundle bundle = new Bundle();
        if (i10 < 3 || !f5030k.a(this.f5042a)) {
            bundle.putBundle(f5032m, this.f5042a.d(i10));
        }
        boolean z10 = this.f5043b;
        if (z10) {
            bundle.putBoolean(f5033n, z10);
        }
        long j10 = this.f5044c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f5034o, j10);
        }
        long j11 = this.f5045d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f5035p, j11);
        }
        if (i10 < 3 || this.f5046e != 0) {
            bundle.putLong(f5036q, this.f5046e);
        }
        int i11 = this.f5047f;
        if (i11 != 0) {
            bundle.putInt(f5037r, i11);
        }
        long j12 = this.f5048g;
        if (j12 != 0) {
            bundle.putLong(f5038s, j12);
        }
        long j13 = this.f5049h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f5039t, j13);
        }
        long j14 = this.f5050i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f5040u, j14);
        }
        if (i10 >= 3 && this.f5051j == 0) {
            return bundle;
        }
        bundle.putLong(f5041v, this.f5051j);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W6.class == obj.getClass()) {
            W6 w62 = (W6) obj;
            if (this.f5044c == w62.f5044c && this.f5042a.equals(w62.f5042a) && this.f5043b == w62.f5043b && this.f5045d == w62.f5045d && this.f5046e == w62.f5046e && this.f5047f == w62.f5047f && this.f5048g == w62.f5048g && this.f5049h == w62.f5049h && this.f5050i == w62.f5050i && this.f5051j == w62.f5051j) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f5042a, Boolean.valueOf(this.f5043b));
    }

    public String toString() {
        return "SessionPositionInfo {PositionInfo {mediaItemIndex=" + this.f5042a.f56619c + ", periodIndex=" + this.f5042a.f56622f + ", positionMs=" + this.f5042a.f56623g + ", contentPositionMs=" + this.f5042a.f56624h + ", adGroupIndex=" + this.f5042a.f56625i + ", adIndexInAdGroup=" + this.f5042a.f56626j + "}, isPlayingAd=" + this.f5043b + ", eventTimeMs=" + this.f5044c + ", durationMs=" + this.f5045d + ", bufferedPositionMs=" + this.f5046e + ", bufferedPercentage=" + this.f5047f + ", totalBufferedDurationMs=" + this.f5048g + ", currentLiveOffsetMs=" + this.f5049h + ", contentDurationMs=" + this.f5050i + ", contentBufferedPositionMs=" + this.f5051j + "}";
    }
}
