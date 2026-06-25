package y5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h extends HashSet {
    private h(Set set) {
        super(set);
    }

    public static h c(Object... objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        Collections.addAll(hashSet, objArr);
        return new h(hashSet);
    }
}
