.class final Landroidx/compose/ui/window/m$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/m;-><init>(Lie/a;Landroidx/compose/ui/window/t;Ljava/lang/String;Landroid/view/View;Li1/d;Landroidx/compose/ui/window/s;Ljava/util/UUID;Landroidx/compose/ui/window/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/m;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/m$f;->a:Landroidx/compose/ui/window/m;

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
.method public final invoke()Ljava/lang/Boolean;
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/window/m$f;->a:Landroidx/compose/ui/window/m;

    invoke-static {v0}, Landroidx/compose/ui/window/m;->g(Landroidx/compose/ui/window/m;)LI0/p;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LI0/p;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/m$f;->a:Landroidx/compose/ui/window/m;

    invoke-virtual {v0}, Landroidx/compose/ui/window/m;->getPopupContentSize-bOM6tXw()Li1/r;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/window/m$f;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
