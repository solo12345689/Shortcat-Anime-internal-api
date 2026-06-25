.class public final Lexpo/modules/image/ExpoImageViewWrapper$d;
.super Landroidx/core/view/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/image/ExpoImageViewWrapper;->setIsScreenReaderFocusable(Landroid/view/View;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/image/ExpoImageViewWrapper$d;->d:Z

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/core/view/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;LL1/B;)V
    .locals 1

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "info"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lexpo/modules/image/ExpoImageViewWrapper$d;->d:Z

    .line 12
    .line 13
    invoke-virtual {p2, v0}, LL1/B;->b1(Z)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1, p2}, Landroidx/core/view/a;->g(Landroid/view/View;LL1/B;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
