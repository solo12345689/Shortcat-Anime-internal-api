package d0;

import Ud.AbstractC2261b;
import b0.InterfaceC2965b;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC2261b implements InterfaceC2965b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4553d f44925a;

    public r(C4553d c4553d) {
        this.f44925a = c4553d;
    }

    @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f44925a.containsValue(obj);
    }

    @Override // Ud.AbstractC2261b
    public int d() {
        return this.f44925a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new s(this.f44925a.q());
    }
}
