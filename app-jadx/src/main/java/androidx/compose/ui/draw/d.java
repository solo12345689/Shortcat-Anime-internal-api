package androidx.compose.ui.draw;

import I0.InterfaceC1680f;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, AbstractC6923b abstractC6923b, boolean z10, l0.e eVar2, InterfaceC1680f interfaceC1680f, float f10, androidx.compose.ui.graphics.d dVar) {
        return eVar.then(new PainterElement(abstractC6923b, z10, eVar2, interfaceC1680f, f10, dVar));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, AbstractC6923b abstractC6923b, boolean z10, l0.e eVar2, InterfaceC1680f interfaceC1680f, float f10, androidx.compose.ui.graphics.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            eVar2 = l0.e.f52304a.e();
        }
        l0.e eVar3 = eVar2;
        if ((i10 & 8) != 0) {
            interfaceC1680f = InterfaceC1680f.f8703a.c();
        }
        InterfaceC1680f interfaceC1680f2 = interfaceC1680f;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            dVar = null;
        }
        return a(eVar, abstractC6923b, z11, eVar3, interfaceC1680f2, f11, dVar);
    }
}
