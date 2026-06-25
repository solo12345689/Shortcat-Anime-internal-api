package G;

import F.AbstractC1542m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements AbstractC1542m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f6856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ie.p f6857b;

    public l(Function1 function1, ie.p pVar) {
        this.f6856a = function1;
        this.f6857b = pVar;
    }

    public final ie.p a() {
        return this.f6857b;
    }

    @Override // F.AbstractC1542m.a
    public Function1 getKey() {
        return this.f6856a;
    }
}
