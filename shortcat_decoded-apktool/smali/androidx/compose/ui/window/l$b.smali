.class final Landroidx/compose/ui/window/l$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/l;-><init>(Lie/a;Landroidx/compose/ui/window/k;Landroid/view/View;Li1/t;Li1/d;Ljava/util/UUID;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/l;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/l$b;->a:Landroidx/compose/ui/window/l;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Landroidx/activity/G;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/window/l$b;->a:Landroidx/compose/ui/window/l;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/ui/window/l;->j(Landroidx/compose/ui/window/l;)Landroidx/compose/ui/window/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/window/k;->b()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/compose/ui/window/l$b;->a:Landroidx/compose/ui/window/l;

    .line 14
    .line 15
    invoke-static {p1}, Landroidx/compose/ui/window/l;->i(Landroidx/compose/ui/window/l;)Lie/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/activity/G;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/l$b;->a(Landroidx/activity/G;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
