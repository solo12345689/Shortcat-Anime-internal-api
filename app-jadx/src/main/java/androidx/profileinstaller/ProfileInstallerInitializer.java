package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.profileinstaller.f;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements V3.a {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: K3.e
            @Override // java.lang.Runnable
            public final void run() {
                f.h(context);
            }
        });
    }

    @Override // V3.a
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // V3.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: K3.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f10863a.g(applicationContext);
            }
        });
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: K3.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.h(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
