package l4;

import i4.i;
import i4.j;
import k4.C5446b;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n4.C5745u;

/* JADX INFO: renamed from: l4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5552f extends AbstractC5549c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f52542f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52543g;

    /* JADX INFO: renamed from: l4.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String strI = i.i("NetworkNotRoamingCtrlr");
        AbstractC5504s.g(strI, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f52543g = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5552f(m4.h tracker) {
        super(tracker);
        AbstractC5504s.h(tracker, "tracker");
    }

    @Override // l4.AbstractC5549c
    public boolean b(C5745u workSpec) {
        AbstractC5504s.h(workSpec, "workSpec");
        return workSpec.f53952j.d() == j.NOT_ROAMING;
    }

    @Override // l4.AbstractC5549c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C5446b value) {
        AbstractC5504s.h(value, "value");
        return (value.a() && value.c()) ? false : true;
    }
}
