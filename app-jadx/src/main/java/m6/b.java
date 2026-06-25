package M6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12233a;

    public b(int i10) {
        this.f12233a = i10;
    }

    public final int a() {
        return this.f12233a;
    }

    public String toString() {
        U u10 = U.f52264a;
        String str = String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f12233a)}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }
}
