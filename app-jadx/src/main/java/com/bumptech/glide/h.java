package com.bumptech.glide;

import U4.t;
import U4.v;
import Y4.o;
import Y4.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import g5.C4855f;
import g5.InterfaceC4854e;
import j5.C5335a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p5.AbstractC5933a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a */
    private final p f35619a;

    /* JADX INFO: renamed from: b */
    private final C5335a f35620b;

    /* JADX INFO: renamed from: c */
    private final j5.e f35621c;

    /* JADX INFO: renamed from: d */
    private final j5.f f35622d;

    /* JADX INFO: renamed from: e */
    private final com.bumptech.glide.load.data.f f35623e;

    /* JADX INFO: renamed from: f */
    private final C4855f f35624f;

    /* JADX INFO: renamed from: g */
    private final j5.b f35625g;

    /* JADX INFO: renamed from: h */
    private final j5.d f35626h = new j5.d();

    /* JADX INFO: renamed from: i */
    private final j5.c f35627i = new j5.c();

    /* JADX INFO: renamed from: j */
    private final K1.d f35628j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public h() {
        K1.d dVarE = AbstractC5933a.e();
        this.f35628j = dVarE;
        this.f35619a = new p(dVarE);
        this.f35620b = new C5335a();
        this.f35621c = new j5.e();
        this.f35622d = new j5.f();
        this.f35623e = new com.bumptech.glide.load.data.f();
        this.f35624f = new C4855f();
        this.f35625g = new j5.b();
        v(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f35621c.d(cls, cls2)) {
            for (Class cls5 : this.f35624f.b(cls4, cls3)) {
                arrayList.add(new U4.i(cls, cls4, cls5, this.f35621c.b(cls, cls4), this.f35624f.a(cls4, cls5), this.f35628j));
            }
        }
        return arrayList;
    }

    public h a(Class cls, S4.d dVar) {
        this.f35620b.a(cls, dVar);
        return this;
    }

    public h b(Class cls, S4.k kVar) {
        this.f35622d.a(cls, kVar);
        return this;
    }

    public h c(Class cls, Class cls2, S4.j jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public h d(Class cls, Class cls2, o oVar) {
        this.f35619a.a(cls, cls2, oVar);
        return this;
    }

    public h e(String str, Class cls, Class cls2, S4.j jVar) {
        this.f35621c.a(str, jVar, cls, cls2);
        return this;
    }

    public List g() {
        List listB = this.f35625g.b();
        if (listB.isEmpty()) {
            throw new b();
        }
        return listB;
    }

    public t h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        t tVarA = this.f35627i.a(cls, cls2, cls3);
        t tVar = null;
        if (this.f35627i.c(tVarA)) {
            return null;
        }
        if (tVarA != null) {
            return tVarA;
        }
        List listF = f(cls, cls2, cls3);
        if (listF.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            tVar = new t(cls4, cls5, cls6, listF, this.f35628j);
        }
        this.f35627i.d(cls4, cls5, cls6, tVar);
        return tVar;
    }

    public List i(Object obj) {
        return this.f35619a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List listA = this.f35626h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList();
            Iterator it = this.f35619a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f35621c.d((Class) it.next(), cls2)) {
                    if (!this.f35624f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f35626h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public S4.k k(v vVar) {
        S4.k kVarB = this.f35622d.b(vVar.a());
        if (kVarB != null) {
            return kVarB;
        }
        throw new d(vVar.a());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f35623e.a(obj);
    }

    public S4.d m(Object obj) {
        S4.d dVarB = this.f35620b.b(obj.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new e(obj.getClass());
    }

    public boolean n(v vVar) {
        return this.f35622d.b(vVar.a()) != null;
    }

    public h o(Class cls, Class cls2, S4.j jVar) {
        q("legacy_prepend_all", cls, cls2, jVar);
        return this;
    }

    public h p(Class cls, Class cls2, o oVar) {
        this.f35619a.f(cls, cls2, oVar);
        return this;
    }

    public h q(String str, Class cls, Class cls2, S4.j jVar) {
        this.f35621c.e(str, jVar, cls, cls2);
        return this;
    }

    public h r(ImageHeaderParser imageHeaderParser) {
        this.f35625g.a(imageHeaderParser);
        return this;
    }

    public h s(e.a aVar) {
        this.f35623e.b(aVar);
        return this;
    }

    public h t(Class cls, Class cls2, InterfaceC4854e interfaceC4854e) {
        this.f35624f.c(cls, cls2, interfaceC4854e);
        return this;
    }

    public h u(Class cls, Class cls2, o oVar) {
        this.f35619a.g(cls, cls2, oVar);
        return this;
    }

    public final h v(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f35621c.f(arrayList);
        return this;
    }
}
