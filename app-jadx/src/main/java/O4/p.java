package o4;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54499a = i4.i.i("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            i4.i iVarE = i4.i.e();
            String str = f54499a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            iVarE.a(str, sb2.toString());
        } catch (Exception e10) {
            i4.i iVarE2 = i4.i.e();
            String str2 = f54499a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            iVarE2.b(str2, sb3.toString(), e10);
        }
    }
}
