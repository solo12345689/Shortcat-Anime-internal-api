package E0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class U implements Function1 {

    /* JADX INFO: renamed from: a */
    private M f4092a;

    public void a(boolean z10) {
        M m10 = this.f4092a;
        if (m10 != null) {
            m10.h(z10);
        }
    }

    public final void b(M m10) {
        this.f4092a = m10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Boolean) obj).booleanValue());
        return Td.L.f17438a;
    }
}
