package Ud;

import java.util.AbstractList;
import java.util.List;
import je.InterfaceC5374d;

/* JADX INFO: renamed from: Ud.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2267h extends AbstractList implements List, InterfaceC5374d {
    protected AbstractC2267h() {
    }

    public abstract int b();

    public abstract Object d(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return d(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
