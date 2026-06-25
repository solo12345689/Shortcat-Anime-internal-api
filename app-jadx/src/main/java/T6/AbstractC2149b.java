package T6;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: T6.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2149b {

    /* JADX INFO: renamed from: e */
    public static final a f17199e = new a(null);

    /* JADX INFO: renamed from: a */
    public List f17200a;

    /* JADX INFO: renamed from: b */
    public int f17201b;

    /* JADX INFO: renamed from: c */
    public int f17202c;

    /* JADX INFO: renamed from: d */
    public int f17203d = -1;

    /* JADX INFO: renamed from: T6.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void b(AbstractC2149b child) {
        AbstractC5504s.h(child, "child");
        List arrayList = this.f17200a;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.f17200a = arrayList;
        }
        arrayList.add(child);
        child.c(this);
    }

    public void c(AbstractC2149b parent) {
        AbstractC5504s.h(parent, "parent");
    }

    public void d(AbstractC2149b parent) {
        AbstractC5504s.h(parent, "parent");
    }

    public abstract String e();

    public final String f() {
        String str;
        List list = this.f17200a;
        String strW0 = list != null ? AbstractC2279u.w0(list, " ", null, null, 0, null, null, 62, null) : null;
        String strE = e();
        if (strW0 == null || Df.r.l0(strW0)) {
            str = "";
        } else {
            str = " children: " + strW0;
        }
        return strE + str;
    }

    public final void g(AbstractC2149b child) {
        AbstractC5504s.h(child, "child");
        List list = this.f17200a;
        if (list == null) {
            return;
        }
        child.d(this);
        list.remove(child);
    }

    public void h() {
    }
}
