package androidx.compose.ui.layout;

import I0.InterfaceC1687m;
import Ud.S;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface l extends InterfaceC1687m {
    static /* synthetic */ I0.C J(l lVar, int i10, int i11, Map map, Function1 function1, Function1 function12, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = S.i();
        }
        Map map2 = map;
        if ((i12 & 8) != 0) {
            function1 = null;
        }
        return lVar.q1(i10, i11, map2, function1, function12);
    }

    static /* synthetic */ I0.C u0(l lVar, int i10, int i11, Map map, Function1 function1, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = S.i();
        }
        return lVar.M0(i10, i11, map, function1);
    }

    default I0.C M0(int i10, int i11, Map map, Function1 function1) {
        return q1(i10, i11, map, null, function1);
    }

    I0.C q1(int i10, int i11, Map map, Function1 function1, Function1 function12);
}
