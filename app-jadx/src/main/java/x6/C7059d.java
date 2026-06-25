package x6;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: x6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7059d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f63945b;

    public C7059d(int i10) {
        this.f63944a = i10;
        this.f63945b = new LinkedHashSet(i10);
    }

    public final synchronized boolean a(Object obj) {
        try {
            if (this.f63945b.size() == this.f63944a) {
                LinkedHashSet linkedHashSet = this.f63945b;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.f63945b.remove(obj);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f63945b.add(obj);
    }

    public final synchronized boolean b(Object obj) {
        return this.f63945b.contains(obj);
    }
}
