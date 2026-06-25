package Q2;

import Q2.b;
import java.util.Arrays;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f14283g;

    public g(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // Q2.b
    public synchronized void a(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f14283g;
                int i10 = this.f14282f;
                this.f14282f = i10 + 1;
                aVarArr[i10] = aVar.a();
                this.f14281e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // Q2.b
    public synchronized a b() {
        a aVar;
        try {
            this.f14281e++;
            int i10 = this.f14282f;
            if (i10 > 0) {
                a[] aVarArr = this.f14283g;
                int i11 = i10 - 1;
                this.f14282f = i11;
                aVar = (a) AbstractC6614a.e(aVarArr[i11]);
                this.f14283g[this.f14282f] = null;
            } else {
                aVar = new a(new byte[this.f14278b], 0);
                int i12 = this.f14281e;
                a[] aVarArr2 = this.f14283g;
                if (i12 > aVarArr2.length) {
                    this.f14283g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // Q2.b
    public synchronized void c(a aVar) {
        a[] aVarArr = this.f14283g;
        int i10 = this.f14282f;
        this.f14282f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f14281e--;
        notifyAll();
    }

    @Override // Q2.b
    public synchronized void d() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, a0.n(this.f14280d, this.f14278b) - this.f14281e);
            int i11 = this.f14282f;
            if (iMax >= i11) {
                return;
            }
            if (this.f14279c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) AbstractC6614a.e(this.f14283g[i10]);
                    if (aVar.f14266a == this.f14279c) {
                        i10++;
                    } else {
                        a aVar2 = (a) AbstractC6614a.e(this.f14283g[i12]);
                        if (aVar2.f14266a != this.f14279c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f14283g;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f14282f) {
                    return;
                }
            }
            Arrays.fill(this.f14283g, iMax, this.f14282f, (Object) null);
            this.f14282f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Q2.b
    public int e() {
        return this.f14278b;
    }

    public synchronized int f() {
        return this.f14281e * this.f14278b;
    }

    public synchronized void g() {
        if (this.f14277a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f14280d;
        this.f14280d = i10;
        if (z10) {
            d();
        }
    }

    public g(boolean z10, int i10, int i11) {
        AbstractC6614a.a(i10 > 0);
        AbstractC6614a.a(i11 >= 0);
        this.f14277a = z10;
        this.f14278b = i10;
        this.f14282f = i11;
        this.f14283g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f14279c = null;
            return;
        }
        this.f14279c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f14283g[i12] = new a(this.f14279c, i12 * i10);
        }
    }
}
