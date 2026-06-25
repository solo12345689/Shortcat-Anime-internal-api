package bc;

import Ud.AbstractC2273n;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f33278a;

    public f(String[] names) {
        AbstractC5504s.h(names, "names");
        this.f33278a = names;
    }

    public final String[] a() {
        return this.f33278a;
    }

    public final f b(f fVar) {
        return fVar == null ? this : new f((String[]) AbstractC2273n.E(this.f33278a, fVar.f33278a));
    }
}
