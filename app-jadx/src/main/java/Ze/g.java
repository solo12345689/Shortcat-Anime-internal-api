package Ze;

import Ze.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: b */
    private static final g f23312b = new g(true);

    /* JADX INFO: renamed from: a */
    private final Map f23313a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Object f23314a;

        /* JADX INFO: renamed from: b */
        private final int f23315b;

        a(Object obj, int i10) {
            this.f23314a = obj;
            this.f23315b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23314a == aVar.f23314a && this.f23315b == aVar.f23315b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f23314a) * 65535) + this.f23315b;
        }
    }

    g() {
        this.f23313a = new HashMap();
    }

    public static g c() {
        return f23312b;
    }

    public static g d() {
        return new g();
    }

    public final void a(i.f fVar) {
        this.f23313a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public i.f b(p pVar, int i10) {
        return (i.f) this.f23313a.get(new a(pVar, i10));
    }

    private g(boolean z10) {
        this.f23313a = Collections.EMPTY_MAP;
    }
}
