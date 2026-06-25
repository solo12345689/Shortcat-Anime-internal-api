package mf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C5671b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5672c f53407a;

    public C5671b(AbstractC5672c abstractC5672c) {
        this.f53407a = abstractC5672c;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC5672c.f(this.f53407a, (Xe.c) obj);
    }
}
