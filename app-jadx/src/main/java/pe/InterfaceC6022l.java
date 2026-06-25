package pe;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: pe.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC6022l extends InterfaceC6012b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: pe.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f56008a = new a("INSTANCE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f56009b = new a("EXTENSION_RECEIVER", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f56010c = new a("VALUE", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f56011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f56012e;

        static {
            a[] aVarArrA = a();
            f56011d = aVarArrA;
            f56012e = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f56008a, f56009b, f56010c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f56011d.clone();
        }
    }

    boolean a();

    int getIndex();

    String getName();

    InterfaceC6027q getType();

    a h();

    boolean p();
}
