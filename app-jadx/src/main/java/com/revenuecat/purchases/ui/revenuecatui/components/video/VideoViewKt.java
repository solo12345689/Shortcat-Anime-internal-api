package com.revenuecat.purchases.ui.revenuecatui.components.video;

import I0.InterfaceC1680f;
import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a[\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "videoUri", "Landroidx/compose/ui/e;", "modifier", "", "showControls", "autoPlay", "loop", "muteAudio", "LI0/f;", "contentScale", "Lkotlin/Function0;", "LTd/L;", "onReady", "VideoView", "(Ljava/lang/String;Landroidx/compose/ui/e;ZZZZLI0/f;Lie/a;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;", "scaleType", "Video", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;LY/m;II)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VideoViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt$Video$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $autoPlay;
        final /* synthetic */ boolean $loop;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ boolean $muteAudio;
        final /* synthetic */ InterfaceC5082a $onReady;
        final /* synthetic */ TextureVideoView.ScaleType $scaleType;
        final /* synthetic */ boolean $showControls;
        final /* synthetic */ String $videoUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(TextureVideoView.ScaleType scaleType, String str, boolean z10, boolean z11, boolean z12, boolean z13, androidx.compose.ui.e eVar, InterfaceC5082a interfaceC5082a, int i10, int i11) {
            super(2);
            this.$scaleType = scaleType;
            this.$videoUri = str;
            this.$showControls = z10;
            this.$autoPlay = z11;
            this.$loop = z12;
            this.$muteAudio = z13;
            this.$modifier = eVar;
            this.$onReady = interfaceC5082a;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VideoViewKt.Video(this.$scaleType, this.$videoUri, this.$showControls, this.$autoPlay, this.$loop, this.$muteAudio, this.$modifier, this.$onReady, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt$VideoView$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $autoPlay;
        final /* synthetic */ InterfaceC1680f $contentScale;
        final /* synthetic */ boolean $loop;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ boolean $muteAudio;
        final /* synthetic */ InterfaceC5082a $onReady;
        final /* synthetic */ boolean $showControls;
        final /* synthetic */ String $videoUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, androidx.compose.ui.e eVar, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC1680f interfaceC1680f, InterfaceC5082a interfaceC5082a, int i10, int i11) {
            super(2);
            this.$videoUri = str;
            this.$modifier = eVar;
            this.$showControls = z10;
            this.$autoPlay = z11;
            this.$loop = z12;
            this.$muteAudio = z13;
            this.$contentScale = interfaceC1680f;
            this.$onReady = interfaceC5082a;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VideoViewKt.VideoView(this.$videoUri, this.$modifier, this.$showControls, this.$autoPlay, this.$loop, this.$muteAudio, this.$contentScale, this.$onReady, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:375:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Video(com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView.ScaleType r23, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, androidx.compose.ui.e r29, ie.InterfaceC5082a r30, Y.InterfaceC2425m r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt.Video(com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView$ScaleType, java.lang.String, boolean, boolean, boolean, boolean, androidx.compose.ui.e, ie.a, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VideoView(java.lang.String r20, androidx.compose.ui.e r21, boolean r22, boolean r23, boolean r24, boolean r25, I0.InterfaceC1680f r26, ie.InterfaceC5082a r27, Y.InterfaceC2425m r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt.VideoView(java.lang.String, androidx.compose.ui.e, boolean, boolean, boolean, boolean, I0.f, ie.a, Y.m, int, int):void");
    }
}
