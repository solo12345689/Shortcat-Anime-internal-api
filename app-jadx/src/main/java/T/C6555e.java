package t;

import Ud.AbstractC2273n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6555e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f60050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60053d;

    public C6555e() {
        this(0, 1, null);
    }

    private final void c() {
        int[] iArr = this.f60050a;
        int length = iArr.length;
        int i10 = this.f60051b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        AbstractC2273n.k(iArr, iArr2, 0, i10, length);
        AbstractC2273n.k(this.f60050a, iArr2, i11, 0, this.f60051b);
        this.f60050a = iArr2;
        this.f60051b = 0;
        this.f60052c = length;
        this.f60053d = i12 - 1;
    }

    public final void a(int i10) {
        int[] iArr = this.f60050a;
        int i11 = this.f60052c;
        iArr[i11] = i10;
        int i12 = this.f60053d & (i11 + 1);
        this.f60052c = i12;
        if (i12 == this.f60051b) {
            c();
        }
    }

    public final void b() {
        this.f60052c = this.f60051b;
    }

    public final boolean d() {
        return this.f60051b == this.f60052c;
    }

    public final int e() {
        int i10 = this.f60051b;
        if (i10 == this.f60052c) {
            C6556f c6556f = C6556f.f60059a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f60050a[i10];
        this.f60051b = (i10 + 1) & this.f60053d;
        return i11;
    }

    public C6555e(int i10) {
        if (!(i10 >= 1)) {
            AbstractC6705d.a("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            AbstractC6705d.a("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f60053d = i10 - 1;
        this.f60050a = new int[i10];
    }

    public /* synthetic */ C6555e(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
