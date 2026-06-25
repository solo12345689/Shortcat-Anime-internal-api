package xa;

import java.util.Collections;
import java.util.Map;
import xa.AbstractC7090p;

/* JADX INFO: renamed from: xa.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7084j {

    /* JADX INFO: renamed from: b */
    private static boolean f64236b = true;

    /* JADX INFO: renamed from: c */
    private static volatile C7084j f64237c;

    /* JADX INFO: renamed from: d */
    static final C7084j f64238d = new C7084j(true);

    /* JADX INFO: renamed from: a */
    private final Map f64239a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: xa.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Object f64240a;

        /* JADX INFO: renamed from: b */
        private final int f64241b;

        a(Object obj, int i10) {
            this.f64240a = obj;
            this.f64241b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f64240a == aVar.f64240a && this.f64241b == aVar.f64241b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f64240a) * 65535) + this.f64241b;
        }
    }

    C7084j(boolean z10) {
    }

    public static C7084j b() {
        C7084j c7084jA;
        if (!f64236b) {
            return f64238d;
        }
        C7084j c7084j = f64237c;
        if (c7084j != null) {
            return c7084j;
        }
        synchronized (C7084j.class) {
            try {
                c7084jA = f64237c;
                if (c7084jA == null) {
                    c7084jA = AbstractC7083i.a();
                    f64237c = c7084jA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7084jA;
    }

    public AbstractC7090p.c a(InterfaceC7070D interfaceC7070D, int i10) {
        android.support.v4.media.session.b.a(this.f64239a.get(new a(interfaceC7070D, i10)));
        return null;
    }
}
