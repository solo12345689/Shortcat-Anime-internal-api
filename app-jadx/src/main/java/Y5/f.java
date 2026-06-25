package y5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends ArrayList {
    private f(int i10) {
        super(i10);
    }

    public static f c(List list) {
        return new f(list);
    }

    public static f d(Object... objArr) {
        f fVar = new f(objArr.length);
        Collections.addAll(fVar, objArr);
        return fVar;
    }

    private f(List list) {
        super(list);
    }
}
