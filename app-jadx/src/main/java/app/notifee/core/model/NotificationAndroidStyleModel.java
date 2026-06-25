package app.notifee.core.model;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.core.app.m;
import androidx.core.app.u;
import androidx.core.graphics.drawable.IconCompat;
import app.notifee.core.Logger;
import app.notifee.core.model.NotificationAndroidStyleModel;
import cg.q;
import cg.s;
import com.amazon.a.a.o.b;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.r;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NotificationAndroidStyleModel {
    private static final String TAG = "NotificationAndroidStyle";
    private Bundle mNotificationAndroidStyleBundle;

    private NotificationAndroidStyleModel(Bundle bundle) {
        this.mNotificationAndroidStyleBundle = bundle;
    }

    public static m.h a(NotificationAndroidStyleModel notificationAndroidStyleModel) {
        String string;
        Bitmap bitmap;
        notificationAndroidStyleModel.getClass();
        m.b bVar = new m.b();
        Bitmap bitmap2 = null;
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("picture")) {
            String string2 = notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString("picture");
            Objects.requireNonNull(string2);
            try {
                bitmap = (Bitmap) s.b(string2).get(10L, TimeUnit.SECONDS);
            } catch (TimeoutException e10) {
                Logger.e(TAG, "Timeout occurred whilst trying to retrieve a big picture style image: " + string2, (Exception) e10);
                bitmap = null;
            } catch (Exception e11) {
                Logger.e(TAG, "An error occurred whilst trying to retrieve a big picture style image: " + string2, e11);
                bitmap = null;
            }
            if (bitmap != null) {
                bVar.i(bitmap);
            }
        }
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("largeIcon")) {
            string = notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString("largeIcon");
            if (string == null) {
                bVar.h(null);
            }
        } else {
            string = null;
        }
        if (string != null) {
            try {
                bitmap2 = (Bitmap) s.b(string).get(10L, TimeUnit.SECONDS);
            } catch (TimeoutException e12) {
                Logger.e(TAG, "Timeout occurred whilst trying to retrieve a big picture style large icon: " + string, (Exception) e12);
            } catch (Exception e13) {
                Logger.e(TAG, "An error occurred whilst trying to retrieve a big picture style large icon: " + string, e13);
            }
            if (bitmap2 != null) {
                bVar.h(bitmap2);
            }
        }
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey(b.f34626S)) {
            bVar = bVar.j(J1.b.a(notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString(b.f34626S), 0));
        }
        return notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("summary") ? bVar.k(J1.b.a(notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString("summary"), 0)) : bVar;
    }

    public static /* synthetic */ u b(Bundle bundle) {
        Bitmap bitmap;
        u.b bVar = new u.b();
        bVar.f(bundle.getString("name"));
        if (bundle.containsKey(DiagnosticsEntry.ID_KEY)) {
            bVar.e(bundle.getString(DiagnosticsEntry.ID_KEY));
        }
        if (bundle.containsKey("bot")) {
            bVar.b(bundle.getBoolean("bot"));
        }
        if (bundle.containsKey("important")) {
            bVar.d(bundle.getBoolean("important"));
        }
        if (bundle.containsKey("icon")) {
            String string = bundle.getString("icon");
            Objects.requireNonNull(string);
            try {
                bitmap = (Bitmap) s.b(string).get(10L, TimeUnit.SECONDS);
            } catch (TimeoutException e10) {
                Logger.e(TAG, "Timeout occurred whilst trying to retrieve a person icon: " + string, (Exception) e10);
                bitmap = null;
            } catch (Exception e11) {
                Logger.e(TAG, "An error occurred whilst trying to retrieve a person icon: " + string, e11);
                bitmap = null;
            }
            if (bitmap != null) {
                bVar.c(IconCompat.b(bitmap));
            }
        }
        if (bundle.containsKey("uri")) {
            bVar.g(bundle.getString("uri"));
        }
        return bVar.a();
    }

    public static m.h c(NotificationAndroidStyleModel notificationAndroidStyleModel, r rVar) {
        u uVar;
        Bundle bundle = notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getBundle("person");
        Objects.requireNonNull(bundle);
        m.g gVar = new m.g((u) getPerson(rVar, bundle).get(20L, TimeUnit.SECONDS));
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey(b.f34626S)) {
            gVar = gVar.k(J1.b.a(notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString(b.f34626S), 0));
        }
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("group")) {
            gVar = gVar.l(notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getBoolean("group"));
        }
        ArrayList parcelableArrayList = notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getParcelableArrayList("messages");
        int i10 = 0;
        while (true) {
            Objects.requireNonNull(parcelableArrayList);
            if (i10 >= parcelableArrayList.size()) {
                return gVar;
            }
            Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
            long jD = q.d(bundle2.get(DiagnosticsEntry.TIMESTAMP_KEY));
            if (bundle2.containsKey("person")) {
                Bundle bundle3 = bundle2.getBundle("person");
                Objects.requireNonNull(bundle3);
                uVar = (u) getPerson(rVar, bundle3).get(20L, TimeUnit.SECONDS);
            } else {
                uVar = null;
            }
            gVar = gVar.i(J1.b.a(bundle2.getString("text"), 0), jD, uVar);
            i10++;
        }
    }

    public static NotificationAndroidStyleModel fromBundle(Bundle bundle) {
        return new NotificationAndroidStyleModel(bundle);
    }

    private p getBigPictureStyleTask(r rVar) {
        return rVar.submit(new Callable() { // from class: t4.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NotificationAndroidStyleModel.a(this.f60720a);
            }
        });
    }

    private m.c getBigTextStyle() {
        m.c cVar = new m.c();
        if (this.mNotificationAndroidStyleBundle.containsKey("text")) {
            cVar = cVar.h(J1.b.a(this.mNotificationAndroidStyleBundle.getString("text"), 0));
        }
        if (this.mNotificationAndroidStyleBundle.containsKey(b.f34626S)) {
            cVar = cVar.i(J1.b.a(this.mNotificationAndroidStyleBundle.getString(b.f34626S), 0));
        }
        return this.mNotificationAndroidStyleBundle.containsKey("summary") ? cVar.j(J1.b.a(this.mNotificationAndroidStyleBundle.getString("summary"), 0)) : cVar;
    }

    private m.f getInboxStyle() {
        m.f fVar = new m.f();
        if (this.mNotificationAndroidStyleBundle.containsKey(b.f34626S)) {
            fVar = fVar.i(J1.b.a(this.mNotificationAndroidStyleBundle.getString(b.f34626S), 0));
        }
        if (this.mNotificationAndroidStyleBundle.containsKey("summary")) {
            fVar = fVar.j(J1.b.a(this.mNotificationAndroidStyleBundle.getString("summary"), 0));
        }
        ArrayList<String> stringArrayList = this.mNotificationAndroidStyleBundle.getStringArrayList("lines");
        int i10 = 0;
        while (true) {
            Objects.requireNonNull(stringArrayList);
            if (i10 >= stringArrayList.size()) {
                return fVar;
            }
            fVar = fVar.h(J1.b.a(stringArrayList.get(i10), 0));
            i10++;
        }
    }

    private p getMessagingStyleTask(final r rVar) {
        return rVar.submit(new Callable() { // from class: t4.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NotificationAndroidStyleModel.c(this.f60721a, rVar);
            }
        });
    }

    private static p getPerson(r rVar, final Bundle bundle) {
        return rVar.submit(new Callable() { // from class: t4.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NotificationAndroidStyleModel.b(bundle);
            }
        });
    }

    public p getStyleTask(r rVar) {
        int iA = q.a(this.mNotificationAndroidStyleBundle.get("type"));
        if (iA == 0) {
            return getBigPictureStyleTask(rVar);
        }
        if (iA == 1) {
            return j.d(getBigTextStyle());
        }
        if (iA == 2) {
            return j.d(getInboxStyle());
        }
        if (iA != 3) {
            return null;
        }
        return getMessagingStyleTask(rVar);
    }

    public Bundle toBundle() {
        return (Bundle) this.mNotificationAndroidStyleBundle.clone();
    }
}
