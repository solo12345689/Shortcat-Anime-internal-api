package qf;

import kotlin.jvm.functions.Function1;
import qf.AbstractC6206p;

/* JADX INFO: renamed from: qf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6194j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6206p f58061a;

    public C6194j(AbstractC6206p abstractC6206p) {
        this.f58061a = abstractC6206p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC6206p.C(this.f58061a, (AbstractC6206p.b) obj);
    }
}
