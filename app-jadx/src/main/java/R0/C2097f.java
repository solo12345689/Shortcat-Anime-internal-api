package R0;

import java.util.Comparator;
import r0.C6226h;

/* JADX INFO: renamed from: R0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2097f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2097f f14954a = new C2097f();

    private C2097f() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(s sVar, s sVar2) {
        C6226h c6226hL = sVar.l();
        C6226h c6226hL2 = sVar2.l();
        int iCompare = Float.compare(c6226hL.i(), c6226hL2.i());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(c6226hL.l(), c6226hL2.l());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(c6226hL.e(), c6226hL2.e());
        return iCompare3 != 0 ? iCompare3 : Float.compare(c6226hL.j(), c6226hL2.j());
    }
}
