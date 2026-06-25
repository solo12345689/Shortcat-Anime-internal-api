package Cf;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class z implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f3136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f3137b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f3138a;

        a() {
            this.f3138a = z.this.f3136a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3138a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return z.this.f3137b.invoke(this.f3138a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(i sequence, Function1 transformer) {
        AbstractC5504s.h(sequence, "sequence");
        AbstractC5504s.h(transformer, "transformer");
        this.f3136a = sequence;
        this.f3137b = transformer;
    }

    public final i e(Function1 iterator) {
        AbstractC5504s.h(iterator, "iterator");
        return new g(this.f3136a, this.f3137b, iterator);
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a();
    }
}
