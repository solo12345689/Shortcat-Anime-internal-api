package N8;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import e9.AbstractC4662e;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n9.InterfaceC5760d;

/* JADX INFO: renamed from: N8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1973b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SoftReference f12712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SoftReference f12713b;

    private final int e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected Executor a() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (AbstractC1973b.class) {
            try {
                SoftReference softReference = f12712a;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    AbstractC4662e.a();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new W8.a("firebase-iid-executor")));
                    f12712a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    protected abstract int b(Context context, C1972a c1972a);

    protected abstract void c(Context context, Bundle bundle);

    final /* synthetic */ void d(Intent intent, final Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iE;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iE = e(context, intent2);
            } else if (intent.getExtras() == null) {
                iE = 500;
            } else {
                final C1972a c1972a = new C1972a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC1973b.class) {
                    try {
                        SoftReference softReference = f12713b;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            AbstractC4662e.a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W8.a("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f12713b = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } finally {
                    }
                }
                executorUnconfigurableExecutorService.execute(new Runnable() { // from class: N8.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        n9.i iVarC;
                        C1972a c1972a2 = c1972a;
                        if (TextUtils.isEmpty(c1972a2.d())) {
                            iVarC = n9.l.f(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", c1972a2.d());
                            Integer numE = c1972a2.e();
                            if (numE != null) {
                                bundle.putInt("google.product_id", numE.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            iVarC = D.b(context2).c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        iVarC.b(new Executor() { // from class: N8.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC5760d() { // from class: N8.n
                            @Override // n9.InterfaceC5760d
                            public final void a(n9.i iVar) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iB = b(context, c1972a);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e10) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                }
                iE = iB;
            }
            if (z10 && pendingResult != null) {
                pendingResult.setResultCode(iE);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th2) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        a().execute(new Runnable() { // from class: N8.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f12738a.d(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}
