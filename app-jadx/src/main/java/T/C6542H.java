package t;

import Ud.AbstractC2273n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.H, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6542H extends AbstractC6569t {
    public C6542H(int i10) {
        super(i10, null);
    }

    public final boolean d(long j10) {
        g(this.f60129b + 1);
        long[] jArr = this.f60128a;
        int i10 = this.f60129b;
        jArr[i10] = j10;
        this.f60129b = i10 + 1;
        return true;
    }

    public final boolean e(int i10, long[] elements) {
        AbstractC5504s.h(elements, "elements");
        if (i10 < 0 || i10 > this.f60129b) {
            AbstractC6705d.c("");
        }
        if (elements.length == 0) {
            return false;
        }
        g(this.f60129b + elements.length);
        long[] jArr = this.f60128a;
        int i11 = this.f60129b;
        if (i10 != i11) {
            AbstractC2273n.l(jArr, jArr, elements.length + i10, i10, i11);
        }
        AbstractC2273n.q(elements, jArr, i10, 0, 0, 12, null);
        this.f60129b += elements.length;
        return true;
    }

    public final void f() {
        this.f60129b = 0;
    }

    public final void g(int i10) {
        long[] jArr = this.f60128a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            AbstractC5504s.g(jArrCopyOf, "copyOf(...)");
            this.f60128a = jArrCopyOf;
        }
    }

    public final long h(int i10) {
        if (i10 < 0 || i10 >= this.f60129b) {
            AbstractC6705d.c("Index must be between 0 and size");
        }
        long[] jArr = this.f60128a;
        long j10 = jArr[i10];
        int i11 = this.f60129b;
        if (i10 != i11 - 1) {
            AbstractC2273n.l(jArr, jArr, i10, i10 + 1, i11);
        }
        this.f60129b--;
        return j10;
    }

    public final void i(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f60129b) || i11 < 0 || i11 > i12) {
            AbstractC6705d.c("Index must be between 0 and size");
        }
        if (i11 < i10) {
            AbstractC6705d.a("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f60129b;
            if (i11 < i13) {
                long[] jArr = this.f60128a;
                AbstractC2273n.l(jArr, jArr, i10, i11, i13);
            }
            this.f60129b -= i11 - i10;
        }
    }

    public /* synthetic */ C6542H(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
