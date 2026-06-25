package ib;

import Td.z;
import Ub.t;
import Ud.AbstractC2279u;
import Ud.S;
import ad.C2603a;
import cd.C3095a;
import dd.C4585a;
import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.constants.ConstantsService;
import expo.modules.core.BasePackage;
import expo.modules.kotlin.edgeToEdge.EdgeToEdgePackage;
import expo.modules.kotlin.services.Service;
import expo.modules.linking.ExpoLinkingPackage;
import expo.modules.localization.LocalizationPackage;
import expo.modules.logbox.ExpoLogBoxPackage;
import expo.modules.notifications.NotificationsPackage;
import expo.modules.systemui.SystemUIPackage;
import expo.modules.updates.UpdatesModule;
import expo.modules.updates.UpdatesPackage;
import expo.modules.webbrowser.WebBrowserPackage;
import java.util.List;
import java.util.Map;
import jd.C5369b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.C5584a;
import ld.C5589a;
import md.C5663f;
import ob.C5850a;
import xb.C7101b;
import xc.C7128a;
import yc.C7219a;
import zb.C7348a;

/* JADX INFO: renamed from: ib.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5055d implements t {
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a */
    private static final List f48772a = AbstractC2279u.p(new ExpoLogBoxPackage(), new ExpoLinkingPackage(), new LocalizationPackage(), new ReactAdapterPackage(), new BasePackage(), new EdgeToEdgePackage(), new NotificationsPackage(), new SystemUIPackage(), new UpdatesPackage(), new WebBrowserPackage());

    /* JADX INFO: renamed from: b */
    private static final Map f48773b = S.l(z.a(Od.e.class, null), z.a(Bb.e.class, null), z.a(C5584a.class, null), z.a(mb.b.class, null), z.a(nb.l.class, null), z.a(C5850a.class, null), z.a(expo.modules.crypto.a.class, null), z.a(C7101b.class, null), z.a(C7348a.class, null), z.a(Ab.c.class, null), z.a(Cb.i.class, null), z.a(Db.k.class, null), z.a(Fb.b.class, null), z.a(Fb.c.class, null), z.a(Gb.b.class, null), z.a(Ib.g.class, null), z.a(Tb.e.class, null), z.a(C7128a.class, null), z.a(C7219a.class, null), z.a(zc.g.class, null), z.a(Cc.b.class, null), z.a(Ec.b.class, null), z.a(expo.modules.notifications.notifications.categories.a.class, null), z.a(Hc.i.class, null), z.a(Hc.l.class, null), z.a(Lc.a.class, null), z.a(Nc.a.class, null), z.a(Vc.c.class, null), z.a(Rc.c.class, null), z.a(Tc.c.class, null), z.a(Wc.e.class, null), z.a(C2603a.class, null), z.a(C3095a.class, null), z.a(Hc.e.class, null), z.a(C4585a.class, null), z.a(ed.i.class, null), z.a(gd.f.class, null), z.a(hd.e.class, null), z.a(C5369b.class, null), z.a(C5589a.class, null), z.a(UpdatesModule.class, null), z.a(expo.modules.video.a.class, null), z.a(Nd.l.class, null), z.a(C5663f.class, null));

    /* JADX INFO: renamed from: ib.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return b();
        }

        public final List b() {
            return C5055d.f48772a;
        }

        private a() {
        }
    }

    public static final List<sb.g> getPackageList() {
        return Companion.a();
    }

    @Override // Ub.t
    public Map<Class<? extends gc.c>, String> getModulesMap() {
        return f48773b;
    }

    @Override // Ub.t
    public List<Class<? extends Service>> getServices() {
        return AbstractC2279u.e(ConstantsService.class);
    }
}
