package i0;

import Ud.AbstractC2273n;

/* JADX INFO: renamed from: i0.M, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4969M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f48432b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g0.z[] f48433c = new g0.z[16];

    private final int b(Object obj, int i10) {
        int i11 = this.f48431a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f48432b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    g0.z zVar = this.f48433c[i13];
                    return obj == (zVar != null ? zVar.get() : null) ? i13 : c(i13, obj, i10);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.f48431a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.f48432b[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.f48433c[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.f48431a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.f48432b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            g0.z[] r2 = r3.f48433c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f48431a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.f48432b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            g0.z[] r2 = r3.f48433c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.f48431a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C4969M.c(int, java.lang.Object, int):int");
    }

    public final boolean a(Object obj) {
        int iB;
        int i10 = this.f48431a;
        int iA = g0.t.a(obj);
        if (i10 > 0) {
            iB = b(obj, iA);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i11 = -(iB + 1);
        g0.z[] zVarArr = this.f48433c;
        int length = zVarArr.length;
        if (i10 == length) {
            int i12 = length * 2;
            g0.z[] zVarArr2 = new g0.z[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            System.arraycopy(zVarArr, i11, zVarArr2, i13, i10 - i11);
            System.arraycopy(this.f48433c, 0, zVarArr2, 0, i11);
            AbstractC2273n.k(this.f48432b, iArr, i13, i11, i10);
            AbstractC2273n.p(this.f48432b, iArr, 0, 0, i11, 6, null);
            this.f48433c = zVarArr2;
            this.f48432b = iArr;
        } else {
            int i14 = i11 + 1;
            System.arraycopy(zVarArr, i11, zVarArr, i14, i10 - i11);
            int[] iArr2 = this.f48432b;
            AbstractC2273n.k(iArr2, iArr2, i14, i11, i10);
        }
        this.f48433c[i11] = new g0.z(obj);
        this.f48432b[i11] = iA;
        this.f48431a++;
        return true;
    }

    public final int[] d() {
        return this.f48432b;
    }

    public final int e() {
        return this.f48431a;
    }

    public final g0.z[] f() {
        return this.f48433c;
    }

    public final void g(int i10) {
        this.f48431a = i10;
    }
}
