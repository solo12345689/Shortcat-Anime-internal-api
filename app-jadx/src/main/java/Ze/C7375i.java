package ze;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: ze.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7375i implements InterfaceC7374h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f66226a;

    public C7375i(List annotations) {
        AbstractC5504s.h(annotations, "annotations");
        this.f66226a = annotations;
    }

    @Override // ze.InterfaceC7374h
    public InterfaceC7369c h(Xe.c cVar) {
        return InterfaceC7374h.b.a(this, cVar);
    }

    @Override // ze.InterfaceC7374h
    public boolean isEmpty() {
        return this.f66226a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f66226a.iterator();
    }

    @Override // ze.InterfaceC7374h
    public boolean k0(Xe.c cVar) {
        return InterfaceC7374h.b.b(this, cVar);
    }

    public String toString() {
        return this.f66226a.toString();
    }
}
