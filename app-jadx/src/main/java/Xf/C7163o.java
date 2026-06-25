package xf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: xf.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7163o extends AbstractC7151c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f64498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f64499b;

    /* JADX INFO: renamed from: xf.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f64500a = true;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64500a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f64500a) {
                throw new NoSuchElementException();
            }
            this.f64500a = false;
            return C7163o.this.f();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7163o(Object value, int i10) {
        super(null);
        AbstractC5504s.h(value, "value");
        this.f64498a = value;
        this.f64499b = i10;
    }

    @Override // xf.AbstractC7151c
    public int b() {
        return 1;
    }

    @Override // xf.AbstractC7151c
    public void d(int i10, Object value) {
        AbstractC5504s.h(value, "value");
        throw new IllegalStateException();
    }

    public final int e() {
        return this.f64499b;
    }

    public final Object f() {
        return this.f64498a;
    }

    @Override // xf.AbstractC7151c
    public Object get(int i10) {
        if (i10 == this.f64499b) {
            return this.f64498a;
        }
        return null;
    }

    @Override // xf.AbstractC7151c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
