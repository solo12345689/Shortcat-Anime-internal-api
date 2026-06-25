package X1;

import Ud.S;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21618a;

        public a(String name) {
            AbstractC5504s.h(name, "name");
            this.f21618a = name;
        }

        public final String a() {
            return this.f21618a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return AbstractC5504s.c(this.f21618a, ((a) obj).f21618a);
            }
            return false;
        }

        public int hashCode() {
            return this.f21618a.hashCode();
        }

        public String toString() {
            return this.f21618a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(S.B(a()), false);
    }

    public final f d() {
        return new c(S.B(a()), true);
    }
}
