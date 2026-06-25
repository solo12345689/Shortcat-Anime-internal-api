package androidx.work;

import androidx.work.b;
import i4.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class OverwritingInputMerger extends g {
    @Override // i4.g
    public b b(List list) {
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.putAll(((b) it.next()).l());
        }
        aVar.d(map);
        return aVar.a();
    }
}
