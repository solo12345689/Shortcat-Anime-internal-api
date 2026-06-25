package io.sentry.android.replay.util;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Runnable f50436b;

    public m(String taskName, Runnable delegate) {
        AbstractC5504s.h(taskName, "taskName");
        AbstractC5504s.h(delegate, "delegate");
        this.f50435a = taskName;
        this.f50436b = delegate;
    }

    public final String a() {
        return this.f50435a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f50436b.run();
    }
}
