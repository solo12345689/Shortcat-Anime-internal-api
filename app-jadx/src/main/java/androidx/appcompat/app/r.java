package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.AbstractC2783t;
import i.AbstractC4956a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends androidx.activity.r implements d {

    /* JADX INFO: renamed from: d */
    private f f24512d;

    /* JADX INFO: renamed from: e */
    private final AbstractC2783t.a f24513e;

    public r(Context context, int i10) {
        super(context, i(context, i10));
        this.f24513e = new AbstractC2783t.a() { // from class: androidx.appcompat.app.q
            @Override // androidx.core.view.AbstractC2783t.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f24511a.j(keyEvent);
            }
        };
        f fVarH = h();
        fVarH.O(i(context, i10));
        fVarH.y(null);
    }

    private static int i(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC4956a.f47978y, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        h().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        h().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC2783t.e(this.f24513e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return h().l(i10);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b g(b.a aVar) {
        return null;
    }

    public f h() {
        if (this.f24512d == null) {
            this.f24512d = f.k(this, this);
        }
        return this.f24512d;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        h().v();
    }

    boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean k(int i10) {
        return h().H(i10);
    }

    @Override // androidx.activity.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        h().u();
        super.onCreate(bundle);
        h().y(bundle);
    }

    @Override // androidx.activity.r, android.app.Dialog
    protected void onStop() {
        super.onStop();
        h().E();
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void setContentView(int i10) {
        c();
        h().I(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h().P(charSequence);
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void setContentView(View view) {
        c();
        h().J(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        h().P(getContext().getString(i10));
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        h().K(view, layoutParams);
    }

    @Override // androidx.appcompat.app.d
    public void e(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void f(androidx.appcompat.view.b bVar) {
    }
}
