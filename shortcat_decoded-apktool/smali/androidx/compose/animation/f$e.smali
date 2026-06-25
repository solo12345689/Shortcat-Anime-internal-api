.class final Landroidx/compose/animation/f$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/f;->e(Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;LY/m;I)Lv/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/h2;

.field final synthetic b:LY/h2;

.field final synthetic c:LY/h2;


# direct methods
.method constructor <init>(LY/h2;LY/h2;LY/h2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/f$e;->a:LY/h2;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/f$e;->b:LY/h2;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/animation/f$e;->c:LY/h2;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/g;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/f$e;->invoke(Landroidx/compose/ui/graphics/g;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/g;)V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/animation/f$e;->a:LY/h2;

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->e(F)V

    .line 3
    iget-object v0, p0, Landroidx/compose/animation/f$e;->b:LY/h2;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->l(F)V

    .line 4
    iget-object v0, p0, Landroidx/compose/animation/f$e;->b:LY/h2;

    if-eqz v0, :cond_2

    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v1

    :cond_2
    invoke-interface {p1, v1}, Landroidx/compose/ui/graphics/g;->y(F)V

    .line 5
    iget-object v0, p0, Landroidx/compose/animation/f$e;->c:LY/h2;

    if-eqz v0, :cond_3

    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/j;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/j;->j()J

    move-result-wide v0

    goto :goto_2

    :cond_3
    sget-object v0, Landroidx/compose/ui/graphics/j;->b:Landroidx/compose/ui/graphics/j$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/j$a;->a()J

    move-result-wide v0

    :goto_2
    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/g;->t0(J)V

    return-void
.end method
