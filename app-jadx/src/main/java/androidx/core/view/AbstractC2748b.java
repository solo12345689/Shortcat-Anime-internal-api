package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2748b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f29024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0496b f29025c;

    /* JADX INFO: renamed from: androidx.core.view.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0496b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC2748b(Context context) {
        this.f29023a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f29025c = null;
        this.f29024b = null;
    }

    public void h(a aVar) {
        this.f29024b = aVar;
    }

    public abstract void i(InterfaceC0496b interfaceC0496b);
}
