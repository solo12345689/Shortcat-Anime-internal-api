package sh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import sh.g;
import sh.i;
import sh.j;
import zg.C7427t;

/* JADX INFO: renamed from: sh.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C6534a implements Serializable {

    /* JADX INFO: renamed from: a */
    private transient k f59820a;

    /* JADX INFO: renamed from: b */
    private final int f59821b;

    /* JADX INFO: renamed from: c */
    private final List f59822c;

    /* JADX INFO: renamed from: d */
    private int f59823d;

    /* JADX INFO: renamed from: e */
    private u f59824e;

    /* JADX INFO: renamed from: f */
    private List f59825f;

    /* JADX INFO: renamed from: g */
    private Map f59826g;

    /* JADX INFO: renamed from: h */
    private Stack f59827h;

    /* JADX INFO: renamed from: i */
    private Map f59828i;

    /* JADX INFO: renamed from: j */
    private int f59829j;

    /* JADX INFO: renamed from: k */
    private boolean f59830k;

    /* JADX INFO: renamed from: l */
    private transient int f59831l;

    C6534a(C6534a c6534a) {
        this.f59820a = new k(c6534a.f59820a.d());
        this.f59821b = c6534a.f59821b;
        this.f59823d = c6534a.f59823d;
        this.f59824e = c6534a.f59824e;
        ArrayList arrayList = new ArrayList();
        this.f59825f = arrayList;
        arrayList.addAll(c6534a.f59825f);
        this.f59826g = new TreeMap();
        for (Integer num : c6534a.f59826g.keySet()) {
            this.f59826g.put(num, (LinkedList) ((LinkedList) c6534a.f59826g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f59827h = stack;
        stack.addAll(c6534a.f59827h);
        this.f59822c = new ArrayList();
        Iterator it = c6534a.f59822c.iterator();
        while (it.hasNext()) {
            this.f59822c.add(((c) it.next()).clone());
        }
        this.f59828i = new TreeMap(c6534a.f59828i);
        this.f59829j = c6534a.f59829j;
        this.f59831l = c6534a.f59831l;
        this.f59830k = c6534a.f59830k;
    }

    private c a() {
        c cVar = null;
        for (c cVar2 : this.f59822c) {
            if (!cVar2.g() && cVar2.h() && (cVar == null || cVar2.c() < cVar.c() || (cVar2.c() == cVar.c() && cVar2.d() < cVar.d()))) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    private void e(byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
        g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
        for (int i10 = 0; i10 < (1 << this.f59821b); i10++) {
            jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(i10).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
            k kVar = this.f59820a;
            kVar.h(kVar.g(bArr2, jVar), bArr);
            n nVarE = this.f59820a.e(jVar);
            iVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(i10).o(iVar.f()).p(iVar.g()).f(iVar.a())).l();
            u uVarA = v.a(this.f59820a, nVarE, iVar);
            gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).n(i10).f(gVar.a())).k();
            while (!this.f59827h.isEmpty() && ((u) this.f59827h.peek()).a() == uVarA.a()) {
                int iA = i10 / (1 << uVarA.a());
                if (iA == 1) {
                    this.f59825f.add(uVarA);
                }
                if (iA == 3 && uVarA.a() < this.f59821b - this.f59823d) {
                    ((c) this.f59822c.get(uVarA.a())).i(uVarA);
                }
                if (iA >= 3 && (iA & 1) == 1 && uVarA.a() >= this.f59821b - this.f59823d && uVarA.a() <= this.f59821b - 2) {
                    if (this.f59826g.get(Integer.valueOf(uVarA.a())) == null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(uVarA);
                        this.f59826g.put(Integer.valueOf(uVarA.a()), linkedList);
                    } else {
                        ((LinkedList) this.f59826g.get(Integer.valueOf(uVarA.a()))).add(uVarA);
                    }
                }
                g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                u uVarB = v.b(this.f59820a, (u) this.f59827h.pop(), uVarA, gVar2);
                u uVar = new u(uVarB.a() + 1, uVarB.b());
                gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                uVarA = uVar;
            }
            this.f59827h.push(uVarA);
        }
        this.f59824e = (u) this.f59827h.pop();
    }

    private void f(byte[] bArr, byte[] bArr2, j jVar) {
        List list;
        Object objRemoveFirst;
        byte[] bArr3;
        byte[] bArr4;
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f59830k) {
            throw new IllegalStateException("index already used");
        }
        int i10 = this.f59829j;
        if (i10 > this.f59831l - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int iB = AbstractC6533A.b(i10, this.f59821b);
        if (((this.f59829j >> (iB + 1)) & 1) == 0 && iB < this.f59821b - 1) {
            this.f59828i.put(Integer.valueOf(iB), this.f59825f.get(iB));
        }
        i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
        g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
        int i11 = 0;
        if (iB == 0) {
            jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f59829j).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
            k kVar = this.f59820a;
            kVar.h(kVar.g(bArr2, jVar), bArr);
            this.f59825f.set(0, v.a(this.f59820a, this.f59820a.e(jVar), (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(this.f59829j).o(iVar.f()).p(iVar.g()).f(iVar.a())).l()));
        } else {
            int i12 = iB - 1;
            g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(i12).n(this.f59829j >> iB).f(gVar.a())).k();
            k kVar2 = this.f59820a;
            kVar2.h(kVar2.g(bArr2, jVar), bArr);
            u uVarB = v.b(this.f59820a, (u) this.f59825f.get(i12), (u) this.f59828i.get(Integer.valueOf(i12)), gVar2);
            this.f59825f.set(iB, new u(uVarB.a() + 1, uVarB.b()));
            this.f59828i.remove(Integer.valueOf(i12));
            for (int i13 = 0; i13 < iB; i13++) {
                if (i13 < this.f59821b - this.f59823d) {
                    list = this.f59825f;
                    objRemoveFirst = ((c) this.f59822c.get(i13)).e();
                } else {
                    list = this.f59825f;
                    objRemoveFirst = ((LinkedList) this.f59826g.get(Integer.valueOf(i13))).removeFirst();
                }
                list.set(i13, objRemoveFirst);
            }
            int iMin = Math.min(iB, this.f59821b - this.f59823d);
            for (int i14 = 0; i14 < iMin; i14++) {
                int i15 = this.f59829j + 1 + ((1 << i14) * 3);
                if (i15 < (1 << this.f59821b)) {
                    ((c) this.f59822c.get(i14)).f(i15);
                }
            }
        }
        j jVar2 = jVar;
        while (i11 < ((this.f59821b - this.f59823d) >> 1)) {
            c cVarA = a();
            if (cVarA != null) {
                bArr3 = bArr;
                bArr4 = bArr2;
                cVarA.j(this.f59827h, this.f59820a, bArr3, bArr4, jVar2);
            } else {
                bArr3 = bArr;
                bArr4 = bArr2;
            }
            i11++;
            bArr = bArr3;
            bArr2 = bArr4;
        }
        this.f59829j++;
    }

    private void g() {
        if (this.f59825f == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.f59826g == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.f59827h == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.f59822c == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.f59828i == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!AbstractC6533A.l(this.f59821b, this.f59829j)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    protected int b() {
        return this.f59829j;
    }

    public int c() {
        return this.f59831l;
    }

    public C6534a d(byte[] bArr, byte[] bArr2, j jVar) {
        return new C6534a(this, bArr, bArr2, jVar);
    }

    public C6534a h(C7427t c7427t) {
        return new C6534a(this, c7427t);
    }

    private C6534a(C6534a c6534a, C7427t c7427t) {
        this.f59820a = new k(new m(c7427t));
        this.f59821b = c6534a.f59821b;
        this.f59823d = c6534a.f59823d;
        this.f59824e = c6534a.f59824e;
        ArrayList arrayList = new ArrayList();
        this.f59825f = arrayList;
        arrayList.addAll(c6534a.f59825f);
        this.f59826g = new TreeMap();
        for (Integer num : c6534a.f59826g.keySet()) {
            this.f59826g.put(num, (LinkedList) ((LinkedList) c6534a.f59826g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f59827h = stack;
        stack.addAll(c6534a.f59827h);
        this.f59822c = new ArrayList();
        Iterator it = c6534a.f59822c.iterator();
        while (it.hasNext()) {
            this.f59822c.add(((c) it.next()).clone());
        }
        this.f59828i = new TreeMap(c6534a.f59828i);
        this.f59829j = c6534a.f59829j;
        this.f59831l = c6534a.f59831l;
        this.f59830k = c6534a.f59830k;
        g();
    }

    private C6534a(C6534a c6534a, byte[] bArr, byte[] bArr2, j jVar) {
        this.f59820a = new k(c6534a.f59820a.d());
        this.f59821b = c6534a.f59821b;
        this.f59823d = c6534a.f59823d;
        this.f59824e = c6534a.f59824e;
        ArrayList arrayList = new ArrayList();
        this.f59825f = arrayList;
        arrayList.addAll(c6534a.f59825f);
        this.f59826g = new TreeMap();
        for (Integer num : c6534a.f59826g.keySet()) {
            this.f59826g.put(num, (LinkedList) ((LinkedList) c6534a.f59826g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f59827h = stack;
        stack.addAll(c6534a.f59827h);
        this.f59822c = new ArrayList();
        Iterator it = c6534a.f59822c.iterator();
        while (it.hasNext()) {
            this.f59822c.add(((c) it.next()).clone());
        }
        this.f59828i = new TreeMap(c6534a.f59828i);
        this.f59829j = c6534a.f59829j;
        this.f59831l = c6534a.f59831l;
        this.f59830k = false;
        f(bArr, bArr2, jVar);
    }

    private C6534a(k kVar, int i10, int i11, int i12) {
        this.f59820a = kVar;
        this.f59821b = i10;
        this.f59831l = i12;
        this.f59823d = i11;
        if (i11 <= i10 && i11 >= 2) {
            int i13 = i10 - i11;
            if (i13 % 2 == 0) {
                this.f59825f = new ArrayList();
                this.f59826g = new TreeMap();
                this.f59827h = new Stack();
                this.f59822c = new ArrayList();
                for (int i14 = 0; i14 < i13; i14++) {
                    this.f59822c.add(new c(i14));
                }
                this.f59828i = new TreeMap();
                this.f59829j = 0;
                this.f59830k = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    C6534a(x xVar, int i10, int i11) {
        this(xVar.i(), xVar.b(), xVar.c(), i11);
        this.f59831l = i10;
        this.f59829j = i11;
        this.f59830k = true;
    }

    C6534a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
    }

    C6534a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i10) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
        while (this.f59829j < i10) {
            f(bArr, bArr2, jVar);
            this.f59830k = false;
        }
    }
}
