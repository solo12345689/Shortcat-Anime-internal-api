package df;

import kotlin.jvm.functions.Function1;
import qf.S;
import ye.H;

/* JADX INFO: renamed from: df.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C4616y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f45177a;

    public C4616y(S s10) {
        this.f45177a = s10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C4617z.c(this.f45177a, (H) obj);
    }
}
