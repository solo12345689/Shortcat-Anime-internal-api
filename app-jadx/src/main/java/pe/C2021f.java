package Pe;

import Ud.AbstractC2279u;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Pe.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C2021f implements InterfaceC7374h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.c f13869a;

    public C2021f(Xe.c fqNameToMatch) {
        AbstractC5504s.h(fqNameToMatch, "fqNameToMatch");
        this.f13869a = fqNameToMatch;
    }

    @Override // ze.InterfaceC7374h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2020e h(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        if (AbstractC5504s.c(fqName, this.f13869a)) {
            return C2020e.f13867a;
        }
        return null;
    }

    @Override // ze.InterfaceC7374h
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC2279u.m().iterator();
    }

    @Override // ze.InterfaceC7374h
    public boolean k0(Xe.c cVar) {
        return InterfaceC7374h.b.b(this, cVar);
    }
}
