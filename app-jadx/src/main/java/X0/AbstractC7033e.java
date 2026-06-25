package x0;

import java.util.ArrayList;

/* JADX INFO: renamed from: x0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7033e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(ArrayList arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }
}
