package y;

import C.InterfaceC1138i;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.s;
import androidx.compose.ui.window.t;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: renamed from: y.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7189k {

    /* JADX INFO: renamed from: a */
    private static final t f64650a = new t(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: b */
    private static final C7180b f64651b;

    /* JADX INFO: renamed from: y.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7180b f64652a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f64653b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5096o f64654c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f64655d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f64656e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7180b c7180b, androidx.compose.ui.e eVar, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.f64652a = c7180b;
            this.f64653b = eVar;
            this.f64654c = interfaceC5096o;
            this.f64655d = i10;
            this.f64656e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC7189k.a(this.f64652a, this.f64653b, this.f64654c, interfaceC2425m, AbstractC2409g1.a(this.f64655d | 1), this.f64656e);
        }
    }

    /* JADX INFO: renamed from: y.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f64657a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f64658b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, InterfaceC5082a interfaceC5082a) {
            super(0);
            this.f64657a = z10;
            this.f64658b = interfaceC5082a;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m978invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m978invoke() {
            if (this.f64657a) {
                this.f64658b.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: y.k$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f64659a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f64660b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C7180b f64661c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ androidx.compose.ui.e f64662d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5096o f64663e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC5082a f64664f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f64665g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f64666h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, boolean z10, C7180b c7180b, androidx.compose.ui.e eVar, InterfaceC5096o interfaceC5096o, InterfaceC5082a interfaceC5082a, int i10, int i11) {
            super(2);
            this.f64659a = str;
            this.f64660b = z10;
            this.f64661c = c7180b;
            this.f64662d = eVar;
            this.f64663e = interfaceC5096o;
            this.f64664f = interfaceC5082a;
            this.f64665g = i10;
            this.f64666h = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC7189k.b(this.f64659a, this.f64660b, this.f64661c, this.f64662d, this.f64663e, this.f64664f, interfaceC2425m, AbstractC2409g1.a(this.f64665g | 1), this.f64666h);
        }
    }

    /* JADX INFO: renamed from: y.k$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ s f64667a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f64668b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.ui.e f64669c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function1 f64670d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f64671e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f64672f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s sVar, InterfaceC5082a interfaceC5082a, androidx.compose.ui.e eVar, Function1 function1, int i10, int i11) {
            super(2);
            this.f64667a = sVar;
            this.f64668b = interfaceC5082a;
            this.f64669c = eVar;
            this.f64670d = function1;
            this.f64671e = i10;
            this.f64672f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC7189k.c(this.f64667a, this.f64668b, this.f64669c, this.f64670d, interfaceC2425m, AbstractC2409g1.a(this.f64671e | 1), this.f64672f);
        }
    }

    /* JADX INFO: renamed from: y.k$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7180b f64673a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f64674b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function1 f64675c;

        /* JADX INFO: renamed from: y.k$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5096o {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Function1 f64676a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C7180b f64677b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1, C7180b c7180b) {
                super(3);
                this.f64676a = function1;
                this.f64677b = c7180b;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((InterfaceC1138i) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
                return L.f17438a;
            }

            public final void invoke(InterfaceC1138i interfaceC1138i, InterfaceC2425m interfaceC2425m, int i10) {
                if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(1156688164, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)");
                }
                Object objD = interfaceC2425m.D();
                if (objD == InterfaceC2425m.f22370a.a()) {
                    objD = new C7185g();
                    interfaceC2425m.u(objD);
                }
                C7185g c7185g = (C7185g) objD;
                Function1 function1 = this.f64676a;
                C7180b c7180b = this.f64677b;
                c7185g.b();
                function1.invoke(c7185g);
                c7185g.a(c7180b, interfaceC2425m, 0);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C7180b c7180b, androidx.compose.ui.e eVar, Function1 function1) {
            super(2);
            this.f64673a = c7180b;
            this.f64674b = eVar;
            this.f64675c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(795909757, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)");
            }
            C7180b c7180b = this.f64673a;
            AbstractC7189k.a(c7180b, this.f64674b, g0.i.d(1156688164, true, new a(this.f64675c, c7180b), interfaceC2425m, 54), interfaceC2425m, 384, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: y.k$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ s f64678a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f64679b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.ui.e f64680c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C7180b f64681d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Function1 f64682e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f64683f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f64684g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(s sVar, InterfaceC5082a interfaceC5082a, androidx.compose.ui.e eVar, C7180b c7180b, Function1 function1, int i10, int i11) {
            super(2);
            this.f64678a = sVar;
            this.f64679b = interfaceC5082a;
            this.f64680c = eVar;
            this.f64681d = c7180b;
            this.f64682e = function1;
            this.f64683f = i10;
            this.f64684g = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC7189k.d(this.f64678a, this.f64679b, this.f64680c, this.f64681d, this.f64682e, interfaceC2425m, AbstractC2409g1.a(this.f64683f | 1), this.f64684g);
        }
    }

    static {
        C6385r0.a aVar = C6385r0.f58985b;
        f64651b = new C7180b(aVar.k(), aVar.a(), aVar.a(), C6385r0.q(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), C6385r0.q(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(y.C7180b r23, androidx.compose.ui.e r24, ie.InterfaceC5096o r25, Y.InterfaceC2425m r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.AbstractC7189k.a(y.b, androidx.compose.ui.e, ie.o, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r22, boolean r23, y.C7180b r24, androidx.compose.ui.e r25, ie.InterfaceC5096o r26, ie.InterfaceC5082a r27, Y.InterfaceC2425m r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.AbstractC7189k.b(java.lang.String, boolean, y.b, androidx.compose.ui.e, ie.o, ie.a, Y.m, int, int):void");
    }

    public static final void c(s sVar, InterfaceC5082a interfaceC5082a, androidx.compose.ui.e eVar, Function1 function1, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        s sVar2;
        InterfaceC5082a interfaceC5082a2;
        Function1 function12;
        androidx.compose.ui.e eVar2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(712057293);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(sVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.F(interfaceC5082a) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.U(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC2425mG.F(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            function12 = function1;
            eVar2 = eVar;
            interfaceC5082a2 = interfaceC5082a;
            sVar2 = sVar;
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            androidx.compose.ui.e eVar3 = eVar;
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(712057293, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            d(sVar, interfaceC5082a, eVar3, e(0, 0, interfaceC2425mG, 0, 3), function1, interfaceC2425mG, (i12 & 1022) | ((i12 << 3) & 57344), 0);
            sVar2 = sVar;
            interfaceC5082a2 = interfaceC5082a;
            function12 = function1;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            eVar2 = eVar3;
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new d(sVar2, interfaceC5082a2, eVar2, function12, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.window.s r14, ie.InterfaceC5082a r15, androidx.compose.ui.e r16, y.C7180b r17, kotlin.jvm.functions.Function1 r18, Y.InterfaceC2425m r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.AbstractC7189k.d(androidx.compose.ui.window.s, ie.a, androidx.compose.ui.e, y.b, kotlin.jvm.functions.Function1, Y.m, int, int):void");
    }

    public static final C7180b e(int i10, int i11, InterfaceC2425m interfaceC2425m, int i12, int i13) {
        int i14 = (i13 & 1) != 0 ? R.style.Widget.PopupMenu : i10;
        int i15 = (i13 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i11;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1689505294, i12, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)");
        }
        Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        boolean zU = interfaceC2425m.U((Configuration) interfaceC2425m.n(AndroidCompositionLocals_androidKt.f())) | interfaceC2425m.U(context);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            C7180b c7180b = f64651b;
            long jH = h(context, i14, R.attr.colorBackground, c7180b.a());
            ColorStateList colorStateListI = i(context, i15, R.attr.textColorPrimary);
            long jG = g(colorStateListI, c7180b.e());
            long jF = f(colorStateListI, c7180b.c());
            Object c7180b2 = new C7180b(jH, jG, jG, jF, jF, null);
            interfaceC2425m.u(c7180b2);
            objD = c7180b2;
        }
        C7180b c7180b3 = (C7180b) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c7180b3;
    }

    private static final long f(ColorStateList colorStateList, long j10) {
        int iK = AbstractC6387s0.k(j10);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iK)) : null;
        return (numValueOf == null || numValueOf.intValue() == iK) ? j10 : AbstractC6387s0.b(numValueOf.intValue());
    }

    private static final long g(ColorStateList colorStateList, long j10) {
        int iK = AbstractC6387s0.k(j10);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iK)) : null;
        return (numValueOf == null || numValueOf.intValue() == iK) ? j10 : AbstractC6387s0.b(numValueOf.intValue());
    }

    private static final long h(Context context, int i10, int i11, long j10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        int iK = AbstractC6387s0.k(j10);
        int color = typedArrayObtainStyledAttributes.getColor(0, iK);
        typedArrayObtainStyledAttributes.recycle();
        return color == iK ? j10 : AbstractC6387s0.b(color);
    }

    private static final ColorStateList i(Context context, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }
}
