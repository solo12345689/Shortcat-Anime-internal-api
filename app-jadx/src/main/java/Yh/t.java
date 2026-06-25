package Yh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class t {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f23021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f23022b;

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new c(this.f23021a, this.f23022b);
        }

        private b(s sVar, s sVar2) {
            this.f23021a = sVar;
            this.f23022b = sVar2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f23023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f23024b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s next() {
            s sVar = this.f23023a;
            this.f23023a = sVar.e();
            return sVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            s sVar = this.f23023a;
            return (sVar == null || sVar == this.f23024b) ? false : true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        private c(s sVar, s sVar2) {
            this.f23023a = sVar;
            this.f23024b = sVar2;
        }
    }

    public static Iterable a(s sVar, s sVar2) {
        return new b(sVar.e(), sVar2);
    }
}
