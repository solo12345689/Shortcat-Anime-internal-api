package f6;

import Td.L;
import Ud.AbstractC2279u;
import Ud.O;
import Ud.S;
import Ud.a0;
import a6.InterfaceC2583d;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import e6.C4654b;
import e6.C4655c;
import f6.j;
import f6.l;
import ie.InterfaceC5082a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f46920n = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w6.d f46921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b6.c f46922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4655c f46923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2583d f46924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f46925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f46926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap f46927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f46928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f46929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f46930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f46931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f46932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set f46933m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5.a f46934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f46935b;

        public a(C5.a bitmapRef) {
            AbstractC5504s.h(bitmapRef, "bitmapRef");
            this.f46934a = bitmapRef;
        }

        public final C5.a a() {
            return this.f46934a;
        }

        public final boolean b() {
            return !this.f46935b && this.f46934a.E();
        }

        public final void c() {
            C5.a.m(this.f46934a);
        }

        public final void d(boolean z10) {
            this.f46935b = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public g(w6.d platformBitmapFactory, b6.c bitmapFrameRenderer, C4655c fpsCompressor, InterfaceC2583d animationInformation, int i10) {
        AbstractC5504s.h(platformBitmapFactory, "platformBitmapFactory");
        AbstractC5504s.h(bitmapFrameRenderer, "bitmapFrameRenderer");
        AbstractC5504s.h(fpsCompressor, "fpsCompressor");
        AbstractC5504s.h(animationInformation, "animationInformation");
        this.f46921a = platformBitmapFactory;
        this.f46922b = bitmapFrameRenderer;
        this.f46923c = fpsCompressor;
        this.f46924d = animationInformation;
        this.f46925e = i10;
        int iE = AbstractC5874j.e((k(l()) * i10) / 1000, 1);
        this.f46926f = iE;
        this.f46927g = new ConcurrentHashMap();
        this.f46930j = new h(l().a());
        this.f46931k = -1;
        this.f46932l = S.i();
        this.f46933m = a0.d();
        d(k(l()));
        this.f46928h = (int) (iE * 0.5f);
    }

    private final void f(C5.a aVar) {
        if (aVar.E()) {
            new Canvas((Bitmap) aVar.C()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    private final boolean g(int i10, int i11, int i12, int i13) throws IOException {
        int iIntValue;
        C5.a aVarA;
        List listD = this.f46930j.d(i10, this.f46926f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (this.f46933m.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Set setF1 = AbstractC2279u.f1(arrayList);
        Set setKeySet = this.f46927g.keySet();
        AbstractC5504s.g(setKeySet, "<get-keys>(...)");
        ArrayDeque arrayDeque = new ArrayDeque(a0.j(setKeySet, setF1));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (this.f46927g.get(Integer.valueOf(iIntValue2)) == null) {
                int i14 = this.f46931k;
                if (i14 != -1 && !setF1.contains(Integer.valueOf(i14))) {
                    return false;
                }
                Integer num = (Integer) arrayDeque.pollFirst();
                int iIntValue3 = num != null ? num.intValue() : -1;
                a aVar = (a) this.f46927g.get(Integer.valueOf(iIntValue3));
                C5.a aVarH = (aVar == null || (aVarA = aVar.a()) == null) ? null : aVarA.h();
                if (aVarH == null) {
                    C5.a aVarA2 = this.f46921a.a(i11, i12);
                    AbstractC5504s.g(aVarA2, "createBitmap(...)");
                    aVar = new a(aVarA2);
                    aVarH = aVar.a().clone();
                }
                aVar.d(true);
                try {
                    o(aVarH, iIntValue2, i11, i12);
                    L l10 = L.f17438a;
                    fe.c.a(aVarH, null);
                    this.f46927g.remove(Integer.valueOf(iIntValue3));
                    aVar.d(false);
                    this.f46927g.put(Integer.valueOf(iIntValue2), aVar);
                } finally {
                }
            }
        }
        if (arrayList.isEmpty()) {
            iIntValue = (int) (this.f46926f * 0.5f);
        } else {
            int size = arrayList.size();
            iIntValue = ((Number) arrayList.get(AbstractC5874j.m((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.f46928h = iIntValue;
        return true;
    }

    static /* synthetic */ boolean h(g gVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return gVar.g(i10, i11, i12, i13);
    }

    private final C4778a i(int i10) {
        C4778a c4778a;
        Iterator it = new C5870f(0, this.f46930j.b()).iterator();
        do {
            c4778a = null;
            if (!it.hasNext()) {
                break;
            }
            int iA = this.f46930j.a(i10 - ((O) it).nextInt());
            a aVar = (a) this.f46927g.get(Integer.valueOf(iA));
            if (aVar != null) {
                if (!aVar.b()) {
                    aVar = null;
                }
                if (aVar != null) {
                    c4778a = new C4778a(iA, aVar.a());
                }
            }
        } while (c4778a == null);
        return c4778a;
    }

    private final l j(int i10) {
        C4778a c4778aI = i(i10);
        if (c4778aI == null) {
            return new l(null, l.a.f46946c);
        }
        C5.a aVarClone = c4778aI.a().clone();
        AbstractC5504s.g(aVarClone, "clone(...)");
        this.f46931k = c4778aI.b();
        return new l(aVarClone, l.a.f46945b);
    }

    private final int k(InterfaceC2583d interfaceC2583d) {
        return (int) AbstractC5874j.f(TimeUnit.SECONDS.toMillis(1L) / ((long) (interfaceC2583d.j() / interfaceC2583d.a())), 1L);
    }

    private final void m(final int i10, final int i11) {
        if (this.f46929i) {
            return;
        }
        this.f46929i = true;
        C4654b.f45810a.b(new Runnable() { // from class: f6.f
            @Override // java.lang.Runnable
            public final void run() {
                g.n(this.f46917a, i10, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(g this$0, int i10, int i11) {
        AbstractC5504s.h(this$0, "this$0");
        while (true) {
            g gVar = this$0;
            int i12 = i10;
            int i13 = i11;
            if (h(gVar, AbstractC5874j.e(this$0.f46931k, 0), i12, i13, 0, 8, null)) {
                gVar.f46929i = false;
                return;
            } else {
                this$0 = gVar;
                i10 = i12;
                i11 = i13;
            }
        }
    }

    private final void o(C5.a aVar, int i10, int i11, int i12) throws IOException {
        C5.a aVarA;
        C5.a aVarH;
        C4778a c4778aI = i(i10);
        if (c4778aI != null && (aVarA = c4778aI.a()) != null && (aVarH = aVarA.h()) != null) {
            try {
                int iB = c4778aI.b();
                if (iB < i10) {
                    Object objC = aVarH.C();
                    AbstractC5504s.g(objC, "get(...)");
                    p(aVar, (Bitmap) objC);
                    Iterator it = new C5870f(iB + 1, i10).iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((O) it).nextInt();
                        b6.c cVar = this.f46922b;
                        Object objC2 = aVar.C();
                        AbstractC5504s.g(objC2, "get(...)");
                        cVar.a(iNextInt, (Bitmap) objC2);
                    }
                    fe.c.a(aVarH, null);
                    return;
                }
                L l10 = L.f17438a;
                fe.c.a(aVarH, null);
            } finally {
            }
        }
        f(aVar);
        Iterator it2 = new C5870f(0, i10).iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((O) it2).nextInt();
            b6.c cVar2 = this.f46922b;
            Object objC3 = aVar.C();
            AbstractC5504s.g(objC3, "get(...)");
            cVar2.a(iNextInt2, (Bitmap) objC3);
        }
    }

    private final C5.a p(C5.a aVar, Bitmap bitmap) {
        if (aVar.E() && !AbstractC5504s.c(aVar.C(), bitmap)) {
            Canvas canvas = new Canvas((Bitmap) aVar.C());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return aVar;
    }

    @Override // f6.j
    public void a() {
        j.a.a(this);
    }

    @Override // f6.j
    public void b(int i10, int i11, InterfaceC5082a onAnimationLoaded) {
        AbstractC5504s.h(onAnimationLoaded, "onAnimationLoaded");
        m(i10, i11);
        onAnimationLoaded.invoke();
    }

    @Override // f6.j
    public l c(int i10, int i11, int i12) {
        Integer num = (Integer) this.f46932l.get(Integer.valueOf(i10));
        if (num == null) {
            return j(i10);
        }
        int iIntValue = num.intValue();
        this.f46931k = iIntValue;
        a aVar = (a) this.f46927g.get(num);
        if (aVar == null || !aVar.b()) {
            aVar = null;
        }
        if (aVar == null) {
            m(i11, i12);
            return j(iIntValue);
        }
        if (this.f46930j.c(this.f46928h, iIntValue, this.f46926f)) {
            m(i11, i12);
        }
        return new l(aVar.a().clone(), l.a.f46944a);
    }

    @Override // f6.j
    public void clear() {
        Collection collectionValues = this.f46927g.values();
        AbstractC5504s.g(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        this.f46927g.clear();
        this.f46931k = -1;
    }

    @Override // f6.j
    public void d(int i10) {
        Map mapA = this.f46923c.a(l().j() * AbstractC5874j.e(l().b(), 1), l().a(), AbstractC5874j.i(i10, k(l())));
        this.f46932l = mapA;
        this.f46933m = AbstractC2279u.f1(mapA.values());
    }

    public InterfaceC2583d l() {
        return this.f46924d;
    }
}
