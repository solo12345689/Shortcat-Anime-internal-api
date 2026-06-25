package hc;

import Td.r;
import be.AbstractC3048a;
import ie.InterfaceC5082a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4932d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f47802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f47803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5082a f47804c;

    /* JADX INFO: renamed from: hc.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: hc.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f47805a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String event) {
            super(null);
            AbstractC5504s.h(event, "event");
            this.f47805a = event;
        }

        public final String a() {
            return this.f47805a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: hc.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f47806b = new c("StartObserving", 0, "startObserving");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f47807c = new c("StopObserving", 1, "stopObserving");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f47808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f47809e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f47810a;

        static {
            c[] cVarArrA = a();
            f47808d = cVarArrA;
            f47809e = AbstractC3048a.a(cVarArrA);
        }

        private c(String str, int i10, String str2) {
            this.f47810a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f47806b, f47807c};
        }

        public static EnumEntries b() {
            return f47809e;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f47808d.clone();
        }

        public final String c() {
            return this.f47810a;
        }
    }

    public C4932d(c type, a filer, InterfaceC5082a body) {
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(filer, "filer");
        AbstractC5504s.h(body, "body");
        this.f47802a = type;
        this.f47803b = filer;
        this.f47804c = body;
    }

    public final void a(c eventType, String eventName) {
        AbstractC5504s.h(eventType, "eventType");
        AbstractC5504s.h(eventName, "eventName");
        if (eventType == this.f47802a && b(eventName)) {
            this.f47804c.invoke();
        }
    }

    public final boolean b(String eventName) {
        AbstractC5504s.h(eventName, "eventName");
        a aVar = this.f47803b;
        if (aVar instanceof b) {
            return AbstractC5504s.c(((b) aVar).a(), eventName);
        }
        throw new r();
    }
}
