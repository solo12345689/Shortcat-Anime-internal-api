package O9;

import O9.u;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements t, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f13104a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t f13105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile transient boolean f13106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient Object f13107d;

        a(t tVar) {
            this.f13105b = (t) n.j(tVar);
        }

        @Override // O9.t
        public Object get() {
            if (!this.f13106c) {
                synchronized (this.f13104a) {
                    try {
                        if (!this.f13106c) {
                            Object obj = this.f13105b.get();
                            this.f13107d = obj;
                            this.f13106c = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return i.a(this.f13107d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f13106c) {
                obj = "<supplier that returned " + this.f13107d + ">";
            } else {
                obj = this.f13105b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final t f13108d = new t() { // from class: O9.v
            @Override // O9.t
            public final Object get() {
                return u.b.a();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f13109a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile t f13110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f13111c;

        b(t tVar) {
            this.f13110b = (t) n.j(tVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // O9.t
        public Object get() {
            t tVar = this.f13110b;
            t tVar2 = f13108d;
            if (tVar != tVar2) {
                synchronized (this.f13109a) {
                    try {
                        if (this.f13110b != tVar2) {
                            Object obj = this.f13110b.get();
                            this.f13111c = obj;
                            this.f13110b = tVar2;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return i.a(this.f13111c);
        }

        public String toString() {
            Object obj = this.f13110b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f13108d) {
                obj = "<supplier that returned " + this.f13111c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements t, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f13112a;

        c(Object obj) {
            this.f13112a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return j.a(this.f13112a, ((c) obj).f13112a);
            }
            return false;
        }

        @Override // O9.t
        public Object get() {
            return this.f13112a;
        }

        public int hashCode() {
            return j.b(this.f13112a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f13112a + ")";
        }
    }

    public static t a(t tVar) {
        return ((tVar instanceof b) || (tVar instanceof a)) ? tVar : tVar instanceof Serializable ? new a(tVar) : new b(tVar);
    }

    public static t b(Object obj) {
        return new c(obj);
    }
}
