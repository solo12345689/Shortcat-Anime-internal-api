package cg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Intent f33635a;

    public static Intent a(Context context) {
        List arrayList;
        String lowerCase = Build.BRAND.toLowerCase(Locale.US);
        arrayList = new ArrayList();
        lowerCase.getClass();
        switch (lowerCase) {
            case "oneplus":
                arrayList = Arrays.asList(b("com.oneplus.security", "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity"));
                break;
            case "huawei":
                arrayList = Arrays.asList(b("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity"), b("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"), b("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity"));
                break;
            case "xiaomi":
            case "redmi":
                arrayList = Arrays.asList(b("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
                break;
            case "htc":
                arrayList = Arrays.asList(b("com.htc.pitroad", "com.htc.pitroad.landingpage.activity.LandingPageActivity"));
                break;
            case "asus":
                arrayList = Arrays.asList(b("com.asus.mobilemanager", "com.asus.mobilemanager.powersaver.PowerSaverSettings"), b("com.asus.mobilemanager", "com.asus.mobilemanager.autostart.AutoStartActivity"), b("com.asus.mobilemanager", "com.asus.mobilemanager.entry.FunctionActivity").setData(Uri.parse("mobilemanager://function/entry/AutoStart")));
                break;
            case "letv":
                arrayList = Arrays.asList(b("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity").setData(Uri.parse("mobilemanager://function/entry/AutoStart")));
                break;
            case "oppo":
            case "coloros":
                arrayList = Arrays.asList(b("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity"), b("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity"), b("com.coloros.safecenter", "com.coloros.safecenter.startupapp.StartupAppListActivity").setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"), b("com.coloros.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerUsageModelActivity"), b("com.coloros.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerSaverModeActivity"), b("com.coloros.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"));
                break;
            case "vivo":
                arrayList = Arrays.asList(b("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity"), b("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"), b("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager"));
                break;
            case "honor":
                arrayList = Arrays.asList(b("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity"));
                break;
            case "meizu":
                arrayList = Arrays.asList(b("com.meizu.safe", "com.meizu.safe.security.SHOW_APPSEC").addCategory("android.intent.category.DEFAULT"));
                break;
            case "nokia":
                arrayList = Arrays.asList(b("com.evenwell.powersaving.g3", "com.evenwell.powersaving.g3.exception.PowerSaverExceptionActivity"));
                break;
            case "samsung":
                arrayList = Arrays.asList(b("com.samsung.android.lool", "com.samsung.android.sm.ui.battery.BatteryActivity"), b("com.samsung.android.sm", "com.samsung.android.sm.ui.battery.BatteryActivity"), b("com.samsung.android.lool", "com.samsung.android.sm.battery.ui.BatteryActivity"));
                break;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Intent intent = (Intent) arrayList.get(i10);
            if (k.d(context, intent)) {
                synchronized (r.class) {
                    f33635a = intent;
                }
                return intent;
            }
        }
        return null;
    }

    public static Intent b(String str, String str2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        return intent;
    }
}
