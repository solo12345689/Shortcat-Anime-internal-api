package androidx.lifecycle;

import Jf.AbstractC1744g;
import androidx.lifecycle.AbstractC2857k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.C5904a;
import p.C5905b;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2865t extends AbstractC2857k {

    /* JADX INFO: renamed from: j */
    public static final a f30249j = new a(null);

    /* JADX INFO: renamed from: a */
    private final boolean f30250a;

    /* JADX INFO: renamed from: b */
    private C5904a f30251b;

    /* JADX INFO: renamed from: c */
    private AbstractC2857k.b f30252c;

    /* JADX INFO: renamed from: d */
    private final WeakReference f30253d;

    /* JADX INFO: renamed from: e */
    private int f30254e;

    /* JADX INFO: renamed from: f */
    private boolean f30255f;

    /* JADX INFO: renamed from: g */
    private boolean f30256g;

    /* JADX INFO: renamed from: h */
    private ArrayList f30257h;

    /* JADX INFO: renamed from: i */
    private final Jf.u f30258i;

    /* JADX INFO: renamed from: androidx.lifecycle.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2865t a(r owner) {
            AbstractC5504s.h(owner, "owner");
            return new C2865t(owner, false, null);
        }

        public final AbstractC2857k.b b(AbstractC2857k.b state1, AbstractC2857k.b bVar) {
            AbstractC5504s.h(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private AbstractC2857k.b f30259a;

        /* JADX INFO: renamed from: b */
        private InterfaceC2861o f30260b;

        public b(InterfaceC2863q interfaceC2863q, AbstractC2857k.b initialState) {
            AbstractC5504s.h(initialState, "initialState");
            AbstractC5504s.e(interfaceC2863q);
            this.f30260b = C2869x.f(interfaceC2863q);
            this.f30259a = initialState;
        }

        public final void a(r rVar, AbstractC2857k.a event) {
            AbstractC5504s.h(event, "event");
            AbstractC2857k.b bVarC = event.c();
            this.f30259a = C2865t.f30249j.b(this.f30259a, bVarC);
            InterfaceC2861o interfaceC2861o = this.f30260b;
            AbstractC5504s.e(rVar);
            interfaceC2861o.g(rVar, event);
            this.f30259a = bVarC;
        }

        public final AbstractC2857k.b b() {
            return this.f30259a;
        }
    }

    public /* synthetic */ C2865t(r rVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, z10);
    }

    private final void c(r rVar) {
        Iterator itDescendingIterator = this.f30251b.descendingIterator();
        AbstractC5504s.g(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.f30256g) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            AbstractC5504s.e(entry);
            InterfaceC2863q interfaceC2863q = (InterfaceC2863q) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f30252c) > 0 && !this.f30256g && this.f30251b.contains(interfaceC2863q)) {
                AbstractC2857k.a aVarA = AbstractC2857k.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                k(aVarA.c());
                bVar.a(rVar, aVarA);
                j();
            }
        }
    }

    private final AbstractC2857k.b d(InterfaceC2863q interfaceC2863q) {
        b bVar;
        Map.Entry entryN = this.f30251b.n(interfaceC2863q);
        AbstractC2857k.b bVar2 = null;
        AbstractC2857k.b bVarB = (entryN == null || (bVar = (b) entryN.getValue()) == null) ? null : bVar.b();
        if (!this.f30257h.isEmpty()) {
            bVar2 = (AbstractC2857k.b) this.f30257h.get(r0.size() - 1);
        }
        a aVar = f30249j;
        return aVar.b(aVar.b(this.f30252c, bVarB), bVar2);
    }

    private final void e(String str) {
        if (!this.f30250a || AbstractC2867v.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void f(r rVar) {
        C5905b.d dVarD = this.f30251b.d();
        AbstractC5504s.g(dVarD, "iteratorWithAdditions(...)");
        while (dVarD.hasNext() && !this.f30256g) {
            Map.Entry entry = (Map.Entry) dVarD.next();
            InterfaceC2863q interfaceC2863q = (InterfaceC2863q) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f30252c) < 0 && !this.f30256g && this.f30251b.contains(interfaceC2863q)) {
                k(bVar.b());
                AbstractC2857k.a aVarB = AbstractC2857k.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(rVar, aVarB);
                j();
            }
        }
    }

    private final boolean h() {
        if (this.f30251b.size() == 0) {
            return true;
        }
        Map.Entry entryB = this.f30251b.b();
        AbstractC5504s.e(entryB);
        AbstractC2857k.b bVarB = ((b) entryB.getValue()).b();
        Map.Entry entryE = this.f30251b.e();
        AbstractC5504s.e(entryE);
        AbstractC2857k.b bVarB2 = ((b) entryE.getValue()).b();
        return bVarB == bVarB2 && this.f30252c == bVarB2;
    }

    private final void i(AbstractC2857k.b bVar) {
        if (this.f30252c == bVar) {
            return;
        }
        AbstractC2866u.a((r) this.f30253d.get(), this.f30252c, bVar);
        this.f30252c = bVar;
        if (this.f30255f || this.f30254e != 0) {
            this.f30256g = true;
            return;
        }
        this.f30255f = true;
        m();
        this.f30255f = false;
        if (this.f30252c == AbstractC2857k.b.f30235a) {
            this.f30251b = new C5904a();
        }
    }

    private final void j() {
        this.f30257h.remove(r0.size() - 1);
    }

    private final void k(AbstractC2857k.b bVar) {
        this.f30257h.add(bVar);
    }

    private final void m() {
        r rVar = (r) this.f30253d.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!h()) {
            this.f30256g = false;
            AbstractC2857k.b bVar = this.f30252c;
            Map.Entry entryB = this.f30251b.b();
            AbstractC5504s.e(entryB);
            if (bVar.compareTo(((b) entryB.getValue()).b()) < 0) {
                c(rVar);
            }
            Map.Entry entryE = this.f30251b.e();
            if (!this.f30256g && entryE != null && this.f30252c.compareTo(((b) entryE.getValue()).b()) > 0) {
                f(rVar);
            }
        }
        this.f30256g = false;
        this.f30258i.setValue(getCurrentState());
    }

    @Override // androidx.lifecycle.AbstractC2857k
    public void addObserver(InterfaceC2863q observer) {
        r rVar;
        AbstractC5504s.h(observer, "observer");
        e("addObserver");
        AbstractC2857k.b bVar = this.f30252c;
        AbstractC2857k.b bVar2 = AbstractC2857k.b.f30235a;
        if (bVar != bVar2) {
            bVar2 = AbstractC2857k.b.f30236b;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f30251b.i(observer, bVar3)) == null && (rVar = (r) this.f30253d.get()) != null) {
            boolean z10 = this.f30254e != 0 || this.f30255f;
            AbstractC2857k.b bVarD = d(observer);
            this.f30254e++;
            while (bVar3.b().compareTo(bVarD) < 0 && this.f30251b.contains(observer)) {
                k(bVar3.b());
                AbstractC2857k.a aVarB = AbstractC2857k.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(rVar, aVarB);
                j();
                bVarD = d(observer);
            }
            if (!z10) {
                m();
            }
            this.f30254e--;
        }
    }

    public void g(AbstractC2857k.a event) {
        AbstractC5504s.h(event, "event");
        e("handleLifecycleEvent");
        i(event.c());
    }

    @Override // androidx.lifecycle.AbstractC2857k
    public AbstractC2857k.b getCurrentState() {
        return this.f30252c;
    }

    @Override // androidx.lifecycle.AbstractC2857k
    public Jf.I getCurrentStateFlow() {
        return AbstractC1744g.b(this.f30258i);
    }

    public void l(AbstractC2857k.b state) {
        AbstractC5504s.h(state, "state");
        e("setCurrentState");
        i(state);
    }

    @Override // androidx.lifecycle.AbstractC2857k
    public void removeObserver(InterfaceC2863q observer) {
        AbstractC5504s.h(observer, "observer");
        e("removeObserver");
        this.f30251b.l(observer);
    }

    private C2865t(r rVar, boolean z10) {
        this.f30250a = z10;
        this.f30251b = new C5904a();
        AbstractC2857k.b bVar = AbstractC2857k.b.f30236b;
        this.f30252c = bVar;
        this.f30257h = new ArrayList();
        this.f30253d = new WeakReference(rVar);
        this.f30258i = Jf.K.a(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2865t(r provider) {
        this(provider, true);
        AbstractC5504s.h(provider, "provider");
    }
}
