package Vh;

import Yh.AbstractC2491a;
import Yh.v;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class l extends ai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yh.n f20444a = new Yh.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f20445b = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends ai.b {
        @Override // ai.e
        public ai.f a(ai.h hVar, ai.g gVar) {
            return (hVar.b() < Xh.f.f22055a || hVar.c() || (hVar.e().f() instanceof v)) ? ai.f.c() : ai.f.d(new l()).a(hVar.getColumn() + Xh.f.f22055a);
        }
    }

    @Override // ai.a, ai.d
    public void e(Zh.f fVar) {
        this.f20445b.add(fVar.a());
    }

    @Override // ai.d
    public AbstractC2491a f() {
        return this.f20444a;
    }

    @Override // ai.a, ai.d
    public void h() {
        int size = this.f20445b.size() - 1;
        while (size >= 0 && Xh.f.f((CharSequence) this.f20445b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < size + 1; i10++) {
            sb2.append((CharSequence) this.f20445b.get(i10));
            sb2.append('\n');
        }
        this.f20444a.o(sb2.toString());
    }

    @Override // ai.d
    public ai.c i(ai.h hVar) {
        return hVar.b() >= Xh.f.f22055a ? ai.c.a(hVar.getColumn() + Xh.f.f22055a) : hVar.c() ? ai.c.b(hVar.d()) : ai.c.d();
    }
}
