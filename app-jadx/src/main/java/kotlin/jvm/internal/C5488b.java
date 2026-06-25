package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C5488b implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f52274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52275b;

    public C5488b(Object[] array) {
        AbstractC5504s.h(array, "array");
        this.f52274a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52275b < this.f52274a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f52274a;
            int i10 = this.f52275b;
            this.f52275b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f52275b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
