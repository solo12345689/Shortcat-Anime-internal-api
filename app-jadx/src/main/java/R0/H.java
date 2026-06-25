package R0;

import java.util.Comparator;
import kotlin.Pair;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class H implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f14942a = new H();

    private H() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Pair pair, Pair pair2) {
        int iCompare = Float.compare(((C6226h) pair.c()).l(), ((C6226h) pair2.c()).l());
        return iCompare != 0 ? iCompare : Float.compare(((C6226h) pair.c()).e(), ((C6226h) pair2.c()).e());
    }
}
