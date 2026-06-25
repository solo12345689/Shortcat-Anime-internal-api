package Qb;

import Df.r;
import S4.h;
import Ud.AbstractC2279u;
import Y4.n;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {
    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(e model, int i10, int i11, h options) {
        AbstractC5504s.h(model, "model");
        AbstractC5504s.h(options, "options");
        List<String> pathSegments = model.a().getPathSegments();
        AbstractC5504s.g(pathSegments, "getPathSegments(...)");
        return new n.a(new n5.c(model), new d(r.K(AbstractC2279u.w0(pathSegments, "/", null, null, 0, null, null, 62, null), "\\", "/", false, 4, null)));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(e model) {
        AbstractC5504s.h(model, "model");
        return true;
    }
}
