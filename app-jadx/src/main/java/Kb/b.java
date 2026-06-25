package Kb;

import Df.r;
import S4.h;
import Y4.n;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements n {
    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(String model, int i10, int i11, h options) {
        AbstractC5504s.h(model, "model");
        AbstractC5504s.h(options, "options");
        return new n.a(new n5.c(model), new a(model));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String model) {
        AbstractC5504s.h(model, "model");
        return r.Q(model, "data:", false, 2, null);
    }
}
