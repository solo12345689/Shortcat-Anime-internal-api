package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.C6552b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class n implements l {

    /* JADX INFO: renamed from: a */
    private final Context f28860a;

    /* JADX INFO: renamed from: b */
    private final Notification.Builder f28861b;

    /* JADX INFO: renamed from: c */
    private final m.e f28862c;

    /* JADX INFO: renamed from: d */
    private RemoteViews f28863d;

    /* JADX INFO: renamed from: e */
    private RemoteViews f28864e;

    /* JADX INFO: renamed from: f */
    private final List f28865f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final Bundle f28866g = new Bundle();

    /* JADX INFO: renamed from: h */
    private int f28867h;

    /* JADX INFO: renamed from: i */
    private RemoteViews f28868i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    n(m.e eVar) {
        int i10;
        this.f28862c = eVar;
        Context context = eVar.f28818a;
        this.f28860a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28861b = e.a(context, eVar.f28807M);
        } else {
            this.f28861b = new Notification.Builder(eVar.f28818a);
        }
        Notification notification = eVar.f28814T;
        this.f28861b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f28827j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f28822e).setContentText(eVar.f28823f).setContentInfo(eVar.f28829l).setContentIntent(eVar.f28825h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f28826i, (notification.flags & 128) != 0).setNumber(eVar.f28830m).setProgress(eVar.f28839v, eVar.f28840w, eVar.f28841x);
        Notification.Builder builder = this.f28861b;
        IconCompat iconCompat = eVar.f28828k;
        c.b(builder, iconCompat == null ? null : iconCompat.o(context));
        this.f28861b.setSubText(eVar.f28836s).setUsesChronometer(eVar.f28833p).setPriority(eVar.f28831n);
        Iterator it = eVar.f28819b.iterator();
        while (it.hasNext()) {
            b((m.a) it.next());
        }
        Bundle bundle = eVar.f28800F;
        if (bundle != null) {
            this.f28866g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f28863d = eVar.f28804J;
        this.f28864e = eVar.f28805K;
        this.f28861b.setShowWhen(eVar.f28832o);
        a.h(this.f28861b, eVar.f28796B);
        a.f(this.f28861b, eVar.f28842y);
        a.i(this.f28861b, eVar.f28795A);
        a.g(this.f28861b, eVar.f28843z);
        this.f28867h = eVar.f28811Q;
        b.b(this.f28861b, eVar.f28799E);
        b.c(this.f28861b, eVar.f28801G);
        b.f(this.f28861b, eVar.f28802H);
        b.d(this.f28861b, eVar.f28803I);
        b.e(this.f28861b, notification.sound, notification.audioAttributes);
        List listE = i11 < 28 ? e(g(eVar.f28820c), eVar.f28817W) : eVar.f28817W;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                b.a(this.f28861b, (String) it2.next());
            }
        }
        this.f28868i = eVar.f28806L;
        if (eVar.f28821d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f28821d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), o.a((m.a) eVar.f28821d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f28866g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.f28816V;
        if (obj != null) {
            c.c(this.f28861b, obj);
        }
        this.f28861b.setExtras(eVar.f28800F);
        d.e(this.f28861b, eVar.f28838u);
        RemoteViews remoteViews = eVar.f28804J;
        if (remoteViews != null) {
            d.c(this.f28861b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f28805K;
        if (remoteViews2 != null) {
            d.b(this.f28861b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f28806L;
        if (remoteViews3 != null) {
            d.d(this.f28861b, remoteViews3);
        }
        if (i13 >= 26) {
            e.b(this.f28861b, eVar.f28808N);
            e.e(this.f28861b, eVar.f28837t);
            e.f(this.f28861b, eVar.f28809O);
            e.g(this.f28861b, eVar.f28810P);
            e.d(this.f28861b, eVar.f28811Q);
            if (eVar.f28798D) {
                e.c(this.f28861b, eVar.f28797C);
            }
            if (!TextUtils.isEmpty(eVar.f28807M)) {
                this.f28861b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it3 = eVar.f28820c.iterator();
            while (it3.hasNext()) {
                f.a(this.f28861b, ((u) it3.next()).h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            g.a(this.f28861b, eVar.f28813S);
            g.b(this.f28861b, m.d.a(null));
        }
        if (i14 >= 31 && (i10 = eVar.f28812R) != 0) {
            h.b(this.f28861b, i10);
        }
        if (i14 >= 36) {
            i.a(this.f28861b, eVar.f28824g);
        }
        if (eVar.f28815U) {
            if (this.f28862c.f28843z) {
                this.f28867h = 2;
            } else {
                this.f28867h = 1;
            }
            this.f28861b.setVibrate(null);
            this.f28861b.setSound(null);
            int i15 = notification.defaults & (-4);
            notification.defaults = i15;
            this.f28861b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f28862c.f28842y)) {
                    a.f(this.f28861b, "silent");
                }
                e.d(this.f28861b, this.f28867h);
            }
        }
    }

    private void b(m.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.n() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : w.d(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i10 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i10 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f28861b, a.d(builderA));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C6552b c6552b = new C6552b(list.size() + list2.size());
        c6552b.addAll(list);
        c6552b.addAll(list2);
        return new ArrayList(c6552b);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((u) it.next()).g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.l
    public Notification.Builder a() {
        return this.f28861b;
    }

    public Notification c() {
        Bundle bundleD;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        m.h hVar = this.f28862c.f28835r;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews remoteViewsE = hVar != null ? hVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f28862c.f28804J;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (hVar != null && (remoteViewsD = hVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (hVar != null && (remoteViewsF = this.f28862c.f28835r.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (hVar != null && (bundleD = m.d(notificationD)) != null) {
            hVar.a(bundleD);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f28861b.build();
        }
        Notification notificationBuild = this.f28861b.build();
        if (this.f28867h != 0) {
            if (a.e(notificationBuild) != null && (notificationBuild.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 && this.f28867h == 2) {
                h(notificationBuild);
            }
            if (a.e(notificationBuild) != null && (notificationBuild.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 && this.f28867h == 1) {
                h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    Context f() {
        return this.f28860a;
    }
}
