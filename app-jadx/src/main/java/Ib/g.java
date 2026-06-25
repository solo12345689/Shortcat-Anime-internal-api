package Ib;

import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import bc.C3042a;
import bc.EnumC3046e;
import dc.C4581b;
import expo.modules.image.ExpoImageViewWrapper;
import expo.modules.image.Image;
import expo.modules.image.enums.ContentFit;
import expo.modules.image.enums.Priority;
import expo.modules.image.records.CachePolicy;
import expo.modules.image.records.ContentPosition;
import expo.modules.image.records.DecodeFormat;
import expo.modules.image.records.ImageLoadOptions;
import expo.modules.image.records.ImageTransition;
import expo.modules.image.records.SourceMap;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.EitherOfThree;
import f8.C4780a;
import hc.C4940l;
import hc.C4941m;
import he.AbstractC4945a;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Map;
import k5.AbstractC5449a;
import k5.InterfaceFutureC5450b;
import k8.C5455a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;
import pc.C5974d;
import pe.C6029s;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;
import wc.AbstractC6959b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LIb/g;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A implements Function1 {
        public A() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            String str = (String) objArr[0];
            Context contextB = g.this.i().B();
            if (contextB == null) {
                return null;
            }
            InterfaceFutureC5450b interfaceFutureC5450bY0 = ((com.bumptech.glide.j) com.bumptech.glide.b.v(contextB).o().v0(new Y4.h(str)).R(true)).y0();
            AbstractC5504s.g(interfaceFutureC5450bY0, "submit(...)");
            try {
                return ((File) interfaceFutureC5450bY0.get()).getAbsolutePath();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class B implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final B f8892a = new B();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.p(List.class, C6029s.f56013c.d(kotlin.jvm.internal.O.o(String.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C f8893a = new C();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(CachePolicy.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class D implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D f8894a = new D();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return kotlin.jvm.internal.O.h(Map.class, aVar.d(kotlin.jvm.internal.O.o(String.class)), aVar.d(kotlin.jvm.internal.O.o(String.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class E implements Function2 {
        public E() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.Object[] r12, Ub.u r13) {
            /*
                r11 = this;
                java.lang.String r0 = "<destruct>"
                kotlin.jvm.internal.AbstractC5504s.h(r12, r0)
                java.lang.String r0 = "promise"
                kotlin.jvm.internal.AbstractC5504s.h(r13, r0)
                r0 = 0
                r1 = r12[r0]
                r2 = 1
                r3 = r12[r2]
                r4 = 2
                r12 = r12[r4]
                java.util.Map r12 = (java.util.Map) r12
                expo.modules.image.records.CachePolicy r3 = (expo.modules.image.records.CachePolicy) r3
                java.util.List r1 = (java.util.List) r1
                Ib.g r4 = Ib.g.this
                Ub.d r4 = r4.i()
                android.content.Context r4 = r4.B()
                if (r4 != 0) goto L26
                return
            L26:
                kotlin.jvm.internal.L r5 = new kotlin.jvm.internal.L
                r5.<init>()
                kotlin.jvm.internal.J r6 = new kotlin.jvm.internal.J
                r6.<init>()
                if (r12 == 0) goto L62
                Y4.k$a r7 = new Y4.k$a
                r7.<init>()
                java.util.Set r12 = r12.entrySet()
                java.util.Iterator r12 = r12.iterator()
            L3f:
                boolean r8 = r12.hasNext()
                if (r8 == 0) goto L5b
                java.lang.Object r8 = r12.next()
                java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                java.lang.Object r9 = r8.getKey()
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r8 = r8.getValue()
                java.lang.String r8 = (java.lang.String) r8
                r7.b(r9, r8)
                goto L3f
            L5b:
                Y4.k r12 = r7.c()
                if (r12 == 0) goto L62
                goto L64
            L62:
                Y4.i r12 = Y4.i.f22790b
            L64:
                java.util.Iterator r7 = r1.iterator()
            L68:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto Lb0
                java.lang.Object r8 = r7.next()
                java.lang.String r8 = (java.lang.String) r8
                com.bumptech.glide.k r9 = com.bumptech.glide.b.v(r4)
                Y4.h r10 = new Y4.h
                r10.<init>(r8, r12)
                com.bumptech.glide.j r8 = r9.u(r10)
                r9 = 100
                k5.a r8 = r8.i(r9)
                com.bumptech.glide.j r8 = (com.bumptech.glide.j) r8
                Ib.p r9 = Ib.p.f9002j
                k5.a r8 = r8.h(r9)
                java.lang.String r9 = "downsample(...)"
                kotlin.jvm.internal.AbstractC5504s.g(r8, r9)
                com.bumptech.glide.j r8 = (com.bumptech.glide.j) r8
                expo.modules.image.records.CachePolicy r9 = expo.modules.image.records.CachePolicy.MEMORY
                if (r3 != r9) goto L9c
                r9 = r2
                goto L9d
            L9c:
                r9 = r0
            L9d:
                Ib.g$r r10 = Ib.g.C1712r.f8946a
                com.bumptech.glide.j r8 = Ib.j.b(r8, r9, r10)
                Ib.g$s r9 = new Ib.g$s
                r9.<init>(r6, r13, r5, r1)
                com.bumptech.glide.j r8 = r8.u0(r9)
                r8.y0()
                goto L68
            Lb0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ib.g.E.a(java.lang.Object[], Ub.u):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class F implements Function1 {
        public F() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            Activity activityA = g.this.i().a();
            if (activityA == null) {
                return Boolean.FALSE;
            }
            com.bumptech.glide.b.d(activityA).c();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class G implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final G f8897a = new G();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Image.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class H implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final H f8898a = new H();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SourceMap.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class I implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final I f8899a = new I();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(ImageLoadOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class J extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f8902c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(Zd.e eVar, g gVar) {
            super(3, eVar);
            this.f8902c = gVar;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, Zd.e eVar) {
            J j10 = new J(eVar, this.f8902c);
            j10.f8901b = objArr;
            return j10.invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws cc.i, l {
            Object objF = AbstractC2605b.f();
            int i10 = this.f8900a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            Object[] objArr = (Object[]) this.f8901b;
            Object obj2 = objArr[0];
            ImageLoadOptions imageLoadOptions = (ImageLoadOptions) objArr[1];
            SourceMap sourceMap = (SourceMap) obj2;
            Ub.d dVarI = this.f8902c.i();
            if (imageLoadOptions == null) {
                imageLoadOptions = new ImageLoadOptions(0, 0, null, 7, null);
            }
            m mVar = new m(dVarI, sourceMap, imageLoadOptions);
            this.f8900a = 1;
            Object objB = mVar.b(this);
            return objB == objF ? objF : objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class K implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final K f8903a = new K();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return kotlin.jvm.internal.O.q(Either.class, aVar.d(kotlin.jvm.internal.O.o(URL.class)), aVar.d(kotlin.jvm.internal.O.o(Image.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class L implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final L f8904a = new L();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            Class cls = Integer.TYPE;
            return kotlin.jvm.internal.O.q(Pair.class, aVar.d(kotlin.jvm.internal.O.o(cls)), aVar.d(kotlin.jvm.internal.O.o(cls)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class M extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f8907c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(Zd.e eVar, g gVar) {
            super(3, eVar);
            this.f8907c = gVar;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, Zd.e eVar) {
            M m10 = new M(eVar, this.f8907c);
            m10.f8906b = objArr;
            return m10.invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws cc.i, l {
            Object objF = AbstractC2605b.f();
            int i10 = this.f8905a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            Object[] objArr = (Object[]) this.f8906b;
            Object obj2 = objArr[0];
            Pair pair = (Pair) objArr[1];
            g gVar = this.f8907c;
            C1714t c1714t = new C1714t(pair);
            this.f8905a = 1;
            Object objY = g.y(gVar, (Either) obj2, c1714t, this);
            return objY == objF ? objF : objY;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class N implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final N f8908a = new N();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return kotlin.jvm.internal.O.q(Either.class, aVar.d(kotlin.jvm.internal.O.o(URL.class)), aVar.d(kotlin.jvm.internal.O.o(Image.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class O extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f8911c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public O(Zd.e eVar, g gVar) {
            super(3, eVar);
            this.f8911c = gVar;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, Zd.e eVar) {
            O o11 = new O(eVar, this.f8911c);
            o11.f8910b = objArr;
            return o11.invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws cc.i, l {
            Object objF = AbstractC2605b.f();
            int i10 = this.f8909a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            Either either = (Either) ((Object[]) this.f8910b)[0];
            g gVar = this.f8911c;
            C1715u c1715u = C1715u.f8955a;
            this.f8909a = 1;
            Object objY = g.y(gVar, either, c1715u, this);
            return objY == objF ? objF : objY;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class P implements InterfaceC5082a {
        public P() {
        }

        public final void a() {
            Context contextB = g.this.i().B();
            if (contextB != null) {
                contextB.registerComponentCallbacks(f.f8888a);
            }
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Q implements InterfaceC5082a {
        public Q() {
        }

        public final void a() {
            Context contextB = g.this.i().B();
            if (contextB != null) {
                contextB.unregisterComponentCallbacks(f.f8888a);
            }
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class R implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final R f8914a = new R();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(ExpoImageViewWrapper.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class S implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Integer.valueOf(((Drawable) ((Image) it[0]).getRef()).getIntrinsicWidth());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class T implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Integer.valueOf(((Drawable) ((Image) it[0]).getRef()).getIntrinsicHeight());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class U implements Function1 {
        public U() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Resources resources;
            DisplayMetrics displayMetrics;
            AbstractC5504s.h(it, "it");
            Image image = (Image) it[0];
            Context contextB = g.this.i().B();
            float f10 = (contextB == null || (resources = contextB.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 1.0f : displayMetrics.density;
            return Float.valueOf((B1.b.d((Drawable) image.getRef(), 0, 0, null, 7, null) != null ? r8.getDensity() : 1) / (f10 * 160.0f));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class V implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            Image image = (Image) it[0];
            return Boolean.valueOf((image.getRef() instanceof C4780a) || (image.getRef() instanceof Y7.a) || (image.getRef() instanceof C5455a));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class W implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class X implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X f8916a = new X();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(ExpoImageViewWrapper.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Y implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((ExpoImageViewWrapper) objArr[0]).setLockResource$expo_image_release(false);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Z implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z f8917a = new Z();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(ExpoImageViewWrapper.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1695a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1695a f8918a = new C1695a();

        C1695a() {
        }

        public final void a(ExpoImageViewWrapper view, String str) {
            AbstractC5504s.h(view, "view");
            view.setAccessibilityLabel$expo_image_release(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (String) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Ib.g$a0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1696a0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) objArr[0];
            expoImageViewWrapper.setShouldRerender$expo_image_release(true);
            ExpoImageViewWrapper.rerenderIfNeeded$expo_image_release$default(expoImageViewWrapper, false, true, 1, null);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Ib.g$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1697b implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1697b f8919a = new C1697b();

        C1697b() {
        }

        public final void a(ExpoImageViewWrapper view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setFocusableProp$expo_image_release(AbstractC5504s.c(bool, Boolean.TRUE));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b0 f8920a = new b0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(ExpoImageViewWrapper.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1698c implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1698c f8921a = new C1698c();

        C1698c() {
        }

        public final void a(ExpoImageViewWrapper view, Priority priority) {
            AbstractC5504s.h(view, "view");
            if (priority == null) {
                priority = Priority.NORMAL;
            }
            view.setPriority$expo_image_release(priority);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (Priority) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((ExpoImageViewWrapper) objArr[0]).setIsAnimating(true);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Ib.g$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1699d implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1699d f8922a = new C1699d();

        C1699d() {
        }

        public final void a(ExpoImageViewWrapper view, CachePolicy cachePolicy) {
            AbstractC5504s.h(view, "view");
            if (cachePolicy == null) {
                cachePolicy = CachePolicy.DISK;
            }
            view.setCachePolicy$expo_image_release(cachePolicy);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (CachePolicy) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d0 f8923a = new d0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(ExpoImageViewWrapper.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1700e implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1700e f8924a = new C1700e();

        C1700e() {
        }

        public final void a(ExpoImageViewWrapper view, String str) {
            AbstractC5504s.h(view, "view");
            view.setRecyclingKey(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (String) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((ExpoImageViewWrapper) objArr[0]).setIsAnimating(false);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Ib.g$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1701f implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1701f f8925a = new C1701f();

        C1701f() {
        }

        public final void a(ExpoImageViewWrapper view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setAllowDownscaling$expo_image_release(!AbstractC5504s.c(bool, Boolean.FALSE));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f0 f8926a = new f0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(ExpoImageViewWrapper.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0121g implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0121g f8927a = new C0121g();

        C0121g() {
        }

        public final void a(ExpoImageViewWrapper view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setAutoplay$expo_image_release(!AbstractC5504s.c(bool, Boolean.FALSE));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((ExpoImageViewWrapper) objArr[0]).setLockResource$expo_image_release(true);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Ib.g$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1702h implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1702h f8928a = new C1702h();

        C1702h() {
        }

        public final void a(ExpoImageViewWrapper view, DecodeFormat decodeFormat) {
            AbstractC5504s.h(view, "view");
            if (decodeFormat == null) {
                decodeFormat = DecodeFormat.ARGB_8888;
            }
            view.setDecodeFormat$expo_image_release(decodeFormat);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (DecodeFormat) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h0 implements Function1 {
        public final void a(View it) {
            AbstractC5504s.h(it, "it");
            ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) it;
            if (expoImageViewWrapper.isAttachedToWindow()) {
                expoImageViewWrapper.addOnAttachStateChangeListener(new A0(expoImageViewWrapper, expoImageViewWrapper));
            } else {
                expoImageViewWrapper.onViewDestroys();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Ib.g$i, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1703i implements Function2 {
        C1703i() {
        }

        public final void a(ExpoImageViewWrapper view, EitherOfThree eitherOfThree) throws cc.i {
            AbstractC5504s.h(view, "view");
            if (eitherOfThree == null) {
                view.setSources$expo_image_release(AbstractC2279u.m());
                return;
            }
            if (eitherOfThree.e(kotlin.jvm.internal.O.b(List.class))) {
                view.setSources$expo_image_release((List) eitherOfThree.b(kotlin.jvm.internal.O.b(List.class)));
                return;
            }
            if (eitherOfThree.f(kotlin.jvm.internal.O.b(SharedRef.class))) {
                view.setSources$expo_image_release(AbstractC2279u.e(new expo.modules.image.records.a((Drawable) ((SharedRef) eitherOfThree.c(kotlin.jvm.internal.O.b(SharedRef.class))).getRef())));
                return;
            }
            Bitmap bitmap = (Bitmap) ((SharedRef) eitherOfThree.g(kotlin.jvm.internal.O.b(SharedRef.class))).getRef();
            Context contextB = g.this.i().B();
            if (contextB == null) {
                throw new cc.i();
            }
            view.setSources$expo_image_release(AbstractC2279u.e(new expo.modules.image.records.a(new BitmapDrawable(contextB.getResources(), bitmap))));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws cc.i {
            a((ExpoImageViewWrapper) obj, (EitherOfThree) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i0 implements Function1 {
        public final void a(View it) {
            AbstractC5504s.h(it, "it");
            ExpoImageViewWrapper.rerenderIfNeeded$expo_image_release$default((ExpoImageViewWrapper) it, false, false, 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Ib.g$j, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1704j implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1704j f8930a = new C1704j();

        C1704j() {
        }

        public final void a(ExpoImageViewWrapper view, ContentFit contentFit) {
            AbstractC5504s.h(view, "view");
            if (contentFit == null) {
                contentFit = ContentFit.Cover;
            }
            view.setContentFit$expo_image_release(contentFit);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (ContentFit) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j0 f8931a = new j0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$k, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1705k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1705k f8932a = new C1705k();

        C1705k() {
        }

        public final void a(ExpoImageViewWrapper view, ContentFit contentFit) {
            AbstractC5504s.h(view, "view");
            if (contentFit == null) {
                contentFit = ContentFit.ScaleDown;
            }
            view.setPlaceholderContentFit$expo_image_release(contentFit);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (ContentFit) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k0 f8933a = new k0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Boolean.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$l, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1706l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1706l f8934a = new C1706l();

        C1706l() {
        }

        public final void a(ExpoImageViewWrapper view, ContentPosition contentPosition) {
            AbstractC5504s.h(view, "view");
            if (contentPosition == null) {
                contentPosition = ContentPosition.INSTANCE.a();
            }
            view.setContentPosition$expo_image_release(contentPosition);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (ContentPosition) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0 f8935a = new l0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Priority.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$m, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1707m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1707m f8936a = new C1707m();

        C1707m() {
        }

        public final void a(ExpoImageViewWrapper view, Integer num) {
            AbstractC5504s.h(view, "view");
            if (num == null || num.intValue() <= 0) {
                num = null;
            }
            view.setBlurRadius$expo_image_release(num);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (Integer) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m0 f8937a = new m0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(CachePolicy.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$n, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1708n implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1708n f8938a = new C1708n();

        C1708n() {
        }

        public final void a(ExpoImageViewWrapper view, ImageTransition imageTransition) {
            AbstractC5504s.h(view, "view");
            view.setTransition$expo_image_release(imageTransition);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (ImageTransition) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n0 f8939a = new n0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$o, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1709o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1709o f8940a = new C1709o();

        C1709o() {
        }

        public final void a(ExpoImageViewWrapper view, Integer num) {
            AbstractC5504s.h(view, "view");
            view.setTintColor$expo_image_release(num);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (Integer) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o0 f8941a = new o0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Boolean.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$p, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1710p implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1710p f8942a = new C1710p();

        C1710p() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(ExpoImageViewWrapper view, List list) {
            AbstractC5504s.h(view, "view");
            if (list == null) {
                list = AbstractC2279u.m();
            }
            view.setPlaceholders$expo_image_release(list);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (List) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p0 f8943a = new p0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Boolean.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$q, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1711q implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1711q f8944a = new C1711q();

        C1711q() {
        }

        public final void a(ExpoImageViewWrapper view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setAccessible$expo_image_release(AbstractC5504s.c(bool, Boolean.TRUE));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((ExpoImageViewWrapper) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q0 f8945a = new q0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(DecodeFormat.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$r, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1712r implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1712r f8946a = new C1712r();

        C1712r() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.bumptech.glide.j invoke(com.bumptech.glide.j customize) {
            AbstractC5504s.h(customize, "$this$customize");
            AbstractC5449a abstractC5449aG = customize.g(U4.j.f19226b);
            AbstractC5504s.g(abstractC5449aG, "diskCacheStrategy(...)");
            return (com.bumptech.glide.j) abstractC5449aG;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r0 f8947a = new r0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return kotlin.jvm.internal.O.i(EitherOfThree.class, aVar.d(kotlin.jvm.internal.O.p(List.class, aVar.d(kotlin.jvm.internal.O.o(SourceMap.class)))), aVar.d(kotlin.jvm.internal.O.p(SharedRef.class, aVar.d(kotlin.jvm.internal.O.o(Drawable.class)))), aVar.d(kotlin.jvm.internal.O.p(SharedRef.class, aVar.d(kotlin.jvm.internal.O.o(Bitmap.class)))));
        }
    }

    /* JADX INFO: renamed from: Ib.g$s, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1713s implements k5.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f8948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ub.u f8949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f8950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f8951d;

        C1713s(kotlin.jvm.internal.J j10, Ub.u uVar, kotlin.jvm.internal.L l10, List list) {
            this.f8948a = j10;
            this.f8949b = uVar;
            this.f8950c = l10;
            this.f8951d = list;
        }

        @Override // k5.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean e(Drawable resource, Object model, l5.d target, S4.a dataSource, boolean z10) {
            AbstractC5504s.h(resource, "resource");
            AbstractC5504s.h(model, "model");
            AbstractC5504s.h(target, "target");
            AbstractC5504s.h(dataSource, "dataSource");
            kotlin.jvm.internal.L l10 = this.f8950c;
            int i10 = l10.f52257a + 1;
            l10.f52257a = i10;
            if (i10 == this.f8951d.size()) {
                this.f8949b.a(true);
            }
            return true;
        }

        @Override // k5.e
        public boolean g(U4.q qVar, Object obj, l5.d target, boolean z10) {
            AbstractC5504s.h(target, "target");
            kotlin.jvm.internal.J j10 = this.f8948a;
            if (!j10.f52255a) {
                j10.f52255a = true;
                this.f8949b.a(false);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s0 f8952a = new s0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(ContentFit.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$t, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1714t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Pair f8953a;

        C1714t(Pair pair) {
            this.f8953a = pair;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Bitmap bitmap) {
            AbstractC5504s.h(bitmap, "bitmap");
            return Jb.d.f9483a.b(bitmap, this.f8953a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t0 f8954a = new t0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(ContentFit.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$u, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1715u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1715u f8955a = new C1715u();

        C1715u() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Bitmap bitmap) {
            AbstractC5504s.h(bitmap, "bitmap");
            String strEncodeToString = Base64.encodeToString(Qb.c.f14791a.a(bitmap), 2);
            AbstractC5504s.g(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u0 f8956a = new u0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(ContentPosition.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$v, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1716v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f8957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8959c;

        C1716v(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8958b = obj;
            this.f8959c |= Integer.MIN_VALUE;
            return g.y(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0 f8960a = new v0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Integer.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$w, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1717w extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f8962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Image f8963c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1717w(Function1 function1, Image image, Zd.e eVar) {
            super(2, eVar);
            this.f8962b = function1;
            this.f8963c = image;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C1717w(this.f8962b, this.f8963c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((C1717w) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f8961a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            return this.f8962b.invoke(B1.b.b((Drawable) this.f8963c.getRef(), 0, 0, null, 7, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class w0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w0 f8964a = new w0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(ImageTransition.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$x, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1718x implements Function1 {
        public C1718x() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            boolean z10;
            AbstractC5504s.h(it, "it");
            Activity activityA = g.this.i().a();
            if (activityA == null) {
                z10 = false;
            } else {
                com.bumptech.glide.b.d(activityA).b();
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class x0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x0 f8966a = new x0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Integer.class);
        }
    }

    /* JADX INFO: renamed from: Ib.g$y, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1719y implements Function2 {
        public C1719y() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, Ub.u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            String str = (String) promise;
            Context contextB = g.this.i().B();
            if (contextB == null) {
                return;
            }
            InterfaceFutureC5450b interfaceFutureC5450bY0 = ((com.bumptech.glide.j) com.bumptech.glide.b.v(contextB).o().v0(new Y4.h(str)).R(true)).y0();
            AbstractC5504s.g(interfaceFutureC5450bY0, "submit(...)");
            try {
                ((File) interfaceFutureC5450bY0.get()).getAbsolutePath();
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class y0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y0 f8968a = new y0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.g(List.class, C6029s.f56013c.d(kotlin.jvm.internal.O.o(SourceMap.class)));
        }
    }

    /* JADX INFO: renamed from: Ib.g$z, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1720z implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1720z f8969a = new C1720z();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class z0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z0 f8970a = new z0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Boolean.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (r1 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object y(Ib.g r17, expo.modules.kotlin.types.Either r18, kotlin.jvm.functions.Function1 r19, Zd.e r20) throws cc.i, Ib.l {
        /*
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof Ib.g.C1716v
            if (r2 == 0) goto L17
            r2 = r1
            Ib.g$v r2 = (Ib.g.C1716v) r2
            int r3 = r2.f8959c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8959c = r3
            goto L1c
        L17:
            Ib.g$v r2 = new Ib.g$v
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f8958b
            java.lang.Object r3 = ae.AbstractC2605b.f()
            int r4 = r2.f8959c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L40
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            Td.v.b(r1)
            return r1
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            java.lang.Object r0 = r2.f8957a
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            Td.v.b(r1)
            goto L99
        L40:
            Td.v.b(r1)
            java.lang.Class<expo.modules.image.Image> r1 = expo.modules.image.Image.class
            pe.d r4 = kotlin.jvm.internal.O.b(r1)
            boolean r4 = r0.f(r4)
            if (r4 == 0) goto L5d
            pe.d r1 = kotlin.jvm.internal.O.b(r1)
            java.lang.Object r0 = r0.c(r1)
            expo.modules.image.Image r0 = (expo.modules.image.Image) r0
            r1 = r0
            r0 = r19
            goto L9b
        L5d:
            Ib.m r1 = new Ib.m
            Ub.d r4 = r17.i()
            expo.modules.image.records.SourceMap r7 = new expo.modules.image.records.SourceMap
            java.lang.Class<java.net.URL> r8 = java.net.URL.class
            pe.d r8 = kotlin.jvm.internal.O.b(r8)
            java.lang.Object r0 = r0.b(r8)
            java.net.URL r0 = (java.net.URL) r0
            java.lang.String r8 = r0.toString()
            r15 = 62
            r16 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r13, r14, r15, r16)
            expo.modules.image.records.ImageLoadOptions r8 = new expo.modules.image.records.ImageLoadOptions
            r12 = 7
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r1.<init>(r4, r7, r8)
            r0 = r19
            r2.f8957a = r0
            r2.f8959c = r6
            java.lang.Object r1 = r1.b(r2)
            if (r1 != r3) goto L99
            goto Laf
        L99:
            expo.modules.image.Image r1 = (expo.modules.image.Image) r1
        L9b:
            Gf.K r4 = Gf.C1608f0.a()
            Ib.g$w r6 = new Ib.g$w
            r7 = 0
            r6.<init>(r0, r1, r7)
            r2.f8957a = r7
            r2.f8959c = r5
            java.lang.Object r0 = Gf.AbstractC1613i.g(r4, r6, r2)
            if (r0 != r3) goto Lb0
        Laf:
            return r3
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ib.g.y(Ib.g, expo.modules.kotlin.types.Either, kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    @Override // gc.c
    public gc.e n() {
        Class cls;
        Class cls2;
        Class cls3;
        C5974d c5974d;
        Object obj;
        Class cls4;
        Class cls5;
        Object sVar;
        gc.d dVar;
        expo.modules.kotlin.views.p pVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar2 = new gc.d(this);
            dVar2.s("ExpoImage");
            Map mapW = dVar2.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new P()));
            Map mapW2 = dVar2.w();
            EnumC3046e enumC3046e2 = EnumC3046e.f33269b;
            mapW2.put(enumC3046e2, new C3042a(enumC3046e2, new Q()));
            pc.X xM = dVar2.m();
            C5974d c5974d2 = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = kotlin.jvm.internal.O.b(List.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                cls = List.class;
                cls2 = Integer.class;
                cls3 = ExpoImageViewWrapper.class;
                c5972b = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls), false, B.f8892a), xM);
            } else {
                cls = List.class;
                cls2 = Integer.class;
                cls3 = ExpoImageViewWrapper.class;
            }
            C5972b c5972b2 = (C5972b) c5974d2.a().get(new Pair(kotlin.jvm.internal.O.b(CachePolicy.class), bool));
            if (c5972b2 == null) {
                c5974d = c5974d2;
                c5972b2 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(CachePolicy.class), false, C.f8893a), xM);
            } else {
                c5974d = c5974d2;
            }
            InterfaceC6014d interfaceC6014dB2 = kotlin.jvm.internal.O.b(Map.class);
            Boolean bool2 = Boolean.TRUE;
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB2, bool2));
            if (c5972b3 == null) {
                obj = Td.L.class;
                cls4 = Boolean.class;
                c5972b3 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Map.class), true, D.f8894a), xM);
            } else {
                obj = Td.L.class;
                cls4 = Boolean.class;
            }
            dVar2.k().put("prefetch", new dc.f("prefetch", new C5972b[]{c5972b, c5972b2, c5972b3}, new E()));
            C4581b c4581bB = dVar2.b("loadAsync");
            String strC = c4581bB.c();
            pc.X xB = c4581bB.b();
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(SourceMap.class), bool));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(SourceMap.class), false, H.f8898a), xB);
            }
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(ImageLoadOptions.class), bool2));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(ImageLoadOptions.class), true, I.f8899a), xB);
            }
            C5972b[] c5972bArr = {c5972b4, c5972b5};
            pc.X x10 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            c4581bB.d(new dc.p(strC, c5972bArr, new J(null, this)));
            C4581b c4581bB2 = dVar2.b("generateBlurhashAsync");
            String strC2 = c4581bB2.c();
            pc.X xB2 = c4581bB2.b();
            C5972b c5972b6 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Either.class), bool));
            if (c5972b6 == null) {
                c5972b6 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Either.class), false, K.f8903a), xB2);
            }
            C5972b c5972b7 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Pair.class), bool));
            if (c5972b7 == null) {
                c5972b7 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Pair.class), false, L.f8904a), xB2);
            }
            c4581bB2.d(new dc.p(strC2, new C5972b[]{c5972b6, c5972b7}, new M(null, this)));
            C4581b c4581bB3 = dVar2.b("generateThumbhashAsync");
            String strC3 = c4581bB3.c();
            pc.X xB3 = c4581bB3.b();
            C5972b c5972b8 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Either.class), bool));
            if (c5972b8 == null) {
                c5972b8 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Either.class), false, N.f8908a), xB3);
            }
            c4581bB3.d(new dc.p(strC3, new C5972b[]{c5972b8}, new O(null, this)));
            InterfaceC6014d interfaceC6014dB3 = kotlin.jvm.internal.O.b(Image.class);
            gc.c cVarX = dVar2.x();
            if (cVarX == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Ub.d dVarI = cVarX.i();
            String simpleName = AbstractC4945a.b(interfaceC6014dB3).getSimpleName();
            AbstractC5504s.g(simpleName, "getSimpleName(...)");
            C5972b c5972b9 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Image.class), bool));
            Yb.c cVar = new Yb.c(dVarI, simpleName, interfaceC6014dB3, c5972b9 == null ? new C5972b(new pc.M(kotlin.jvm.internal.O.b(Image.class), false, G.f8897a), null) : c5972b9, dVar2.m());
            C4941m c4941m = new C4941m(cVar.y().g(), "width");
            int i10 = 2;
            C5972b[] c5972bArr2 = {new C5972b(c4941m.d(), x10, i10, z16 ? 1 : 0)};
            pc.V v10 = pc.V.f55908a;
            pc.U u10 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls2));
            if (u10 == null) {
                u10 = new pc.U(kotlin.jvm.internal.O.b(cls2));
                v10.a().put(kotlin.jvm.internal.O.b(cls2), u10);
            }
            dc.r rVar = new dc.r(com.amazon.a.a.o.b.au, c5972bArr2, u10, new S());
            rVar.l(c4941m.d());
            rVar.k(true);
            c4941m.b(rVar);
            cVar.o().put("width", c4941m);
            C4941m c4941m2 = new C4941m(cVar.y().g(), "height");
            C5972b[] c5972bArr3 = {new C5972b(c4941m2.d(), z15 ? 1 : 0, i10, z14 ? 1 : 0)};
            pc.U u11 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls2));
            if (u11 == null) {
                u11 = new pc.U(kotlin.jvm.internal.O.b(cls2));
                v10.a().put(kotlin.jvm.internal.O.b(cls2), u11);
            }
            dc.r rVar2 = new dc.r(com.amazon.a.a.o.b.au, c5972bArr3, u11, new T());
            rVar2.l(c4941m2.d());
            rVar2.k(true);
            c4941m2.b(rVar2);
            cVar.o().put("height", c4941m2);
            C4941m c4941m3 = new C4941m(cVar.y().g(), "scale");
            C5972b[] c5972bArr4 = {new C5972b(c4941m3.d(), z13 ? 1 : 0, i10, z12 ? 1 : 0)};
            pc.U u12 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Float.class));
            if (u12 == null) {
                u12 = new pc.U(kotlin.jvm.internal.O.b(Float.class));
                v10.a().put(kotlin.jvm.internal.O.b(Float.class), u12);
            }
            dc.r rVar3 = new dc.r(com.amazon.a.a.o.b.au, c5972bArr4, u12, new U());
            rVar3.l(c4941m3.d());
            rVar3.k(true);
            c4941m3.b(rVar3);
            cVar.o().put("scale", c4941m3);
            C4941m c4941m4 = new C4941m(cVar.y().g(), "isAnimated");
            C5972b[] c5972bArr5 = {new C5972b(c4941m4.d(), z11 ? 1 : 0, i10, z10 ? 1 : 0)};
            pc.U u13 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls4));
            if (u13 == null) {
                u13 = new pc.U(kotlin.jvm.internal.O.b(cls4));
                v10.a().put(kotlin.jvm.internal.O.b(cls4), u13);
            }
            dc.r rVar4 = new dc.r(com.amazon.a.a.o.b.au, c5972bArr5, u13, new V());
            rVar4.l(c4941m4.d());
            rVar4.k(true);
            c4941m4.b(rVar4);
            cVar.o().put("isAnimated", c4941m4);
            C4940l c4940l = new C4940l("mediaType");
            C5972b[] c5972bArr6 = new C5972b[0];
            pc.U u14 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Object.class));
            if (u14 == null) {
                u14 = new pc.U(kotlin.jvm.internal.O.b(Object.class));
                v10.a().put(kotlin.jvm.internal.O.b(Object.class), u14);
            }
            c4940l.b(new dc.r(com.amazon.a.a.o.b.au, c5972bArr6, u14, new W()));
            cVar.o().put("mediaType", c4940l);
            dVar2.v().add(cVar.v());
            dc.s sVar2 = new dc.s("clearMemoryCache", new C5972b[0], new F());
            dVar2.k().put("clearMemoryCache", sVar2);
            sVar2.n(dc.m.f45116a);
            C5972b[] c5972bArr7 = new C5972b[0];
            C1718x c1718x = new C1718x();
            Class cls6 = Integer.TYPE;
            Class cls7 = cls4;
            boolean zC = AbstractC5504s.c(cls7, cls6);
            Class cls8 = Float.TYPE;
            Class cls9 = Double.TYPE;
            Class cls10 = Boolean.TYPE;
            dVar2.k().put("clearDiskCache", zC ? new dc.l("clearDiskCache", c5972bArr7, c1718x) : AbstractC5504s.c(cls7, cls10) ? new dc.h("clearDiskCache", c5972bArr7, c1718x) : AbstractC5504s.c(cls7, cls9) ? new dc.i("clearDiskCache", c5972bArr7, c1718x) : AbstractC5504s.c(cls7, cls8) ? new dc.j("clearDiskCache", c5972bArr7, c1718x) : AbstractC5504s.c(cls7, String.class) ? new dc.n("clearDiskCache", c5972bArr7, c1718x) : new dc.s("clearDiskCache", c5972bArr7, c1718x));
            if (AbstractC5504s.c(String.class, Ub.u.class)) {
                cls5 = cls7;
                sVar = new dc.f("getCachePathAsync", new C5972b[0], new C1719y());
            } else {
                pc.X xM2 = dVar2.m();
                C5972b c5972b10 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(String.class), bool));
                if (c5972b10 == null) {
                    cls5 = cls7;
                    c5972b10 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(String.class), false, C1720z.f8969a), xM2);
                } else {
                    cls5 = cls7;
                }
                sVar = new dc.s("getCachePathAsync", new C5972b[]{c5972b10}, new A());
            }
            dVar2.k().put("getCachePathAsync", sVar);
            expo.modules.kotlin.views.p pVar2 = new expo.modules.kotlin.views.p(kotlin.jvm.internal.O.b(cls3), new pc.M(kotlin.jvm.internal.O.b(cls3), false, R.f8914a, 2, null), dVar2.m());
            AbstractC6959b.g(pVar2);
            pVar2.b("onLoadStart", "onProgress", "onError", "onLoad", "onDisplay");
            C1703i c1703i = new C1703i();
            Map mapH = pVar2.h();
            C5972b c5972b11 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(EitherOfThree.class), bool2));
            if (c5972b11 == null) {
                dVar = dVar2;
                pVar = pVar2;
                c5972b11 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(EitherOfThree.class), true, r0.f8947a), null);
            } else {
                dVar = dVar2;
                pVar = pVar2;
            }
            mapH.put("source", new expo.modules.kotlin.views.c("source", c5972b11, c1703i));
            C1704j c1704j = C1704j.f8930a;
            Map mapH2 = pVar.h();
            C5972b c5972b12 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(ContentFit.class), bool2));
            if (c5972b12 == null) {
                c5972b12 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(ContentFit.class), true, s0.f8952a), null);
            }
            mapH2.put("contentFit", new expo.modules.kotlin.views.c("contentFit", c5972b12, c1704j));
            C1705k c1705k = C1705k.f8932a;
            Map mapH3 = pVar.h();
            C5972b c5972b13 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(ContentFit.class), bool2));
            if (c5972b13 == null) {
                c5972b13 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(ContentFit.class), true, t0.f8954a), null);
            }
            mapH3.put("placeholderContentFit", new expo.modules.kotlin.views.c("placeholderContentFit", c5972b13, c1705k));
            C1706l c1706l = C1706l.f8934a;
            Map mapH4 = pVar.h();
            C5972b c5972b14 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(ContentPosition.class), bool2));
            if (c5972b14 == null) {
                c5972b14 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(ContentPosition.class), true, u0.f8956a), null);
            }
            mapH4.put("contentPosition", new expo.modules.kotlin.views.c("contentPosition", c5972b14, c1706l));
            C1707m c1707m = C1707m.f8936a;
            Map mapH5 = pVar.h();
            C5972b c5972b15 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool2));
            if (c5972b15 == null) {
                c5972b15 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), true, v0.f8960a), null);
            }
            mapH5.put("blurRadius", new expo.modules.kotlin.views.c("blurRadius", c5972b15, c1707m));
            C1708n c1708n = C1708n.f8938a;
            Map mapH6 = pVar.h();
            C5972b c5972b16 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(ImageTransition.class), bool2));
            if (c5972b16 == null) {
                c5972b16 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(ImageTransition.class), true, w0.f8964a), null);
            }
            mapH6.put("transition", new expo.modules.kotlin.views.c("transition", c5972b16, c1708n));
            C1709o c1709o = C1709o.f8940a;
            Map mapH7 = pVar.h();
            C5972b c5972b17 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool2));
            if (c5972b17 == null) {
                c5972b17 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), true, x0.f8966a), null);
            }
            mapH7.put("tintColor", new expo.modules.kotlin.views.c("tintColor", c5972b17, c1709o));
            C1710p c1710p = C1710p.f8942a;
            Map mapH8 = pVar.h();
            C5972b c5972b18 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool2));
            if (c5972b18 == null) {
                c5972b18 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls), true, y0.f8968a), null);
            }
            mapH8.put("placeholder", new expo.modules.kotlin.views.c("placeholder", c5972b18, c1710p));
            C1711q c1711q = C1711q.f8944a;
            Map mapH9 = pVar.h();
            C5972b c5972b19 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool2));
            if (c5972b19 == null) {
                c5972b19 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls5), true, z0.f8970a), null);
            }
            mapH9.put("accessible", new expo.modules.kotlin.views.c("accessible", c5972b19, c1711q));
            C1695a c1695a = C1695a.f8918a;
            Map mapH10 = pVar.h();
            C5972b c5972b20 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(String.class), bool2));
            if (c5972b20 == null) {
                c5972b20 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(String.class), true, j0.f8931a), null);
            }
            mapH10.put("accessibilityLabel", new expo.modules.kotlin.views.c("accessibilityLabel", c5972b20, c1695a));
            C1697b c1697b = C1697b.f8919a;
            Map mapH11 = pVar.h();
            C5972b c5972b21 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool2));
            if (c5972b21 == null) {
                c5972b21 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls5), true, k0.f8933a), null);
            }
            mapH11.put("focusable", new expo.modules.kotlin.views.c("focusable", c5972b21, c1697b));
            C1698c c1698c = C1698c.f8921a;
            Map mapH12 = pVar.h();
            C5972b c5972b22 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Priority.class), bool2));
            if (c5972b22 == null) {
                c5972b22 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Priority.class), true, l0.f8935a), null);
            }
            mapH12.put("priority", new expo.modules.kotlin.views.c("priority", c5972b22, c1698c));
            C1699d c1699d = C1699d.f8922a;
            Map mapH13 = pVar.h();
            C5972b c5972b23 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(CachePolicy.class), bool2));
            if (c5972b23 == null) {
                c5972b23 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(CachePolicy.class), true, m0.f8937a), null);
            }
            mapH13.put("cachePolicy", new expo.modules.kotlin.views.c("cachePolicy", c5972b23, c1699d));
            C1700e c1700e = C1700e.f8924a;
            Map mapH14 = pVar.h();
            C5972b c5972b24 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(String.class), bool2));
            if (c5972b24 == null) {
                c5972b24 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(String.class), true, n0.f8939a), null);
            }
            mapH14.put("recyclingKey", new expo.modules.kotlin.views.c("recyclingKey", c5972b24, c1700e));
            C1701f c1701f = C1701f.f8925a;
            Map mapH15 = pVar.h();
            C5972b c5972b25 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool2));
            if (c5972b25 == null) {
                c5972b25 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls5), true, o0.f8941a), null);
            }
            mapH15.put("allowDownscaling", new expo.modules.kotlin.views.c("allowDownscaling", c5972b25, c1701f));
            C0121g c0121g = C0121g.f8927a;
            Map mapH16 = pVar.h();
            C5972b c5972b26 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool2));
            if (c5972b26 == null) {
                c5972b26 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls5), true, p0.f8943a), null);
            }
            mapH16.put("autoplay", new expo.modules.kotlin.views.c("autoplay", c5972b26, c0121g));
            C1702h c1702h = C1702h.f8928a;
            Map mapH17 = pVar.h();
            C5972b c5972b27 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(DecodeFormat.class), bool2));
            if (c5972b27 == null) {
                c5972b27 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(DecodeFormat.class), true, q0.f8945a), null);
            }
            mapH17.put("decodeFormat", new expo.modules.kotlin.views.c("decodeFormat", c5972b27, c1702h));
            C5972b c5972b28 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool));
            if (c5972b28 == null) {
                c5972b28 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls3), false, b0.f8920a), null);
            }
            C5972b[] c5972bArr8 = {c5972b28};
            c0 c0Var = new c0();
            Object obj2 = obj;
            pVar.f().put("startAnimating", AbstractC5504s.c(obj2, cls6) ? new dc.l("startAnimating", c5972bArr8, c0Var) : AbstractC5504s.c(obj2, cls10) ? new dc.h("startAnimating", c5972bArr8, c0Var) : AbstractC5504s.c(obj2, cls9) ? new dc.i("startAnimating", c5972bArr8, c0Var) : AbstractC5504s.c(obj2, cls8) ? new dc.j("startAnimating", c5972bArr8, c0Var) : AbstractC5504s.c(obj2, String.class) ? new dc.n("startAnimating", c5972bArr8, c0Var) : new dc.s("startAnimating", c5972bArr8, c0Var));
            C5972b c5972b29 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool));
            if (c5972b29 == null) {
                c5972b29 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls3), false, d0.f8923a), null);
            }
            C5972b[] c5972bArr9 = {c5972b29};
            e0 e0Var = new e0();
            pVar.f().put("stopAnimating", AbstractC5504s.c(obj2, cls6) ? new dc.l("stopAnimating", c5972bArr9, e0Var) : AbstractC5504s.c(obj2, cls10) ? new dc.h("stopAnimating", c5972bArr9, e0Var) : AbstractC5504s.c(obj2, cls9) ? new dc.i("stopAnimating", c5972bArr9, e0Var) : AbstractC5504s.c(obj2, cls8) ? new dc.j("stopAnimating", c5972bArr9, e0Var) : AbstractC5504s.c(obj2, String.class) ? new dc.n("stopAnimating", c5972bArr9, e0Var) : new dc.s("stopAnimating", c5972bArr9, e0Var));
            C5972b c5972b30 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool));
            if (c5972b30 == null) {
                c5972b30 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls3), false, f0.f8926a), null);
            }
            C5972b[] c5972bArr10 = {c5972b30};
            g0 g0Var = new g0();
            pVar.f().put("lockResourceAsync", AbstractC5504s.c(obj2, cls6) ? new dc.l("lockResourceAsync", c5972bArr10, g0Var) : AbstractC5504s.c(obj2, cls10) ? new dc.h("lockResourceAsync", c5972bArr10, g0Var) : AbstractC5504s.c(obj2, cls9) ? new dc.i("lockResourceAsync", c5972bArr10, g0Var) : AbstractC5504s.c(obj2, cls8) ? new dc.j("lockResourceAsync", c5972bArr10, g0Var) : AbstractC5504s.c(obj2, String.class) ? new dc.n("lockResourceAsync", c5972bArr10, g0Var) : new dc.s("lockResourceAsync", c5972bArr10, g0Var));
            C5972b c5972b31 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool));
            if (c5972b31 == null) {
                c5972b31 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls3), false, X.f8916a), null);
            }
            C5972b[] c5972bArr11 = {c5972b31};
            Y y10 = new Y();
            pVar.f().put("unlockResourceAsync", AbstractC5504s.c(obj2, cls6) ? new dc.l("unlockResourceAsync", c5972bArr11, y10) : AbstractC5504s.c(obj2, cls10) ? new dc.h("unlockResourceAsync", c5972bArr11, y10) : AbstractC5504s.c(obj2, cls9) ? new dc.i("unlockResourceAsync", c5972bArr11, y10) : AbstractC5504s.c(obj2, cls8) ? new dc.j("unlockResourceAsync", c5972bArr11, y10) : AbstractC5504s.c(obj2, String.class) ? new dc.n("unlockResourceAsync", c5972bArr11, y10) : new dc.s("unlockResourceAsync", c5972bArr11, y10));
            C5972b c5972b32 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool));
            if (c5972b32 == null) {
                c5972b32 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls3), false, Z.f8917a), null);
            }
            C5972b[] c5972bArr12 = {c5972b32};
            C1696a0 c1696a0 = new C1696a0();
            pVar.f().put("reloadAsync", AbstractC5504s.c(obj2, cls6) ? new dc.l("reloadAsync", c5972bArr12, c1696a0) : AbstractC5504s.c(obj2, cls10) ? new dc.h("reloadAsync", c5972bArr12, c1696a0) : AbstractC5504s.c(obj2, cls9) ? new dc.i("reloadAsync", c5972bArr12, c1696a0) : AbstractC5504s.c(obj2, cls8) ? new dc.j("reloadAsync", c5972bArr12, c1696a0) : AbstractC5504s.c(obj2, String.class) ? new dc.n("reloadAsync", c5972bArr12, c1696a0) : new dc.s("reloadAsync", c5972bArr12, c1696a0));
            expo.modules.kotlin.views.p pVar3 = pVar;
            pVar3.k(new i0());
            pVar3.j(new h0());
            expo.modules.kotlin.views.r rVarC = pVar3.c();
            gc.d dVar3 = dVar;
            dVar3.y(rVarC);
            gc.e eVarU = dVar3.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A0 implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpoImageViewWrapper f8891b;

        public A0(View view, ExpoImageViewWrapper expoImageViewWrapper) {
            this.f8890a = view;
            this.f8891b = expoImageViewWrapper;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f8890a.removeOnAttachStateChangeListener(this);
            this.f8891b.onViewDestroys();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
