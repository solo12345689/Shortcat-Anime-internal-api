package m1;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f53009r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f53010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53011b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f53015f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f53019j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53012c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f53013d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53014e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f53016g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f53017h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f53018i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    C5623b[] f53020k = new C5623b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f53021l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f53022m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f53023n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f53024o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f53025p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    HashSet f53026q = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f53019j = aVar;
    }

    static void c() {
        f53009r++;
    }

    public final void a(C5623b c5623b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f53021l;
            if (i10 >= i11) {
                C5623b[] c5623bArr = this.f53020k;
                if (i11 >= c5623bArr.length) {
                    this.f53020k = (C5623b[]) Arrays.copyOf(c5623bArr, c5623bArr.length * 2);
                }
                C5623b[] c5623bArr2 = this.f53020k;
                int i12 = this.f53021l;
                c5623bArr2[i12] = c5623b;
                this.f53021l = i12 + 1;
                return;
            }
            if (this.f53020k[i10] == c5623b) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f53012c - iVar.f53012c;
    }

    public final void h(C5623b c5623b) {
        int i10 = this.f53021l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f53020k[i11] == c5623b) {
                while (i11 < i10 - 1) {
                    C5623b[] c5623bArr = this.f53020k;
                    int i12 = i11 + 1;
                    c5623bArr[i11] = c5623bArr[i12];
                    i11 = i12;
                }
                this.f53021l--;
                return;
            }
            i11++;
        }
    }

    public void k() {
        this.f53011b = null;
        this.f53019j = a.UNKNOWN;
        this.f53014e = 0;
        this.f53012c = -1;
        this.f53013d = -1;
        this.f53015f = 0.0f;
        this.f53016g = false;
        this.f53023n = false;
        this.f53024o = -1;
        this.f53025p = 0.0f;
        int i10 = this.f53021l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f53020k[i11] = null;
        }
        this.f53021l = 0;
        this.f53022m = 0;
        this.f53010a = false;
        Arrays.fill(this.f53018i, 0.0f);
    }

    public void m(C5625d c5625d, float f10) {
        this.f53015f = f10;
        this.f53016g = true;
        this.f53023n = false;
        this.f53024o = -1;
        this.f53025p = 0.0f;
        int i10 = this.f53021l;
        this.f53013d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f53020k[i11].A(c5625d, this, false);
        }
        this.f53021l = 0;
    }

    public void n(a aVar, String str) {
        this.f53019j = aVar;
    }

    public final void p(C5625d c5625d, C5623b c5623b) {
        int i10 = this.f53021l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f53020k[i11].B(c5625d, c5623b, false);
        }
        this.f53021l = 0;
    }

    public String toString() {
        if (this.f53011b != null) {
            return "" + this.f53011b;
        }
        return "" + this.f53012c;
    }
}
