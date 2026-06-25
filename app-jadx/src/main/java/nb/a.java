package Nb;

import Df.r;
import Gf.AbstractC1617k;
import Gf.O;
import Pb.c;
import Td.L;
import Td.v;
import U4.q;
import ae.AbstractC2605b;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import expo.modules.image.ExpoImageViewWrapper;
import expo.modules.image.records.ImageErrorEvent;
import expo.modules.image.records.ImageLoadEvent;
import expo.modules.image.records.ImageSource;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k5.e;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import l5.d;
import vc.InterfaceC6858b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f12774a;

    /* JADX INFO: renamed from: Nb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0198a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpoImageViewWrapper f12776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ S4.a f12777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f12778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f12779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Drawable f12781g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0198a(ExpoImageViewWrapper expoImageViewWrapper, S4.a aVar, Object obj, int i10, int i11, Drawable drawable, Zd.e eVar) {
            super(2, eVar);
            this.f12776b = expoImageViewWrapper;
            this.f12777c = aVar;
            this.f12778d = obj;
            this.f12779e = i10;
            this.f12780f = i11;
            this.f12781g = drawable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C0198a(this.f12776b, this.f12777c, this.f12778d, this.f12779e, this.f12780f, this.f12781g, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((C0198a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f12775a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            InterfaceC6858b onLoad$expo_image_release = this.f12776b.getOnLoad$expo_image_release();
            String strName = Mb.a.f12316b.a(this.f12777c).name();
            Locale locale = Locale.getDefault();
            AbstractC5504s.g(locale, "getDefault(...)");
            String lowerCase = strName.toLowerCase(locale);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            onLoad$expo_image_release.invoke(new ImageLoadEvent(lowerCase, new ImageSource(this.f12778d.toString(), this.f12779e, this.f12780f, null, this.f12781g instanceof Animatable)));
            return L.f17438a;
        }
    }

    public a(WeakReference expoImageViewWrapper) {
        AbstractC5504s.h(expoImageViewWrapper, "expoImageViewWrapper");
        this.f12774a = expoImageViewWrapper;
    }

    @Override // k5.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean e(Drawable resource, Object model, d target, S4.a dataSource, boolean z10) {
        AbstractC5504s.h(resource, "resource");
        AbstractC5504s.h(model, "model");
        AbstractC5504s.h(target, "target");
        AbstractC5504s.h(dataSource, "dataSource");
        boolean z11 = resource instanceof c;
        c cVar = z11 ? (c) resource : null;
        int iB = cVar != null ? cVar.b() : resource.getIntrinsicWidth();
        c cVar2 = z11 ? (c) resource : null;
        int iA = cVar2 != null ? cVar2.a() : resource.getIntrinsicHeight();
        ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) this.f12774a.get();
        if (expoImageViewWrapper == null) {
            return false;
        }
        AbstractC1617k.d(expoImageViewWrapper.getAppContext().x(), null, null, new C0198a(expoImageViewWrapper, dataSource, model, iB, iA, resource, null), 3, null);
        return false;
    }

    @Override // k5.e
    public boolean g(q qVar, Object obj, d target, boolean z10) {
        String strD0;
        InterfaceC6858b onError$expo_image_release;
        String message;
        AbstractC5504s.h(target, "target");
        if (qVar == null || (message = qVar.getMessage()) == null || (strD0 = r.D0(message, "\n call GlideException#logRootCauses(String) for more detail")) == null) {
            strD0 = "Unknown error";
        }
        ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) this.f12774a.get();
        if (expoImageViewWrapper != null && (onError$expo_image_release = expoImageViewWrapper.getOnError$expo_image_release()) != null) {
            onError$expo_image_release.invoke(new ImageErrorEvent(strD0));
        }
        Log.e("ExpoImage", strD0);
        if (qVar == null) {
            return false;
        }
        qVar.g("ExpoImage");
        return false;
    }
}
