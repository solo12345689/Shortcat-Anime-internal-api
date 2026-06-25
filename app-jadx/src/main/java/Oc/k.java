package oc;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5856e f55356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f55357b;

    public k(InterfaceC5856e typedArray) {
        AbstractC5504s.h(typedArray, "typedArray");
        this.f55356a = typedArray;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f55357b < this.f55356a.getLength();
    }

    @Override // java.util.Iterator
    public Object next() {
        InterfaceC5856e interfaceC5856e = this.f55356a;
        int i10 = this.f55357b;
        this.f55357b = i10 + 1;
        return interfaceC5856e.get(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
