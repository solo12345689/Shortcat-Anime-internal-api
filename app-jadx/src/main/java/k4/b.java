package K4;

import G4.f;
import G4.i;
import G4.q;
import K4.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f10873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f10874b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements c.a {
        @Override // K4.c.a
        public c a(d dVar, i iVar) {
            return new b(dVar, iVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(d dVar, i iVar) {
        this.f10873a = dVar;
        this.f10874b = iVar;
    }

    @Override // K4.c
    public void a() {
        i iVar = this.f10874b;
        if (iVar instanceof q) {
            this.f10873a.a(((q) iVar).a());
        } else if (iVar instanceof f) {
            this.f10873a.d(iVar.a());
        }
    }
}
