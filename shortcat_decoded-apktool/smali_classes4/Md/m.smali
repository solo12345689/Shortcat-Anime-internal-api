.class public final LMd/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LMd/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LMd/m;

    .line 2
    .line 3
    invoke-direct {v0}, LMd/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LMd/m;->a:LMd/m;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroidx/media3/ui/PlayerView;Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "playerView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->getSubtitleView()Landroidx/media3/ui/SubtitleView;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Landroidx/media3/ui/SubtitleView;->setApplyEmbeddedStyles(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/media3/ui/SubtitleView;->setApplyEmbeddedFontSizes(Z)V

    .line 22
    .line 23
    .line 24
    const-string v0, "captioning"

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    instance-of v0, p2, Landroid/view/accessibility/CaptioningManager;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    check-cast p2, Landroid/view/accessibility/CaptioningManager;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object p2, v1

    .line 39
    :goto_0
    if-eqz p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/view/accessibility/CaptioningManager;->getUserStyle()Landroid/view/accessibility/CaptioningManager$CaptionStyle;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-static {v1}, LG3/a;->a(Landroid/view/accessibility/CaptioningManager$CaptionStyle;)LG3/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "createFromCaptionStyle(...)"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroidx/media3/ui/SubtitleView;->setStyle(LG3/a;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/view/accessibility/CaptioningManager;->getFontScale()F

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    const/4 v0, 0x2

    .line 64
    const/high16 v1, 0x41800000    # 16.0f

    .line 65
    .line 66
    mul-float/2addr p2, v1

    .line 67
    invoke-virtual {p1, v0, p2}, Landroidx/media3/ui/SubtitleView;->b(IF)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public final b(Landroidx/media3/ui/PlayerView;Landroid/content/Context;)Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;
    .locals 1

    .line 1
    const-string v0, "playerView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LMd/m$a;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, LMd/m$a;-><init>(Landroidx/media3/ui/PlayerView;Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
