package Zf;

import ag.AbstractC2627a;
import ag.d;
import ag.e;
import ag.f;
import ag.g;
import ag.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f23425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f23426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f23427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ComponentName f23428d;

    static {
        LinkedList linkedList = new LinkedList();
        f23425a = linkedList;
        f23426b = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AbstractC2627a.class);
        linkedList.add(ag.c.class);
        linkedList.add(d.class);
        linkedList.add(e.class);
        linkedList.add(h.class);
        linkedList.add(f.class);
        linkedList.add(g.class);
        linkedList.add(ag.b.class);
    }

    public static void a(Context context, int i10) throws b {
        if (f23427c == null && !b(context)) {
            throw new b("No default launcher available");
        }
        try {
            f23427c.b(context, f23428d, i10);
        } catch (Exception e10) {
            throw new b("Unable to execute badge", e10);
        }
    }

    private static boolean b(Context context) {
        a aVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f23428d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator it2 = f23425a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                try {
                    aVar = (a) ((Class) it2.next()).newInstance();
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar != null && aVar.a().contains(str)) {
                    f23427c = aVar;
                    break;
                }
            }
            if (f23427c != null) {
                break;
            }
        }
        if (f23427c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f23427c = new h();
            return true;
        }
        if (str2.equalsIgnoreCase("OPPO")) {
            f23427c = new d();
            return true;
        }
        if (str2.equalsIgnoreCase("VIVO")) {
            f23427c = new f();
            return true;
        }
        if (str2.equalsIgnoreCase("ZTE")) {
            f23427c = new g();
            return true;
        }
        f23427c = new DefaultBadger();
        return true;
    }
}
