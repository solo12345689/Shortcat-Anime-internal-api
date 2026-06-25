package Wc;

import android.content.Context;
import fe.k;
import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20846b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20847a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Context context) {
        AbstractC5504s.h(context, "context");
        this.f20847a = context;
    }

    public final String a() {
        if (b().exists()) {
            return k.m(b(), null, 1, null);
        }
        return null;
    }

    protected final File b() {
        return new File(this.f20847a.getNoBackupFilesDir(), "expo_notifications_registration_info.txt");
    }

    public final void c(String str) {
        b().delete();
        if (str != null) {
            k.o(b(), str, null, 2, null);
        }
    }
}
