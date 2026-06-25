package U2;

import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface J {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f18918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f18919b;

        public a(K k10) {
            this(k10, k10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f18918a.equals(aVar.f18918a) && this.f18919b.equals(aVar.f18919b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f18918a.hashCode() * 31) + this.f18919b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f18918a);
            if (this.f18918a.equals(this.f18919b)) {
                str = "";
            } else {
                str = ", " + this.f18919b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(K k10, K k11) {
            this.f18918a = (K) AbstractC6614a.e(k10);
            this.f18919b = (K) AbstractC6614a.e(k11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f18920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f18921b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // U2.J
        public a g(long j10) {
            return this.f18921b;
        }

        @Override // U2.J
        public boolean k() {
            return false;
        }

        @Override // U2.J
        public long n() {
            return this.f18920a;
        }

        public b(long j10, long j11) {
            this.f18920a = j10;
            this.f18921b = new a(j11 == 0 ? K.f18922c : new K(0L, j11));
        }
    }

    a g(long j10);

    boolean k();

    long n();
}
