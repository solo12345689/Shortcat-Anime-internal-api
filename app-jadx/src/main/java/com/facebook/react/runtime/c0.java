package com.facebook.react.runtime;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f37277b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37278a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c0(int i10) {
        this.f37278a = i10;
    }

    public static /* synthetic */ void b(c0 c0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        c0Var.a(str, str2);
    }

    public final void a(String method, String str) {
        AbstractC5504s.h(method, "method");
        if (str == null) {
            AbstractC7283a.K("BridgelessReact", "ReactHost{%d}.%s", Integer.valueOf(this.f37278a), method);
        } else {
            AbstractC7283a.K("BridgelessReact", "ReactHost{%d}.%s: %s", Integer.valueOf(this.f37278a), method, str);
        }
    }
}
