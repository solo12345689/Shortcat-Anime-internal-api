package x;

import K0.AbstractC1798l;
import K0.InterfaceC1794j;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: x.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7013k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f63367a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f63367a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        return C0.c.e(C0.d.b(keyEvent), C0.c.f2484a.b()) && d(keyEvent);
    }

    public static final boolean c(InterfaceC1794j interfaceC1794j) {
        return e(AbstractC1798l.a(interfaceC1794j));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int iB = C0.f.b(C0.d.a(keyEvent));
        return iB == 23 || iB == 66 || iB == 160;
    }

    private static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        return C0.c.e(C0.d.b(keyEvent), C0.c.f2484a.a()) && d(keyEvent);
    }
}
