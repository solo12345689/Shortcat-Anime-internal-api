package com.facebook.react.uimanager;

import L1.B;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.AbstractC2747a0;
import be.AbstractC3048a;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.AbstractC3250o;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class D extends R1.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f37394u = new c(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Map f37395v = Ud.S.l(Td.z.a("activate", Integer.valueOf(B.a.f11217i.b())), Td.z.a("longpress", Integer.valueOf(B.a.f11218j.b())), Td.z.a("increment", Integer.valueOf(B.a.f11225q.b())), Td.z.a("decrement", Integer.valueOf(B.a.f11226r.b())), Td.z.a("expand", Integer.valueOf(B.a.f11231w.b())), Td.z.a("collapse", Integer.valueOf(B.a.f11232x.b())));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f37396w = 1056964608;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f37397x = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f37398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f37399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap f37400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f37401t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends com.facebook.react.uimanager.events.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WritableMap f37402a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WritableMap accessibilityEventData, int i10, int i11) {
            super(i10, i11);
            AbstractC5504s.h(accessibilityEventData, "accessibilityEventData");
            this.f37402a = accessibilityEventData;
        }

        @Override // com.facebook.react.uimanager.events.d
        public WritableMap getEventData() {
            return this.f37402a;
        }

        @Override // com.facebook.react.uimanager.events.d
        public String getEventName() {
            return "topAccessibilityAction";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37415a;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        private static final /* synthetic */ b[] f37431n0;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f37433o0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f37416b = new b("NONE", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f37417c = new b("BUTTON", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f37418d = new b("DROPDOWNLIST", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f37419e = new b("TOGGLEBUTTON", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f37420f = new b("LINK", 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f37421g = new b("SEARCH", 5);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f37422h = new b("IMAGE", 6);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f37423i = new b("IMAGEBUTTON", 7);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f37424j = new b("KEYBOARDKEY", 8);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f37425k = new b("TEXT", 9);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f37426l = new b("ADJUSTABLE", 10);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f37428m = new b("SUMMARY", 11);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f37430n = new b("HEADER", 12);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f37432o = new b("ALERT", 13);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f37434p = new b("CHECKBOX", 14);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f37435q = new b("COMBOBOX", 15);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f37436r = new b("MENU", 16);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f37437s = new b("MENUBAR", 17);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f37438t = new b("MENUITEM", 18);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f37439u = new b("PROGRESSBAR", 19);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f37440v = new b("RADIO", 20);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f37441w = new b("RADIOGROUP", 21);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f37442x = new b("SCROLLBAR", 22);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f37443y = new b("SPINBUTTON", 23);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final b f37444z = new b("SWITCH", 24);

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final b f37403A = new b("TAB", 25);

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final b f37404B = new b("TABLIST", 26);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final b f37405C = new b("TIMER", 27);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final b f37406D = new b("LIST", 28);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final b f37407E = new b("GRID", 29);

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final b f37408F = new b("PAGER", 30);

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final b f37409G = new b("SCROLLVIEW", 31);

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final b f37410H = new b("HORIZONTALSCROLLVIEW", 32);

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final b f37411I = new b("VIEWGROUP", 33);

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final b f37412X = new b("WEBVIEW", 34);

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final b f37413Y = new b("DRAWERLAYOUT", 35);

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final b f37414Z = new b("SLIDINGDRAWER", 36);

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public static final b f37427l0 = new b("ICONMENU", 37);

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final b f37429m0 = new b("TOOLBAR", 38);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: com.facebook.react.uimanager.D$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public /* synthetic */ class C0623a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f37445a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ int[] f37446b;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.f37417c.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.f37418d.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.f37419e.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.f37421g.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.f37422h.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[b.f37423i.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[b.f37424j.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[b.f37425k.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[b.f37426l.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[b.f37434p.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[b.f37440v.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[b.f37443y.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[b.f37444z.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[b.f37406D.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[b.f37407E.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[b.f37409G.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[b.f37410H.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[b.f37408F.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[b.f37413Y.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[b.f37414Z.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[b.f37427l0.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[b.f37411I.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[b.f37412X.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[b.f37416b.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[b.f37420f.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[b.f37428m.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[b.f37430n.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[b.f37432o.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[b.f37435q.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[b.f37436r.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[b.f37437s.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[b.f37438t.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[b.f37439u.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[b.f37441w.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[b.f37442x.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[b.f37403A.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[b.f37404B.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[b.f37405C.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[b.f37429m0.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    f37445a = iArr;
                    int[] iArr2 = new int[d.values().length];
                    try {
                        iArr2[d.f37476b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr2[d.f37481g.ordinal()] = 2;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr2[d.f37483i.ordinal()] = 3;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr2[d.f37485k.ordinal()] = 4;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr2[d.f37504u.ordinal()] = 5;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr2[d.f37508w.ordinal()] = 6;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr2[d.f37510x.ordinal()] = 7;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr2[d.f37512y.ordinal()] = 8;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr2[d.f37514z.ordinal()] = 9;
                    } catch (NoSuchFieldError unused48) {
                    }
                    try {
                        iArr2[d.f37458F.ordinal()] = 10;
                    } catch (NoSuchFieldError unused49) {
                    }
                    try {
                        iArr2[d.f37460G.ordinal()] = 11;
                    } catch (NoSuchFieldError unused50) {
                    }
                    try {
                        iArr2[d.f37462H.ordinal()] = 12;
                    } catch (NoSuchFieldError unused51) {
                    }
                    try {
                        iArr2[d.f37473Y.ordinal()] = 13;
                    } catch (NoSuchFieldError unused52) {
                    }
                    try {
                        iArr2[d.f37491n0.ordinal()] = 14;
                    } catch (NoSuchFieldError unused53) {
                    }
                    try {
                        iArr2[d.f37493o0.ordinal()] = 15;
                    } catch (NoSuchFieldError unused54) {
                    }
                    try {
                        iArr2[d.f37495p0.ordinal()] = 16;
                    } catch (NoSuchFieldError unused55) {
                    }
                    try {
                        iArr2[d.f37505u0.ordinal()] = 17;
                    } catch (NoSuchFieldError unused56) {
                    }
                    try {
                        iArr2[d.f37507v0.ordinal()] = 18;
                    } catch (NoSuchFieldError unused57) {
                    }
                    try {
                        iArr2[d.f37511x0.ordinal()] = 19;
                    } catch (NoSuchFieldError unused58) {
                    }
                    try {
                        iArr2[d.f37513y0.ordinal()] = 20;
                    } catch (NoSuchFieldError unused59) {
                    }
                    try {
                        iArr2[d.f37449A0.ordinal()] = 21;
                    } catch (NoSuchFieldError unused60) {
                    }
                    try {
                        iArr2[d.f37451B0.ordinal()] = 22;
                    } catch (NoSuchFieldError unused61) {
                    }
                    try {
                        iArr2[d.f37453C0.ordinal()] = 23;
                    } catch (NoSuchFieldError unused62) {
                    }
                    try {
                        iArr2[d.f37457E0.ordinal()] = 24;
                    } catch (NoSuchFieldError unused63) {
                    }
                    try {
                        iArr2[d.f37463H0.ordinal()] = 25;
                    } catch (NoSuchFieldError unused64) {
                    }
                    try {
                        iArr2[d.f37465I0.ordinal()] = 26;
                    } catch (NoSuchFieldError unused65) {
                    }
                    f37446b = iArr2;
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(d role) {
                AbstractC5504s.h(role, "role");
                switch (C0623a.f37446b[role.ordinal()]) {
                    case 1:
                        return b.f37432o;
                    case 2:
                        return b.f37417c;
                    case 3:
                        return b.f37434p;
                    case 4:
                        return b.f37435q;
                    case 5:
                        return b.f37407E;
                    case 6:
                        return b.f37430n;
                    case 7:
                        return b.f37422h;
                    case 8:
                        return b.f37420f;
                    case 9:
                        return b.f37406D;
                    case 10:
                        return b.f37436r;
                    case 11:
                        return b.f37437s;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        return b.f37438t;
                    case 13:
                        return b.f37416b;
                    case 14:
                        return b.f37439u;
                    case 15:
                        return b.f37440v;
                    case 16:
                        return b.f37441w;
                    case 17:
                        return b.f37442x;
                    case 18:
                        return b.f37421g;
                    case 19:
                        return b.f37426l;
                    case 20:
                        return b.f37443y;
                    case 21:
                        return b.f37428m;
                    case 22:
                        return b.f37444z;
                    case 23:
                        return b.f37403A;
                    case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                        return b.f37404B;
                    case 25:
                        return b.f37405C;
                    case 26:
                        return b.f37429m0;
                    default:
                        return null;
                }
            }

            public final b b(String str) {
                if (str == null) {
                    return b.f37416b;
                }
                for (b bVar : b.c()) {
                    if (Df.r.B(bVar.name(), str, true)) {
                        return bVar;
                    }
                }
                throw new IllegalArgumentException("Invalid accessibility role value: " + str);
            }

            public final b c(View view) {
                AbstractC5504s.h(view, "view");
                d dVar = (d) view.getTag(AbstractC3247l.f36901B);
                return dVar != null ? a(dVar) : (b) view.getTag(AbstractC3247l.f36914h);
            }

            public final String d(b role) {
                AbstractC5504s.h(role, "role");
                switch (C0623a.f37445a[role.ordinal()]) {
                    case 1:
                        return "android.widget.Button";
                    case 2:
                        return "android.widget.Spinner";
                    case 3:
                        return "android.widget.ToggleButton";
                    case 4:
                        return "android.widget.EditText";
                    case 5:
                        return "android.widget.ImageView";
                    case 6:
                        return "android.widget.ImageButton";
                    case 7:
                        return "android.inputmethodservice.Keyboard$Key";
                    case 8:
                        return "android.widget.TextView";
                    case 9:
                        return "android.widget.SeekBar";
                    case 10:
                        return "android.widget.CheckBox";
                    case 11:
                        return "android.widget.RadioButton";
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        return "android.widget.SpinButton";
                    case 13:
                        return "android.widget.Switch";
                    case 14:
                        return "android.widget.AbsListView";
                    case 15:
                        return "android.widget.GridView";
                    case 16:
                        return "android.widget.ScrollView";
                    case 17:
                        return "android.widget.HorizontalScrollView";
                    case 18:
                        return "androidx.viewpager.widget.ViewPager";
                    case 19:
                        return "androidx.drawerlayout.widget.DrawerLayout";
                    case 20:
                        return "android.widget.SlidingDrawer";
                    case 21:
                        return "com.android.internal.view.menu.IconMenuView";
                    case 22:
                        return "android.view.ViewGroup";
                    case 23:
                        return "android.webkit.WebView";
                    case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                        return "android.view.View";
                    default:
                        throw new Td.r();
                }
            }

            private a() {
            }
        }

        static {
            b[] bVarArrA = a();
            f37431n0 = bVarArrA;
            f37433o0 = AbstractC3048a.a(bVarArrA);
            f37415a = new a(null);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f37416b, f37417c, f37418d, f37419e, f37420f, f37421g, f37422h, f37423i, f37424j, f37425k, f37426l, f37428m, f37430n, f37432o, f37434p, f37435q, f37436r, f37437s, f37438t, f37439u, f37440v, f37441w, f37442x, f37443y, f37444z, f37403A, f37404B, f37405C, f37406D, f37407E, f37408F, f37409G, f37410H, f37411I, f37412X, f37413Y, f37414Z, f37427l0, f37429m0};
        }

        public static final b b(String str) {
            return f37415a.b(str);
        }

        public static EnumEntries c() {
            return f37433o0;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f37431n0.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f37447a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.f37420f.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.f37422h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.f37423i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.f37417c.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.f37419e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b.f37428m.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[b.f37430n.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[b.f37432o.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[b.f37435q.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[b.f37436r.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[b.f37437s.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[b.f37438t.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[b.f37439u.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[b.f37441w.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[b.f37442x.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[b.f37443y.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[b.f37403A.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[b.f37404B.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[b.f37405C.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[b.f37429m0.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                f37447a = iArr;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean e(L1.B b10) {
            if (b10 == null) {
                return false;
            }
            CharSequence charSequenceI = b10.I();
            return !(charSequenceI == null || charSequenceI.length() == 0) || b10.S() || g(b10);
        }

        private final String k(StringBuilder sb2) {
            int length = sb2.length();
            if (length > 0) {
                sb2.delete(length - 2, length);
            }
            String string = sb2.toString();
            AbstractC5504s.g(string, "toString(...)");
            return string;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(L1.B b10, ReadableMap readableMap) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic = readableMap.getDynamic(strNextKey);
                if (AbstractC5504s.c(strNextKey, "selected") && dynamic.getType() == ReadableType.Boolean) {
                    b10.d1(dynamic.asBoolean());
                } else if (AbstractC5504s.c(strNextKey, "disabled") && dynamic.getType() == ReadableType.Boolean) {
                    b10.H0(!dynamic.asBoolean());
                } else if (AbstractC5504s.c(strNextKey, "checked") && dynamic.getType() == ReadableType.Boolean) {
                    boolean zAsBoolean = dynamic.asBoolean();
                    b10.x0(true);
                    b10.y0(zAsBoolean);
                }
            }
        }

        public final L1.B b(View view) {
            if (view == null) {
                return null;
            }
            L1.B bK0 = L1.B.k0();
            try {
                AbstractC2747a0.X(view, bK0);
                return bK0;
            } catch (NullPointerException unused) {
                return null;
            }
        }

        public final CharSequence c(View view, L1.B b10) {
            AbstractC5504s.h(view, "view");
            L1.B b11 = b10 == null ? b(view) : L1.B.l0(b10);
            if (b11 == null) {
                return null;
            }
            CharSequence charSequenceW = b11.w();
            CharSequence charSequenceK = b11.K();
            boolean z10 = charSequenceK == null || charSequenceK.length() == 0;
            boolean z11 = view instanceof EditText;
            StringBuilder sb2 = new StringBuilder();
            if (charSequenceW != null && charSequenceW.length() != 0 && (!z11 || z10)) {
                sb2.append(charSequenceW);
                return sb2;
            }
            if (!z10) {
                sb2.append(charSequenceK);
                return sb2;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                L1.B bK0 = L1.B.k0();
                AbstractC2747a0.X(childAt, bK0);
                if (j(bK0, childAt) && !h(bK0, childAt)) {
                    AbstractC5504s.e(childAt);
                    CharSequence charSequenceC = c(childAt, null);
                    if (charSequenceC != null && charSequenceC.length() != 0) {
                        sb3.append(((Object) charSequenceC) + ", ");
                    }
                }
            }
            return k(sb3);
        }

        public final boolean d(L1.B b10, View view) {
            if (b10 != null && view != null && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt != null) {
                        L1.B bK0 = L1.B.k0();
                        AbstractC2747a0.X(childAt, bK0);
                        if (bK0.j0() && !h(bK0, childAt) && j(bK0, childAt)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public final boolean f(L1.B b10) {
            if (b10 == null || b10.u() != null) {
                return false;
            }
            CharSequence charSequenceK = b10.K();
            if (charSequenceK != null && charSequenceK.length() != 0) {
                return true;
            }
            CharSequence charSequenceW = b10.w();
            if (charSequenceW != null && charSequenceW.length() != 0) {
                return true;
            }
            CharSequence charSequenceB = b10.B();
            return (charSequenceB == null || charSequenceB.length() == 0) ? false : true;
        }

        public final boolean g(L1.B b10) {
            B.h hVarG;
            if (b10 == null || (hVarG = b10.G()) == null) {
                return false;
            }
            float fB = hVarG.b();
            float fC = hVarG.c();
            float fA = hVarG.a();
            return fB - fC > 0.0f && fA >= fC && fA <= fB;
        }

        public final boolean h(L1.B b10, View view) {
            if (b10 == null || view == null || !b10.j0()) {
                return false;
            }
            return b10.e0() || i(b10);
        }

        public final boolean i(L1.B b10) {
            if (b10 == null) {
                return false;
            }
            if (b10.U() || b10.c0() || b10.Y()) {
                return true;
            }
            List<B.a> listI = b10.i();
            AbstractC5504s.g(listI, "getActionList(...)");
            if (listI != null && listI.isEmpty()) {
                return false;
            }
            for (B.a aVar : listI) {
                if (AbstractC5504s.c(aVar, B.a.f11217i) || AbstractC5504s.c(aVar, B.a.f11218j) || AbstractC5504s.c(aVar, B.a.f11213e)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean j(L1.B b10, View view) {
            int iW;
            if (b10 == null || view == null || (iW = AbstractC2747a0.w(view)) == 4 || (iW == 2 && b10.r() <= 0)) {
                return false;
            }
            return f(b10) || e(b10) || b10.S() || d(b10, view);
        }

        public final void l(View view, boolean z10, int i10) {
            AbstractC5504s.h(view, "view");
            if (AbstractC2747a0.M(view)) {
                return;
            }
            if (view.getTag(AbstractC3247l.f36914h) == null && view.getTag(AbstractC3247l.f36915i) == null && view.getTag(AbstractC3247l.f36907a) == null && view.getTag(AbstractC3247l.f36928v) == null && view.getTag(AbstractC3247l.f36909c) == null && view.getTag(AbstractC3247l.f36912f) == null && view.getTag(AbstractC3247l.f36901B) == null) {
                return;
            }
            AbstractC2747a0.k0(view, new D(view, z10, i10));
        }

        public final void m(L1.B nodeInfo, b bVar, Context context) {
            AbstractC5504s.h(nodeInfo, "nodeInfo");
            AbstractC5504s.h(context, "context");
            if (bVar == null) {
                bVar = b.f37416b;
            }
            nodeInfo.z0(b.f37415a.d(bVar));
            switch (a.f37447a[bVar.ordinal()]) {
                case 1:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37108F));
                    break;
                case 2:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37106D));
                    break;
                case 3:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37107E));
                    nodeInfo.A0(true);
                    break;
                case 4:
                    nodeInfo.A0(true);
                    break;
                case 5:
                    nodeInfo.A0(true);
                    nodeInfo.x0(true);
                    break;
                case 6:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37121S));
                    break;
                case 7:
                    nodeInfo.L0(true);
                    break;
                case 8:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37125a));
                    break;
                case 9:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37105C));
                    break;
                case 10:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37109G));
                    break;
                case 11:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37110H));
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37111I));
                    break;
                case 13:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37112J));
                    break;
                case 14:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37113K));
                    break;
                case 15:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37116N));
                    break;
                case 16:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37117O));
                    break;
                case 17:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37115M));
                    break;
                case 18:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37122T));
                    break;
                case 19:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37123U));
                    break;
                case 20:
                    nodeInfo.a1(context.getString(AbstractC3250o.f37124V));
                    break;
            }
        }

        private c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: N0, reason: collision with root package name */
        private static final /* synthetic */ d[] f37470N0;

        /* JADX INFO: renamed from: O0, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f37471O0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f37476b = new d("ALERT", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f37477c = new d("ALERTDIALOG", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f37478d = new d("APPLICATION", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f37479e = new d("ARTICLE", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f37480f = new d("BANNER", 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f37481g = new d("BUTTON", 5);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f37482h = new d("CELL", 6);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f37483i = new d("CHECKBOX", 7);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f37484j = new d("COLUMNHEADER", 8);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final d f37485k = new d("COMBOBOX", 9);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final d f37486l = new d("COMPLEMENTARY", 10);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final d f37488m = new d("CONTENTINFO", 11);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final d f37490n = new d("DEFINITION", 12);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final d f37492o = new d("DIALOG", 13);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final d f37494p = new d("DIRECTORY", 14);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final d f37496q = new d("DOCUMENT", 15);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final d f37498r = new d("FEED", 16);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final d f37500s = new d("FIGURE", 17);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final d f37502t = new d("FORM", 18);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final d f37504u = new d("GRID", 19);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final d f37506v = new d("GROUP", 20);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final d f37508w = new d("HEADING", 21);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final d f37510x = new d("IMG", 22);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final d f37512y = new d("LINK", 23);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final d f37514z = new d("LIST", 24);

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final d f37448A = new d("LISTITEM", 25);

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final d f37450B = new d("LOG", 26);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final d f37452C = new d("MAIN", 27);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final d f37454D = new d("MARQUEE", 28);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final d f37456E = new d("MATH", 29);

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final d f37458F = new d("MENU", 30);

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final d f37460G = new d("MENUBAR", 31);

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final d f37462H = new d("MENUITEM", 32);

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final d f37464I = new d("METER", 33);

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final d f37472X = new d("NAVIGATION", 34);

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final d f37473Y = new d("NONE", 35);

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final d f37474Z = new d("NOTE", 36);

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public static final d f37487l0 = new d("OPTION", 37);

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final d f37489m0 = new d("PRESENTATION", 38);

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public static final d f37491n0 = new d("PROGRESSBAR", 39);

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public static final d f37493o0 = new d("RADIO", 40);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f37495p0 = new d("RADIOGROUP", 41);

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final d f37497q0 = new d("REGION", 42);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final d f37499r0 = new d("ROW", 43);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final d f37501s0 = new d("ROWGROUP", 44);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final d f37503t0 = new d("ROWHEADER", 45);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final d f37505u0 = new d("SCROLLBAR", 46);

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public static final d f37507v0 = new d("SEARCHBOX", 47);

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final d f37509w0 = new d("SEPARATOR", 48);

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final d f37511x0 = new d("SLIDER", 49);

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final d f37513y0 = new d("SPINBUTTON", 50);

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final d f37515z0 = new d("STATUS", 51);

        /* JADX INFO: renamed from: A0, reason: collision with root package name */
        public static final d f37449A0 = new d("SUMMARY", 52);

        /* JADX INFO: renamed from: B0, reason: collision with root package name */
        public static final d f37451B0 = new d("SWITCH", 53);

        /* JADX INFO: renamed from: C0, reason: collision with root package name */
        public static final d f37453C0 = new d("TAB", 54);

        /* JADX INFO: renamed from: D0, reason: collision with root package name */
        public static final d f37455D0 = new d("TABLE", 55);

        /* JADX INFO: renamed from: E0, reason: collision with root package name */
        public static final d f37457E0 = new d("TABLIST", 56);

        /* JADX INFO: renamed from: F0, reason: collision with root package name */
        public static final d f37459F0 = new d("TABPANEL", 57);

        /* JADX INFO: renamed from: G0, reason: collision with root package name */
        public static final d f37461G0 = new d("TERM", 58);

        /* JADX INFO: renamed from: H0, reason: collision with root package name */
        public static final d f37463H0 = new d("TIMER", 59);

        /* JADX INFO: renamed from: I0, reason: collision with root package name */
        public static final d f37465I0 = new d("TOOLBAR", 60);

        /* JADX INFO: renamed from: J0, reason: collision with root package name */
        public static final d f37466J0 = new d("TOOLTIP", 61);

        /* JADX INFO: renamed from: K0, reason: collision with root package name */
        public static final d f37467K0 = new d("TREE", 62);

        /* JADX INFO: renamed from: L0, reason: collision with root package name */
        public static final d f37468L0 = new d("TREEGRID", 63);

        /* JADX INFO: renamed from: M0, reason: collision with root package name */
        public static final d f37469M0 = new d("TREEITEM", 64);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                for (d dVar : d.c()) {
                    if (Df.r.B(dVar.name(), str, true)) {
                        return dVar;
                    }
                }
                return null;
            }

            private a() {
            }
        }

        static {
            d[] dVarArrA = a();
            f37470N0 = dVarArrA;
            f37471O0 = AbstractC3048a.a(dVarArrA);
            f37475a = new a(null);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f37476b, f37477c, f37478d, f37479e, f37480f, f37481g, f37482h, f37483i, f37484j, f37485k, f37486l, f37488m, f37490n, f37492o, f37494p, f37496q, f37498r, f37500s, f37502t, f37504u, f37506v, f37508w, f37510x, f37512y, f37514z, f37448A, f37450B, f37452C, f37454D, f37456E, f37458F, f37460G, f37462H, f37464I, f37472X, f37473Y, f37474Z, f37487l0, f37489m0, f37491n0, f37493o0, f37495p0, f37497q0, f37499r0, f37501s0, f37503t0, f37505u0, f37507v0, f37509w0, f37511x0, f37513y0, f37515z0, f37449A0, f37451B0, f37453C0, f37455D0, f37457E0, f37459F0, f37461G0, f37463H0, f37465I0, f37466J0, f37467K0, f37468L0, f37469M0};
        }

        public static final d b(String str) {
            return f37475a.a(str);
        }

        public static EnumEntries c() {
            return f37471O0;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f37470N0.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends Handler {
        e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            AbstractC5504s.h(msg, "msg");
            View view = (View) msg.obj;
            if (view != null) {
                view.sendAccessibilityEvent(4);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(View hostView, boolean z10, int i10) {
        super(hostView);
        AbstractC5504s.h(hostView, "hostView");
        this.f37398q = hostView;
        this.f37399r = new e();
        this.f37400s = new HashMap();
        hostView.setFocusable(z10);
        hostView.setImportantForAccessibility(i10);
    }

    private final void X(View view) {
        if (this.f37399r.hasMessages(1, view)) {
            this.f37399r.removeMessages(1, view);
        }
        Message messageObtainMessage = this.f37399r.obtainMessage(1, view);
        AbstractC5504s.g(messageObtainMessage, "obtainMessage(...)");
        this.f37399r.sendMessageDelayed(messageObtainMessage, 200L);
    }

    public static final void Y(View view, boolean z10, int i10) {
        f37394u.l(view, z10, i10);
    }

    @Override // R1.a
    protected int B(float f10, float f11) {
        return Integer.MIN_VALUE;
    }

    @Override // R1.a
    protected void C(List virtualViewIds) {
        AbstractC5504s.h(virtualViewIds, "virtualViewIds");
    }

    @Override // R1.a
    protected boolean J(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // R1.a
    protected void N(int i10, L1.B node) {
        AbstractC5504s.h(node, "node");
        node.D0("");
        node.v0(new Rect(0, 0, 1, 1));
    }

    protected final View W() {
        return this.f37398q;
    }

    protected final L1.C Z(View host) {
        AbstractC5504s.h(host, "host");
        return super.b(host);
    }

    @Override // R1.a, androidx.core.view.C2746a
    public L1.C b(View host) {
        AbstractC5504s.h(host, "host");
        return null;
    }

    @Override // R1.a, androidx.core.view.C2746a
    public void f(View host, AccessibilityEvent event) {
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(event, "event");
        super.f(host, event);
        ReadableMap readableMap = (ReadableMap) host.getTag(AbstractC3247l.f36917k);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            ReadableType type = dynamic.getType();
            ReadableType readableType = ReadableType.Number;
            if (type == readableType && dynamic2.getType() == readableType && dynamic3.getType() == readableType) {
                int iAsInt = dynamic.asInt();
                int iAsInt2 = dynamic2.asInt();
                int iAsInt3 = dynamic3.asInt();
                if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                    return;
                }
                event.setItemCount(iAsInt3 - iAsInt);
                event.setCurrentItemIndex(iAsInt2);
            }
        }
    }

    @Override // R1.a, androidx.core.view.C2746a
    public void g(View host, L1.B info) {
        int iIntValue;
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(info, "info");
        super.g(host, info);
        if (host.getTag(AbstractC3247l.f36916j) != null) {
            Object tag = host.getTag(AbstractC3247l.f36916j);
            AbstractC5504s.f(tag, "null cannot be cast to non-null type kotlin.Boolean");
            info.a(((Boolean) tag).booleanValue() ? 524288 : 262144);
        }
        b bVarC = b.f37415a.c(host);
        String str = (String) host.getTag(AbstractC3247l.f36910d);
        if (bVarC != null) {
            c cVar = f37394u;
            Context context = host.getContext();
            AbstractC5504s.g(context, "getContext(...)");
            cVar.m(info, bVarC, context);
        }
        if (str != null) {
            info.k1(str);
        }
        Object tag2 = host.getTag(AbstractC3247l.f36924r);
        if (tag2 != null) {
            View rootView = host.getRootView();
            AbstractC5504s.g(rootView, "getRootView(...)");
            View viewA = I7.a.a(rootView, (String) tag2);
            this.f37401t = viewA;
            if (viewA != null) {
                info.P0(viewA);
            }
        }
        ReadableMap readableMap = (ReadableMap) host.getTag(AbstractC3247l.f36915i);
        if (readableMap != null) {
            f37394u.n(info, readableMap);
        }
        ReadableArray readableArray = (ReadableArray) host.getTag(AbstractC3247l.f36907a);
        ReadableMap readableMap2 = (ReadableMap) host.getTag(AbstractC3247l.f36909c);
        if (readableMap2 != null) {
            info.C0(B.g.a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (map == null || !map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                String string = map.getString("name");
                String str2 = map.hasKey("label") ? (String) Q6.a.c(map.getString("label")) : "";
                Integer num = (Integer) f37395v.get(string);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    Map map2 = f37397x;
                    Object objValueOf = map2.get(string);
                    if (objValueOf == null) {
                        int i11 = f37396w;
                        f37396w = i11 + 1;
                        objValueOf = Integer.valueOf(i11);
                        map2.put(string, objValueOf);
                    }
                    iIntValue = ((Number) objValueOf).intValue();
                }
                this.f37400s.put(Integer.valueOf(iIntValue), string);
                info.b(new B.a(iIntValue, str2));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) host.getTag(AbstractC3247l.f36917k);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            ReadableType type = dynamic.getType();
            ReadableType readableType = ReadableType.Number;
            if (type == readableType && dynamic2.getType() == readableType && dynamic3.getType() == readableType) {
                int iAsInt = dynamic.asInt();
                int iAsInt2 = dynamic2.asInt();
                int iAsInt3 = dynamic3.asInt();
                if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                    info.Z0(B.h.d(0, iAsInt, iAsInt3, iAsInt2));
                }
            }
        }
        String str3 = (String) host.getTag(AbstractC3247l.f36928v);
        if (str3 != null) {
            info.p1(str3);
        }
        CharSequence charSequenceW = info.w();
        boolean z10 = charSequenceW == null || charSequenceW.length() == 0;
        CharSequence charSequenceK = info.K();
        boolean z11 = z10 && (charSequenceK == null || charSequenceK.length() == 0);
        boolean z12 = (readableArray == null && readableMap == null && tag2 == null && bVarC == null) ? false : true;
        if (z11 && z12) {
            info.D0(f37394u.c(host, info));
        }
    }

    @Override // androidx.core.view.C2746a
    public boolean j(View host, int i10, Bundle bundle) {
        AbstractC5504s.h(host, "host");
        if (i10 == 524288) {
            host.setTag(AbstractC3247l.f36916j, Boolean.FALSE);
        }
        if (i10 == 262144) {
            host.setTag(AbstractC3247l.f36916j, Boolean.TRUE);
        }
        if (!this.f37400s.containsKey(Integer.valueOf(i10))) {
            return super.j(host, i10, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", (String) this.f37400s.get(Integer.valueOf(i10)));
        Context context = host.getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        if (reactContext.hasActiveReactInstance()) {
            int id2 = host.getId();
            int iE = f0.e(reactContext);
            UIManager uIManagerG = f0.g(reactContext, C7.a.a(id2));
            if (uIManagerG != null) {
                uIManagerG.getEventDispatcher().d(new a(writableMapCreateMap, iE, id2));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        Object tag = host.getTag(AbstractC3247l.f36914h);
        AbstractC5504s.f(tag, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactAccessibilityDelegate.AccessibilityRole");
        b bVar = (b) tag;
        ReadableMap readableMap = (ReadableMap) host.getTag(AbstractC3247l.f36917k);
        if (bVar != b.f37426l) {
            return true;
        }
        if (i10 != B.a.f11225q.b() && i10 != B.a.f11226r.b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            X(host);
        }
        return super.j(host, i10, bundle);
    }
}
