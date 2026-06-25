package E3;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: E3.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C1427o implements InterfaceC1327b3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f5450g = Q6.f4870a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f5452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final NotificationManager f5455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5456f;

    /* JADX INFO: renamed from: E3.o$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f5457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f5458b = new c() { // from class: E3.p
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5459c = "default_channel_id";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5460d = C1427o.f5450g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f5461e;

        public b(Context context) {
            this.f5457a = context;
        }

        public C1427o e() {
            AbstractC6614a.g(!this.f5461e);
            C1427o c1427o = new C1427o(this);
            this.f5461e = true;
            return c1427o;
        }
    }

    /* JADX INFO: renamed from: E3.o$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
    }

    @Override // E3.InterfaceC1327b3
    public final boolean a(C1375h3 c1375h3, String str, Bundle bundle) {
        return false;
    }

    public C1427o(Context context, c cVar, String str, int i10) {
        this.f5451a = context;
        this.f5452b = cVar;
        this.f5453c = str;
        this.f5454d = i10;
        this.f5455e = (NotificationManager) AbstractC6614a.i((NotificationManager) context.getSystemService("notification"));
        this.f5456f = P6.f4858w0;
    }

    private C1427o(b bVar) {
        this(bVar.f5457a, bVar.f5458b, bVar.f5459c, bVar.f5460d);
    }
}
