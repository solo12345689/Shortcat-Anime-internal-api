package L4;

import H4.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class q implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11294a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public q(r rVar) {
    }

    @Override // L4.n
    public boolean a(H4.h hVar) {
        H4.c cVarB = hVar.b();
        if ((cVarB instanceof c.a ? ((c.a) cVarB).f7909a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        H4.c cVarA = hVar.a();
        return (cVarA instanceof c.a ? ((c.a) cVarA).f7909a : Integer.MAX_VALUE) > 100;
    }

    @Override // L4.n
    public boolean b() {
        return m.f11283a.b(null);
    }
}
