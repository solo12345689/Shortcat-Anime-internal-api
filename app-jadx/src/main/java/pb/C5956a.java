package pb;

import Td.z;
import Ud.S;
import java.util.Map;

/* JADX INFO: renamed from: pb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5956a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5956a f55872a = new C5956a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f55873b = S.l(z.a("host.exp.exponent.experience.splashscreen.legacy.SplashScreenPackage", 11), z.a("expo.modules.updates.UpdatesPackage", 10));

    private C5956a() {
    }

    public final int a(String str) {
        Integer num;
        if (str == null || (num = (Integer) f55873b.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
