package d1;

import U0.C2191b;
import U0.InterfaceC2230v;
import U0.InterfaceC2236y;
import U0.Y0;
import Y0.AbstractC2485u;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final InterfaceC2230v a(InterfaceC2236y interfaceC2236y, int i10, int i11, long j10) {
        AbstractC5504s.f(interfaceC2236y, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new C2191b((e) interfaceC2236y, i10, i11, j10, null);
    }

    public static final InterfaceC2230v b(String str, Y0 y02, List list, List list2, int i10, int i11, long j10, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar) {
        return new C2191b(new e(str, y02, list, list2, bVar, interfaceC5011d), i10, i11, j10, null);
    }
}
