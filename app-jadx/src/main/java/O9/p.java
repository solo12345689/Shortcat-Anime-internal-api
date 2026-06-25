package O9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements o, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f13091a;

        @Override // O9.o
        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.f13091a.size(); i10++) {
                if (!((o) this.f13091a.get(i10)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f13091a.equals(((b) obj).f13091a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13091a.hashCode() + 306654252;
        }

        public String toString() {
            return p.d("and", this.f13091a);
        }

        private b(List list) {
            this.f13091a = list;
        }
    }

    public static o b(o oVar, o oVar2) {
        return new b(c((o) n.j(oVar), (o) n.j(oVar2)));
    }

    private static List c(o oVar, o oVar2) {
        return Arrays.asList(oVar, oVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
