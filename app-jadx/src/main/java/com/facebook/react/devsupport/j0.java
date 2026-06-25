package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements U6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c7.f f36776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f36777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i0 f36778c;

    public j0(c7.f devSupportManager) {
        AbstractC5504s.h(devSupportManager, "devSupportManager");
        this.f36776a = devSupportManager;
    }

    @Override // U6.g
    public void a() {
        i0 i0Var;
        if (b() && (i0Var = this.f36778c) != null) {
            i0Var.dismiss();
        }
        View view = this.f36777b;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(this.f36777b);
        }
        this.f36778c = null;
    }

    @Override // U6.g
    public boolean b() {
        i0 i0Var = this.f36778c;
        if (i0Var != null) {
            return i0Var.isShowing();
        }
        return false;
    }

    @Override // U6.g
    public void c() {
        if (b() || !d()) {
            return;
        }
        Activity activityA = this.f36776a.a();
        if (activityA == null || activityA.isFinishing()) {
            J7.d.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        i0 i0Var = new i0(activityA, this.f36777b);
        this.f36778c = i0Var;
        i0Var.setCancelable(false);
        i0Var.show();
    }

    @Override // U6.g
    public boolean d() {
        return this.f36777b != null;
    }

    @Override // U6.g
    public void e(String appKey) {
        AbstractC5504s.h(appKey, "appKey");
        Q6.a.b(AbstractC5504s.c(appKey, "LogBox"), "This surface manager can only create LogBox React application");
        View viewB = this.f36776a.b("LogBox");
        this.f36777b = viewB;
        if (viewB == null) {
            J7.d.a("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // U6.g
    public void f() {
        View view = this.f36777b;
        if (view != null) {
            this.f36776a.e(view);
            this.f36777b = null;
        }
    }
}
