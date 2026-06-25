package af;

import kotlin.jvm.functions.Function1;
import qf.S;

/* JADX INFO: loaded from: classes5.dex */
class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f24004a;

    public s(u uVar) {
        this.f24004a = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return u.o2(this.f24004a, (S) obj);
    }
}
