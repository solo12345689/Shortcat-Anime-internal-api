package t;

import Ud.AbstractC2273n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6539E extends AbstractC6563m {
    public C6539E(int i10) {
        super(i10, null);
    }

    public final void g(int i10, int i11) {
        if (i10 < 0 || i10 > this.f60103b) {
            AbstractC6705d.c("Index must be between 0 and size");
        }
        k(this.f60103b + 1);
        int[] iArr = this.f60102a;
        int i12 = this.f60103b;
        if (i10 != i12) {
            AbstractC2273n.k(iArr, iArr, i10 + 1, i10, i12);
        }
        iArr[i10] = i11;
        this.f60103b++;
    }

    public final boolean h(int i10) {
        k(this.f60103b + 1);
        int[] iArr = this.f60102a;
        int i11 = this.f60103b;
        iArr[i11] = i10;
        this.f60103b = i11 + 1;
        return true;
    }

    public final boolean i(int i10, int[] elements) {
        AbstractC5504s.h(elements, "elements");
        if (i10 < 0 || i10 > this.f60103b) {
            AbstractC6705d.c("");
        }
        if (elements.length == 0) {
            return false;
        }
        k(this.f60103b + elements.length);
        int[] iArr = this.f60102a;
        int i11 = this.f60103b;
        if (i10 != i11) {
            AbstractC2273n.k(iArr, iArr, elements.length + i10, i10, i11);
        }
        AbstractC2273n.p(elements, iArr, i10, 0, 0, 12, null);
        this.f60103b += elements.length;
        return true;
    }

    public final void j() {
        this.f60103b = 0;
    }

    public final void k(int i10) {
        int[] iArr = this.f60102a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
            this.f60102a = iArrCopyOf;
        }
    }

    public final int l(int i10) {
        if (i10 < 0 || i10 >= this.f60103b) {
            AbstractC6705d.c("Index must be between 0 and size");
        }
        int[] iArr = this.f60102a;
        int i11 = iArr[i10];
        int i12 = this.f60103b;
        if (i10 != i12 - 1) {
            AbstractC2273n.k(iArr, iArr, i10, i10 + 1, i12);
        }
        this.f60103b--;
        return i11;
    }

    public final void m(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f60103b) || i11 < 0 || i11 > i12) {
            AbstractC6705d.c("Index must be between 0 and size");
        }
        if (i11 < i10) {
            AbstractC6705d.a("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f60103b;
            if (i11 < i13) {
                int[] iArr = this.f60102a;
                AbstractC2273n.k(iArr, iArr, i10, i11, i13);
            }
            this.f60103b -= i11 - i10;
        }
    }

    public final int n(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f60103b) {
            AbstractC6705d.c("Index must be between 0 and size");
        }
        int[] iArr = this.f60102a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public final void o() {
        int i10 = this.f60103b;
        if (i10 == 0) {
            return;
        }
        AbstractC2273n.G(this.f60102a, 0, i10);
    }

    public /* synthetic */ C6539E(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
