package Ud;

import ie.InterfaceC5082a;
import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class M implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5082a f19490a;

    public M(InterfaceC5082a iteratorFactory) {
        AbstractC5504s.h(iteratorFactory, "iteratorFactory");
        this.f19490a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new N((Iterator) this.f19490a.invoke());
    }
}
