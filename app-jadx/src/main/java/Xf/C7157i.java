package xf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: xf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7157i extends AbstractC7151c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C7157i f64489a = new C7157i();

    /* JADX INFO: renamed from: xf.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {
        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private C7157i() {
        super(null);
    }

    @Override // xf.AbstractC7151c
    public int b() {
        return 0;
    }

    @Override // xf.AbstractC7151c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // xf.AbstractC7151c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(int i10, Void value) {
        AbstractC5504s.h(value, "value");
        throw new IllegalStateException();
    }

    @Override // xf.AbstractC7151c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
