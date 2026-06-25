package td;

import be.AbstractC3048a;
import expo.modules.updates.d;
import kotlin.enums.EnumEntries;
import vd.InterfaceC6861b;

/* JADX INFO: renamed from: td.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC6665d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: td.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f60877a = new a("IDLE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f60878b = new a("NEW_UPDATE_LOADING", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f60879c = new a("NEW_UPDATE_LOADED", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f60880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f60881e;

        static {
            a[] aVarArrA = a();
            f60880d = aVarArrA;
            f60881e = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f60877a, f60878b, f60879c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f60880d.clone();
        }
    }

    void a();

    void b();

    void c(InterfaceC6861b.a aVar);

    void d(Exception exc);

    int e();

    void f();

    a g();

    d.a h();
}
