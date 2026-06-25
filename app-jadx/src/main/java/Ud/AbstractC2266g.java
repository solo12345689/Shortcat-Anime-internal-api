package Ud;

import java.util.AbstractCollection;
import java.util.Collection;
import je.InterfaceC5372b;

/* JADX INFO: renamed from: Ud.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2266g extends AbstractCollection implements Collection, InterfaceC5372b {
    protected AbstractC2266g() {
    }

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
