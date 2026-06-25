package com.facebook.react.views.textinput;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3321k extends InputConnectionWrapper {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f38454e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3320j f38455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventDispatcher f38456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38458d;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3321k(InputConnection target, ReactContext reactContext, C3320j editText, EventDispatcher eventDispatcher) {
        super(target, false);
        AbstractC5504s.h(target, "target");
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(editText, "editText");
        AbstractC5504s.h(eventDispatcher, "eventDispatcher");
        this.f38455a = editText;
        this.f38456b = eventDispatcher;
    }

    private final void b(String str) {
        if (AbstractC5504s.c(str, "\n")) {
            str = "Enter";
        }
        this.f38456b.d(new o(f0.f(this.f38455a), this.f38455a.getId(), str));
    }

    private final void c(String str) {
        if (this.f38457c) {
            this.f38458d = str;
        } else {
            b(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f38457c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int i10) {
        AbstractC5504s.h(text, "text");
        String string = text.toString();
        if (string.length() <= 2) {
            if (string.length() == 0) {
                string = "Backspace";
            }
            c(string);
        }
        return super.commitText(text, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        b("Backspace");
        return super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f38457c = false;
        String str = this.f38458d;
        if (str != null) {
            b(str);
            this.f38458d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        AbstractC5504s.h(event, "event");
        if (event.getAction() == 0) {
            int unicodeChar = event.getUnicodeChar();
            boolean z10 = false;
            if (48 <= unicodeChar && unicodeChar < 58) {
                z10 = true;
            }
            int keyCode = event.getKeyCode();
            if (keyCode == 66) {
                b("Enter");
            } else if (keyCode == 67) {
                b("Backspace");
            } else if (z10) {
                b(String.valueOf(event.getNumber()));
            }
        }
        return super.sendKeyEvent(event);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int i10) {
        String strValueOf;
        AbstractC5504s.h(text, "text");
        int selectionStart = this.f38455a.getSelectionStart();
        int selectionEnd = this.f38455a.getSelectionEnd();
        boolean composingText = super.setComposingText(text, i10);
        int selectionStart2 = this.f38455a.getSelectionStart();
        boolean z10 = selectionStart == selectionEnd;
        boolean z11 = selectionStart2 == selectionStart;
        if (selectionStart2 < selectionStart || selectionStart2 <= 0 || (!z10 && z11)) {
            strValueOf = "Backspace";
        } else {
            Editable text2 = this.f38455a.getText();
            strValueOf = String.valueOf(text2 != null ? Character.valueOf(text2.charAt(selectionStart2 - 1)) : null);
        }
        c(strValueOf);
        return composingText;
    }
}
