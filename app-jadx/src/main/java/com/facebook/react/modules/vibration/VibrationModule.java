package com.facebook.react.modules.vibration;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.facebook.fbreact.specs.NativeVibrationSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import w7.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "Vibration")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/modules/vibration/VibrationModule;", "Lcom/facebook/fbreact/specs/NativeVibrationSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/os/Vibrator;", "getVibrator", "()Landroid/os/Vibrator;", "", "durationDouble", "LTd/L;", "vibrate", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "pattern", "repeatDouble", "vibrateByPattern", "(Lcom/facebook/react/bridge/ReadableArray;D)V", "cancel", "()V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VibrationModule extends NativeVibrationSpec {
    public static final String NAME = "Vibration";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibrationModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
    }

    private final Vibrator getVibrator() {
        if (Build.VERSION.SDK_INT < 31) {
            return (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        }
        VibratorManager vibratorManagerA = d.a(getReactApplicationContext().getSystemService("vibrator_manager"));
        if (vibratorManagerA != null) {
            return vibratorManagerA.getDefaultVibrator();
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void cancel() {
        Vibrator vibrator = getVibrator();
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrate(double durationDouble) {
        int i10 = (int) durationDouble;
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(i10, -1));
        } else {
            vibrator.vibrate(i10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrateByPattern(ReadableArray pattern, double repeatDouble) {
        AbstractC5504s.h(pattern, "pattern");
        int i10 = (int) repeatDouble;
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        long[] jArr = new long[pattern.size()];
        int size = pattern.size();
        for (int i11 = 0; i11 < size; i11++) {
            jArr[i11] = pattern.getInt(i11);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createWaveform(jArr, i10));
        } else {
            vibrator.vibrate(jArr, i10);
        }
    }
}
