package S0;

import i1.C5021n;
import t.AbstractC6566p;
import t.C6540F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6540F f15627a = AbstractC6566p.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f15628b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f15629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f15630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f15631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f15632f;

    public d() {
        C5021n.a aVar = C5021n.f48560b;
        this.f15629c = aVar.b();
        this.f15630d = aVar.b();
    }

    public final void b(long j10) {
        C6540F c6540f = this.f15627a;
        Object[] objArr = c6540f.f60107c;
        long[] jArr = c6540f.f60105a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j11 = jArr[i10];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j11) < 128) {
                        android.support.v4.media.session.b.a(objArr[(i10 << 3) + i12]);
                    }
                    j11 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(int i10, long j10, long j11, long j12) {
        android.support.v4.media.session.b.a(this.f15627a.c(i10));
    }

    public final long d() {
        return this.f15628b;
    }

    public final C6540F e() {
        return this.f15627a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r13) {
        /*
            r12 = this;
            long r0 = r12.f15628b
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 <= 0) goto L7
            return
        L7:
            t.F r13 = r12.f15627a
            java.lang.Object[] r14 = r13.f60107c
            long[] r13 = r13.f60105a
            int r0 = r13.length
            int r0 = r0 + (-2)
            if (r0 < 0) goto L4c
            r1 = 0
            r2 = r1
        L14:
            r3 = r13[r2]
            long r5 = ~r3
            r7 = 7
            long r5 = r5 << r7
            long r5 = r5 & r3
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L47
            int r5 = r2 - r0
            int r5 = ~r5
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r7 = r1
        L2e:
            if (r7 >= r5) goto L45
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            r10 = 128(0x80, double:6.32E-322)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L41
            int r8 = r2 << 3
            int r8 = r8 + r7
            r8 = r14[r8]
            android.support.v4.media.session.b.a(r8)
        L41:
            long r3 = r3 >> r6
            int r7 = r7 + 1
            goto L2e
        L45:
            if (r5 != r6) goto L4c
        L47:
            if (r2 == r0) goto L4c
            int r2 = r2 + 1
            goto L14
        L4c:
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r13 > r13 ? 1 : (r13 == r13 ? 0 : -1))
            if (r0 != 0) goto L57
            r13 = -1
        L57:
            r12.f15628b = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.d.f(long):void");
    }

    public final boolean g(long j10, long j11, float[] fArr, int i10, int i11) {
        boolean z10;
        if (C5021n.j(j11, this.f15629c)) {
            z10 = false;
        } else {
            this.f15629c = j11;
            z10 = true;
        }
        if (!C5021n.j(j10, this.f15630d)) {
            this.f15630d = j10;
            z10 = true;
        }
        if (fArr != null) {
            this.f15632f = fArr;
            z10 = true;
        }
        long j12 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (j12 == this.f15631e) {
            return z10;
        }
        this.f15631e = j12;
        return true;
    }

    public final void a(long j10) {
    }
}
