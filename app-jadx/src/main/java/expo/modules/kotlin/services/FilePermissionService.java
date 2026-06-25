package expo.modules.kotlin.services;

import Df.r;
import Ud.AbstractC2279u;
import android.content.Context;
import be.AbstractC3048a;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/services/FilePermissionService;", "Lexpo/modules/kotlin/services/Service;", "<init>", "()V", "", "path", "Landroid/content/Context;", "context", "Ljava/util/EnumSet;", "Lexpo/modules/kotlin/services/FilePermissionService$a;", "b", "(Ljava/lang/String;Landroid/content/Context;)Ljava/util/EnumSet;", "", "c", "(Landroid/content/Context;)Ljava/util/List;", "d", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/EnumSet;", "a", "(Ljava/lang/String;)Ljava/util/EnumSet;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FilePermissionService implements Service {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46179a = new a("READ", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f46180b = new a("WRITE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f46181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f46182d;

        static {
            a[] aVarArrA = a();
            f46181c = aVarArrA;
            f46182d = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f46179a, f46180b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f46181c.clone();
        }
    }

    private final EnumSet b(String path, Context context) {
        Object next;
        try {
            String canonicalPath = new File(path).getCanonicalPath();
            Iterator it = c(context).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str = (String) next;
                AbstractC5504s.e(canonicalPath);
                if (r.Q(canonicalPath, str + "/", false, 2, null) || AbstractC5504s.c(str, canonicalPath)) {
                    break;
                }
            }
            if (((String) next) != null) {
                return EnumSet.of(a.f46179a, a.f46180b);
            }
            return null;
        } catch (IOException unused) {
            return EnumSet.noneOf(a.class);
        }
    }

    private final List c(Context context) {
        return AbstractC2279u.p(context.getFilesDir().getCanonicalPath(), context.getCacheDir().getCanonicalPath());
    }

    protected EnumSet a(String path) {
        AbstractC5504s.h(path, "path");
        File file = new File(path);
        EnumSet enumSetNoneOf = EnumSet.noneOf(a.class);
        if (file.canRead()) {
            enumSetNoneOf.add(a.f46179a);
        }
        if (file.canWrite()) {
            enumSetNoneOf.add(a.f46180b);
        }
        AbstractC5504s.g(enumSetNoneOf, "apply(...)");
        return enumSetNoneOf;
    }

    public EnumSet d(Context context, String path) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(path, "path");
        EnumSet enumSetB = b(path, context);
        return enumSetB == null ? a(path) : enumSetB;
    }
}
