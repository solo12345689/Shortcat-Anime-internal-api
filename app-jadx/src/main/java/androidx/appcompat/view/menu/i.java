package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC2781s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a */
    private final Context f24794a;

    /* JADX INFO: renamed from: b */
    private final e f24795b;

    /* JADX INFO: renamed from: c */
    private final boolean f24796c;

    /* JADX INFO: renamed from: d */
    private final int f24797d;

    /* JADX INFO: renamed from: e */
    private final int f24798e;

    /* JADX INFO: renamed from: f */
    private View f24799f;

    /* JADX INFO: renamed from: g */
    private int f24800g;

    /* JADX INFO: renamed from: h */
    private boolean f24801h;

    /* JADX INFO: renamed from: i */
    private j.a f24802i;

    /* JADX INFO: renamed from: j */
    private h f24803j;

    /* JADX INFO: renamed from: k */
    private PopupWindow.OnDismissListener f24804k;

    /* JADX INFO: renamed from: l */
    private final PopupWindow.OnDismissListener f24805l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f24794a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f24794a.getResources().getDimensionPixelSize(i.d.f47989a) ? new b(this.f24794a, this.f24799f, this.f24797d, this.f24798e, this.f24796c) : new l(this.f24794a, this.f24795b, this.f24799f, this.f24797d, this.f24798e, this.f24796c);
        bVar.m(this.f24795b);
        bVar.w(this.f24805l);
        bVar.r(this.f24799f);
        bVar.e(this.f24802i);
        bVar.t(this.f24801h);
        bVar.u(this.f24800g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h hVarC = c();
        hVarC.x(z11);
        if (z10) {
            if ((AbstractC2781s.b(this.f24800g, this.f24799f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f24799f.getWidth();
            }
            hVarC.v(i10);
            hVarC.y(i11);
            int i12 = (int) ((this.f24794a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.s(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.c();
    }

    public void b() {
        if (d()) {
            this.f24803j.dismiss();
        }
    }

    public h c() {
        if (this.f24803j == null) {
            this.f24803j = a();
        }
        return this.f24803j;
    }

    public boolean d() {
        h hVar = this.f24803j;
        return hVar != null && hVar.b();
    }

    protected void e() {
        this.f24803j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f24804k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f24799f = view;
    }

    public void g(boolean z10) {
        this.f24801h = z10;
        h hVar = this.f24803j;
        if (hVar != null) {
            hVar.t(z10);
        }
    }

    public void h(int i10) {
        this.f24800g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f24804k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f24802i = aVar;
        h hVar = this.f24803j;
        if (hVar != null) {
            hVar.e(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f24799f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f24799f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f24800g = 8388611;
        this.f24805l = new a();
        this.f24794a = context;
        this.f24795b = eVar;
        this.f24799f = view;
        this.f24796c = z10;
        this.f24797d = i10;
        this.f24798e = i11;
    }
}
