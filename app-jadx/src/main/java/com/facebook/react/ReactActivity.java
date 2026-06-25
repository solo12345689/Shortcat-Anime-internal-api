package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import q7.InterfaceC6143a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ReactActivity extends androidx.appcompat.app.c implements InterfaceC6143a, q7.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.activity.G f36426i = new a(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3279t f36425h = W();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends androidx.activity.G {
        a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.G
        public void d() {
            j(false);
            ReactActivity.this.onBackPressed();
            j(true);
        }
    }

    protected ReactActivity() {
    }

    protected abstract C3279t W();

    public C3323w X() {
        return this.f36425h.getReactDelegate();
    }

    @Override // q7.InterfaceC6143a
    public void a() {
        this.f36426i.j(false);
        super.onBackPressed();
    }

    @Override // q7.f
    public void c(String[] strArr, int i10, q7.g gVar) {
        this.f36425h.requestPermissions(strArr, i10, gVar);
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f36425h.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void onBackPressed() {
        if (this.f36425h.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.c, androidx.activity.AbstractActivityC2640j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f36425h.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f36425h.onCreate(bundle);
        if (J7.a.a(this)) {
            getOnBackPressedDispatcher().i(this, this.f36426i);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.AbstractActivityC2842v, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f36425h.onDestroy();
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f36425h.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return this.f36425h.onKeyLongPress(i10, keyEvent) || super.onKeyLongPress(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return this.f36425h.onKeyUp(i10, keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f36425h.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f36425h.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this.f36425h.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f36425h.onResume();
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f36425h.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f36425h.onWindowFocusChanged(z10);
    }
}
