package tg;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tg.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6689n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f61059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f61060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P f61061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f61062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f61063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f61064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Long f61065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f61066h;

    public C6689n(boolean z10, boolean z11, P p10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        AbstractC5504s.h(extras, "extras");
        this.f61059a = z10;
        this.f61060b = z11;
        this.f61061c = p10;
        this.f61062d = l10;
        this.f61063e = l11;
        this.f61064f = l12;
        this.f61065g = l13;
        this.f61066h = Ud.S.y(extras);
    }

    public static /* synthetic */ C6689n b(C6689n c6689n, boolean z10, boolean z11, P p10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c6689n.f61059a;
        }
        if ((i10 & 2) != 0) {
            z11 = c6689n.f61060b;
        }
        if ((i10 & 4) != 0) {
            p10 = c6689n.f61061c;
        }
        if ((i10 & 8) != 0) {
            l10 = c6689n.f61062d;
        }
        if ((i10 & 16) != 0) {
            l11 = c6689n.f61063e;
        }
        if ((i10 & 32) != 0) {
            l12 = c6689n.f61064f;
        }
        if ((i10 & 64) != 0) {
            l13 = c6689n.f61065g;
        }
        if ((i10 & 128) != 0) {
            map = c6689n.f61066h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return c6689n.a(z10, z11, p10, l10, l15, l16, l14, map2);
    }

    public final C6689n a(boolean z10, boolean z11, P p10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        AbstractC5504s.h(extras, "extras");
        return new C6689n(z10, z11, p10, l10, l11, l12, l13, extras);
    }

    public final Long c() {
        return this.f61064f;
    }

    public final Long d() {
        return this.f61062d;
    }

    public final P e() {
        return this.f61061c;
    }

    public final boolean f() {
        return this.f61060b;
    }

    public final boolean g() {
        return this.f61059a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f61059a) {
            arrayList.add("isRegularFile");
        }
        if (this.f61060b) {
            arrayList.add("isDirectory");
        }
        if (this.f61062d != null) {
            arrayList.add("byteCount=" + this.f61062d);
        }
        if (this.f61063e != null) {
            arrayList.add("createdAt=" + this.f61063e);
        }
        if (this.f61064f != null) {
            arrayList.add("lastModifiedAt=" + this.f61064f);
        }
        if (this.f61065g != null) {
            arrayList.add("lastAccessedAt=" + this.f61065g);
        }
        if (!this.f61066h.isEmpty()) {
            arrayList.add("extras=" + this.f61066h);
        }
        return AbstractC2279u.w0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C6689n(boolean z10, boolean z11, P p10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : p10, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? Ud.S.i() : map);
    }
}
