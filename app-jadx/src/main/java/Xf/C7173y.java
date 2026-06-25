package xf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C7173y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC7174z f64575a;

    public C7173y(AbstractC7174z abstractC7174z) {
        this.f64575a = abstractC7174z;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(AbstractC7174z.g(this.f64575a, (String) obj));
    }
}
