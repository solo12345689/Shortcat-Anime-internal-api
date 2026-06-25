package com.margelo.nitro.utils;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/margelo/nitro/utils/ThreadUtils;", "", "<init>", "()V", "Companion", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThreadUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/utils/ThreadUtils$Companion;", "", "<init>", "()V", "", "getCurrentThreadName", "()Ljava/lang/String;", "name", "LTd/L;", "setCurrentThreadName", "(Ljava/lang/String;)V", "", "isOnUIThread", "()Z", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getCurrentThreadName() {
            String name = Thread.currentThread().getName();
            AbstractC5504s.g(name, "getName(...)");
            return name;
        }

        public final boolean isOnUIThread() {
            return AbstractC5504s.c(Looper.myLooper(), Looper.getMainLooper());
        }

        public final void runOnUIThread(Runnable runnable) {
            AbstractC5504s.h(runnable, "runnable");
            ThreadUtils.handler.post(runnable);
        }

        public final void setCurrentThreadName(String name) {
            AbstractC5504s.h(name, "name");
            Thread.currentThread().setName(name);
        }

        private Companion() {
        }
    }

    public static final String getCurrentThreadName() {
        return INSTANCE.getCurrentThreadName();
    }

    public static final boolean isOnUIThread() {
        return INSTANCE.isOnUIThread();
    }

    public static final void runOnUIThread(Runnable runnable) {
        INSTANCE.runOnUIThread(runnable);
    }

    public static final void setCurrentThreadName(String str) {
        INSTANCE.setCurrentThreadName(str);
    }
}
