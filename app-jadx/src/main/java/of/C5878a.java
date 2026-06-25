package of;

import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import ze.InterfaceC7369c;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: of.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C5878a implements InterfaceC7374h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f55457b = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C5878a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6044i f55458a;

    public C5878a(pf.n storageManager, InterfaceC5082a compute) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(compute, "compute");
        this.f55458a = storageManager.c(compute);
    }

    private final List b() {
        return (List) AbstractC6048m.a(this.f55458a, this, f55457b[0]);
    }

    @Override // ze.InterfaceC7374h
    public InterfaceC7369c h(Xe.c cVar) {
        return InterfaceC7374h.b.a(this, cVar);
    }

    @Override // ze.InterfaceC7374h
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return b().iterator();
    }

    @Override // ze.InterfaceC7374h
    public boolean k0(Xe.c cVar) {
        return InterfaceC7374h.b.b(this, cVar);
    }
}
