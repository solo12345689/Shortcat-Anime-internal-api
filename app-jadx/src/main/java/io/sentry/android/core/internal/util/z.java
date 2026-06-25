package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.android.core.C5131g0;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z {
    public static /* synthetic */ void a(View view, Canvas canvas, ILogger iLogger, CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
        } catch (Throwable th2) {
            try {
                iLogger.b(EnumC5215i3.ERROR, "Taking screenshot failed (view.draw).", th2);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i10) {
        atomicBoolean.set(i10 == 0);
        countDownLatch.countDown();
    }

    public static Bitmap c(Activity activity, io.sentry.util.thread.a aVar, final ILogger iLogger, C5131g0 c5131g0) {
        boolean z10 = false;
        if (!e(activity)) {
            iLogger.c(EnumC5215i3.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(EnumC5215i3.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.c(EnumC5215i3.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        final View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            iLogger.c(EnumC5215i3.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            iLogger.c(EnumC5215i3.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            if (c5131g0.d() >= 26) {
                HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                handlerThread.start();
                try {
                    Handler handler = new Handler(handlerThread.getLooper());
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    PixelCopy.request(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.core.internal.util.x
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i10) {
                            z.b(atomicBoolean, countDownLatch, i10);
                        }
                    }, handler);
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        if (atomicBoolean.get()) {
                            z10 = true;
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
                if (!z10) {
                    return null;
                }
            } else {
                final Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (aVar.a()) {
                    rootView.draw(canvas);
                    countDownLatch.countDown();
                } else {
                    activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.internal.util.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            z.a(rootView, canvas, iLogger, countDownLatch);
                        }
                    });
                }
                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                    return null;
                }
            }
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Taking screenshot failed.", th2);
            return null;
        }
    }

    public static byte[] d(Bitmap bitmap, ILogger iLogger) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bitmap.recycle();
                    if (byteArrayOutputStream.size() <= 0) {
                        iLogger.c(EnumC5215i3.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                        byteArrayOutputStream.close();
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th2) {
                iLogger.b(EnumC5215i3.ERROR, "Compressing bitmap failed.", th2);
            }
        }
        return null;
    }

    private static boolean e(Activity activity) {
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static byte[] f(Activity activity, ILogger iLogger, C5131g0 c5131g0) {
        return g(activity, l.e(), iLogger, c5131g0);
    }

    public static byte[] g(Activity activity, io.sentry.util.thread.a aVar, ILogger iLogger, C5131g0 c5131g0) {
        return d(c(activity, aVar, iLogger, c5131g0), iLogger);
    }
}
