package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f28766b;

    public j(boolean z10) {
        this.f28765a = z10;
    }

    public final boolean a() {
        return this.f28765a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(boolean z10, Configuration newConfig) {
        this(z10);
        AbstractC5504s.h(newConfig, "newConfig");
        this.f28766b = newConfig;
    }
}
