package r4;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.service.notification.StatusBarNotification;
import androidx.concurrent.futures.c;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import androidx.work.c;
import app.notifee.core.ForegroundService;
import app.notifee.core.Logger;
import app.notifee.core.ReceiverService;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.model.NotificationAndroidActionModel;
import app.notifee.core.model.NotificationAndroidModel;
import app.notifee.core.model.NotificationAndroidPressActionModel;
import app.notifee.core.model.NotificationAndroidStyleModel;
import app.notifee.core.model.NotificationModel;
import cg.AbstractC3104a;
import cg.InterfaceC3105b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s4.C6429i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f58551a;

    /* JADX INFO: renamed from: b */
    public static final com.google.common.util.concurrent.r f58552b;

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        f58551a = executorServiceNewCachedThreadPool;
        f58552b = com.google.common.util.concurrent.s.b(executorServiceNewCachedThreadPool);
    }

    public static List A() {
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : ((NotificationManager) cg.f.f33622a.getSystemService("notification")).getActiveNotifications()) {
            Notification notification = statusBarNotification.getNotification();
            Bundle bundle = notification.extras;
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = bundle.getBundle("notifee.notification");
            Bundle bundle4 = bundle.getBundle("notifee.trigger");
            if (bundle3 == null) {
                bundle3 = new Bundle();
                bundle3.putString(DiagnosticsEntry.ID_KEY, "" + statusBarNotification.getId());
                Object obj = bundle.get("android.title");
                if (obj != null) {
                    bundle3.putString(com.amazon.a.a.o.b.f34626S, obj.toString());
                }
                Object obj2 = bundle.get("android.text");
                if (obj2 != null) {
                    bundle3.putString("body", obj2.toString());
                }
                Object obj3 = bundle.get("android.subText");
                if (obj3 != null) {
                    bundle3.putString("subtitle", obj3.toString());
                }
                Bundle bundle5 = new Bundle();
                if (Build.VERSION.SDK_INT >= 26) {
                    bundle5.putString("channelId", notification.getChannelId());
                }
                bundle5.putString("tag", statusBarNotification.getTag());
                bundle5.putString("group", notification.getGroup());
                bundle3.putBundle("android", bundle5);
                bundle2.putString(DiagnosticsEntry.ID_KEY, "" + statusBarNotification.getId());
            } else {
                bundle2.putString(DiagnosticsEntry.ID_KEY, "" + bundle3.get(DiagnosticsEntry.ID_KEY));
            }
            if (bundle4 != null) {
                bundle2.putBundle("trigger", bundle4);
            }
            bundle2.putBundle("notification", bundle3);
            bundle2.putString("date", "" + statusBarNotification.getPostTime());
            arrayList.add(bundle2);
        }
        return arrayList;
    }

    public static m.e a(m.e eVar, NotificationAndroidModel notificationAndroidModel) {
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        Rect rect;
        float f10;
        Rect rect2;
        if (notificationAndroidModel.hasLargeIcon().booleanValue()) {
            String largeIcon = notificationAndroidModel.getLargeIcon();
            try {
                bitmap = (Bitmap) cg.s.b(largeIcon).get(10L, TimeUnit.SECONDS);
            } catch (TimeoutException e10) {
                Logger.e("NotificationManager", "Timeout occurred whilst trying to retrieve a largeIcon image: " + largeIcon, (Exception) e10);
                bitmap = null;
            } catch (Exception e11) {
                Logger.e("NotificationManager", "An error occurred whilst trying to retrieve a largeIcon image: " + largeIcon, e11);
                bitmap = null;
            }
            if (bitmap != null) {
                if (notificationAndroidModel.getCircularLargeIcon().booleanValue()) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width > height) {
                        bitmapCreateBitmap = Bitmap.createBitmap(height, height, Bitmap.Config.ARGB_8888);
                        int i10 = (width - height) / 2;
                        rect = new Rect(i10, 0, i10 + height, height);
                        rect2 = new Rect(0, 0, height, height);
                        f10 = height / 2;
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
                        int i11 = (height - width) / 2;
                        rect = new Rect(0, i11, width, i11 + width);
                        f10 = width / 2;
                        rect2 = new Rect(0, 0, width, width);
                    }
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    canvas.drawARGB(0, 0, 0, 0);
                    paint.setColor(-65536);
                    canvas.drawCircle(f10, f10, f10, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, rect, rect2, paint);
                    bitmap = bitmapCreateBitmap;
                }
                eVar.y(bitmap);
            }
        }
        return eVar;
    }

    public static m.e b(m.e eVar, NotificationAndroidModel notificationAndroidModel, NotificationModel notificationModel) {
        if (notificationAndroidModel.hasFullScreenAction().booleanValue()) {
            NotificationAndroidPressActionModel fullScreenAction = notificationAndroidModel.getFullScreenAction();
            String launchActivity = fullScreenAction.getLaunchActivity();
            Class clsA = cg.k.a(launchActivity);
            if (clsA == null) {
                Logger.e("NotificationManager", String.format("Launch Activity for full-screen action does not exist ('%s').", launchActivity));
                return eVar;
            }
            Intent intent = new Intent(cg.f.f33622a, (Class<?>) clsA);
            if (fullScreenAction.getLaunchActivityFlags() != -1) {
                intent.addFlags(fullScreenAction.getLaunchActivityFlags());
            }
            if (fullScreenAction.getMainComponent() != null) {
                intent.putExtra("mainComponent", fullScreenAction.getMainComponent());
                intent.putExtra("notification", notificationModel.toBundle());
                cg.g.b(new cg.l(fullScreenAction.getMainComponent()));
            }
            eVar.u(PendingIntent.getActivity(cg.f.f33622a, notificationModel.b().intValue(), intent, 167772160), true);
        }
        return eVar;
    }

    public static m.e c(NotificationAndroidModel notificationAndroidModel, NotificationModel notificationModel) {
        Boolean bool = Boolean.FALSE;
        m.e eVar = new m.e(cg.f.f33622a, notificationAndroidModel.getChannelId());
        Bundle bundle = notificationModel.f33014a.getBundle("data");
        eVar.s(bundle != null ? (Bundle) bundle.clone() : new Bundle());
        eVar.r(ReceiverService.a("app.notifee.core.ReceiverService.DELETE_INTENT", new String[]{"notification"}, notificationModel.toBundle()));
        if (cg.f.f33622a.getApplicationInfo().targetSdkVersion < 31 || Build.VERSION.SDK_INT < 31) {
            eVar.n(ReceiverService.a("app.notifee.core.ReceiverService.PRESS_INTENT", new String[]{"notification", "pressAction"}, notificationModel.toBundle(), notificationAndroidModel.getPressAction()));
        } else {
            eVar.n(cg.o.a(notificationModel.b().intValue(), notificationAndroidModel.getPressAction(), 1, new String[]{"notification", "pressAction"}, notificationModel.toBundle(), notificationAndroidModel.getPressAction()));
        }
        if (notificationModel.f33014a.getString(com.amazon.a.a.o.b.f34626S) != null) {
            eVar.p(J1.b.a(notificationModel.f33014a.getString(com.amazon.a.a.o.b.f34626S), 0));
        }
        if (notificationModel.f33014a.getString("subtitle") != null) {
            eVar.P(J1.b.a(notificationModel.f33014a.getString("subtitle"), 0));
        }
        if (notificationModel.f33014a.getString("body") != null) {
            eVar.o(J1.b.a(notificationModel.f33014a.getString("body"), 0));
        }
        if (notificationAndroidModel.getBadgeIconType() != null) {
            eVar.h(notificationAndroidModel.getBadgeIconType().intValue());
        }
        if (notificationAndroidModel.getCategory() != null) {
            eVar.i(notificationAndroidModel.getCategory());
        }
        if (notificationAndroidModel.getColor() != null) {
            eVar.l(notificationAndroidModel.getColor().intValue());
        }
        eVar.m(notificationAndroidModel.getColorized().booleanValue());
        eVar.k(notificationAndroidModel.getChronometerCountDown().booleanValue());
        if (notificationAndroidModel.getGroup() != null) {
            eVar.v(notificationAndroidModel.getGroup());
        }
        eVar.w(notificationAndroidModel.getGroupAlertBehaviour());
        eVar.x(notificationAndroidModel.getGroupSummary().booleanValue());
        if (notificationAndroidModel.getInputHistory() != null) {
            eVar.G(notificationAndroidModel.getInputHistory());
        }
        if (notificationAndroidModel.getLights() != null) {
            ArrayList<Integer> lights = notificationAndroidModel.getLights();
            eVar.z(lights.get(0).intValue(), lights.get(1).intValue(), lights.get(2).intValue());
        }
        eVar.A(notificationAndroidModel.getLocalOnly().booleanValue());
        if (notificationAndroidModel.getNumber() != null) {
            eVar.B(notificationAndroidModel.getNumber().intValue());
        }
        if (notificationAndroidModel.getSound() != null) {
            Uri uriE = cg.s.e(notificationAndroidModel.getSound());
            if (uriE != null) {
                bool = Boolean.TRUE;
                eVar.N(uriE);
            } else {
                Logger.w("NotificationManager", "Unable to retrieve sound for notification, sound was specified as: " + notificationAndroidModel.getSound());
            }
        }
        eVar.q(notificationAndroidModel.getDefaults(bool).intValue());
        eVar.C(notificationAndroidModel.getOngoing().booleanValue());
        eVar.D(notificationAndroidModel.getOnlyAlertOnce().booleanValue());
        eVar.E(notificationAndroidModel.getPriority());
        NotificationAndroidModel.a progress = notificationAndroidModel.getProgress();
        if (progress != null) {
            eVar.F(progress.f33011a, progress.f33012b, progress.f33013c);
        }
        if (notificationAndroidModel.getShortcutId() != null) {
            eVar.H(notificationAndroidModel.getShortcutId());
        }
        eVar.I(notificationAndroidModel.getShowTimestamp().booleanValue());
        Integer smallIcon = notificationAndroidModel.getSmallIcon();
        if (smallIcon != null) {
            Integer smallIconLevel = notificationAndroidModel.getSmallIconLevel();
            if (smallIconLevel != null) {
                eVar.L(smallIcon.intValue(), smallIconLevel.intValue());
            } else {
                eVar.K(smallIcon.intValue());
            }
        }
        if (notificationAndroidModel.getSortKey() != null) {
            eVar.M(notificationAndroidModel.getSortKey());
        }
        if (notificationAndroidModel.getTicker() != null) {
            eVar.Q(notificationAndroidModel.getTicker());
        }
        if (notificationAndroidModel.getTimeoutAfter() != null) {
            eVar.R(notificationAndroidModel.getTimeoutAfter().longValue());
        }
        eVar.S(notificationAndroidModel.getShowChronometer().booleanValue());
        long[] vibrationPattern = notificationAndroidModel.getVibrationPattern();
        if (vibrationPattern.length > 0) {
            eVar.T(vibrationPattern);
        }
        eVar.U(notificationAndroidModel.getVisibility());
        long timestamp = notificationAndroidModel.getTimestamp();
        if (timestamp > -1) {
            eVar.V(timestamp);
        }
        eVar.g(notificationAndroidModel.getAutoCancel().booleanValue());
        return eVar;
    }

    public static com.google.common.util.concurrent.p d() {
        return f58552b.submit(new Callable() { // from class: r4.z0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return E0.A();
            }
        });
    }

    public static com.google.common.util.concurrent.p e(final int i10) {
        com.google.common.util.concurrent.r rVar = f58552b;
        return new cg.h(rVar.submit(new Callable() { // from class: r4.x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return E0.z(i10);
            }
        })).b(new com.google.common.util.concurrent.d() { // from class: r4.y0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return E0.f(i10, obj);
            }
        }, rVar);
    }

    public static /* synthetic */ com.google.common.util.concurrent.p f(int i10, Object obj) {
        return (i10 == 2 || i10 == 0) ? new cg.h(g0.b()).a(new InterfaceC3105b() { // from class: r4.n0
            @Override // cg.InterfaceC3105b
            public final void a(Exception exc, Object obj2) {
                E0.u(exc, (Void) obj2);
            }
        }, f58552b) : com.google.common.util.concurrent.j.d(null);
    }

    public static com.google.common.util.concurrent.p g(int i10, List list, Object obj) {
        if (i10 != 1) {
            C6429i.j(cg.f.f33622a).n(list);
        }
        return com.google.common.util.concurrent.j.d(null);
    }

    public static com.google.common.util.concurrent.p h(final int i10, final List list, final String str) {
        com.google.common.util.concurrent.r rVar = f58552b;
        return new cg.h(rVar.submit(new Callable() { // from class: r4.A0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return E0.p(list, i10, str);
            }
        })).b(new com.google.common.util.concurrent.d() { // from class: r4.B0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return E0.g(i10, list, obj);
            }
        }, rVar);
    }

    public static com.google.common.util.concurrent.p l(final NotificationModel notificationModel) {
        final NotificationAndroidModel notificationAndroidModelA = notificationModel.a();
        Callable callable = new Callable() { // from class: r4.D0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return E0.c(notificationAndroidModelA, notificationModel);
            }
        };
        com.google.common.util.concurrent.d dVar = new com.google.common.util.concurrent.d() { // from class: r4.j0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return E0.f58552b.submit(new Callable() { // from class: r4.p0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return E0.a(eVar, notificationAndroidModel);
                    }
                });
            }
        };
        com.google.common.util.concurrent.d dVar2 = new com.google.common.util.concurrent.d() { // from class: r4.k0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return E0.f58552b.submit(new Callable() { // from class: r4.q0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return E0.b(eVar, notificationAndroidModel, notificationModel);
                    }
                });
            }
        };
        com.google.common.util.concurrent.d dVar3 = new com.google.common.util.concurrent.d() { // from class: r4.l0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return E0.f58552b.submit(new Callable() { // from class: r4.o0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return E0.v(eVar, notificationAndroidModel, notificationModel);
                    }
                });
            }
        };
        com.google.common.util.concurrent.d dVar4 = new com.google.common.util.concurrent.d() { // from class: r4.m0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return E0.f58552b.submit(new Callable() { // from class: r4.r0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return E0.w(notificationAndroidModel, eVar);
                    }
                });
            }
        };
        com.google.common.util.concurrent.r rVar = f58552b;
        return new cg.h(rVar.submit(callable)).b(dVar, rVar).b(dVar3, rVar).b(dVar4, rVar).b(dVar2, rVar);
    }

    public static com.google.common.util.concurrent.p m(final NotificationModel notificationModel, final Bundle bundle) {
        return f58552b.submit(new Callable() { // from class: r4.w0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return E0.q(bundle, notificationModel);
            }
        });
    }

    public static com.google.common.util.concurrent.p n(NotificationModel notificationModel, Bundle bundle, m.e eVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("notifee.notification", notificationModel.toBundle());
        if (bundle != null) {
            bundle2.putBundle("notifee.trigger", bundle);
        }
        eVar.c(bundle2);
        Notification notificationD = eVar.d();
        int iIntValue = notificationModel.b().intValue();
        NotificationAndroidModel notificationAndroidModelA = notificationModel.a();
        if (notificationAndroidModelA.getLoopSound().booleanValue()) {
            notificationD.flags |= 4;
        }
        if (notificationAndroidModelA.getFlags() != null && notificationAndroidModelA.getFlags().length > 0) {
            for (int i10 : notificationAndroidModelA.getFlags()) {
                notificationD.flags = i10 | notificationD.flags;
            }
        }
        if (notificationAndroidModelA.getLightUpScreen().booleanValue()) {
            PowerManager powerManager = (PowerManager) cg.f.f33622a.getSystemService("power");
            if (!powerManager.isInteractive()) {
                powerManager.newWakeLock(805306394, "Notifee:lock").acquire();
                powerManager.newWakeLock(1, "Notifee:cpuLock").acquire();
            }
        }
        if (notificationAndroidModelA.getAsForegroundService().booleanValue()) {
            Bundle bundle3 = notificationModel.toBundle();
            String str = ForegroundService.f32968a;
            Intent intent = new Intent(cg.f.f33622a, (Class<?>) ForegroundService.class);
            intent.setAction("app.notifee.core.ForegroundService.START");
            intent.putExtra("hashCode", iIntValue);
            intent.putExtra("notification", notificationD);
            intent.putExtra("notificationBundle", bundle3);
            if (Build.VERSION.SDK_INT >= 26) {
                cg.f.f33622a.startForegroundService(intent);
            } else {
                cg.f.f33622a.startService(intent);
            }
        } else {
            androidx.core.app.q.i(cg.f.f33622a).q(notificationAndroidModelA.getTag(), iIntValue, notificationD);
        }
        cg.g.a(new NotificationEvent(3, notificationModel));
        return com.google.common.util.concurrent.j.d(null);
    }

    public static com.google.common.util.concurrent.p o(cg.v vVar, androidx.work.b bVar, c.a aVar) {
        byte[] bArrJ;
        if (vVar == null || (bArrJ = vVar.f33645b) == null) {
            bArrJ = bVar.j("notification");
            if (bArrJ == null) {
                Logger.w("NotificationManager", "Attempted to handle doScheduledWork but no notification data was found.");
                aVar.b(c.a.c());
                return com.google.common.util.concurrent.j.d(null);
            }
            Logger.w("NotificationManager", "The trigger notification was created using an older version, please consider recreating the notification.");
        }
        NotificationModel notificationModel = new NotificationModel(cg.q.b(bArrJ));
        byte[] bArr = vVar.f33646c;
        return y(notificationModel, bArr != null ? cg.q.b(bArr) : null);
    }

    public static Object p(List list, int i10, String str) {
        i4.t tVarH = i4.t.h(cg.f.f33622a);
        androidx.core.app.q qVarI = androidx.core.app.q.i(cg.f.f33622a);
        Iterator it = list.iterator();
        while (true) {
            Integer numValueOf = null;
            if (!it.hasNext()) {
                return null;
            }
            String str2 = (String) it.next();
            Logger.i("NotificationManager", "Removing notification with id " + str2);
            if (i10 != 2) {
                if (str != null && str2.equals("0")) {
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt(str2));
                    } catch (Exception unused) {
                        Logger.e("NotificationManager", "cancelAllNotificationsWithIds -> Failed to parse id as integer  " + str2);
                    }
                    if (numValueOf != null) {
                        qVarI.c(str, numValueOf.intValue());
                    }
                }
                qVarI.c(str, str2.hashCode());
            }
            if (i10 != 1) {
                Logger.i("NotificationManager", "Removing notification with id " + str2);
                tVarH.b("trigger:" + str2);
                tVarH.j();
                PendingIntent pendingIntentA = g0.a(str2);
                AlarmManager alarmManagerA = AbstractC3104a.a();
                if (pendingIntentA != null) {
                    alarmManagerA.cancel(pendingIntentA);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Void q(android.os.Bundle r17, app.notifee.core.model.NotificationModel r18) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.E0.q(android.os.Bundle, app.notifee.core.model.NotificationModel):java.lang.Void");
    }

    public static /* synthetic */ void r(final c.a aVar, final androidx.work.b bVar, final String str, Exception exc, com.google.common.util.concurrent.p pVar) {
        if (exc == null) {
            new cg.h(pVar).a(new InterfaceC3105b() { // from class: r4.u0
                @Override // cg.InterfaceC3105b
                public final void a(Exception exc2, Object obj) {
                    E0.s(aVar, bVar, str, exc2, (Void) obj);
                }
            }, f58552b);
        } else {
            aVar.b(c.a.c());
            Logger.e("NotificationManager", "Failed to display notification", exc);
        }
    }

    public static void s(c.a aVar, androidx.work.b bVar, String str, Exception exc, Void r42) {
        aVar.b(c.a.c());
        if (exc != null) {
            Logger.e("NotificationManager", "Failed to display notification", exc);
            return;
        }
        String strM = bVar.m("workRequestType");
        if (strM == null || !strM.equals("OneTime")) {
            return;
        }
        C6429i.j(cg.f.f33622a).m(str);
    }

    public static void t(final androidx.work.b bVar, final c.a aVar) {
        final String strM = bVar.m(DiagnosticsEntry.ID_KEY);
        C6429i c6429i = new C6429i(cg.f.f33622a);
        com.google.common.util.concurrent.d dVar = new com.google.common.util.concurrent.d() { // from class: r4.s0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return E0.f58552b.submit(new Callable() { // from class: r4.v0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return E0.o(vVar, bVar, aVar);
                    }
                });
            }
        };
        cg.h hVar = new cg.h(c6429i.p(strM));
        com.google.common.util.concurrent.r rVar = f58552b;
        hVar.b(dVar, rVar).a(new InterfaceC3105b() { // from class: r4.t0
            @Override // cg.InterfaceC3105b
            public final void a(Exception exc, Object obj) {
                E0.r(aVar, bVar, strM, exc, (com.google.common.util.concurrent.p) obj);
            }
        }, rVar);
    }

    public static void u(Exception exc, Void r12) {
        if (exc == null) {
            C6429i.j(cg.f.f33622a).k();
        }
    }

    public static m.e v(m.e eVar, NotificationAndroidModel notificationAndroidModel, NotificationModel notificationModel) {
        Bitmap bitmap;
        ArrayList<NotificationAndroidActionModel> actions = notificationAndroidModel.getActions();
        if (actions != null) {
            for (NotificationAndroidActionModel notificationAndroidActionModel : actions) {
                PendingIntent pendingIntentA = (cg.f.f33622a.getApplicationInfo().targetSdkVersion < 31 || Build.VERSION.SDK_INT < 31) ? ReceiverService.a("app.notifee.core.ReceiverService.ACTION_PRESS_INTENT", new String[]{"notification", "pressAction"}, notificationModel.toBundle(), notificationAndroidActionModel.getPressAction().toBundle()) : cg.o.a(notificationModel.b().intValue(), notificationAndroidActionModel.getPressAction().toBundle(), 2, new String[]{"notification", "pressAction"}, notificationModel.toBundle(), notificationAndroidActionModel.getPressAction().toBundle());
                String icon = notificationAndroidActionModel.getIcon();
                if (icon != null) {
                    try {
                        bitmap = (Bitmap) cg.s.b(notificationAndroidActionModel.getIcon()).get(10L, TimeUnit.SECONDS);
                    } catch (TimeoutException e10) {
                        Logger.e("NotificationManager", "Timeout occurred whilst trying to retrieve an action icon: " + icon, (Exception) e10);
                        bitmap = null;
                    } catch (Exception e11) {
                        Logger.e("NotificationManager", "An error occurred whilst trying to retrieve an action icon: " + icon, e11);
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                m.a.C0493a c0493a = new m.a.C0493a(bitmap != null ? IconCompat.b(bitmap) : null, J1.b.a(notificationAndroidActionModel.getTitle(), 0), pendingIntentA);
                androidx.core.app.w remoteInput = notificationAndroidActionModel.getRemoteInput(c0493a);
                if (remoteInput != null) {
                    c0493a.a(remoteInput);
                }
                eVar.b(c0493a.b());
            }
        }
        return eVar;
    }

    public static /* synthetic */ m.e w(NotificationAndroidModel notificationAndroidModel, m.e eVar) {
        com.google.common.util.concurrent.p styleTask;
        m.h hVar;
        NotificationAndroidStyleModel style = notificationAndroidModel.getStyle();
        if (style != null && (styleTask = style.getStyleTask(f58552b)) != null && (hVar = (m.h) styleTask.get()) != null) {
            eVar.O(hVar);
        }
        return eVar;
    }

    public static com.google.common.util.concurrent.p y(final NotificationModel notificationModel, final Bundle bundle) {
        return new cg.h(l(notificationModel)).b(new com.google.common.util.concurrent.d() { // from class: r4.C0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return E0.n(notificationModel, bundle, (m.e) obj);
            }
        }, f58551a);
    }

    public static Object z(int i10) {
        androidx.core.app.q qVarI = androidx.core.app.q.i(cg.f.f33622a);
        if (i10 == 1 || i10 == 0) {
            qVarI.d();
        }
        if (i10 != 2 && i10 != 0) {
            return null;
        }
        i4.t tVarH = i4.t.h(cg.f.f33622a);
        tVarH.a("app.notifee.core.NotificationManager.TRIGGER");
        tVarH.j();
        return null;
    }
}
