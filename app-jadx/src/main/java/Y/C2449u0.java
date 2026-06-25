package Y;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Y.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2449u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f22552a;

    public C2449u0(Function1 function1) {
        this.f22552a = function1;
    }

    public final Object a(long j10) {
        return this.f22552a.invoke(Long.valueOf(j10 / 1000000));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).longValue());
    }
}
