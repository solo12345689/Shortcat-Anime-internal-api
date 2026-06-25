package com.facebook.react.devsupport;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E0 f36629a = new E0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36630b;

    static {
        f36630b = Build.VERSION.SDK_INT < 26 ? 2006 : 2038;
    }

    private E0() {
    }
}
