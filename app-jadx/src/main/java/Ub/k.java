package Ub;

import Td.AbstractC2163n;
import android.util.Log;
import ib.C5055d;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19429a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f19430b = AbstractC2163n.b(new InterfaceC5082a() { // from class: Ub.j
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return k.c();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            return (t) k.f19430b.getValue();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t c() {
        try {
            C5055d.a aVar = C5055d.Companion;
            Object objNewInstance = C5055d.class.getConstructor(null).newInstance(null);
            AbstractC5504s.f(objNewInstance, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider");
            return (t) objNewInstance;
        } catch (Exception e10) {
            Log.e("ExpoModulesHelper", "Couldn't get expo modules list.", e10);
            return null;
        }
    }
}
