package n2;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.lifecycle.InterfaceC2854h;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import m2.AbstractC5628a;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: n2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC5720e {
    public static final U a(Y y10, InterfaceC6014d interfaceC6014d, String str, W.c cVar, AbstractC5628a abstractC5628a) {
        W wA = cVar != null ? W.f30207b.a(y10.getViewModelStore(), cVar, abstractC5628a) : y10 instanceof InterfaceC2854h ? W.f30207b.a(y10.getViewModelStore(), ((InterfaceC2854h) y10).getDefaultViewModelProviderFactory(), abstractC5628a) : W.b.c(W.f30207b, y10, null, null, 6, null);
        return str != null ? wA.b(str, interfaceC6014d) : wA.c(interfaceC6014d);
    }

    public static final U b(InterfaceC6014d interfaceC6014d, Y y10, String str, W.c cVar, AbstractC5628a abstractC5628a, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 2) != 0 && (y10 = C5717b.f53840a.c(interfaceC2425m, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            cVar = null;
        }
        if ((i11 & 16) != 0) {
            abstractC5628a = y10 instanceof InterfaceC2854h ? ((InterfaceC2854h) y10).getDefaultViewModelCreationExtras() : AbstractC5628a.b.f53049c;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1673618944, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:105)");
        }
        U uA = AbstractC5719d.a(y10, interfaceC6014d, str, cVar, abstractC5628a);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return uA;
    }
}
