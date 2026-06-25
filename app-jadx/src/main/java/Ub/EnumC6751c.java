package ub;

import Td.r;
import app.notifee.core.event.LogEvent;
import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ub.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC6751c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f61467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC6751c f61468c = new EnumC6751c("Trace", 0, "trace");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC6751c f61469d = new EnumC6751c("Timer", 1, "timer");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC6751c f61470e = new EnumC6751c("Stacktrace", 2, "stacktrace");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC6751c f61471f = new EnumC6751c("Debug", 3, "debug");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC6751c f61472g = new EnumC6751c("Info", 4, LogEvent.LEVEL_INFO);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC6751c f61473h = new EnumC6751c("Warn", 5, LogEvent.LEVEL_WARN);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC6751c f61474i = new EnumC6751c("Error", 6, LogEvent.LEVEL_ERROR);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC6751c f61475j = new EnumC6751c("Fatal", 7, "fatal");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumC6751c[] f61476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f61477l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f61478a;

    /* JADX INFO: renamed from: ub.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: ub.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0920a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f61479a;

            static {
                int[] iArr = new int[EnumC6751c.values().length];
                try {
                    iArr[EnumC6751c.f61468c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6751c.f61469d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6751c.f61470e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC6751c.f61471f.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC6751c.f61472g.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC6751c.f61473h.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC6751c.f61474i.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC6751c.f61475j.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f61479a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(EnumC6751c type) {
            AbstractC5504s.h(type, "type");
            switch (C0920a.f61479a[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                case 8:
                    return 7;
                default:
                    throw new r();
            }
        }

        private a() {
        }
    }

    static {
        EnumC6751c[] enumC6751cArrA = a();
        f61476k = enumC6751cArrA;
        f61477l = AbstractC3048a.a(enumC6751cArrA);
        f61467b = new a(null);
    }

    private EnumC6751c(String str, int i10, String str2) {
        this.f61478a = str2;
    }

    private static final /* synthetic */ EnumC6751c[] a() {
        return new EnumC6751c[]{f61468c, f61469d, f61470e, f61471f, f61472g, f61473h, f61474i, f61475j};
    }

    public static EnumC6751c valueOf(String str) {
        return (EnumC6751c) Enum.valueOf(EnumC6751c.class, str);
    }

    public static EnumC6751c[] values() {
        return (EnumC6751c[]) f61476k.clone();
    }

    public final String b() {
        return this.f61478a;
    }
}
