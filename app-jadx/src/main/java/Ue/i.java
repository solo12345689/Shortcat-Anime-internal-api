package Ue;

import Se.x;
import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19583b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f19584c = new i(AbstractC2279u.m());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19585a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(x table) {
            AbstractC5504s.h(table, "table");
            if (table.w() == 0) {
                return b();
            }
            List listX = table.x();
            AbstractC5504s.g(listX, "getRequirementList(...)");
            return new i(listX, null);
        }

        public final i b() {
            return i.f19584c;
        }

        private a() {
        }
    }

    public /* synthetic */ i(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private i(List list) {
        this.f19585a = list;
    }
}
