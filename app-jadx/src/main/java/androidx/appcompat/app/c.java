package androidx.appcompat.app;

import P3.f;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r0;
import androidx.core.app.y;
import androidx.fragment.app.AbstractActivityC2842v;
import f.InterfaceC4746b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends AbstractActivityC2842v implements d, y.a {

    /* JADX INFO: renamed from: f */
    private f f24391f;

    /* JADX INFO: renamed from: g */
    private Resources f24392g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements f.b {
        a() {
        }

        @Override // P3.f.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.J().C(bundle);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements InterfaceC4746b {
        b() {
        }

        @Override // f.InterfaceC4746b
        public void a(Context context) {
            f fVarJ = c.this.J();
            fVarJ.u();
            fVarJ.y(c.this.getSavedStateRegistry().a("androidx:appcompat"));
        }
    }

    public c() {
        L();
    }

    private void L() {
        getSavedStateRegistry().c("androidx:appcompat", new a());
        addOnContextAvailableListener(new b());
    }

    private boolean S(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public f J() {
        if (this.f24391f == null) {
            this.f24391f = f.j(this, this);
        }
        return this.f24391f;
    }

    public AbstractC2646a K() {
        return J().t();
    }

    public void M(androidx.core.app.y yVar) {
        yVar.c(this);
    }

    public boolean R() {
        Intent intentB = b();
        if (intentB == null) {
            return false;
        }
        if (!V(intentB)) {
            U(intentB);
            return true;
        }
        androidx.core.app.y yVarE = androidx.core.app.y.e(this);
        M(yVarE);
        P(yVarE);
        yVarE.f();
        try {
            androidx.core.app.b.r(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void T(Toolbar toolbar) {
        J().N(toolbar);
    }

    public void U(Intent intent) {
        androidx.core.app.k.e(this, intent);
    }

    public boolean V(Intent intent) {
        return androidx.core.app.k.f(this, intent);
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        J().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(J().i(context));
    }

    @Override // androidx.core.app.y.a
    public Intent b() {
        return androidx.core.app.k.a(this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC2646a abstractC2646aK = K();
        if (getWindow().hasFeature(0)) {
            if (abstractC2646aK == null || !abstractC2646aK.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC2646a abstractC2646aK = K();
        if (keyCode == 82 && abstractC2646aK != null && abstractC2646aK.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return J().l(i10);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b g(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return J().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f24392g == null && r0.c()) {
            this.f24392g = new r0(this, super.getResources());
        }
        Resources resources = this.f24392g;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        J().v();
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        J().x(configuration);
        if (this.f24392g != null) {
            this.f24392g.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        Q();
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        J().z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (S(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, androidx.activity.AbstractActivityC2640j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC2646a abstractC2646aK = K();
        if (menuItem.getItemId() != 16908332 || abstractC2646aK == null || (abstractC2646aK.i() & 4) == 0) {
            return false;
        }
        return R();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        J().A(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        J().B();
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, android.app.Activity
    protected void onStart() {
        super.onStart();
        J().D();
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, android.app.Activity
    protected void onStop() {
        super.onStop();
        J().E();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        J().P(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC2646a abstractC2646aK = K();
        if (getWindow().hasFeature(0)) {
            if (abstractC2646aK == null || !abstractC2646aK.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        J().I(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        J().O(i10);
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        J().J(view);
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        J().K(view, layoutParams);
    }

    public void Q() {
    }

    protected void N(G1.i iVar) {
    }

    protected void O(int i10) {
    }

    public void P(androidx.core.app.y yVar) {
    }

    @Override // androidx.appcompat.app.d
    public void e(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void f(androidx.appcompat.view.b bVar) {
    }
}
