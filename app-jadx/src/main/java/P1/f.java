package p1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractC5914b implements Iterable {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f f55698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f55699b = 0;

        a(f fVar) {
            this.f55698a = fVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5916d next() {
            C5916d c5916d = (C5916d) this.f55698a.f55690f.get(this.f55699b);
            this.f55699b++;
            return c5916d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55699b < this.f55698a.size();
        }
    }

    public f(char[] cArr) {
        super(cArr);
    }

    @Override // p1.AbstractC5914b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public f clone() {
        return (f) super.clone();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }
}
