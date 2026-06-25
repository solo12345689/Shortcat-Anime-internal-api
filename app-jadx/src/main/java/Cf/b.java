package Cf;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements i, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f3080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3081b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f3082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3083b;

        a(b bVar) {
            this.f3082a = bVar.f3080a.iterator();
            this.f3083b = bVar.f3081b;
        }

        private final void b() {
            while (this.f3083b > 0 && this.f3082a.hasNext()) {
                this.f3082a.next();
                this.f3083b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f3082a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            return this.f3082a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(i sequence, int i10) {
        AbstractC5504s.h(sequence, "sequence");
        this.f3080a = sequence;
        this.f3081b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + com.amazon.a.a.o.c.a.b.f34706a).toString());
    }

    @Override // Cf.c
    public i a(int i10) {
        int i11 = this.f3081b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f3080a, i11);
    }

    @Override // Cf.c
    public i b(int i10) {
        int i11 = this.f3081b;
        int i12 = i11 + i10;
        return i12 < 0 ? new x(this, i10) : new w(this.f3080a, i11, i12);
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a(this);
    }
}
