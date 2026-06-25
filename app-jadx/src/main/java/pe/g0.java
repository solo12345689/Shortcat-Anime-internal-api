package Pe;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f13880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f13883d;

    public g0(r0 r0Var, List parametersInfo, String str) {
        AbstractC5504s.h(parametersInfo, "parametersInfo");
        this.f13880a = r0Var;
        this.f13881b = parametersInfo;
        this.f13882c = str;
        g0 g0Var = null;
        if (str != null) {
            r0 r0VarA = r0Var != null ? r0Var.a() : null;
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(parametersInfo, 10));
            Iterator it = parametersInfo.iterator();
            while (it.hasNext()) {
                r0 r0Var2 = (r0) it.next();
                arrayList.add(r0Var2 != null ? r0Var2.a() : null);
            }
            g0Var = new g0(r0VarA, arrayList, null);
        }
        this.f13883d = g0Var;
    }

    public final String a() {
        return this.f13882c;
    }

    public final List b() {
        return this.f13881b;
    }

    public final r0 c() {
        return this.f13880a;
    }

    public final g0 d() {
        return this.f13883d;
    }
}
