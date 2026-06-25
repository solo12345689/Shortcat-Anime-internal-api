package U6;

import Df.p;
import Df.r;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import android.net.Uri;
import com.revenuecat.purchases.common.Constants;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19359b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f19360c = "\n\nTry the following to fix the issue:\n\\u2022 Ensure that Metro is running\n\\u2022 Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n\\u2022 Ensure Airplane Mode is disabled\n\\u2022 If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT> to forward requests from your device\n\\u2022 If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19361a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String d(String str) {
            List listM;
            List listL = new p("/").l(str, 0);
            if (listL.isEmpty()) {
                listM = AbstractC2279u.m();
            } else {
                ListIterator listIterator = listL.listIterator(listL.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listM = AbstractC2279u.T0(listL, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listM = AbstractC2279u.m();
            }
            return (String) AbstractC2273n.z0((String[]) listM.toArray(new String[0]));
        }

        public final b a(String url, String reason, String extra, Throwable th2) {
            AbstractC5504s.h(url, "url");
            AbstractC5504s.h(reason, "reason");
            AbstractC5504s.h(extra, "extra");
            return new b(reason + r.K(b.f19360c, "<PORT>", String.valueOf(Uri.parse(url).getPort()), false, 4, null) + extra, th2);
        }

        public final b b(String url, String reason, Throwable th2) {
            AbstractC5504s.h(url, "url");
            AbstractC5504s.h(reason, "reason");
            return a(url, reason, "", th2);
        }

        public final b c(String str, String str2) {
            if (str2 != null && str2.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("filename");
                    String string2 = jSONObject.getString("message");
                    AbstractC5504s.g(string2, "getString(...)");
                    AbstractC5504s.e(string);
                    return new b(string2, d(string), jSONObject.getInt("lineNumber"), jSONObject.getInt("column"), null);
                } catch (JSONException e10) {
                    AbstractC7283a.J("ReactNative", "Could not parse DebugServerException from: " + str2, e10);
                }
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ b(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, i11);
    }

    private b(String str, String str2, int i10, int i11) {
        super(str + "\n  at " + str2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i10 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i11);
        this.f19361a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String description) {
        super(description);
        AbstractC5504s.h(description, "description");
        this.f19361a = description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String detailMessage, Throwable th2) {
        super(detailMessage, th2);
        AbstractC5504s.h(detailMessage, "detailMessage");
        this.f19361a = detailMessage;
    }
}
