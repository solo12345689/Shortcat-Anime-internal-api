package d0;

import Ud.AbstractC2270k;
import b0.InterfaceC2967d;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC2270k implements InterfaceC2967d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4553d f44924b;

    public p(C4553d c4553d) {
        this.f44924b = c4553d;
    }

    @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f44924b.containsKey(obj);
    }

    @Override // Ud.AbstractC2261b
    public int d() {
        return this.f44924b.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new q(this.f44924b.q());
    }
}
