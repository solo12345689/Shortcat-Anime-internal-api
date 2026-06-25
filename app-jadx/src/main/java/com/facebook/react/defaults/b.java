package com.facebook.react.defaults;

import com.facebook.soloader.SoLoader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f36598a = new b();

    private b() {
    }

    public static final synchronized void a() {
        SoLoader.t("react_newarchdefaults");
        try {
            SoLoader.t("appmodules");
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
