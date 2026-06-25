package S4;

import java.security.MessageDigest;
import o5.C5825b;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements f {

    /* JADX INFO: renamed from: b */
    private final C6551a f15948b = new C5825b();

    private static void f(g gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f15948b.size(); i10++) {
            f((g) this.f15948b.g(i10), this.f15948b.k(i10), messageDigest);
        }
    }

    public Object c(g gVar) {
        return this.f15948b.containsKey(gVar) ? this.f15948b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f15948b.h(hVar.f15948b);
    }

    public h e(g gVar, Object obj) {
        this.f15948b.put(gVar, obj);
        return this;
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f15948b.equals(((h) obj).f15948b);
        }
        return false;
    }

    @Override // S4.f
    public int hashCode() {
        return this.f15948b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f15948b + '}';
    }
}
