package sh;

import java.io.Serializable;
import java.util.Stack;
import sh.g;
import sh.i;
import sh.j;

/* JADX INFO: loaded from: classes5.dex */
class c implements Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f59834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f59836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f59837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59838e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f59839f = false;

    c(int i10) {
        this.f59835b = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c(this.f59835b);
        cVar.f59834a = this.f59834a;
        cVar.f59836c = this.f59836c;
        cVar.f59837d = this.f59837d;
        cVar.f59838e = this.f59838e;
        cVar.f59839f = this.f59839f;
        return cVar;
    }

    int c() {
        if (!this.f59838e || this.f59839f) {
            return Integer.MAX_VALUE;
        }
        return this.f59836c;
    }

    int d() {
        return this.f59837d;
    }

    public u e() {
        return this.f59834a;
    }

    void f(int i10) {
        this.f59834a = null;
        this.f59836c = this.f59835b;
        this.f59837d = i10;
        this.f59838e = true;
        this.f59839f = false;
    }

    boolean g() {
        return this.f59839f;
    }

    boolean h() {
        return this.f59838e;
    }

    void i(u uVar) {
        this.f59834a = uVar;
        int iA = uVar.a();
        this.f59836c = iA;
        if (iA == this.f59835b) {
            this.f59839f = true;
        }
    }

    void j(Stack stack, k kVar, byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f59839f || !this.f59838e) {
            throw new IllegalStateException("finished or not initialized");
        }
        j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f59837d).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
        i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar2.b())).h(jVar2.c())).n(this.f59837d).l();
        g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar2.b())).h(jVar2.c())).n(this.f59837d).k();
        kVar.h(kVar.g(bArr2, jVar2), bArr);
        u uVarA = v.a(kVar, kVar.e(jVar2), iVar);
        while (!stack.isEmpty() && ((u) stack.peek()).a() == uVarA.a() && ((u) stack.peek()).a() != this.f59835b) {
            g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
            u uVarB = v.b(kVar, (u) stack.pop(), uVarA, gVar2);
            u uVar = new u(uVarB.a() + 1, uVarB.b());
            gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
            uVarA = uVar;
        }
        u uVar2 = this.f59834a;
        if (uVar2 == null) {
            this.f59834a = uVarA;
        } else if (uVar2.a() == uVarA.a()) {
            g gVar3 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
            uVarA = new u(this.f59834a.a() + 1, v.b(kVar, this.f59834a, uVarA, gVar3).b());
            this.f59834a = uVarA;
        } else {
            stack.push(uVarA);
        }
        if (this.f59834a.a() == this.f59835b) {
            this.f59839f = true;
        } else {
            this.f59836c = uVarA.a();
            this.f59837d++;
        }
    }
}
