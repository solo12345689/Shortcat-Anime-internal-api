package Cf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f3091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f3093c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f3094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3095b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f3096c;

        a() {
            this.f3094a = f.this.f3091a.iterator();
        }

        private final void b() {
            while (this.f3094a.hasNext()) {
                Object next = this.f3094a.next();
                if (((Boolean) f.this.f3093c.invoke(next)).booleanValue() == f.this.f3092b) {
                    this.f3096c = next;
                    this.f3095b = 1;
                    return;
                }
            }
            this.f3095b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3095b == -1) {
                b();
            }
            return this.f3095b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f3095b == -1) {
                b();
            }
            if (this.f3095b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f3096c;
            this.f3096c = null;
            this.f3095b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(i sequence, boolean z10, Function1 predicate) {
        AbstractC5504s.h(sequence, "sequence");
        AbstractC5504s.h(predicate, "predicate");
        this.f3091a = sequence;
        this.f3092b = z10;
        this.f3093c = predicate;
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a();
    }
}
