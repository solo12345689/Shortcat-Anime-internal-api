.class public final LMd/m$a;
.super Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMd/m;->b(Landroidx/media3/ui/PlayerView;Landroid/content/Context;)Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/ui/PlayerView;

.field final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroidx/media3/ui/PlayerView;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, LMd/m$a;->a:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    iput-object p2, p0, LMd/m$a;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onEnabledChanged(Z)V
    .locals 2

    .line 1
    sget-object p1, LMd/m;->a:LMd/m;

    .line 2
    .line 3
    iget-object v0, p0, LMd/m$a;->a:Landroidx/media3/ui/PlayerView;

    .line 4
    .line 5
    iget-object v1, p0, LMd/m$a;->b:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1}, LMd/m;->a(Landroidx/media3/ui/PlayerView;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onFontScaleChanged(F)V
    .locals 2

    .line 1
    sget-object p1, LMd/m;->a:LMd/m;

    .line 2
    .line 3
    iget-object v0, p0, LMd/m$a;->a:Landroidx/media3/ui/PlayerView;

    .line 4
    .line 5
    iget-object v1, p0, LMd/m$a;->b:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1}, LMd/m;->a(Landroidx/media3/ui/PlayerView;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onUserStyleChanged(Landroid/view/accessibility/CaptioningManager$CaptionStyle;)V
    .locals 2

    .line 1
    const-string v0, "userStyle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LMd/m;->a:LMd/m;

    .line 7
    .line 8
    iget-object v0, p0, LMd/m$a;->a:Landroidx/media3/ui/PlayerView;

    .line 9
    .line 10
    iget-object v1, p0, LMd/m$a;->b:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, LMd/m;->a(Landroidx/media3/ui/PlayerView;Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
