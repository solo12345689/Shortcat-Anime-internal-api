package H1;

import A1.s;
import H1.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import t.C6575z;
import t.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C6575z f7654a = new C6575z(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f7655b = k.a("fonts-androidx", 10, ColorExtractionConstants.MAX_PIXEL_SAMPLES);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f7656c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final i0 f7657d = new i0();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f7659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f7660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7661d;

        a(String str, Context context, f fVar, int i10) {
            this.f7658a = str;
            this.f7659b = context;
            this.f7660c = fVar;
            this.f7661d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return i.c(this.f7658a, this.f7659b, h.a(new Object[]{this.f7660c}), this.f7661d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements K1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ H1.a f7662a;

        b(H1.a aVar) {
            this.f7662a = aVar;
        }

        @Override // K1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f7662a.b(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f7664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f7665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7666d;

        c(String str, Context context, List list, int i10) {
            this.f7663a = str;
            this.f7664b = context;
            this.f7665c = list;
            this.f7666d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return i.c(this.f7663a, this.f7664b, this.f7665c, this.f7666d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements K1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7667a;

        d(String str) {
            this.f7667a = str;
        }

        @Override // K1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (i.f7656c) {
                try {
                    i0 i0Var = i.f7657d;
                    ArrayList arrayList = (ArrayList) i0Var.get(this.f7667a);
                    if (arrayList == null) {
                        return;
                    }
                    i0Var.remove(this.f7667a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((K1.a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static String a(List list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((f) list.get(i11)).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    private static int b(j.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        j.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (j.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, List list, int i10) {
        X3.a.c("getFontSync");
        try {
            C6575z c6575z = f7654a;
            Typeface typeface = (Typeface) c6575z.d(str);
            if (typeface != null) {
                return new e(typeface);
            }
            j.a aVarE = H1.e.e(context, list, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? s.b(context, null, aVarE.c(), i10) : s.c(context, null, aVarE.d(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            c6575z.f(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            X3.a.f();
        }
    }

    static Typeface d(Context context, List list, int i10, Executor executor, H1.a aVar) {
        String strA = a(list, i10);
        Typeface typeface = (Typeface) f7654a.d(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f7656c) {
            try {
                i0 i0Var = f7657d;
                ArrayList arrayList = (ArrayList) i0Var.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                i0Var.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f7655b;
                }
                k.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Typeface e(Context context, f fVar, H1.a aVar, int i10, int i11) {
        String strA = a(h.a(new Object[]{fVar}), i10);
        Typeface typeface = (Typeface) f7654a.d(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, h.a(new Object[]{fVar}), i10);
            aVar.b(eVarC);
            return eVarC.f7668a;
        }
        try {
            e eVar = (e) k.d(f7655b, new a(strA, context, fVar, i10), i11);
            aVar.b(eVar);
            return eVar.f7668a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f7668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f7669b;

        e(int i10) {
            this.f7668a = null;
            this.f7669b = i10;
        }

        boolean a() {
            return this.f7669b == 0;
        }

        e(Typeface typeface) {
            this.f7668a = typeface;
            this.f7669b = 0;
        }
    }
}
