package V5;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: renamed from: V5.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2315f extends AbstractC2310a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Drawable[] f19797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f19798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f19801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f19802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f19803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int[] f19804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int[] f19805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f19806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean[] f19807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f19808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private l6.m f19809u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f19810v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f19811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f19812x;

    public C2315f(Drawable[] drawableArr, boolean z10, int i10) {
        super(drawableArr);
        this.f19812x = true;
        y5.k.j(drawableArr.length >= 1, "At least one layer required!");
        this.f19797i = drawableArr;
        this.f19804p = new int[drawableArr.length];
        this.f19805q = new int[drawableArr.length];
        this.f19806r = 255;
        this.f19807s = new boolean[drawableArr.length];
        this.f19808t = 0;
        this.f19798j = z10;
        this.f19799k = z10 ? 255 : 0;
        this.f19800l = i10;
        t();
    }

    private void h(Canvas canvas, Drawable drawable, int i10) {
        if (drawable == null || i10 <= 0) {
            return;
        }
        this.f19808t++;
        if (this.f19812x) {
            drawable.mutate();
        }
        drawable.setAlpha(i10);
        this.f19808t--;
        drawable.draw(canvas);
    }

    private void p() {
        if (this.f19810v) {
            this.f19810v = false;
            l6.m mVar = this.f19809u;
            if (mVar != null) {
                mVar.c();
            }
        }
    }

    private void r() {
        int i10;
        if (!this.f19810v && (i10 = this.f19800l) >= 0) {
            boolean[] zArr = this.f19807s;
            if (i10 < zArr.length && zArr[i10]) {
                this.f19810v = true;
                l6.m mVar = this.f19809u;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    private void s() {
        if (this.f19811w && this.f19801m == 2 && this.f19807s[this.f19800l]) {
            l6.m mVar = this.f19809u;
            if (mVar != null) {
                mVar.b();
            }
            this.f19811w = false;
        }
    }

    private void t() {
        this.f19801m = 2;
        Arrays.fill(this.f19804p, this.f19799k);
        this.f19804p[0] = 255;
        Arrays.fill(this.f19805q, this.f19799k);
        this.f19805q[0] = 255;
        Arrays.fill(this.f19807s, this.f19798j);
        this.f19807s[0] = true;
    }

    private boolean v(float f10) {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f19797i.length; i10++) {
            boolean z11 = this.f19807s[i10];
            int i11 = z11 ? 1 : -1;
            int[] iArr = this.f19805q;
            int i12 = (int) (this.f19804p[i10] + (i11 * 255 * f10));
            iArr[i10] = i12;
            if (i12 < 0) {
                iArr[i10] = 0;
            }
            if (iArr[i10] > 255) {
                iArr[i10] = 255;
            }
            if (z11 && iArr[i10] < 255) {
                z10 = false;
            }
            if (!z11 && iArr[i10] > 0) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[EDGE_INSN: B:33:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f19801m
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 == r3) goto La
            goto L52
        La:
            int r0 = r8.f19802n
            if (r0 <= 0) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r2
        L11:
            y5.k.i(r0)
            long r4 = r8.o()
            long r6 = r8.f19803o
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f19802n
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.v(r0)
            if (r0 == 0) goto L27
            goto L28
        L27:
            r1 = r3
        L28:
            r8.f19801m = r1
        L2a:
            r3 = r0
            goto L52
        L2c:
            int[] r0 = r8.f19805q
            int[] r4 = r8.f19804p
            android.graphics.drawable.Drawable[] r5 = r8.f19797i
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.o()
            r8.f19803o = r4
            int r0 = r8.f19802n
            if (r0 != 0) goto L43
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L43:
            r0 = 0
        L44:
            boolean r0 = r8.v(r0)
            r8.r()
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r3
        L4f:
            r8.f19801m = r1
            goto L2a
        L52:
            android.graphics.drawable.Drawable[] r0 = r8.f19797i
            int r1 = r0.length
            if (r2 >= r1) goto L72
            r0 = r0[r2]
            int[] r1 = r8.f19805q
            r1 = r1[r2]
            int r4 = r8.f19806r
            int r1 = r1 * r4
            double r4 = (double) r1
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            r8.h(r9, r0, r1)
            int r2 = r2 + 1
            goto L52
        L72:
            if (r3 == 0) goto L7b
            r8.p()
            r8.s()
            return
        L7b:
            r8.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.C2315f.draw(android.graphics.Canvas):void");
    }

    public void g() {
        this.f19808t++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19806r;
    }

    public void i() {
        this.f19808t--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f19808t == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f19801m = 0;
        Arrays.fill(this.f19807s, true);
        invalidateSelf();
    }

    public void k(int i10) {
        this.f19801m = 0;
        this.f19807s[i10] = true;
        invalidateSelf();
    }

    public void m(int i10) {
        this.f19801m = 0;
        this.f19807s[i10] = false;
        invalidateSelf();
    }

    public void n() {
        this.f19801m = 2;
        for (int i10 = 0; i10 < this.f19797i.length; i10++) {
            this.f19805q[i10] = this.f19807s[i10] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long o() {
        return SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f19806r != i10) {
            this.f19806r = i10;
            invalidateSelf();
        }
    }

    public void u(int i10) {
        this.f19802n = i10;
        if (this.f19801m == 1) {
            this.f19801m = 0;
        }
    }
}
