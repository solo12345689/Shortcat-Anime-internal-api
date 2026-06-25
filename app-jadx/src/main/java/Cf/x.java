package Cf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class x implements i, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f3126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3127b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f3129b;

        a(x xVar) {
            this.f3128a = xVar.f3127b;
            this.f3129b = xVar.f3126a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3128a > 0 && this.f3129b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f3128a;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f3128a = i10 - 1;
            return this.f3129b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(i sequence, int i10) {
        AbstractC5504s.h(sequence, "sequence");
        this.f3126a = sequence;
        this.f3127b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + com.amazon.a.a.o.c.a.b.f34706a).toString());
    }

    @Override // Cf.c
    public i a(int i10) {
        int i11 = this.f3127b;
        return i10 >= i11 ? s.i() : new w(this.f3126a, i10, i11);
    }

    @Override // Cf.c
    public i b(int i10) {
        return i10 >= this.f3127b ? this : new x(this.f3126a, i10);
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a(this);
    }
}
