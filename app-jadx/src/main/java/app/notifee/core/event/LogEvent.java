package app.notifee.core.event;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class LogEvent {
    public static final String LEVEL_DEBUG = "debug";
    public static final String LEVEL_ERROR = "error";
    public static final String LEVEL_INFO = "info";
    public static final String LEVEL_VERBOSE = "verbose";
    public static final String LEVEL_WARN = "warn";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f33007d;

    public LogEvent(String str, String str2, String str3) {
        this.f33004a = str2;
        this.f33005b = str;
        this.f33006c = str3;
        this.f33007d = null;
    }

    public String getLevel() {
        return this.f33005b;
    }

    public String getMessage() {
        return this.f33006c;
    }

    public String getTag() {
        return this.f33004a;
    }

    public Throwable getThrowable() {
        return this.f33007d;
    }

    public LogEvent(String str, String str2, String str3, Throwable th2) {
        this.f33004a = str2;
        this.f33005b = str;
        this.f33006c = str3;
        this.f33007d = th2;
    }
}
