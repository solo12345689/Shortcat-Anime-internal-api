package E0;

import androidx.compose.ui.platform.A1;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: E0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1292b extends InterfaceC5011d {
    static /* synthetic */ Object D1(InterfaceC1292b interfaceC1292b, EnumC1308s enumC1308s, Zd.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            enumC1308s = EnumC1308s.f4179b;
        }
        return interfaceC1292b.p0(enumC1308s, eVar);
    }

    C1307q F0();

    Object K(long j10, Function2 function2, Zd.e eVar);

    long a();

    Object d1(long j10, Function2 function2, Zd.e eVar);

    A1 getViewConfiguration();

    long n0();

    Object p0(EnumC1308s enumC1308s, Zd.e eVar);
}
