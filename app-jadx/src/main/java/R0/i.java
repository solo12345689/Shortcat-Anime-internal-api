package R0;

import java.util.Comparator;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class i implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f14971a = new i();

    private i() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(s sVar, s sVar2) {
        C6226h c6226hL = sVar.l();
        C6226h c6226hL2 = sVar2.l();
        int iCompare = Float.compare(c6226hL2.j(), c6226hL.j());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(c6226hL.l(), c6226hL2.l());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(c6226hL.e(), c6226hL2.e());
        return iCompare3 != 0 ? iCompare3 : Float.compare(c6226hL2.i(), c6226hL.i());
    }
}
