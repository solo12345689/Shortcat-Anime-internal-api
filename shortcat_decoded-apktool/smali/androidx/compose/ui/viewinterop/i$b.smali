.class final Landroidx/compose/ui/viewinterop/i$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/i;->setReleaseBlock(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/viewinterop/i;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i$b;->a:Landroidx/compose/ui/viewinterop/i;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/i$b;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i$b;->a:Landroidx/compose/ui/viewinterop/i;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/i;->G(Landroidx/compose/ui/viewinterop/i;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/i$b;->a:Landroidx/compose/ui/viewinterop/i;

    invoke-virtual {v1}, Landroidx/compose/ui/viewinterop/i;->getReleaseBlock()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i$b;->a:Landroidx/compose/ui/viewinterop/i;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/i;->H(Landroidx/compose/ui/viewinterop/i;)V

    return-void
.end method
