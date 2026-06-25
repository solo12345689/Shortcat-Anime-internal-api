package M2;

import P9.AbstractC2011u;
import java.util.List;

/* JADX INFO: renamed from: M2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1921k implements InterfaceC1920j {
    @Override // M2.InterfaceC1920j
    public d0 a(List list, List list2) {
        return new C1919i(list, list2);
    }

    @Override // M2.InterfaceC1920j
    public d0 empty() {
        return new C1919i(AbstractC2011u.A(), AbstractC2011u.A());
    }
}
