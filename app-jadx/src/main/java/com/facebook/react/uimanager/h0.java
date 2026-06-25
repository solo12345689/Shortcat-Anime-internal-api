package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.uimanager.events.x;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f37691a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f37692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f37693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f37694d;

    static {
        Pair pairA = Td.z.a("topChange", Ud.S.f(Td.z.a("phasedRegistrationNames", Ud.S.l(Td.z.a("bubbled", "onChange"), Td.z.a("captured", "onChangeCapture")))));
        Pair pairA2 = Td.z.a("topSelect", Ud.S.f(Td.z.a("phasedRegistrationNames", Ud.S.l(Td.z.a("bubbled", "onSelect"), Td.z.a("captured", "onSelectCapture")))));
        x.a aVar = com.facebook.react.uimanager.events.x.f37679b;
        f37692b = Ud.S.l(pairA, pairA2, Td.z.a(aVar.a(com.facebook.react.uimanager.events.x.f37680c), Ud.S.f(Td.z.a("phasedRegistrationNames", Ud.S.l(Td.z.a("bubbled", "onTouchStart"), Td.z.a("captured", "onTouchStartCapture"))))), Td.z.a(aVar.a(com.facebook.react.uimanager.events.x.f37682e), Ud.S.f(Td.z.a("phasedRegistrationNames", Ud.S.l(Td.z.a("bubbled", "onTouchMove"), Td.z.a("captured", "onTouchMoveCapture"))))), Td.z.a(aVar.a(com.facebook.react.uimanager.events.x.f37681d), Ud.S.f(Td.z.a("phasedRegistrationNames", Ud.S.l(Td.z.a("bubbled", "onTouchEnd"), Td.z.a("captured", "onTouchEndCapture"))))), Td.z.a(aVar.a(com.facebook.react.uimanager.events.x.f37683f), Ud.S.f(Td.z.a("phasedRegistrationNames", Ud.S.l(Td.z.a("bubbled", "onTouchCancel"), Td.z.a("captured", "onTouchCancelCapture"))))));
        f37693c = Ud.S.l(Td.z.a("topContentSizeChange", Ud.S.f(Td.z.a("registrationName", "onContentSizeChange"))), Td.z.a("topLayout", Ud.S.f(Td.z.a("registrationName", "onLayout"))), Td.z.a("topLoadingError", Ud.S.f(Td.z.a("registrationName", "onLoadingError"))), Td.z.a("topLoadingFinish", Ud.S.f(Td.z.a("registrationName", "onLoadingFinish"))), Td.z.a("topLoadingStart", Ud.S.f(Td.z.a("registrationName", "onLoadingStart"))), Td.z.a("topSelectionChange", Ud.S.f(Td.z.a("registrationName", "onSelectionChange"))), Td.z.a("topMessage", Ud.S.f(Td.z.a("registrationName", "onMessage"))), Td.z.a("topScrollBeginDrag", Ud.S.f(Td.z.a("registrationName", "onScrollBeginDrag"))), Td.z.a("topScrollEndDrag", Ud.S.f(Td.z.a("registrationName", "onScrollEndDrag"))), Td.z.a("topScroll", Ud.S.f(Td.z.a("registrationName", "onScroll"))), Td.z.a("topMomentumScrollBegin", Ud.S.f(Td.z.a("registrationName", "onMomentumScrollBegin"))), Td.z.a("topMomentumScrollEnd", Ud.S.f(Td.z.a("registrationName", "onMomentumScrollEnd"))));
        f37694d = Ud.S.l(Td.z.a("UIView", Ud.S.f(Td.z.a("ContentMode", Ud.S.l(Td.z.a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal())), Td.z.a("ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal())), Td.z.a("ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal())))))), Td.z.a("StyleConstants", Ud.S.f(Td.z.a("PointerEventsValues", Ud.S.l(Td.z.a("none", Integer.valueOf(C.f37388b.ordinal())), Td.z.a("boxNone", Integer.valueOf(C.f37389c.ordinal())), Td.z.a("boxOnly", Integer.valueOf(C.f37390d.ordinal())), Td.z.a("unspecified", Integer.valueOf(C.f37391e.ordinal())))))), Td.z.a("AccessibilityEventTypes", Ud.S.l(Td.z.a("typeWindowStateChanged", 32), Td.z.a("typeViewFocused", 8), Td.z.a("typeViewClicked", 1))));
    }

    private h0() {
    }
}
