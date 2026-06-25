package mg;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f53684c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f53686b = new int[10];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final int a(int i10) {
        return this.f53686b[i10];
    }

    public final int b() {
        if ((this.f53685a & 2) != 0) {
            return this.f53686b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f53685a & 128) != 0) {
            return this.f53686b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f53685a & 16) != 0) {
            return this.f53686b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        return (this.f53685a & 32) != 0 ? this.f53686b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f53685a) != 0;
    }

    public final void g(m other) {
        AbstractC5504s.h(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f53686b;
            if (i10 < iArr.length) {
                this.f53685a = (1 << i10) | this.f53685a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f53685a);
    }
}
