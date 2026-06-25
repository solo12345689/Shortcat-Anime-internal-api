package K;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: K.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1758h extends AbstractC5506u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f10044a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1758h(G g10) {
        super(2);
        this.f10044a = g10;
    }

    public final String a(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-1451087197);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1451087197, i10, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:98)");
        }
        String strB = this.f10044a.b(interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return strB;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((InterfaceC2425m) obj, ((Number) obj2).intValue());
    }
}
