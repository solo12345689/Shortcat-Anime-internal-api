package expo.modules.constants;

import Df.C1271d;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import be.AbstractC3048a;
import com.adjust.sdk.Constants;
import expo.modules.interfaces.constants.ConstantsInterface;
import fe.c;
import fe.v;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mc.InterfaceC5657a;
import ob.AbstractC5851b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5657a(clazz = ConstantsInterface.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u0000 !2\u00020\u0001:\u0002\u0006\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u001f¨\u0006\""}, d2 = {"Lexpo/modules/constants/ConstantsService;", "Lexpo/modules/interfaces/constants/ConstantsInterface;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "b", "Landroid/content/Context;", "", "c", "I", "getStatusBarHeightInternal", "()I", "setStatusBarHeightInternal", "(I)V", "statusBarHeightInternal", "", "d", "Ljava/lang/String;", "sessionId", "a", "()Ljava/lang/String;", "appConfig", "", "", "getConstants", "()Ljava/util/Map;", "constants", "deviceName", "systemVersion", "", "()Ljava/util/List;", "systemFonts", "e", "expo-constants_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ConstantsService implements ConstantsInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int statusBarHeightInternal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String sessionId;

    /* JADX INFO: renamed from: expo.modules.constants.ConstantsService$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(float f10, Context context) {
            return (int) (f10 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f46045b = new b("BARE", 0, "bare");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f46046c = new b("STANDALONE", 1, "standalone");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f46047d = new b("STORE_CLIENT", 2, "storeClient");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f46048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f46049f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f46050a;

        static {
            b[] bVarArrA = a();
            f46048e = bVarArrA;
            f46049f = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10, String str2) {
            this.f46050a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f46045b, f46046c, f46047d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f46048e.clone();
        }

        public final String b() {
            return this.f46050a;
        }
    }

    public ConstantsService(Context context) {
        AbstractC5504s.h(context, "context");
        this.context = context;
        Integer numValueOf = Integer.valueOf(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        this.statusBarHeightInternal = (numValueOf.intValue() <= 0 ? null : numValueOf) != null ? INSTANCE.b(context.getResources().getDimensionPixelSize(r0.intValue()), context) : 0;
        String string = UUID.randomUUID().toString();
        AbstractC5504s.g(string, "toString(...)");
        this.sessionId = string;
    }

    private final String a() {
        try {
            InputStream inputStreamOpen = this.context.getAssets().open("app.config");
            try {
                AbstractC5504s.e(inputStreamOpen);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, C1271d.f3718b), 8192);
                try {
                    String strE = v.e(bufferedReader);
                    c.a(bufferedReader, null);
                    c.a(inputStreamOpen, null);
                    return strE;
                } finally {
                }
            } finally {
            }
        } catch (FileNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            Log.e(AbstractC5851b.f55348a, "Error reading embedded app config", e10);
            return null;
        }
    }

    public String b() {
        String MODEL = Build.MODEL;
        AbstractC5504s.g(MODEL, "MODEL");
        return MODEL;
    }

    public List c() {
        return AbstractC2279u.p(Constants.NORMAL, "notoserif", "sans-serif", "sans-serif-light", "sans-serif-thin", "sans-serif-condensed", "sans-serif-medium", "serif", "Roboto", "monospace");
    }

    public String d() {
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC5504s.g(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public Map getConstants() {
        return S.l(z.a("sessionId", this.sessionId), z.a("executionEnvironment", b.f46045b.b()), z.a("statusBarHeight", Integer.valueOf(this.statusBarHeightInternal)), z.a("deviceName", b()), z.a("systemFonts", c()), z.a("systemVersion", d()), z.a("manifest", a()), z.a("platform", S.f(z.a("android", S.i()))));
    }
}
