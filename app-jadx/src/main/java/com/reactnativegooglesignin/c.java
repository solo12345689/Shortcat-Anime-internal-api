package com.reactnativegooglesignin;

import android.util.Log;
import com.facebook.react.bridge.Promise;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Promise f43994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43996c;

    public c(String str) {
        this.f43996c = str;
    }

    private void e(Promise promise, String str) {
        promise.reject("ASYNC_OP_IN_PROGRESS", "Warning: previous promise did not settle and was overwritten. You've called \"" + str + "\" while \"" + a() + "\" was already in progress and has not completed yet.");
    }

    private void f() {
        this.f43995b = null;
        this.f43994a = null;
    }

    public String a() {
        return this.f43995b;
    }

    public void b(Exception exc) {
        Promise promise = this.f43994a;
        String str = this.f43995b;
        if (promise == null) {
            Log.e(this.f43996c, "cannot reject promise because it's null");
            return;
        }
        a aVar = new a(exc, str);
        f();
        promise.reject(aVar.a(), aVar.b(), exc);
    }

    public void c(String str) {
        d(this.f43995b, str);
    }

    public void d(String str, String str2) {
        Promise promise = this.f43994a;
        if (promise == null) {
            Log.e(this.f43996c, "cannot reject promise because it's null");
        } else {
            f();
            promise.reject(str, str2);
        }
    }

    public void g(Object obj) {
        Promise promise = this.f43994a;
        if (promise == null) {
            Log.e(this.f43996c, "cannot resolve promise because it's null");
        } else {
            f();
            promise.resolve(obj);
        }
    }

    public void h(Promise promise, String str) {
        Promise promise2 = this.f43994a;
        if (promise2 != null) {
            e(promise2, str);
        }
        this.f43994a = promise;
        this.f43995b = str;
    }
}
