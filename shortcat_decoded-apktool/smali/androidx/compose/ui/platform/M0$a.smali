.class final Landroidx/compose/ui/platform/M0$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/M0;-><init>(Lv0/c;Ls0/Z0;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lie/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/M0;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/M0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/M0$a;->a:Landroidx/compose/ui/platform/M0;

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/f;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/M0$a;->invoke(Lu0/f;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/f;)V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/M0$a;->a:Landroidx/compose/ui/platform/M0;

    .line 3
    invoke-interface {p1}, Lu0/f;->n1()Lu0/d;

    move-result-object v1

    invoke-interface {v1}, Lu0/d;->b()Ls0/j0;

    move-result-object v1

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/platform/M0;->m(Landroidx/compose/ui/platform/M0;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lu0/f;->n1()Lu0/d;

    move-result-object p1

    invoke-interface {p1}, Lu0/d;->g()Lv0/c;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
