package We;

import Ud.AbstractC2279u;
import Ud.a0;
import Ve.a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends f {

    /* JADX INFO: renamed from: h */
    private final a.e f20869h;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(a.e types, String[] strings) {
        Set setF1;
        AbstractC5504s.h(types, "types");
        AbstractC5504s.h(strings, "strings");
        List listY = types.y();
        if (listY.isEmpty()) {
            setF1 = a0.d();
        } else {
            AbstractC5504s.e(listY);
            setF1 = AbstractC2279u.f1(listY);
        }
        List listZ = types.z();
        AbstractC5504s.g(listZ, "getRecordList(...)");
        super(strings, setF1, g.a(listZ));
        this.f20869h = types;
    }
}
