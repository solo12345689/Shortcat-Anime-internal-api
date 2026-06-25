package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import i4.i;
import java.util.ArrayList;
import java.util.List;
import k4.InterfaceC5447c;
import n4.AbstractC5748x;
import n4.C5745u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f32796e = i.i("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f32799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k4.e f32800d;

    c(Context context, int i10, g gVar) {
        this.f32797a = context;
        this.f32798b = i10;
        this.f32799c = gVar;
        this.f32800d = new k4.e(gVar.g().u(), (InterfaceC5447c) null);
    }

    void a() {
        List<C5745u> listE = this.f32799c.g().v().J().e();
        ConstraintProxy.a(this.f32797a, listE);
        this.f32800d.a(listE);
        ArrayList<C5745u> arrayList = new ArrayList(listE.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C5745u c5745u : listE) {
            String str = c5745u.f53943a;
            if (jCurrentTimeMillis >= c5745u.c() && (!c5745u.h() || this.f32800d.d(str))) {
                arrayList.add(c5745u);
            }
        }
        for (C5745u c5745u2 : arrayList) {
            String str2 = c5745u2.f53943a;
            Intent intentB = b.b(this.f32797a, AbstractC5748x.a(c5745u2));
            i.e().a(f32796e, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f32799c.e().a().execute(new g.b(this.f32799c, intentB, this.f32798b));
        }
        this.f32800d.reset();
    }
}
