package C;

import I0.InterfaceC1686l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static final AbstractC1141l a(F f10) {
        if (f10 != null) {
            return f10.a();
        }
        return null;
    }

    public static final boolean b(F f10) {
        if (f10 != null) {
            return f10.b();
        }
        return true;
    }

    public static final F c(InterfaceC1686l interfaceC1686l) {
        Object objJ = interfaceC1686l.j();
        if (objJ instanceof F) {
            return (F) objJ;
        }
        return null;
    }

    public static final F d(androidx.compose.ui.layout.s sVar) {
        Object objJ = sVar.j();
        if (objJ instanceof F) {
            return (F) objJ;
        }
        return null;
    }

    public static final float e(F f10) {
        if (f10 != null) {
            return f10.d();
        }
        return 0.0f;
    }

    public static final boolean f(F f10) {
        AbstractC1141l abstractC1141lA = a(f10);
        if (abstractC1141lA != null) {
            return abstractC1141lA.c();
        }
        return false;
    }
}
