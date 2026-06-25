package i0;

import java.util.Set;
import je.InterfaceC5376f;
import kotlin.jvm.internal.AbstractC5496j;

/* JADX INFO: renamed from: i0.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5006y implements Set, InterfaceC5376f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4963G f48539a;

    public AbstractC5006y(C4963G c4963g) {
        this.f48539a = c4963g;
    }

    public final C4963G b() {
        return this.f48539a;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f48539a.clear();
    }

    public int d() {
        return this.f48539a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f48539a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC5496j.b(this, objArr);
    }
}
