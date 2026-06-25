package xd;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.C6760l;

/* JADX INFO: renamed from: xd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7134e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f64365b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6760l f64366a;

    /* JADX INFO: renamed from: xd.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7134e(File filesDirectory) {
        AbstractC5504s.h(filesDirectory, "filesDirectory");
        this.f64366a = new C6760l("dev.expo.updates", filesDirectory);
    }

    private final long b(Date date) {
        return Long.max(date.getTime(), new Date().getTime() - ((long) 86400));
    }

    private final boolean d(String str, long j10) {
        C7132c c7132cA = C7132c.f64354i.a(str);
        return c7132cA != null && c7132cA.g() >= j10;
    }

    public static /* synthetic */ void f(C7134e c7134e, Date date, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            date = new Date(new Date().getTime() - ((long) 86400));
        }
        c7134e.e(date, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(C7134e c7134e, long j10, String entryString) {
        AbstractC5504s.h(entryString, "entryString");
        return c7134e.d(entryString, j10);
    }

    public final List c(Date newerThan) {
        AbstractC5504s.h(newerThan, "newerThan");
        long jB = b(newerThan);
        List listM = this.f64366a.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (d((String) obj, jB)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void e(Date olderThan, Function1 completionHandler) {
        AbstractC5504s.h(olderThan, "olderThan");
        AbstractC5504s.h(completionHandler, "completionHandler");
        final long jB = b(olderThan);
        this.f64366a.k(new Function1() { // from class: xd.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C7134e.g(this.f64363a, jB, (String) obj));
            }
        }, completionHandler);
    }
}
