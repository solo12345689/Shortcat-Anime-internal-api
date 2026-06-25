package G4;

import Td.z;
import Ud.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: b */
    public static final b f7369b = new b(null);

    /* JADX INFO: renamed from: c */
    public static final n f7370c = new n();

    /* JADX INFO: renamed from: a */
    private final Map f7371a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Map f7372a;

        public a(n nVar) {
            this.f7372a = S.B(nVar.f7371a);
        }

        public final n a() {
            return new n(L4.c.b(this.f7372a), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ n(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map d() {
        if (isEmpty()) {
            return S.i();
        }
        Map map = this.f7371a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        android.support.v4.media.session.b.a(((Map.Entry) it.next()).getValue());
        throw null;
    }

    public final a e() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && AbstractC5504s.c(this.f7371a, ((n) obj).f7371a);
    }

    public int hashCode() {
        return this.f7371a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f7371a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map map = this.f7371a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            android.support.v4.media.session.b.a(entry.getValue());
            arrayList.add(z.a(str, null));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.f7371a + ')';
    }

    private n(Map map) {
        this.f7371a = map;
    }

    public n() {
        this(S.i());
    }
}
