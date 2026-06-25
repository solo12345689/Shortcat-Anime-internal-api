package Aa;

import be.AbstractC3048a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f342f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a.EnumC0007a f343g = a.EnumC0007a.f352b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a.EnumC0007a f344h = a.EnumC0007a.f353c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a.EnumC0007a f345i = a.EnumC0007a.f354d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a.EnumC0007a f346j = a.EnumC0007a.f355e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.EnumC0007a f347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f351e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: Aa.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class EnumC0007a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final EnumC0007a f352b = new EnumC0007a("Move", 0, "topKeyboardMove");

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final EnumC0007a f353c = new EnumC0007a("Start", 1, "topKeyboardMoveStart");

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final EnumC0007a f354d = new EnumC0007a("End", 2, "topKeyboardMoveEnd");

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final EnumC0007a f355e = new EnumC0007a("Interactive", 3, "topKeyboardMoveInteractive");

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ EnumC0007a[] f356f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f357g;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f358a;

            static {
                EnumC0007a[] enumC0007aArrA = a();
                f356f = enumC0007aArrA;
                f357g = AbstractC3048a.a(enumC0007aArrA);
            }

            private EnumC0007a(String str, int i10, String str2) {
                this.f358a = str2;
            }

            private static final /* synthetic */ EnumC0007a[] a() {
                return new EnumC0007a[]{f352b, f353c, f354d, f355e};
            }

            public static EnumC0007a valueOf(String str) {
                return (EnumC0007a) Enum.valueOf(EnumC0007a.class, str);
            }

            public static EnumC0007a[] values() {
                return (EnumC0007a[]) f356f.clone();
            }

            public final String b() {
                return this.f358a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0007a a() {
            return f.f345i;
        }

        public final EnumC0007a b() {
            return f.f346j;
        }

        public final EnumC0007a c() {
            return f.f343g;
        }

        public final EnumC0007a d() {
            return f.f344h;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, int i11, a.EnumC0007a event, double d10, double d11, int i12, int i13) {
        super(i10, i11);
        AbstractC5504s.h(event, "event");
        this.f347a = event;
        this.f348b = d10;
        this.f349c = d11;
        this.f350d = i12;
        this.f351e = i13;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f349c);
        writableMapCreateMap.putDouble("height", this.f348b);
        writableMapCreateMap.putInt("duration", this.f350d);
        writableMapCreateMap.putInt("target", this.f351e);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f347a.b();
    }
}
