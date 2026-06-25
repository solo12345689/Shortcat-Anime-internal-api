package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: renamed from: androidx.core.view.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2761h0 {

    /* JADX INFO: renamed from: androidx.core.view.h0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29054c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, Zd.e eVar) {
            super(2, eVar);
            this.f29054c = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Cf.k kVar, Zd.e eVar) {
            return ((a) create(kVar, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f29054c, eVar);
            aVar.f29053b = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.e(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r4.f29052a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Td.v.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f29053b
                Cf.k r1 = (Cf.k) r1
                Td.v.b(r5)
                goto L37
            L22:
                Td.v.b(r5)
                java.lang.Object r5 = r4.f29053b
                r1 = r5
                Cf.k r1 = (Cf.k) r1
                android.view.View r5 = r4.f29054c
                r4.f29053b = r1
                r4.f29052a = r3
                java.lang.Object r5 = r1.d(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.f29054c
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                Cf.i r5 = androidx.core.view.AbstractC2759g0.b(r5)
                r3 = 0
                r4.f29053b = r3
                r4.f29052a = r2
                java.lang.Object r5 = r1.e(r5, r4)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                Td.L r5 = Td.L.f17438a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.AbstractC2761h0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.h0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29055a = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final Cf.i a(View view) {
        return Cf.l.b(new a(view, null));
    }

    public static final Cf.i b(View view) {
        return Cf.l.p(view.getParent(), b.f29055a);
    }
}
