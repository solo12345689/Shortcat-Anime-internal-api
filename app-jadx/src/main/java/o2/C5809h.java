package o2;

import androidx.lifecycle.InterfaceC2854h;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import kotlin.jvm.internal.AbstractC5504s;
import m2.AbstractC5628a;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: o2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5809h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5809h f54235a = new C5809h();

    private C5809h() {
    }

    public final AbstractC5628a a(Y owner) {
        AbstractC5504s.h(owner, "owner");
        return owner instanceof InterfaceC2854h ? ((InterfaceC2854h) owner).getDefaultViewModelCreationExtras() : AbstractC5628a.b.f53049c;
    }

    public final W.c b(Y owner) {
        AbstractC5504s.h(owner, "owner");
        return owner instanceof InterfaceC2854h ? ((InterfaceC2854h) owner).getDefaultViewModelProviderFactory() : C5805d.f54229b;
    }

    public final String c(InterfaceC6014d modelClass) {
        AbstractC5504s.h(modelClass, "modelClass");
        String strA = AbstractC5802a.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final U d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
