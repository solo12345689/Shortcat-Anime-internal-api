package Ud;

import java.util.AbstractSet;
import java.util.Set;
import je.InterfaceC5376f;

/* JADX INFO: renamed from: Ud.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2269j extends AbstractSet implements Set, InterfaceC5376f {
    protected AbstractC2269j() {
    }

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
