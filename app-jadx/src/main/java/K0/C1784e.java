package K0;

import Td.C2160k;

/* JADX INFO: renamed from: K0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1784e implements androidx.compose.ui.focus.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1784e f10687a = new C1784e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f10688b;

    private C1784e() {
    }

    @Override // androidx.compose.ui.focus.i
    public void g(boolean z10) {
        f10688b = Boolean.valueOf(z10);
    }

    @Override // androidx.compose.ui.focus.i
    public boolean i() {
        Boolean bool = f10688b;
        if (bool != null) {
            return bool.booleanValue();
        }
        H0.a.c("canFocus is read before it is written");
        throw new C2160k();
    }

    public final boolean o() {
        return f10688b != null;
    }

    public final void p() {
        f10688b = null;
    }
}
