package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.C2767k0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface J {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, j.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    Menu j();

    int k();

    C2767k0 l(int i10, long j10);

    ViewGroup m();

    void n(boolean z10);

    void o();

    void p(boolean z10);

    void q();

    void r(a0 a0Var);

    void s(int i10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(j.a aVar, e.a aVar2);

    void u(int i10);

    int v();

    void w();

    void x(Drawable drawable);
}
