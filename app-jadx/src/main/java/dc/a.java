package Dc;

import Hc.f;
import Pc.e;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import qb.InterfaceC6168b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a extends e.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f3683b;

    public a(Context context) {
        this.f3683b = new e(context);
    }

    protected boolean A(InterfaceC6168b interfaceC6168b) {
        return !interfaceC6168b.getBoolean("vibrate", true);
    }

    protected boolean p(InterfaceC6168b interfaceC6168b) {
        return interfaceC6168b.getBoolean("autoDismiss", true);
    }

    protected Number q(InterfaceC6168b interfaceC6168b) {
        if (interfaceC6168b.f("badge")) {
            return Integer.valueOf(interfaceC6168b.getInt("badge"));
        }
        return null;
    }

    protected JSONObject r(InterfaceC6168b interfaceC6168b) {
        try {
            Map map = interfaceC6168b.getMap("data");
            if (map != null) {
                return new JSONObject(map);
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    protected String s(InterfaceC6168b interfaceC6168b) {
        return interfaceC6168b.getString("categoryIdentifier", null);
    }

    protected Number t(InterfaceC6168b interfaceC6168b) {
        try {
            if (interfaceC6168b.f("color")) {
                return Integer.valueOf(Color.parseColor(interfaceC6168b.getString("color")));
            }
            return null;
        } catch (IllegalArgumentException unused) {
            Log.e("expo-notifications", "Could not have parsed color passed in notification.");
            return null;
        }
    }

    protected Mc.d u(InterfaceC6168b interfaceC6168b) {
        return Mc.d.b(interfaceC6168b.getString("priority"));
    }

    protected Uri v(InterfaceC6168b interfaceC6168b) {
        return this.f3683b.b(interfaceC6168b.getString("sound"));
    }

    protected boolean w(InterfaceC6168b interfaceC6168b) {
        return interfaceC6168b.getBoolean("sticky", false);
    }

    protected long[] x(InterfaceC6168b interfaceC6168b) {
        try {
            List listA = interfaceC6168b.a("vibrate");
            if (listA == null) {
                return null;
            }
            long[] jArr = new long[listA.size()];
            for (int i10 = 0; i10 < listA.size(); i10++) {
                if (!(listA.get(i10) instanceof Number)) {
                    throw new f(i10, listA.get(i10));
                }
                jArr[i10] = ((Number) listA.get(i10)).longValue();
            }
            return jArr;
        } catch (f e10) {
            Log.w("expo-notifications", "Failed to set custom vibration pattern from the notification: " + e10.getMessage());
            return null;
        }
    }

    public e.b y(InterfaceC6168b interfaceC6168b) {
        l(interfaceC6168b.getString(com.amazon.a.a.o.b.f34626S)).j(interfaceC6168b.getString("subtitle")).k(interfaceC6168b.getString("body")).d(r(interfaceC6168b)).g(u(interfaceC6168b)).c(q(interfaceC6168b)).f(t(interfaceC6168b)).b(p(interfaceC6168b)).e(s(interfaceC6168b)).i(w(interfaceC6168b));
        if (z(interfaceC6168b)) {
            n();
        } else {
            h(v(interfaceC6168b));
        }
        if (A(interfaceC6168b)) {
            o();
            return this;
        }
        m(x(interfaceC6168b));
        return this;
    }

    protected boolean z(InterfaceC6168b interfaceC6168b) {
        return interfaceC6168b.b("sound") instanceof Boolean ? interfaceC6168b.getBoolean("sound") : v(interfaceC6168b) == null;
    }
}
