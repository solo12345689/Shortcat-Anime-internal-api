.class final Lv/k$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/k;->b(Lw/o0;Landroidx/compose/ui/e;Lw/G;Lkotlin/jvm/functions/Function1;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/o0;

.field final synthetic b:Lw/G;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lie/o;


# direct methods
.method constructor <init>(Lw/o0;Lw/G;Ljava/lang/Object;Lie/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/k$d;->a:Lw/o0;

    .line 2
    .line 3
    iput-object p2, p0, Lv/k$d;->b:Lw/G;

    .line 4
    .line 5
    iput-object p3, p0, Lv/k$d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lv/k$d;->d:Lie/o;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic a(LY/h2;)F
    .locals 0

    .line 1
    invoke-static {p0}, Lv/k$d;->b(LY/h2;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final b(LY/h2;)F
    .locals 0

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/k$d;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 13

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    and-int/lit8 v2, p2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 3
    invoke-interface {p1}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 5
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_2

    const v2, -0x55057628

    const-string v4, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)"

    invoke-static {v2, p2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object v5, p0, Lv/k$d;->a:Lw/o0;

    new-instance p2, Lv/k$d$b;

    iget-object v2, p0, Lv/k$d;->b:Lw/G;

    invoke-direct {p2, v2}, Lv/k$d$b;-><init>(Lw/G;)V

    iget-object v2, p0, Lv/k$d;->c:Ljava/lang/Object;

    .line 6
    sget-object v4, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v4}, Lw/u0;->f(Lkotlin/jvm/internal/l;)Lw/s0;

    move-result-object v9

    .line 7
    invoke-virtual {v5}, Lw/o0;->h()Ljava/lang/Object;

    move-result-object v4

    const v6, -0x1a25b2ec

    invoke-interface {p1, v6}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v7

    const-string v8, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)"

    if-eqz v7, :cond_3

    .line 8
    invoke-static {v6, v0, v3, v8}, LY/w;->U(IIILjava/lang/String;)V

    :cond_3
    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v7, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    if-eqz v4, :cond_4

    move v4, v10

    goto :goto_1

    :cond_4
    move v4, v7

    :goto_1
    invoke-static {}, LY/w;->L()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-static {}, LY/w;->T()V

    :cond_5
    invoke-interface {p1}, LY/m;->O()V

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 9
    invoke-virtual {v5}, Lw/o0;->o()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {p1, v6}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v12

    if-eqz v12, :cond_6

    .line 10
    invoke-static {v6, v0, v3, v8}, LY/w;->U(IIILjava/lang/String;)V

    :cond_6
    invoke-static {v11, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move v7, v10

    :cond_7
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {}, LY/w;->T()V

    :cond_8
    invoke-interface {p1}, LY/m;->O()V

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    .line 11
    invoke-virtual {v5}, Lw/o0;->m()Lw/o0$b;

    move-result-object v2

    invoke-interface {p2, v2, p1, v1}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v8, p2

    check-cast v8, Lw/G;

    const/4 v12, 0x0

    .line 12
    const-string v10, "FloatAnimation"

    move-object v11, p1

    move-object v6, v4

    invoke-static/range {v5 .. v12}, Lw/p0;->c(Lw/o0;Ljava/lang/Object;Ljava/lang/Object;Lw/G;Lw/s0;Ljava/lang/String;LY/m;I)LY/h2;

    move-result-object p1

    .line 13
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    invoke-interface {v11, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    .line 14
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    .line 15
    sget-object v2, LY/m;->a:LY/m$a;

    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_a

    .line 16
    :cond_9
    new-instance v3, Lv/k$d$a;

    invoke-direct {v3, p1}, Lv/k$d$a;-><init>(LY/h2;)V

    .line 17
    invoke-interface {v11, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 18
    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v3}, Landroidx/compose/ui/graphics/f;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p2, p0, Lv/k$d;->d:Lie/o;

    iget-object v2, p0, Lv/k$d;->c:Ljava/lang/Object;

    .line 19
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v3}, Ll0/e$a;->o()Ll0/e;

    move-result-object v3

    .line 20
    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v3

    .line 21
    invoke-static {v11, v0}, LY/h;->a(LY/m;I)I

    move-result v0

    .line 22
    invoke-interface {v11}, LY/m;->r()LY/I;

    move-result-object v4

    .line 23
    invoke-static {v11, p1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    .line 24
    sget-object v5, LK0/g;->M:LK0/g$a;

    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    move-result-object v6

    .line 25
    invoke-interface {v11}, LY/m;->j()LY/d;

    move-result-object v7

    if-nez v7, :cond_b

    invoke-static {}, LY/h;->d()V

    .line 26
    :cond_b
    invoke-interface {v11}, LY/m;->I()V

    .line 27
    invoke-interface {v11}, LY/m;->e()Z

    move-result v7

    if-eqz v7, :cond_c

    .line 28
    invoke-interface {v11, v6}, LY/m;->h(Lie/a;)V

    goto :goto_2

    .line 29
    :cond_c
    invoke-interface {v11}, LY/m;->s()V

    .line 30
    :goto_2
    invoke-static {v11}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v6

    .line 31
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v3, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 32
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v6, v4, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 33
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    .line 34
    invoke-interface {v6}, LY/m;->e()Z

    move-result v4

    if-nez v4, :cond_d

    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    .line 35
    :cond_d
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 37
    :cond_e
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, p1, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 38
    sget-object p1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 39
    invoke-interface {p2, v2, v11, v1}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    invoke-interface {v11}, LY/m;->x()V

    .line 41
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-static {}, LY/w;->T()V

    :cond_f
    return-void
.end method
