package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.m;
import com.google.firebase.messaging.AbstractC3966d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.firebase.messaging.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3968f {

    /* JADX INFO: renamed from: a */
    private final ExecutorService f43436a;

    /* JADX INFO: renamed from: b */
    private final Context f43437b;

    /* JADX INFO: renamed from: c */
    private final N f43438c;

    public C3968f(Context context, N n10, ExecutorService executorService) {
        this.f43436a = executorService;
        this.f43437b = context;
        this.f43438c = n10;
    }

    private boolean b() {
        if (((KeyguardManager) this.f43437b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.l.c()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f43437b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(AbstractC3966d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f43437b.getSystemService("notification")).notify(aVar.f43422b, aVar.f43423c, aVar.f43421a.d());
    }

    private J d() {
        J jH = J.h(this.f43438c.p("gcm.n.image"));
        if (jH != null) {
            jH.k(this.f43436a);
        }
        return jH;
    }

    private void e(m.e eVar, J j10) {
        if (j10 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) n9.l.b(j10.j(), 5L, TimeUnit.SECONDS);
            eVar.y(bitmap);
            eVar.O(new m.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            j10.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            j10.close();
        }
    }

    boolean a() {
        if (this.f43438c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        J jD = d();
        AbstractC3966d.a aVarE = AbstractC3966d.e(this.f43437b, this.f43438c);
        e(aVarE.f43421a, jD);
        c(aVarE);
        return true;
    }
}
