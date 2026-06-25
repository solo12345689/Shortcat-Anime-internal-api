package Mb;

import Ud.AbstractC2273n;
import be.AbstractC3048a;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0188a f12316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12317c = new a("NONE", 0, S4.a.LOCAL, S4.a.REMOTE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12318d = new a("DISK", 1, S4.a.DATA_DISK_CACHE, S4.a.RESOURCE_DISK_CACHE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12319e = new a("MEMORY", 2, S4.a.MEMORY_CACHE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f12320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12321g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S4.a[] f12322a;

    /* JADX INFO: renamed from: Mb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0188a {
        public /* synthetic */ C0188a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(S4.a value) {
            Object next;
            AbstractC5504s.h(value, "value");
            Iterator<E> it = a.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC2273n.R(((a) next).f12322a, value)) {
                    break;
                }
            }
            a aVar = (a) next;
            return aVar == null ? a.f12317c : aVar;
        }

        private C0188a() {
        }
    }

    static {
        a[] aVarArrA = a();
        f12320f = aVarArrA;
        f12321g = AbstractC3048a.a(aVarArrA);
        f12316b = new C0188a(null);
    }

    private a(String str, int i10, S4.a... aVarArr) {
        this.f12322a = aVarArr;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f12317c, f12318d, f12319e};
    }

    public static EnumEntries c() {
        return f12321g;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12320f.clone();
    }
}
