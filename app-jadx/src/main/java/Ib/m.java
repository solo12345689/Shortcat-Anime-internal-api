package Ib;

import Gf.O;
import Td.L;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Color;
import expo.modules.image.records.ImageLoadOptions;
import expo.modules.image.records.SourceMap;
import k5.AbstractC5449a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ub.d f8981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SourceMap f8982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageLoadOptions f8983c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f8984a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8986c;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8984a = obj;
            this.f8986c |= Integer.MIN_VALUE;
            return m.this.b(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f8988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f8989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f8990d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, Object obj, m mVar, Zd.e eVar) {
            super(2, eVar);
            this.f8988b = context;
            this.f8989c = obj;
            this.f8990d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new b(this.f8988b, this.f8989c, this.f8990d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f8987a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            AbstractC5449a abstractC5449aD = com.bumptech.glide.b.v(this.f8988b).k().v0(this.f8989c).d();
            AbstractC5504s.g(abstractC5449aD, "centerInside(...)");
            com.bumptech.glide.j jVarA = (com.bumptech.glide.j) abstractC5449aD;
            Color tintColor = this.f8990d.f8983c.getTintColor();
            if (tintColor != null) {
                jVarA = jVarA.a(new k5.f().Z(d.f8885a.a(), kotlin.coroutines.jvm.internal.b.d(tintColor.toArgb())));
                AbstractC5504s.g(jVarA, "apply(...)");
            }
            return jVarA.z0(this.f8990d.f8983c.getMaxWidth(), this.f8990d.f8983c.getMaxHeight()).get();
        }
    }

    public m(Ub.d appContext, SourceMap source, ImageLoadOptions options) {
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(options, "options");
        this.f8981a = appContext;
        this.f8982b = source;
        this.f8983c = options;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(Zd.e r8) throws cc.i, Ib.l {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Ib.m.a
            if (r0 == 0) goto L13
            r0 = r8
            Ib.m$a r0 = (Ib.m.a) r0
            int r1 = r0.f8986c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8986c = r1
            goto L18
        L13:
            Ib.m$a r0 = new Ib.m$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8984a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f8986c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Td.v.b(r8)     // Catch: java.lang.Exception -> L29
            goto L5f
        L29:
            r8 = move-exception
            goto L86
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            Td.v.b(r8)
            Ub.d r8 = r7.f8981a
            android.content.Context r8 = r8.B()
            if (r8 == 0) goto L8c
            expo.modules.image.records.SourceMap r2 = r7.f8982b
            Ib.k r2 = r2.createGlideModelProvider(r8)
            r4 = 0
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r2.a()
            goto L4d
        L4c:
            r2 = r4
        L4d:
            Gf.K r5 = Gf.C1608f0.b()     // Catch: java.lang.Exception -> L29
            Ib.m$b r6 = new Ib.m$b     // Catch: java.lang.Exception -> L29
            r6.<init>(r8, r2, r7, r4)     // Catch: java.lang.Exception -> L29
            r0.f8986c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = Gf.AbstractC1613i.g(r5, r6, r0)     // Catch: java.lang.Exception -> L29
            if (r8 != r1) goto L5f
            return r1
        L5f:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8     // Catch: java.lang.Exception -> L29
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L7d
            expo.modules.image.records.ImageLoadOptions r0 = r7.f8983c     // Catch: java.lang.Exception -> L29
            android.graphics.Color r0 = r0.getTintColor()     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L7d
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0     // Catch: java.lang.Exception -> L29
            expo.modules.image.records.ImageLoadOptions r1 = r7.f8983c     // Catch: java.lang.Exception -> L29
            android.graphics.Color r1 = r1.getTintColor()     // Catch: java.lang.Exception -> L29
            int r1 = com.facebook.react.bridge.m.a(r1)     // Catch: java.lang.Exception -> L29
            r0.setTint(r1)     // Catch: java.lang.Exception -> L29
        L7d:
            expo.modules.image.Image r0 = new expo.modules.image.Image     // Catch: java.lang.Exception -> L29
            kotlin.jvm.internal.AbstractC5504s.e(r8)     // Catch: java.lang.Exception -> L29
            r0.<init>(r8)     // Catch: java.lang.Exception -> L29
            return r0
        L86:
            Ib.l r0 = new Ib.l
            r0.<init>(r8)
            throw r0
        L8c:
            cc.i r8 = new cc.i
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ib.m.b(Zd.e):java.lang.Object");
    }
}
