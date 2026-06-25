package com.facebook.react.devsupport;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import c7.f;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC5504s;
import r7.InterfaceC6274a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C0 implements c7.f {
    private final JSExceptionHandler defaultJSExceptionHandler = new DefaultJSExceptionHandler();

    @Override // c7.f
    public void A(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
    }

    @Override // c7.f
    public InterfaceC6274a D() {
        return null;
    }

    @Override // c7.f
    public boolean E() {
        return false;
    }

    @Override // c7.f
    public void H(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
    }

    @Override // c7.f
    public Activity a() {
        return null;
    }

    @Override // c7.f
    public View b(String appKey) {
        AbstractC5504s.h(appKey, "appKey");
        return null;
    }

    @Override // c7.f
    public U6.g d(String moduleName) {
        AbstractC5504s.h(moduleName, "moduleName");
        return null;
    }

    @Override // c7.f
    public ReactContext getCurrentReactContext() {
        return null;
    }

    @Override // c7.f
    public void h(String message, f.a listener) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(listener, "listener");
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception e10) {
        AbstractC5504s.h(e10, "e");
        this.defaultJSExceptionHandler.handleException(e10);
    }

    @Override // c7.f
    public String j() {
        return null;
    }

    @Override // c7.f
    public String k() {
        return null;
    }

    @Override // c7.f
    public boolean m() {
        return false;
    }

    @Override // c7.f
    public void n(c7.h callback) {
        AbstractC5504s.h(callback, "callback");
        callback.a(false);
    }

    @Override // c7.f
    public boolean o() {
        return false;
    }

    @Override // c7.f
    public Pair r(Pair errorInfo) {
        AbstractC5504s.h(errorInfo, "errorInfo");
        return errorInfo;
    }

    @Override // c7.f
    public c7.g t() {
        return null;
    }

    @Override // c7.f
    public String u() {
        return null;
    }

    @Override // c7.f
    public void w(String optionName, c7.e optionHandler) {
        AbstractC5504s.h(optionName, "optionName");
        AbstractC5504s.h(optionHandler, "optionHandler");
    }

    @Override // c7.f
    public c7.j x() {
        return null;
    }

    @Override // c7.f
    public c7.k[] z() {
        return null;
    }

    @Override // c7.f
    public void B() {
    }

    @Override // c7.f
    public void F() {
    }

    @Override // c7.f
    public void f() {
    }

    @Override // c7.f
    public void g() {
    }

    @Override // c7.f
    public void l() {
    }

    @Override // c7.f
    public void p() {
    }

    @Override // c7.f
    public void y() {
    }

    @Override // c7.f
    public void c(boolean z10) {
    }

    @Override // c7.f
    public void e(View view) {
    }

    @Override // c7.f
    public void i(boolean z10) {
    }

    @Override // c7.f
    public void s(boolean z10) {
    }

    @Override // c7.f
    public void v(String str) {
    }
}
