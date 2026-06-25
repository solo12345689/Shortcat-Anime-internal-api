package com.facebook.react.views.textinput;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.C2658l;
import androidx.core.view.AbstractC2747a0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import h7.C4914b;
import h7.C4921i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3320j extends C2658l {

    /* JADX INFO: renamed from: r0 */
    public static final a f38412r0 = new a(null);

    /* JADX INFO: renamed from: s0 */
    private static final boolean f38413s0;

    /* JADX INFO: renamed from: t0 */
    private static final KeyListener f38414t0;

    /* JADX INFO: renamed from: A */
    private String f38415A;

    /* JADX INFO: renamed from: B */
    private int f38416B;

    /* JADX INFO: renamed from: C */
    private int f38417C;

    /* JADX INFO: renamed from: D */
    private boolean f38418D;

    /* JADX INFO: renamed from: E */
    private boolean f38419E;

    /* JADX INFO: renamed from: F */
    private boolean f38420F;

    /* JADX INFO: renamed from: G */
    private boolean f38421G;

    /* JADX INFO: renamed from: H */
    private String f38422H;

    /* JADX INFO: renamed from: I */
    private H7.v f38423I;

    /* JADX INFO: renamed from: g */
    private final InputMethodManager f38424g;

    /* JADX INFO: renamed from: h */
    private final String f38425h;

    /* JADX INFO: renamed from: i */
    private boolean f38426i;

    /* JADX INFO: renamed from: j */
    private final int f38427j;

    /* JADX INFO: renamed from: k */
    private final int f38428k;

    /* JADX INFO: renamed from: l */
    private int f38429l;

    /* JADX INFO: renamed from: l0 */
    private InterfaceC3282a0 f38430l0;

    /* JADX INFO: renamed from: m */
    private CopyOnWriteArrayList f38431m;

    /* JADX INFO: renamed from: m0 */
    private boolean f38432m0;

    /* JADX INFO: renamed from: n */
    private int f38433n;

    /* JADX INFO: renamed from: n0 */
    private boolean f38434n0;

    /* JADX INFO: renamed from: o */
    private boolean f38435o;

    /* JADX INFO: renamed from: o0 */
    private EventDispatcher f38436o0;

    /* JADX INFO: renamed from: p */
    private String f38437p;

    /* JADX INFO: renamed from: p0 */
    private c f38438p0;

    /* JADX INFO: renamed from: q */
    private List f38439q;

    /* JADX INFO: renamed from: q0 */
    private String f38440q0;

    /* JADX INFO: renamed from: r */
    private boolean f38441r;

    /* JADX INFO: renamed from: s */
    private L f38442s;

    /* JADX INFO: renamed from: t */
    private InterfaceC3311a f38443t;

    /* JADX INFO: renamed from: u */
    private K f38444u;

    /* JADX INFO: renamed from: v */
    private b f38445v;

    /* JADX INFO: renamed from: w */
    private boolean f38446w;

    /* JADX INFO: renamed from: x */
    private boolean f38447x;

    /* JADX INFO: renamed from: y */
    private final com.facebook.react.views.text.r f38448y;

    /* JADX INFO: renamed from: z */
    private boolean f38449z;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean c(Editable editable, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            if (i10 > spannableStringBuilder.length() || i11 > spannableStringBuilder.length()) {
                return false;
            }
            while (i10 < i11) {
                if (editable.charAt(i10) != spannableStringBuilder.charAt(i10)) {
                    return false;
                }
                i10++;
            }
            return true;
        }

        public final boolean b() {
            return C3320j.f38413s0;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements KeyListener {

        /* JADX INFO: renamed from: a */
        private int f38450a;

        public final void a(int i10) {
            this.f38450a = i10;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable content, int i10) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(content, "content");
            C3320j.f38414t0.clearMetaKeyState(view, content, i10);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f38450a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable text, int i10, KeyEvent event) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(text, "text");
            AbstractC5504s.h(event, "event");
            return C3320j.f38414t0.onKeyDown(view, text, i10, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable text, KeyEvent event) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(text, "text");
            AbstractC5504s.h(event, "event");
            return C3320j.f38414t0.onKeyOther(view, text, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable text, int i10, KeyEvent event) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(text, "text");
            AbstractC5504s.h(event, "event");
            return C3320j.f38414t0.onKeyUp(view, text, i10, event);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            AbstractC5504s.h(s10, "s");
            if (C3320j.this.E() || (copyOnWriteArrayList = C3320j.this.f38431m) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(s10);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            AbstractC5504s.h(s10, "s");
            if (C3320j.this.E() || (copyOnWriteArrayList = C3320j.this.f38431m) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(s10, i10, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            AbstractC5504s.h(s10, "s");
            if (C3320j.f38412r0.b()) {
                AbstractC7283a.m(C3320j.this.f38425h, "onTextChanged[" + C3320j.this.getId() + "]: " + ((Object) s10) + " " + i10 + " " + i11 + " " + i12);
            }
            if (!C3320j.this.E() && (copyOnWriteArrayList = C3320j.this.f38431m) != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(s10, i10, i11, i12);
                }
            }
            C3320j.this.d0();
            C3320j.this.M();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements ActionMode.Callback {
        d() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            AbstractC5504s.h(mode, "mode");
            AbstractC5504s.h(item, "item");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            AbstractC5504s.h(mode, "mode");
            AbstractC5504s.h(menu, "menu");
            if (C3320j.this.f38419E) {
                return false;
            }
            menu.removeItem(R.id.pasteAsPlainText);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            AbstractC5504s.h(mode, "mode");
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            AbstractC5504s.h(mode, "mode");
            AbstractC5504s.h(menu, "menu");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends com.facebook.react.uimanager.D {
        e(boolean z10, int i10) {
            super(C3320j.this, z10, i10);
        }

        @Override // com.facebook.react.uimanager.D, androidx.core.view.C2746a
        public boolean j(View host, int i10, Bundle bundle) {
            AbstractC5504s.h(host, "host");
            if (i10 != 16) {
                return super.j(host, i10, bundle);
            }
            Editable text = C3320j.this.getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int length = text.length();
            if (length > 0) {
                C3320j.this.setSelection(length);
            }
            return C3320j.this.O();
        }
    }

    static {
        Y6.a aVar = Y6.a.f22859a;
        f38413s0 = false;
        QwertyKeyListener instanceForFullKeyboard = QwertyKeyListener.getInstanceForFullKeyboard();
        AbstractC5504s.g(instanceForFullKeyboard, "getInstanceForFullKeyboard(...)");
        f38414t0 = instanceForFullKeyboard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3320j(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        String simpleName = C3320j.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        this.f38425h = simpleName;
        this.f38416B = -1;
        this.f38417C = -1;
        this.f38423I = H7.v.f8136b;
        Object systemService = context.getSystemService("input_method");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f38424g = (InputMethodManager) systemService;
        this.f38427j = getGravity() & 8388615;
        this.f38428k = getGravity() & 112;
        this.f38429l = 0;
        this.f38426i = false;
        this.f38441r = false;
        this.f38431m = null;
        this.f38433n = getInputType();
        if (this.f38445v == null) {
            this.f38445v = new b();
        }
        this.f38444u = null;
        this.f38448y = new com.facebook.react.views.text.r();
        u();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27) {
            setLayerType(1, null);
        }
        AbstractC2747a0.k0(this, new e(isFocusable(), getImportantForAccessibility()));
        d dVar = new d();
        setCustomSelectionActionModeCallback(dVar);
        setCustomInsertionActionModeCallback(dVar);
    }

    private final boolean D() {
        return (getInputType() & 144) != 0;
    }

    private final void F(SpannableStringBuilder spannableStringBuilder) {
        Editable text = getText();
        if (text == null) {
            throw new IllegalStateException("Required value was null.");
        }
        for (Object obj : text.getSpans(0, length(), Object.class)) {
            int spanFlags = text.getSpanFlags(obj);
            boolean z10 = (spanFlags & 33) == 33;
            if (obj instanceof P7.k) {
                text.removeSpan(obj);
            }
            if (z10) {
                int spanStart = text.getSpanStart(obj);
                int spanEnd = text.getSpanEnd(obj);
                text.removeSpan(obj);
                if (f38412r0.c(text, spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private final void G(int i10, int i11) {
        if (i10 == -1 || i11 == -1) {
            return;
        }
        setSelection(w(i10), w(i11));
    }

    private final void I(com.facebook.react.views.text.i iVar) {
        if (!(D() && AbstractC5504s.c(getText(), iVar.h())) && v(iVar.b())) {
            if (f38413s0) {
                AbstractC7283a.m(this.f38425h, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) iVar.h()));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iVar.h());
            F(spannableStringBuilder);
            V(spannableStringBuilder);
            this.f38435o = iVar.a();
            this.f38432m0 = true;
            if (iVar.h().length() == 0) {
                setText((CharSequence) null);
            } else {
                Editable text = getText();
                if (text == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                text.replace(0, length(), spannableStringBuilder);
            }
            this.f38432m0 = false;
            if (getBreakStrategy() != iVar.j()) {
                setBreakStrategy(iVar.j());
            }
            d0();
        }
    }

    public final void M() {
        InterfaceC3311a interfaceC3311a = this.f38443t;
        if (interfaceC3311a != null) {
            interfaceC3311a.a();
        }
        Q();
    }

    public final boolean O() {
        boolean zRequestFocus = super.requestFocus(130, null);
        if (isInTouchMode() && getShowSoftInputOnFocus()) {
            T();
        }
        return zRequestFocus;
    }

    private final void Q() {
        ReactContext reactContextD = f0.d(this);
        if (Y6.a.f22864f || this.f38430l0 != null || reactContextD.isBridgeless()) {
            return;
        }
        p pVar = new p(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContextD.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), pVar);
        }
    }

    private final void U(SpannableStringBuilder spannableStringBuilder, Class cls, K1.g gVar) {
        Iterator itA = AbstractC5489c.a(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls));
        while (itA.hasNext()) {
            Object next = itA.next();
            if (gVar.test(next)) {
                spannableStringBuilder.removeSpan(next);
            }
        }
    }

    private final void V(SpannableStringBuilder spannableStringBuilder) {
        U(spannableStringBuilder, P7.d.class, new K1.g() { // from class: com.facebook.react.views.textinput.c
            @Override // K1.g
            public final boolean test(Object obj) {
                return C3320j.W(this.f38405a, (P7.d) obj);
            }
        });
        U(spannableStringBuilder, P7.e.class, new K1.g() { // from class: com.facebook.react.views.textinput.d
            @Override // K1.g
            public final boolean test(Object obj) {
                return C3320j.X(this.f38406a, (P7.e) obj);
            }
        });
        U(spannableStringBuilder, P7.g.class, new K1.g() { // from class: com.facebook.react.views.textinput.e
            @Override // K1.g
            public final boolean test(Object obj) {
                return C3320j.Y(this.f38407a, (P7.g) obj);
            }
        });
        U(spannableStringBuilder, P7.l.class, new K1.g() { // from class: com.facebook.react.views.textinput.f
            @Override // K1.g
            public final boolean test(Object obj) {
                return C3320j.Z(this.f38408a, (P7.l) obj);
            }
        });
        U(spannableStringBuilder, P7.o.class, new K1.g() { // from class: com.facebook.react.views.textinput.g
            @Override // K1.g
            public final boolean test(Object obj) {
                return C3320j.a0(this.f38409a, (P7.o) obj);
            }
        });
        U(spannableStringBuilder, P7.a.class, new K1.g() { // from class: com.facebook.react.views.textinput.h
            @Override // K1.g
            public final boolean test(Object obj) {
                return C3320j.b0(this.f38410a, (P7.a) obj);
            }
        });
        U(spannableStringBuilder, P7.c.class, new K1.g() { // from class: com.facebook.react.views.textinput.i
            @Override // K1.g
            public final boolean test(Object obj) {
                return C3320j.c0(this.f38411a, (P7.c) obj);
            }
        });
    }

    public static final boolean W(C3320j c3320j, P7.d span) {
        AbstractC5504s.h(span, "span");
        return span.getSize() == c3320j.f38448y.c();
    }

    public static final boolean X(C3320j c3320j, P7.e span) {
        AbstractC5504s.h(span, "span");
        int backgroundColor = span.getBackgroundColor();
        Integer numI = C3281a.i(c3320j);
        return numI != null && backgroundColor == numI.intValue();
    }

    public static final boolean Y(C3320j c3320j, P7.g span) {
        AbstractC5504s.h(span, "span");
        return span.getForegroundColor() == c3320j.getCurrentTextColor();
    }

    public static final boolean Z(C3320j c3320j, P7.l lVar) {
        return (c3320j.getPaintFlags() & 16) != 0;
    }

    public static final boolean a0(C3320j c3320j, P7.o oVar) {
        return (c3320j.getPaintFlags() & 8) != 0;
    }

    public static final boolean b0(C3320j c3320j, P7.a span) {
        AbstractC5504s.h(span, "span");
        return span.b() == c3320j.f38448y.d();
    }

    public static final boolean c0(C3320j c3320j, P7.c span) {
        AbstractC5504s.h(span, "span");
        return span.c() == c3320j.f38417C && AbstractC5504s.c(span.a(), c3320j.f38415A) && span.d() == c3320j.f38416B && AbstractC5504s.c(span.b(), c3320j.getFontFeatureSettings());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0() {
        /*
            r5 = this;
            com.facebook.react.uimanager.a0 r0 = r5.f38430l0
            if (r0 != 0) goto L5
            goto Lc
        L5:
            int r0 = r5.getId()
            r1 = -1
            if (r0 != r1) goto Ld
        Lc:
            return
        Ld:
            android.text.Editable r0 = r5.getText()
            r1 = 0
            if (r0 == 0) goto L1d
            int r2 = r0.length()
            if (r2 != 0) goto L1b
            goto L1d
        L1b:
            r2 = r1
            goto L1e
        L1d:
            r2 = 1
        L1e:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            if (r0 == 0) goto L39
            if (r2 != 0) goto L39
            int r4 = r0.length()     // Catch: java.lang.IndexOutOfBoundsException -> L33
            java.lang.CharSequence r0 = r0.subSequence(r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L33
            r3.append(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L33
            goto L39
        L33:
            r0 = move-exception
            java.lang.String r4 = r5.f38425h
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r4, r0)
        L39:
            if (r2 == 0) goto L64
            java.lang.CharSequence r0 = r5.getHint()
            if (r0 == 0) goto L58
            java.lang.CharSequence r0 = r5.getHint()
            java.lang.String r2 = "getHint(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r2)
            int r0 = r0.length()
            if (r0 <= 0) goto L58
            java.lang.CharSequence r0 = r5.getHint()
            r3.append(r0)
            goto L64
        L58:
            int r0 = C7.a.c(r5)
            r2 = 2
            if (r0 == r2) goto L64
            java.lang.String r0 = "I"
            r3.append(r0)
        L64:
            r5.t(r3)
            P7.n r0 = new P7.n
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r4 = r5.getPaint()
            r2.<init>(r4)
            r0.<init>(r2)
            int r2 = r3.length()
            r4 = 18
            r3.setSpan(r0, r1, r2, r4)
            com.facebook.react.views.text.s r0 = com.facebook.react.views.text.s.f38347a
            int r1 = r5.getId()
            r0.A(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.C3320j.d0():void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void e0() {
        String str = this.f38440q0;
        int i10 = 6;
        if (str != null) {
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        i10 = 7;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        i10 = 3;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        i10 = 2;
                    }
                    break;
                case 3089282:
                    str.equals("done");
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        i10 = 5;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        i10 = 1;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        i10 = 4;
                    }
                    break;
            }
        }
        if (this.f38441r) {
            i10 |= 33554432;
        }
        setImeOptions(i10);
    }

    private final c getTextWatcherDelegator() {
        if (this.f38438p0 == null) {
            this.f38438p0 = new c();
        }
        return this.f38438p0;
    }

    private final void t(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new P7.d(this.f38448y.c()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new P7.g(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        Integer numI = C3281a.i(this);
        if (numI != null && numI.intValue() != 0) {
            spannableStringBuilder.setSpan(new P7.e(numI.intValue()), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new P7.l(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new P7.o(), 0, spannableStringBuilder.length(), 16711698);
        }
        float fD = this.f38448y.d();
        if (!Float.isNaN(fD)) {
            spannableStringBuilder.setSpan(new P7.a(fD), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.f38417C != -1 || this.f38416B != -1 || this.f38415A != null || getFontFeatureSettings() != null) {
            int i10 = this.f38417C;
            int i11 = this.f38416B;
            String fontFeatureSettings = getFontFeatureSettings();
            String str = this.f38415A;
            AssetManager assets = getContext().getAssets();
            AbstractC5504s.g(assets, "getAssets(...)");
            spannableStringBuilder.setSpan(new P7.c(i10, i11, fontFeatureSettings, str, assets), 0, spannableStringBuilder.length(), 16711698);
        }
        float fE = this.f38448y.e();
        if (Float.isNaN(fE)) {
            return;
        }
        spannableStringBuilder.setSpan(new P7.b(fE), 0, spannableStringBuilder.length(), 16711698);
    }

    private final int w(int i10) {
        int length;
        if (getText() == null) {
            length = 0;
        } else {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            length = text.length();
        }
        return (int) Math.max(0.0d, Math.min(i10, length));
    }

    protected final void A() {
        this.f38424g.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final int B() {
        int i10 = this.f38429l + 1;
        this.f38429l = i10;
        return i10;
    }

    public final boolean C() {
        return (getInputType() & 131072) != 0;
    }

    protected final boolean E() {
        return this.f38426i;
    }

    public final void H(int i10, int i11, int i12) {
        if (v(i10)) {
            G(i11, i12);
        }
    }

    public final void J(com.facebook.react.views.text.i reactTextUpdate) {
        AbstractC5504s.h(reactTextUpdate, "reactTextUpdate");
        this.f38426i = true;
        I(reactTextUpdate);
        this.f38426i = false;
    }

    public final void K(com.facebook.react.views.text.i reactTextUpdate) {
        AbstractC5504s.h(reactTextUpdate, "reactTextUpdate");
        this.f38434n0 = true;
        I(reactTextUpdate);
        this.f38434n0 = false;
    }

    public final void L() {
        if (this.f38449z) {
            this.f38449z = false;
            Typeface typeface = getTypeface();
            int i10 = this.f38417C;
            int i11 = this.f38416B;
            String str = this.f38415A;
            AssetManager assets = getContext().getAssets();
            AbstractC5504s.g(assets, "getAssets(...)");
            setTypeface(com.facebook.react.views.text.p.a(typeface, i10, i11, str, assets));
            boolean z10 = (this.f38417C == -1 && this.f38416B == -1 && this.f38415A == null && getFontFeatureSettings() == null) ? false : true;
            setPaintFlags(z10 ? getPaintFlags() | 128 : getPaintFlags() & (-129));
            if (C4914b.g()) {
                setPaintFlags(z10 ? getPaintFlags() | 64 : getPaintFlags() & (-65));
            }
        }
    }

    public final void N() {
        O();
    }

    public final void P(float f10, int i10) {
        C3281a.s(this, (H7.i) H7.i.b().get(i10), Float.isNaN(f10) ? null : new C3303t(com.facebook.react.uimanager.B.g(f10), EnumC3304u.f37832a));
    }

    public final boolean R() {
        String str = this.f38437p;
        return str == null ? !C() : AbstractC5504s.c(str, "blurAndSubmit");
    }

    public final boolean S() {
        String str = this.f38437p;
        return str == null ? !C() : AbstractC5504s.c(str, "submit") || AbstractC5504s.c(str, "blurAndSubmit");
    }

    protected final boolean T() {
        return this.f38424g.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher watcher) {
        AbstractC5504s.h(watcher, "watcher");
        if (this.f38431m == null) {
            this.f38431m = new CopyOnWriteArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38431m;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(watcher);
        }
    }

    protected final void finalize() {
        if (f38413s0) {
            AbstractC7283a.m(this.f38425h, "finalize[" + getId() + "] delete cached spannable");
        }
        com.facebook.react.views.text.s.f38347a.l(getId());
    }

    protected final boolean getContainsImages() {
        return this.f38435o;
    }

    public final boolean getDisableFullscreenUI() {
        return this.f38441r;
    }

    public final boolean getDisableTextDiffing$ReactAndroid_release() {
        return this.f38432m0;
    }

    public final List<String> getDragAndDropFilter() {
        return this.f38439q;
    }

    public final int getGravityHorizontal$ReactAndroid_release() {
        return getGravity() & 8388615;
    }

    public final int getGravityVertical$ReactAndroid_release() {
        return getGravity() & 112;
    }

    protected final int getNativeEventCount() {
        return this.f38429l;
    }

    public final String getReturnKeyType() {
        return this.f38440q0;
    }

    public final int getStagedInputType() {
        return this.f38433n;
    }

    public final InterfaceC3282a0 getStateWrapper() {
        return this.f38430l0;
    }

    public final String getSubmitBehavior() {
        return this.f38437p;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC5504s.h(drawable, "drawable");
        if (this.f38435o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC5489c.a((P7.r[]) text.getSpans(0, text.length(), P7.r.class));
            while (itA.hasNext()) {
                if (((P7.r) itA.next()).a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setTextIsSelectable(true);
        G(selectionStart, selectionEnd);
        if (this.f38435o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC5489c.a((P7.r[]) text.getSpans(0, text.length(), P7.r.class));
            while (itA.hasNext()) {
                ((P7.r) itA.next()).c();
            }
        }
        if (this.f38418D && !this.f38420F) {
            O();
        }
        this.f38420F = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (C4921i.a() && C4914b.n()) {
            u();
        }
    }

    @Override // androidx.appcompat.widget.C2658l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        AbstractC5504s.h(outAttrs, "outAttrs");
        ReactContext reactContextD = f0.d(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection != null && this.f38447x) {
            EventDispatcher eventDispatcher = this.f38436o0;
            if (eventDispatcher == null) {
                throw new IllegalStateException("Required value was null.");
            }
            inputConnectionOnCreateInputConnection = new C3321k(inputConnectionOnCreateInputConnection, reactContextD, this, eventDispatcher);
        }
        if (C() && (R() || S())) {
            outAttrs.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // androidx.appcompat.widget.C2658l, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38435o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC5489c.a((P7.r[]) text.getSpans(0, text.length(), P7.r.class));
            while (itA.hasNext()) {
                ((P7.r) itA.next()).d();
            }
        }
    }

    @Override // androidx.appcompat.widget.C2658l, android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent event) {
        AbstractC5504s.h(event, "event");
        List list = this.f38439q;
        if (list != null && event.getAction() == 1) {
            if (list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (event.getClipDescription().hasMimeType((String) it.next())) {
                }
            }
            return false;
        }
        return super.onDragEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        if (this.f38423I != H7.v.f8136b) {
            C3281a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f38435o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC5489c.a((P7.r[]) text.getSpans(0, text.length(), P7.r.class));
            while (itA.hasNext()) {
                ((P7.r) itA.next()).e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        L l10;
        super.onFocusChanged(z10, i10, rect);
        if (!z10 || (l10 = this.f38442s) == null || l10 == null) {
            return;
        }
        l10.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent event) {
        AbstractC5504s.h(event, "event");
        if (i10 != 66 || C()) {
            return super.onKeyUp(i10, event);
        }
        A();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        M();
        if (this.f38421G && isFocused()) {
            selectAll();
            this.f38421G = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        K k10 = this.f38444u;
        if (k10 != null) {
            k10.a(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i10, int i11) {
        L l10;
        if (f38413s0) {
            AbstractC7283a.m(this.f38425h, "onSelectionChanged[" + getId() + "]: " + i10 + " " + i11);
        }
        super.onSelectionChanged(i10, i11);
        if (this.f38442s == null || !hasFocus() || (l10 = this.f38442s) == null) {
            return;
        }
        l10.a(i10, i11);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f38435o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC5489c.a((P7.r[]) text.getSpans(0, text.length(), P7.r.class));
            while (itA.hasNext()) {
                ((P7.r) itA.next()).f();
            }
        }
    }

    @Override // androidx.appcompat.widget.C2658l, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            i10 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        AbstractC5504s.h(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.f38446w = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f38446w) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f38446w = false;
        }
        return super.onTouchEvent(ev);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher watcher) {
        AbstractC5504s.h(watcher, "watcher");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38431m;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(watcher);
            if (copyOnWriteArrayList.isEmpty()) {
                this.f38431m = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public final void setAllowFontScaling(boolean z10) {
        if (this.f38448y.b() != z10) {
            this.f38448y.h(z10);
            u();
        }
    }

    public final void setAutoFocus(boolean z10) {
        this.f38418D = z10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        C3281a.m(this, Integer.valueOf(i10));
    }

    public final void setBorderRadius(float f10) {
        P(f10, H7.i.f8043a.ordinal());
    }

    public final void setBorderStyle(String str) {
        C3281a.t(this, str == null ? null : H7.k.f8072a.a(str));
    }

    protected final void setContainsImages(boolean z10) {
        this.f38435o = z10;
    }

    public final void setContentSizeWatcher(InterfaceC3311a interfaceC3311a) {
        this.f38443t = interfaceC3311a;
    }

    public final void setContextMenuHidden(boolean z10) {
        this.f38419E = z10;
    }

    public final void setDisableFullscreenUI(boolean z10) {
        this.f38441r = z10;
        e0();
    }

    public final void setDisableTextDiffing$ReactAndroid_release(boolean z10) {
        this.f38432m0 = z10;
    }

    public final void setDragAndDropFilter(List<String> list) {
        this.f38439q = list;
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.f38436o0 = eventDispatcher;
    }

    public final void setFontFamily(String str) {
        this.f38415A = str;
        this.f38449z = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (AbstractC5504s.c(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.f38449z = true;
    }

    public final void setFontSize(float f10) {
        this.f38448y.i(f10);
        u();
    }

    public final void setFontStyle(String str) {
        int iB = com.facebook.react.views.text.p.b(str);
        if (iB != this.f38417C) {
            this.f38417C = iB;
            this.f38449z = true;
        }
    }

    public final void setFontWeight(String str) {
        int iD = com.facebook.react.views.text.p.d(str);
        if (iD != this.f38416B) {
            this.f38416B = iD;
            this.f38449z = true;
        }
    }

    public final void setGravityHorizontal$ReactAndroid_release(int i10) {
        if (i10 == 0) {
            i10 = this.f38427j;
        }
        setGravity(i10 | (getGravity() & (-8388616)));
    }

    public final void setGravityVertical$ReactAndroid_release(int i10) {
        if (i10 == 0) {
            i10 = this.f38428k;
        }
        setGravity(i10 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i10);
        this.f38433n = i10;
        super.setTypeface(typeface);
        if (C()) {
            setSingleLine(false);
        }
        if (this.f38445v == null) {
            this.f38445v = new b();
        }
        b bVar = this.f38445v;
        if (bVar != null) {
            bVar.a(i10);
        }
        super.setKeyListener(this.f38445v);
    }

    public final void setLetterSpacingPt(float f10) {
        this.f38448y.k(f10);
        u();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        this.f38448y.l(i10);
    }

    public final void setMaxFontSizeMultiplier(float f10) {
        if (f10 == this.f38448y.g()) {
            return;
        }
        this.f38448y.m(f10);
        u();
    }

    protected final void setNativeEventCount(int i10) {
        this.f38429l = i10;
    }

    public final void setOnKeyPress(boolean z10) {
        this.f38447x = z10;
    }

    public final void setOverflow(String str) {
        if (str == null) {
            this.f38423I = H7.v.f8136b;
        } else {
            H7.v vVarA = H7.v.f8135a.a(str);
            if (vVarA == null) {
                vVarA = H7.v.f8136b;
            }
            this.f38423I = vVarA;
        }
        invalidate();
    }

    public final void setPlaceholder(String str) {
        if (AbstractC5504s.c(str, this.f38422H)) {
            return;
        }
        this.f38422H = str;
        setHint(str);
    }

    public final void setReturnKeyType(String str) {
        this.f38440q0 = str;
        e0();
    }

    public final void setScrollWatcher(K k10) {
        this.f38444u = k10;
    }

    public final void setSelectTextOnFocus(boolean z10) {
        super.setSelectAllOnFocus(z10);
        this.f38421G = z10;
    }

    @Override // android.widget.EditText
    public void setSelection(int i10, int i11) {
        if (f38413s0) {
            AbstractC7283a.m(this.f38425h, "setSelection[" + getId() + "]: " + i10 + " " + i11);
        }
        super.setSelection(i10, i11);
    }

    public final void setSelectionWatcher$ReactAndroid_release(L l10) {
        this.f38442s = l10;
    }

    protected final void setSettingTextFromJS(boolean z10) {
        this.f38426i = z10;
    }

    protected final void setSettingTextFromState(boolean z10) {
        this.f38434n0 = z10;
    }

    public final void setStagedInputType(int i10) {
        this.f38433n = i10;
    }

    public final void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f38430l0 = interfaceC3282a0;
    }

    public final void setSubmitBehavior(String str) {
        this.f38437p = str;
    }

    protected final void u() {
        setTextSize(0, this.f38448y.c());
        float fD = this.f38448y.d();
        if (Float.isNaN(fD)) {
            return;
        }
        setLetterSpacing(fD);
    }

    public final boolean v(int i10) {
        return i10 >= this.f38429l;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        AbstractC5504s.h(drawable, "drawable");
        if (this.f38435o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC5489c.a((P7.r[]) text.getSpans(0, text.length(), P7.r.class));
            while (itA.hasNext()) {
                if (((P7.r) itA.next()).a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public final void x() {
        if (Build.VERSION.SDK_INT > 28 || !isInTouchMode()) {
            super.clearFocus();
        } else {
            View rootView = getRootView();
            AbstractC5504s.f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) rootView;
            int descendantFocusability = viewGroup.getDescendantFocusability();
            viewGroup.setDescendantFocusability(393216);
            super.clearFocus();
            viewGroup.setDescendantFocusability(descendantFocusability);
        }
        A();
    }

    public final void y() {
        x();
    }

    public final void z() {
        if (getInputType() != this.f38433n) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f38433n);
            G(selectionStart, selectionEnd);
        }
    }
}
