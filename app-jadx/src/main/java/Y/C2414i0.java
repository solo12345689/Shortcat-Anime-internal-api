package Y;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Y.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2414i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f22337a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22338b;

    private final int[] i() {
        int[] iArr = this.f22337a;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
        this.f22337a = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void a() {
        this.f22338b = 0;
    }

    public final int b(int i10) {
        int[] iArr = this.f22337a;
        int iMin = Math.min(iArr.length, this.f22338b);
        for (int i11 = 0; i11 < iMin; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final int c() {
        return this.f22337a[this.f22338b - 1];
    }

    public final int d(int i10) {
        return this.f22337a[i10];
    }

    public final int e() {
        return this.f22337a[this.f22338b - 2];
    }

    public final int f(int i10) {
        int i11 = this.f22338b - 1;
        return i11 >= 0 ? this.f22337a[i11] : i10;
    }

    public final int g() {
        int[] iArr = this.f22337a;
        int i10 = this.f22338b - 1;
        this.f22338b = i10;
        return iArr[i10];
    }

    public final void h(int i10) {
        int[] iArrI = this.f22337a;
        if (this.f22338b >= iArrI.length) {
            iArrI = i();
        }
        int i11 = this.f22338b;
        this.f22338b = i11 + 1;
        iArrI[i11] = i10;
    }
}
