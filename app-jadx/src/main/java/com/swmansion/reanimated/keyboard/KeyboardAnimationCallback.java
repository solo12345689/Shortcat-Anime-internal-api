package com.swmansion.reanimated.keyboard;

import androidx.core.view.C2777p0;
import androidx.core.view.L0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class KeyboardAnimationCallback extends C2777p0.b {
    private static final int CONTENT_TYPE_MASK = L0.p.d();
    private final boolean mIsNavigationBarTranslucent;
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;

    public KeyboardAnimationCallback(Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction, boolean z10) {
        super(1);
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
        this.mIsNavigationBarTranslucent = z10;
        this.mKeyboard = keyboard;
    }

    private static boolean isKeyboardAnimation(C2777p0 c2777p0) {
        return (c2777p0.d() & CONTENT_TYPE_MASK) != 0;
    }

    @Override // androidx.core.view.C2777p0.b
    public void onEnd(C2777p0 c2777p0) {
        if (isKeyboardAnimation(c2777p0)) {
            this.mKeyboard.onAnimationEnd();
            this.mNotifyAboutKeyboardChange.call();
        }
    }

    @Override // androidx.core.view.C2777p0.b
    public L0 onProgress(L0 l02, List<C2777p0> list) {
        Iterator<C2777p0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (isKeyboardAnimation(it.next())) {
                this.mKeyboard.updateHeight(l02, this.mIsNavigationBarTranslucent);
                this.mNotifyAboutKeyboardChange.call();
                break;
            }
        }
        return l02;
    }

    @Override // androidx.core.view.C2777p0.b
    public C2777p0.a onStart(C2777p0 c2777p0, C2777p0.a aVar) {
        if (!isKeyboardAnimation(c2777p0)) {
            return aVar;
        }
        this.mKeyboard.onAnimationStart();
        this.mNotifyAboutKeyboardChange.call();
        return super.onStart(c2777p0, aVar);
    }
}
