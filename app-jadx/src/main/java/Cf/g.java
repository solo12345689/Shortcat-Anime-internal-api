package Cf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f3098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f3099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f3100c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f3101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f3102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3103c;

        a() {
            this.f3101a = g.this.f3098a.iterator();
        }

        private final boolean b() {
            Iterator it = this.f3102b;
            if (it != null && it.hasNext()) {
                this.f3103c = 1;
                return true;
            }
            while (this.f3101a.hasNext()) {
                Iterator it2 = (Iterator) g.this.f3100c.invoke(g.this.f3099b.invoke(this.f3101a.next()));
                if (it2.hasNext()) {
                    this.f3102b = it2;
                    this.f3103c = 1;
                    return true;
                }
            }
            this.f3103c = 2;
            this.f3102b = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f3103c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f3103c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !b()) {
                throw new NoSuchElementException();
            }
            this.f3103c = 0;
            Iterator it = this.f3102b;
            AbstractC5504s.e(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(i sequence, Function1 transformer, Function1 iterator) {
        AbstractC5504s.h(sequence, "sequence");
        AbstractC5504s.h(transformer, "transformer");
        AbstractC5504s.h(iterator, "iterator");
        this.f3098a = sequence;
        this.f3099b = transformer;
        this.f3100c = iterator;
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a();
    }
}
