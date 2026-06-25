package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f30303a = (AudioAttributes) aVar.r(audioAttributesImplApi26.f30303a, 1);
        audioAttributesImplApi26.f30304b = aVar.p(audioAttributesImplApi26.f30304b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.x(false, false);
        aVar.H(audioAttributesImplApi26.f30303a, 1);
        aVar.F(audioAttributesImplApi26.f30304b, 2);
    }
}
