package com.facebook.react.runtime;

import com.facebook.react.T;
import com.facebook.react.bridge.JSBundleLoader;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.react.runtime.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3258f {
    JSRuntimeFactory a();

    JSBundleLoader b();

    String c();

    List d();

    void e(Exception exc);

    T.a f();

    BindingsInstaller getBindingsInstaller();
}
