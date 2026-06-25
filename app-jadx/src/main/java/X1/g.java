package X1;

import X1.f;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final f a() {
        return new c(null, true, true ? 1 : 0, 0 == true ? 1 : 0);
    }

    public static final c b(f.b... pairs) {
        AbstractC5504s.h(pairs, "pairs");
        c cVar = new c(null, false, 1, 0 == true ? 1 : 0);
        cVar.g((f.b[]) Arrays.copyOf(pairs, pairs.length));
        return cVar;
    }
}
