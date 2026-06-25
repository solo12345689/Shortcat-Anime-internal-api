package Vh;

import Yh.AbstractC2491a;
import Yh.C2492b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class c extends ai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2492b f20391a = new C2492b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends ai.b {
        @Override // ai.e
        public ai.f a(ai.h hVar, ai.g gVar) {
            int iD = hVar.d();
            if (!c.l(hVar, iD)) {
                return ai.f.c();
            }
            int column = hVar.getColumn() + hVar.b();
            int i10 = column + 1;
            if (Xh.f.j(hVar.a().a(), iD + 1)) {
                i10 = column + 2;
            }
            return ai.f.d(new c()).a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(ai.h hVar, int i10) {
        CharSequence charSequenceA = hVar.a().a();
        return hVar.b() < Xh.f.f22055a && i10 < charSequenceA.length() && charSequenceA.charAt(i10) == '>';
    }

    @Override // ai.a, ai.d
    public boolean a() {
        return true;
    }

    @Override // ai.a, ai.d
    public boolean c(AbstractC2491a abstractC2491a) {
        return true;
    }

    @Override // ai.d
    public ai.c i(ai.h hVar) {
        int iD = hVar.d();
        if (!l(hVar, iD)) {
            return ai.c.d();
        }
        int column = hVar.getColumn() + hVar.b();
        int i10 = column + 1;
        if (Xh.f.j(hVar.a().a(), iD + 1)) {
            i10 = column + 2;
        }
        return ai.c.a(i10);
    }

    @Override // ai.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2492b f() {
        return this.f20391a;
    }
}
