package aa;

import ja.C5356a;
import ja.InterfaceC5358c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ma.InterfaceC5655b;

/* JADX INFO: renamed from: aa.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C2592E implements InterfaceC2596d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f23839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f23840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f23841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f23842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f23843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f23844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2596d f23845g;

    /* JADX INFO: renamed from: aa.E$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements InterfaceC5358c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f23846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC5358c f23847b;

        public a(Set set, InterfaceC5358c interfaceC5358c) {
            this.f23846a = set;
            this.f23847b = interfaceC5358c;
        }

        @Override // ja.InterfaceC5358c
        public void b(C5356a c5356a) {
            if (!this.f23846a.contains(c5356a.b())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", c5356a));
            }
            this.f23847b.b(c5356a);
        }
    }

    C2592E(C2595c c2595c, InterfaceC2596d interfaceC2596d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c2595c.g()) {
            if (qVar.d()) {
                if (qVar.f()) {
                    hashSet4.add(qVar.b());
                } else {
                    hashSet.add(qVar.b());
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else if (qVar.f()) {
                hashSet5.add(qVar.b());
            } else {
                hashSet2.add(qVar.b());
            }
        }
        if (!c2595c.k().isEmpty()) {
            hashSet.add(C2591D.b(InterfaceC5358c.class));
        }
        this.f23839a = Collections.unmodifiableSet(hashSet);
        this.f23840b = Collections.unmodifiableSet(hashSet2);
        this.f23841c = Collections.unmodifiableSet(hashSet3);
        this.f23842d = Collections.unmodifiableSet(hashSet4);
        this.f23843e = Collections.unmodifiableSet(hashSet5);
        this.f23844f = c2595c.k();
        this.f23845g = interfaceC2596d;
    }

    @Override // aa.InterfaceC2596d
    public Object a(Class cls) {
        if (!this.f23839a.contains(C2591D.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f23845g.a(cls);
        return !cls.equals(InterfaceC5358c.class) ? objA : new a(this.f23844f, (InterfaceC5358c) objA);
    }

    @Override // aa.InterfaceC2596d
    public InterfaceC5655b b(C2591D c2591d) {
        if (this.f23840b.contains(c2591d)) {
            return this.f23845g.b(c2591d);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", c2591d));
    }

    @Override // aa.InterfaceC2596d
    public InterfaceC5655b d(C2591D c2591d) {
        if (this.f23843e.contains(c2591d)) {
            return this.f23845g.d(c2591d);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c2591d));
    }

    @Override // aa.InterfaceC2596d
    public InterfaceC5655b e(Class cls) {
        return b(C2591D.b(cls));
    }

    @Override // aa.InterfaceC2596d
    public Object f(C2591D c2591d) {
        if (this.f23839a.contains(c2591d)) {
            return this.f23845g.f(c2591d);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", c2591d));
    }

    @Override // aa.InterfaceC2596d
    public Set g(C2591D c2591d) {
        if (this.f23842d.contains(c2591d)) {
            return this.f23845g.g(c2591d);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", c2591d));
    }
}
