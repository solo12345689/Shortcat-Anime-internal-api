package D;

import F.AbstractC1542m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements AbstractC1542m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f3383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f3384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ie.p f3385c;

    public j(Function1 function1, Function1 function12, ie.p pVar) {
        this.f3383a = function1;
        this.f3384b = function12;
        this.f3385c = pVar;
    }

    public final ie.p a() {
        return this.f3385c;
    }

    @Override // F.AbstractC1542m.a
    public Function1 getKey() {
        return this.f3383a;
    }

    @Override // F.AbstractC1542m.a
    public Function1 getType() {
        return this.f3384b;
    }
}
