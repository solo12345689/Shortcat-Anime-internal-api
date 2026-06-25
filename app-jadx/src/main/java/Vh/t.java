package Vh;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class t implements bi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f20490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20491b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList f20492c = new LinkedList();

    t(char c10) {
        this.f20490a = c10;
    }

    private bi.a f(int i10) {
        for (bi.a aVar : this.f20492c) {
            if (aVar.b() <= i10) {
                return aVar;
            }
        }
        return (bi.a) this.f20492c.getFirst();
    }

    @Override // bi.a
    public char a() {
        return this.f20490a;
    }

    @Override // bi.a
    public int b() {
        return this.f20491b;
    }

    @Override // bi.a
    public char c() {
        return this.f20490a;
    }

    @Override // bi.a
    public int d(bi.b bVar, bi.b bVar2) {
        return f(bVar.length()).d(bVar, bVar2);
    }

    void e(bi.a aVar) {
        int iB = aVar.b();
        ListIterator listIterator = this.f20492c.listIterator();
        while (listIterator.hasNext()) {
            bi.a aVar2 = (bi.a) listIterator.next();
            int iB2 = aVar2.b();
            if (iB > iB2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iB == iB2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f20490a + "' and minimum length " + iB + "; conflicting processors: " + aVar2 + ", " + aVar);
            }
        }
        this.f20492c.add(aVar);
        this.f20491b = iB;
    }
}
