package expo.modules.video.player;

import expo.modules.video.VideoView;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.AudioTrackChangedEventPayload;
import expo.modules.video.records.AvailableAudioTracksChangedEventPayload;
import expo.modules.video.records.AvailableSubtitleTracksChangedEventPayload;
import expo.modules.video.records.IsPlayingEventPayload;
import expo.modules.video.records.MutedChangedEventPayload;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.PlaybackRateChangedEventPayload;
import expo.modules.video.records.SourceChangedEventPayload;
import expo.modules.video.records.StatusChangedEventPayload;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.SubtitleTrackChangedEventPayload;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoEventPayload;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoSourceLoadedEventPayload;
import expo.modules.video.records.VideoTrack;
import expo.modules.video.records.VideoTrackChangedEventPayload;
import expo.modules.video.records.VolumeChangedEventPayload;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.d0;
import q2.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoEventPayload f46703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f46704c;

    /* JADX INFO: renamed from: expo.modules.video.player.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0749a extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AudioMixingMode f46705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AudioMixingMode f46706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46707f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f46708g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0749a(AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2) {
            super(null);
            AbstractC5504s.h(audioMixingMode, "audioMixingMode");
            this.f46705d = audioMixingMode;
            this.f46706e = audioMixingMode2;
            this.f46707f = "audioMixingModeChange";
        }

        @Override // expo.modules.video.player.a
        public boolean b() {
            return this.f46708g;
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46707f;
        }

        public final AudioMixingMode e() {
            return this.f46705d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0749a)) {
                return false;
            }
            C0749a c0749a = (C0749a) obj;
            return this.f46705d == c0749a.f46705d && this.f46706e == c0749a.f46706e;
        }

        public final AudioMixingMode f() {
            return this.f46706e;
        }

        public int hashCode() {
            int iHashCode = this.f46705d.hashCode() * 31;
            AudioMixingMode audioMixingMode = this.f46706e;
            return iHashCode + (audioMixingMode == null ? 0 : audioMixingMode.hashCode());
        }

        public String toString() {
            return "AudioMixingModeChanged(audioMixingMode=" + this.f46705d + ", oldAudioMixingMode=" + this.f46706e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AudioTrack f46709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AudioTrack f46710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AudioTrackChangedEventPayload f46712g;

        public b(AudioTrack audioTrack, AudioTrack audioTrack2) {
            super(null);
            this.f46709d = audioTrack;
            this.f46710e = audioTrack2;
            this.f46711f = "audioTrackChange";
            this.f46712g = new AudioTrackChangedEventPayload(audioTrack, audioTrack2);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46711f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AudioTrackChangedEventPayload c() {
            return this.f46712g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(this.f46709d, bVar.f46709d) && AbstractC5504s.c(this.f46710e, bVar.f46710e);
        }

        public int hashCode() {
            AudioTrack audioTrack = this.f46709d;
            int iHashCode = (audioTrack == null ? 0 : audioTrack.hashCode()) * 31;
            AudioTrack audioTrack2 = this.f46710e;
            return iHashCode + (audioTrack2 != null ? audioTrack2.hashCode() : 0);
        }

        public String toString() {
            return "AudioTrackChanged(audioTrack=" + this.f46709d + ", oldAudioTrack=" + this.f46710e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f46713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f46714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AvailableAudioTracksChangedEventPayload f46716g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List availableAudioTracks, List oldAvailableAudioTracks) {
            super(null);
            AbstractC5504s.h(availableAudioTracks, "availableAudioTracks");
            AbstractC5504s.h(oldAvailableAudioTracks, "oldAvailableAudioTracks");
            this.f46713d = availableAudioTracks;
            this.f46714e = oldAvailableAudioTracks;
            this.f46715f = "availableAudioTracksChange";
            this.f46716g = new AvailableAudioTracksChangedEventPayload(availableAudioTracks, oldAvailableAudioTracks);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46715f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AvailableAudioTracksChangedEventPayload c() {
            return this.f46716g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC5504s.c(this.f46713d, cVar.f46713d) && AbstractC5504s.c(this.f46714e, cVar.f46714e);
        }

        public int hashCode() {
            return (this.f46713d.hashCode() * 31) + this.f46714e.hashCode();
        }

        public String toString() {
            return "AvailableAudioTracksChanged(availableAudioTracks=" + this.f46713d + ", oldAvailableAudioTracks=" + this.f46714e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f46717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f46718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AvailableSubtitleTracksChangedEventPayload f46720g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List availableSubtitleTracks, List oldAvailableSubtitleTracks) {
            super(null);
            AbstractC5504s.h(availableSubtitleTracks, "availableSubtitleTracks");
            AbstractC5504s.h(oldAvailableSubtitleTracks, "oldAvailableSubtitleTracks");
            this.f46717d = availableSubtitleTracks;
            this.f46718e = oldAvailableSubtitleTracks;
            this.f46719f = "availableSubtitleTracksChange";
            this.f46720g = new AvailableSubtitleTracksChangedEventPayload(availableSubtitleTracks, oldAvailableSubtitleTracks);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46719f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AvailableSubtitleTracksChangedEventPayload c() {
            return this.f46720g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC5504s.c(this.f46717d, dVar.f46717d) && AbstractC5504s.c(this.f46718e, dVar.f46718e);
        }

        public int hashCode() {
            return (this.f46717d.hashCode() * 31) + this.f46718e.hashCode();
        }

        public String toString() {
            return "AvailableSubtitleTracksChanged(availableSubtitleTracks=" + this.f46717d + ", oldAvailableSubtitleTracks=" + this.f46718e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f46721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Boolean f46722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final IsPlayingEventPayload f46724g;

        public e(boolean z10, Boolean bool) {
            super(null);
            this.f46721d = z10;
            this.f46722e = bool;
            this.f46723f = "playingChange";
            this.f46724g = new IsPlayingEventPayload(z10, bool);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46723f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public IsPlayingEventPayload c() {
            return this.f46724g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f46721d == eVar.f46721d && AbstractC5504s.c(this.f46722e, eVar.f46722e);
        }

        public final Boolean f() {
            return this.f46722e;
        }

        public final boolean g() {
            return this.f46721d;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f46721d) * 31;
            Boolean bool = this.f46722e;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "IsPlayingChanged(isPlaying=" + this.f46721d + ", oldIsPlaying=" + this.f46722e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f46725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Boolean f46726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46727f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final MutedChangedEventPayload f46728g;

        public f(boolean z10, Boolean bool) {
            super(null);
            this.f46725d = z10;
            this.f46726e = bool;
            this.f46727f = "mutedChange";
            this.f46728g = new MutedChangedEventPayload(z10, bool);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46727f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public MutedChangedEventPayload c() {
            return this.f46728g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f46725d == fVar.f46725d && AbstractC5504s.c(this.f46726e, fVar.f46726e);
        }

        public final boolean f() {
            return this.f46725d;
        }

        public final Boolean g() {
            return this.f46726e;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f46725d) * 31;
            Boolean bool = this.f46726e;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "MutedChanged(muted=" + this.f46725d + ", oldMuted=" + this.f46726e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f46729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Float f46730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final PlaybackRateChangedEventPayload f46732g;

        public g(float f10, Float f11) {
            super(null);
            this.f46729d = f10;
            this.f46730e = f11;
            this.f46731f = "playbackRateChange";
            this.f46732g = new PlaybackRateChangedEventPayload(f10, f11);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46731f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public PlaybackRateChangedEventPayload c() {
            return this.f46732g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f46729d, gVar.f46729d) == 0 && AbstractC5504s.c(this.f46730e, gVar.f46730e);
        }

        public final Float f() {
            return this.f46730e;
        }

        public final float g() {
            return this.f46729d;
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.f46729d) * 31;
            Float f10 = this.f46730e;
            return iHashCode + (f10 == null ? 0 : f10.hashCode());
        }

        public String toString() {
            return "PlaybackRateChanged(rate=" + this.f46729d + ", oldRate=" + this.f46730e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f46733d;

        public h() {
            super(null);
            this.f46733d = "playToEnd";
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46733d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f46734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f46735e;

        public i() {
            super(null);
            this.f46734d = "renderFirstFrame";
        }

        @Override // expo.modules.video.player.a
        public boolean b() {
            return this.f46735e;
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46734d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final VideoSource f46736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final VideoSource f46737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final SourceChangedEventPayload f46739g;

        public j(VideoSource videoSource, VideoSource videoSource2) {
            super(null);
            this.f46736d = videoSource;
            this.f46737e = videoSource2;
            this.f46738f = "sourceChange";
            this.f46739g = new SourceChangedEventPayload(videoSource, videoSource2);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46738f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SourceChangedEventPayload c() {
            return this.f46739g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return AbstractC5504s.c(this.f46736d, jVar.f46736d) && AbstractC5504s.c(this.f46737e, jVar.f46737e);
        }

        public final VideoSource f() {
            return this.f46737e;
        }

        public final VideoSource g() {
            return this.f46736d;
        }

        public int hashCode() {
            VideoSource videoSource = this.f46736d;
            int iHashCode = (videoSource == null ? 0 : videoSource.hashCode()) * 31;
            VideoSource videoSource2 = this.f46737e;
            return iHashCode + (videoSource2 != null ? videoSource2.hashCode() : 0);
        }

        public String toString() {
            return "SourceChanged(source=" + this.f46736d + ", oldSource=" + this.f46737e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final PlayerStatus f46740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final PlayerStatus f46741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final PlaybackError f46742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f46743g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final StatusChangedEventPayload f46744h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(PlayerStatus status, PlayerStatus playerStatus, PlaybackError playbackError) {
            super(null);
            AbstractC5504s.h(status, "status");
            this.f46740d = status;
            this.f46741e = playerStatus;
            this.f46742f = playbackError;
            this.f46743g = "statusChange";
            this.f46744h = new StatusChangedEventPayload(status, playerStatus, playbackError);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46743g;
        }

        public final PlaybackError e() {
            return this.f46742f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f46740d == kVar.f46740d && this.f46741e == kVar.f46741e && AbstractC5504s.c(this.f46742f, kVar.f46742f);
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public StatusChangedEventPayload c() {
            return this.f46744h;
        }

        public final PlayerStatus g() {
            return this.f46741e;
        }

        public final PlayerStatus h() {
            return this.f46740d;
        }

        public int hashCode() {
            int iHashCode = this.f46740d.hashCode() * 31;
            PlayerStatus playerStatus = this.f46741e;
            int iHashCode2 = (iHashCode + (playerStatus == null ? 0 : playerStatus.hashCode())) * 31;
            PlaybackError playbackError = this.f46742f;
            return iHashCode2 + (playbackError != null ? playbackError.hashCode() : 0);
        }

        public String toString() {
            return "StatusChanged(status=" + this.f46740d + ", oldStatus=" + this.f46741e + ", error=" + this.f46742f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SubtitleTrack f46745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SubtitleTrack f46746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final SubtitleTrackChangedEventPayload f46748g;

        public l(SubtitleTrack subtitleTrack, SubtitleTrack subtitleTrack2) {
            super(null);
            this.f46745d = subtitleTrack;
            this.f46746e = subtitleTrack2;
            this.f46747f = "subtitleTrackChange";
            this.f46748g = new SubtitleTrackChangedEventPayload(subtitleTrack, subtitleTrack2);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46747f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SubtitleTrackChangedEventPayload c() {
            return this.f46748g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return AbstractC5504s.c(this.f46745d, lVar.f46745d) && AbstractC5504s.c(this.f46746e, lVar.f46746e);
        }

        public int hashCode() {
            SubtitleTrack subtitleTrack = this.f46745d;
            int iHashCode = (subtitleTrack == null ? 0 : subtitleTrack.hashCode()) * 31;
            SubtitleTrack subtitleTrack2 = this.f46746e;
            return iHashCode + (subtitleTrack2 != null ? subtitleTrack2.hashCode() : 0);
        }

        public String toString() {
            return "SubtitleTrackChanged(subtitleTrack=" + this.f46745d + ", oldSubtitleTrack=" + this.f46746e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final VideoView f46749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final VideoView f46750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f46752g;

        public m(VideoView videoView, VideoView videoView2) {
            super(null);
            this.f46749d = videoView;
            this.f46750e = videoView2;
            this.f46751f = "targetViewChange";
        }

        @Override // expo.modules.video.player.a
        public boolean b() {
            return this.f46752g;
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46751f;
        }

        public final VideoView e() {
            return this.f46749d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return AbstractC5504s.c(this.f46749d, mVar.f46749d) && AbstractC5504s.c(this.f46750e, mVar.f46750e);
        }

        public final VideoView f() {
            return this.f46750e;
        }

        public int hashCode() {
            VideoView videoView = this.f46749d;
            int iHashCode = (videoView == null ? 0 : videoView.hashCode()) * 31;
            VideoView videoView2 = this.f46750e;
            return iHashCode + (videoView2 != null ? videoView2.hashCode() : 0);
        }

        public String toString() {
            return "TargetViewChanged(newTargetView=" + this.f46749d + ", oldTargetView=" + this.f46750e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TimeUpdate f46753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f46754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final TimeUpdate f46755f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(TimeUpdate timeUpdate) {
            super(null);
            AbstractC5504s.h(timeUpdate, "timeUpdate");
            this.f46753d = timeUpdate;
            this.f46754e = "timeUpdate";
            this.f46755f = timeUpdate;
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46754e;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public TimeUpdate c() {
            return this.f46755f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && AbstractC5504s.c(this.f46753d, ((n) obj).f46753d);
        }

        public final TimeUpdate f() {
            return this.f46753d;
        }

        public int hashCode() {
            return this.f46753d.hashCode();
        }

        public String toString() {
            return "TimeUpdated(timeUpdate=" + this.f46753d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d0 f46756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f46757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f46758f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(d0 trackSelectionParameters) {
            super(null);
            AbstractC5504s.h(trackSelectionParameters, "trackSelectionParameters");
            this.f46756d = trackSelectionParameters;
            this.f46757e = "trackSelectionParametersChange";
        }

        @Override // expo.modules.video.player.a
        public boolean b() {
            return this.f46758f;
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46757e;
        }

        public final d0 e() {
            return this.f46756d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && AbstractC5504s.c(this.f46756d, ((o) obj).f46756d);
        }

        public int hashCode() {
            return this.f46756d.hashCode();
        }

        public String toString() {
            return "TrackSelectionParametersChanged(trackSelectionParameters=" + this.f46756d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h0 f46759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f46760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f46761f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(h0 tracks) {
            super(null);
            AbstractC5504s.h(tracks, "tracks");
            this.f46759d = tracks;
            this.f46760e = "tracksChange";
        }

        @Override // expo.modules.video.player.a
        public boolean b() {
            return this.f46761f;
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46760e;
        }

        public final h0 e() {
            return this.f46759d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && AbstractC5504s.c(this.f46759d, ((p) obj).f46759d);
        }

        public int hashCode() {
            return this.f46759d.hashCode();
        }

        public String toString() {
            return "TracksChanged(tracks=" + this.f46759d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final VideoSource f46762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f46763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f46764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f46765g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f46766h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f46767i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final VideoSourceLoadedEventPayload f46768j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(VideoSource videoSource, double d10, List availableVideoTracks, List availableSubtitleTracks, List availableAudioTracks) {
            super(null);
            AbstractC5504s.h(availableVideoTracks, "availableVideoTracks");
            AbstractC5504s.h(availableSubtitleTracks, "availableSubtitleTracks");
            AbstractC5504s.h(availableAudioTracks, "availableAudioTracks");
            this.f46762d = videoSource;
            this.f46763e = d10;
            this.f46764f = availableVideoTracks;
            this.f46765g = availableSubtitleTracks;
            this.f46766h = availableAudioTracks;
            this.f46767i = "sourceLoad";
            this.f46768j = new VideoSourceLoadedEventPayload(videoSource, d10, availableVideoTracks, availableSubtitleTracks, availableAudioTracks);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46767i;
        }

        public final List e() {
            return this.f46766h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return AbstractC5504s.c(this.f46762d, qVar.f46762d) && Double.compare(this.f46763e, qVar.f46763e) == 0 && AbstractC5504s.c(this.f46764f, qVar.f46764f) && AbstractC5504s.c(this.f46765g, qVar.f46765g) && AbstractC5504s.c(this.f46766h, qVar.f46766h);
        }

        public final List f() {
            return this.f46765g;
        }

        public final List g() {
            return this.f46764f;
        }

        public final double h() {
            return this.f46763e;
        }

        public int hashCode() {
            VideoSource videoSource = this.f46762d;
            return ((((((((videoSource == null ? 0 : videoSource.hashCode()) * 31) + Double.hashCode(this.f46763e)) * 31) + this.f46764f.hashCode()) * 31) + this.f46765g.hashCode()) * 31) + this.f46766h.hashCode();
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public VideoSourceLoadedEventPayload c() {
            return this.f46768j;
        }

        public final VideoSource j() {
            return this.f46762d;
        }

        public String toString() {
            return "VideoSourceLoaded(videoSource=" + this.f46762d + ", duration=" + this.f46763e + ", availableVideoTracks=" + this.f46764f + ", availableSubtitleTracks=" + this.f46765g + ", availableAudioTracks=" + this.f46766h + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final VideoTrack f46769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final VideoTrack f46770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final VideoTrackChangedEventPayload f46772g;

        public r(VideoTrack videoTrack, VideoTrack videoTrack2) {
            super(null);
            this.f46769d = videoTrack;
            this.f46770e = videoTrack2;
            this.f46771f = "videoTrackChange";
            this.f46772g = new VideoTrackChangedEventPayload(videoTrack, videoTrack2);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46771f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public VideoTrackChangedEventPayload c() {
            return this.f46772g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return AbstractC5504s.c(this.f46769d, rVar.f46769d) && AbstractC5504s.c(this.f46770e, rVar.f46770e);
        }

        public final VideoTrack f() {
            return this.f46770e;
        }

        public final VideoTrack g() {
            return this.f46769d;
        }

        public int hashCode() {
            VideoTrack videoTrack = this.f46769d;
            int iHashCode = (videoTrack == null ? 0 : videoTrack.hashCode()) * 31;
            VideoTrack videoTrack2 = this.f46770e;
            return iHashCode + (videoTrack2 != null ? videoTrack2.hashCode() : 0);
        }

        public String toString() {
            return "VideoTrackChanged(videoTrack=" + this.f46769d + ", oldVideoTrack=" + this.f46770e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f46773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Float f46774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46775f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final VolumeChangedEventPayload f46776g;

        public s(float f10, Float f11) {
            super(null);
            this.f46773d = f10;
            this.f46774e = f11;
            this.f46775f = "volumeChange";
            this.f46776g = new VolumeChangedEventPayload(f10, f11);
        }

        @Override // expo.modules.video.player.a
        public String d() {
            return this.f46775f;
        }

        @Override // expo.modules.video.player.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public VolumeChangedEventPayload c() {
            return this.f46776g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return Float.compare(this.f46773d, sVar.f46773d) == 0 && AbstractC5504s.c(this.f46774e, sVar.f46774e);
        }

        public final Float f() {
            return this.f46774e;
        }

        public final float g() {
            return this.f46773d;
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.f46773d) * 31;
            Float f10 = this.f46774e;
            return iHashCode + (f10 == null ? 0 : f10.hashCode());
        }

        public String toString() {
            return "VolumeChanged(volume=" + this.f46773d + ", oldVolume=" + this.f46774e + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void a(VideoPlayer player, List listeners) {
        AbstractC5504s.h(player, "player");
        AbstractC5504s.h(listeners, "listeners");
        if (this instanceof k) {
            Iterator it = listeners.iterator();
            while (it.hasNext()) {
                k kVar = (k) this;
                ((Hd.b) it.next()).onStatusChanged(player, kVar.h(), kVar.g(), kVar.e());
            }
            return;
        }
        if (this instanceof e) {
            Iterator it2 = listeners.iterator();
            while (it2.hasNext()) {
                e eVar = (e) this;
                ((Hd.b) it2.next()).onIsPlayingChanged(player, eVar.g(), eVar.f());
            }
            return;
        }
        if (this instanceof s) {
            Iterator it3 = listeners.iterator();
            while (it3.hasNext()) {
                s sVar = (s) this;
                ((Hd.b) it3.next()).onVolumeChanged(player, sVar.g(), sVar.f());
            }
            return;
        }
        if (this instanceof j) {
            Iterator it4 = listeners.iterator();
            while (it4.hasNext()) {
                j jVar = (j) this;
                ((Hd.b) it4.next()).onSourceChanged(player, jVar.g(), jVar.f());
            }
            return;
        }
        if (this instanceof g) {
            Iterator it5 = listeners.iterator();
            while (it5.hasNext()) {
                g gVar = (g) this;
                ((Hd.b) it5.next()).onPlaybackRateChanged(player, gVar.g(), gVar.f());
            }
            return;
        }
        if (this instanceof p) {
            Iterator it6 = listeners.iterator();
            while (it6.hasNext()) {
                ((Hd.b) it6.next()).onTracksChanged(player, ((p) this).e());
            }
            return;
        }
        if (this instanceof o) {
            Iterator it7 = listeners.iterator();
            while (it7.hasNext()) {
                ((Hd.b) it7.next()).onTrackSelectionParametersChanged(player, ((o) this).e());
            }
            return;
        }
        if (this instanceof n) {
            Iterator it8 = listeners.iterator();
            while (it8.hasNext()) {
                ((Hd.b) it8.next()).onTimeUpdate(player, ((n) this).f());
            }
            return;
        }
        if (this instanceof h) {
            Iterator it9 = listeners.iterator();
            while (it9.hasNext()) {
                ((Hd.b) it9.next()).onPlayedToEnd(player);
            }
            return;
        }
        if (this instanceof f) {
            Iterator it10 = listeners.iterator();
            while (it10.hasNext()) {
                f fVar = (f) this;
                ((Hd.b) it10.next()).onMutedChanged(player, fVar.f(), fVar.g());
            }
            return;
        }
        if (this instanceof C0749a) {
            Iterator it11 = listeners.iterator();
            while (it11.hasNext()) {
                C0749a c0749a = (C0749a) this;
                ((Hd.b) it11.next()).onAudioMixingModeChanged(player, c0749a.e(), c0749a.f());
            }
            return;
        }
        if (this instanceof r) {
            Iterator it12 = listeners.iterator();
            while (it12.hasNext()) {
                r rVar = (r) this;
                ((Hd.b) it12.next()).onVideoTrackChanged(player, rVar.g(), rVar.f());
            }
            return;
        }
        if (this instanceof i) {
            Iterator it13 = listeners.iterator();
            while (it13.hasNext()) {
                ((Hd.b) it13.next()).onRenderedFirstFrame(player);
            }
        } else {
            if (this instanceof q) {
                Iterator it14 = listeners.iterator();
                while (it14.hasNext()) {
                    q qVar = (q) this;
                    ((Hd.b) it14.next()).onVideoSourceLoaded(player, qVar.j(), Double.valueOf(qVar.h()), qVar.g(), qVar.f(), qVar.e());
                }
                return;
            }
            if (this instanceof m) {
                Iterator it15 = listeners.iterator();
                while (it15.hasNext()) {
                    m mVar = (m) this;
                    ((Hd.b) it15.next()).onTargetViewChanged(player, mVar.e(), mVar.f());
                }
            }
        }
    }

    public boolean b() {
        return this.f46704c;
    }

    public VideoEventPayload c() {
        return this.f46703b;
    }

    public abstract String d();

    private a() {
        this.f46702a = "";
        this.f46704c = true;
    }
}
