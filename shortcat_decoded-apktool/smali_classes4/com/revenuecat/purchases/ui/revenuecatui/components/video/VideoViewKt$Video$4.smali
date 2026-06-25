.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt;->Video(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $autoPlay:Z

.field final synthetic $loop:Z

.field final synthetic $modifier:Landroidx/compose/ui/e;

.field final synthetic $muteAudio:Z

.field final synthetic $onReady:Lie/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/a;"
        }
    .end annotation
.end field

.field final synthetic $scaleType:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;

.field final synthetic $showControls:Z

.field final synthetic $videoUri:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;",
            "Ljava/lang/String;",
            "ZZZZ",
            "Landroidx/compose/ui/e;",
            "Lie/a;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$scaleType:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$videoUri:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$showControls:Z

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$autoPlay:Z

    .line 8
    .line 9
    iput-boolean p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$loop:Z

    .line 10
    .line 11
    iput-boolean p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$muteAudio:Z

    .line 12
    .line 13
    iput-object p7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$modifier:Landroidx/compose/ui/e;

    .line 14
    .line 15
    iput-object p8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$onReady:Lie/a;

    .line 16
    .line 17
    iput p9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$$changed:I

    .line 18
    .line 19
    iput p10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$$default:I

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 11

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$scaleType:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$videoUri:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$showControls:Z

    iget-boolean v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$autoPlay:Z

    iget-boolean v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$loop:Z

    iget-boolean v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$muteAudio:Z

    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$modifier:Landroidx/compose/ui/e;

    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$onReady:Lie/a;

    iget p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v9

    iget v10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;->$$default:I

    move-object v8, p1

    invoke-static/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt;->access$Video(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;LY/m;II)V

    return-void
.end method
