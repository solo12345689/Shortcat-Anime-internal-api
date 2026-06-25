package Ef;

import be.AbstractC3048a;
import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f5968b = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f5969c = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f5970d = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f5971e = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f5972f = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f5973g = new d("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f5974h = new d("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ d[] f5975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5976j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeUnit f5977a;

    static {
        d[] dVarArrA = a();
        f5975i = dVarArrA;
        f5976j = AbstractC3048a.a(dVarArrA);
    }

    private d(String str, int i10, TimeUnit timeUnit) {
        this.f5977a = timeUnit;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f5968b, f5969c, f5970d, f5971e, f5972f, f5973g, f5974h};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5975i.clone();
    }

    public final TimeUnit b() {
        return this.f5977a;
    }
}
