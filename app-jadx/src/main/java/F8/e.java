package F8;

import android.net.Uri;
import android.util.LogPrinter;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f6569b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LogPrinter f6570a = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f6569b = builder.build();
    }
}
