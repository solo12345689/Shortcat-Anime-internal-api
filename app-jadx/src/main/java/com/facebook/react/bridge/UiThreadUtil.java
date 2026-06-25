package com.facebook.react.bridge;

import Td.AbstractC2163n;
import android.os.Handler;
import android.os.Looper;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/bridge/UiThreadUtil;", "", "<init>", "()V", "Landroid/os/Handler;", "getUiThreadHandler", "()Landroid/os/Handler;", "", "isOnUiThread", "()Z", "LTd/L;", "assertOnUiThread", "assertNotOnUiThread", "Ljava/lang/Runnable;", "runnable", "runOnUiThread", "(Ljava/lang/Runnable;)Z", "", "delayInMs", "(Ljava/lang/Runnable;J)Z", "removeOnUiThread", "(Ljava/lang/Runnable;)V", "mainHandler$delegate", "Lkotlin/Lazy;", "getMainHandler", "mainHandler", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UiThreadUtil {
    public static final UiThreadUtil INSTANCE = new UiThreadUtil();

    /* JADX INFO: renamed from: mainHandler$delegate, reason: from kotlin metadata */
    private static final Lazy mainHandler = AbstractC2163n.a(Td.q.f17463c, new InterfaceC5082a() { // from class: com.facebook.react.bridge.w
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return UiThreadUtil.mainHandler_delegate$lambda$0();
        }
    });

    private UiThreadUtil() {
    }

    public static final void assertNotOnUiThread() {
        if (Y6.a.f22860b) {
            SoftAssertions.assertCondition(!isOnUiThread(), "Expected not to run on UI thread!");
        }
    }

    public static final void assertOnUiThread() {
        if (Y6.a.f22860b) {
            SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
        }
    }

    private final Handler getMainHandler() {
        return (Handler) mainHandler.getValue();
    }

    public static final Handler getUiThreadHandler() {
        return INSTANCE.getMainHandler();
    }

    public static final boolean isOnUiThread() {
        return AbstractC5504s.c(Looper.getMainLooper().getThread(), Thread.currentThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mainHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    public static final void removeOnUiThread(Runnable runnable) {
        AbstractC5504s.h(runnable, "runnable");
        INSTANCE.getMainHandler().removeCallbacks(runnable);
    }

    public static final boolean runOnUiThread(Runnable runnable) {
        AbstractC5504s.h(runnable, "runnable");
        return INSTANCE.getMainHandler().postDelayed(runnable, 0L);
    }

    public static final boolean runOnUiThread(Runnable runnable, long delayInMs) {
        AbstractC5504s.h(runnable, "runnable");
        return INSTANCE.getMainHandler().postDelayed(runnable, delayInMs);
    }
}
