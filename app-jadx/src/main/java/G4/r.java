package G4;

import Ud.S;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: b */
    public static final a f7383b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final r f7384c = new r(S.i());

    /* JADX INFO: renamed from: a */
    private final Map f7385a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(Map map) {
            return new r(L4.c.b(map), null);
        }

        private a() {
        }
    }

    public /* synthetic */ r(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map a() {
        return this.f7385a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && AbstractC5504s.c(this.f7385a, ((r) obj).f7385a);
    }

    public int hashCode() {
        return this.f7385a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f7385a + ')';
    }

    private r(Map map) {
        this.f7385a = map;
    }
}
