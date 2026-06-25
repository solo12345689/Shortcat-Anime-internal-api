package Cf;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f3084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f3085b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f3086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3087b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f3088c;

        a() {
            this.f3086a = d.this.f3084a.iterator();
        }

        private final void b() {
            while (this.f3086a.hasNext()) {
                Object next = this.f3086a.next();
                if (!((Boolean) d.this.f3085b.invoke(next)).booleanValue()) {
                    this.f3088c = next;
                    this.f3087b = 1;
                    return;
                }
            }
            this.f3087b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3087b == -1) {
                b();
            }
            return this.f3087b == 1 || this.f3086a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f3087b == -1) {
                b();
            }
            if (this.f3087b != 1) {
                return this.f3086a.next();
            }
            Object obj = this.f3088c;
            this.f3088c = null;
            this.f3087b = 0;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(i sequence, Function1 predicate) {
        AbstractC5504s.h(sequence, "sequence");
        AbstractC5504s.h(predicate, "predicate");
        this.f3084a = sequence;
        this.f3085b = predicate;
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a();
    }
}
