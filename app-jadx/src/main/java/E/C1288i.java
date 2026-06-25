package E;

import F.AbstractC1542m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: E.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1288i implements AbstractC1542m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f3898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f3899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f3900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ie.p f3901d;

    public C1288i(Function1 function1, Function2 function2, Function1 function12, ie.p pVar) {
        this.f3898a = function1;
        this.f3899b = function2;
        this.f3900c = function12;
        this.f3901d = pVar;
    }

    public final ie.p a() {
        return this.f3901d;
    }

    public final Function2 b() {
        return this.f3899b;
    }

    @Override // F.AbstractC1542m.a
    public Function1 getKey() {
        return this.f3898a;
    }

    @Override // F.AbstractC1542m.a
    public Function1 getType() {
        return this.f3900c;
    }
}
