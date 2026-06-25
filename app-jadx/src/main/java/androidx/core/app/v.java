package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f28907b;

    public v(boolean z10) {
        this.f28906a = z10;
    }

    public final boolean a() {
        return this.f28906a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(boolean z10, Configuration newConfig) {
        this(z10);
        AbstractC5504s.h(newConfig, "newConfig");
        this.f28907b = newConfig;
    }
}
