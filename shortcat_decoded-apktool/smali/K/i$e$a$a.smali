.class final LK/i$e$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i$e$a;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/F;

.field final synthetic b:LK/y;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:Lkotlin/jvm/functions/Function1;

.field final synthetic f:La1/U;

.field final synthetic g:La1/J;

.field final synthetic h:Li1/d;

.field final synthetic i:I


# direct methods
.method constructor <init>(LQ/F;LK/y;ZZLkotlin/jvm/functions/Function1;La1/U;La1/J;Li1/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$e$a$a;->a:LQ/F;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$e$a$a;->b:LK/y;

    .line 4
    .line 5
    iput-boolean p3, p0, LK/i$e$a$a;->c:Z

    .line 6
    .line 7
    iput-boolean p4, p0, LK/i$e$a$a;->d:Z

    .line 8
    .line 9
    iput-object p5, p0, LK/i$e$a$a;->e:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iput-object p6, p0, LK/i$e$a$a;->f:La1/U;

    .line 12
    .line 13
    iput-object p7, p0, LK/i$e$a$a;->g:La1/J;

    .line 14
    .line 15
    iput-object p8, p0, LK/i$e$a$a;->h:Li1/d;

    .line 16
    .line 17
    iput p9, p0, LK/i$e$a$a;->i:I

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
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

    invoke-virtual {p0, p1, p2}, LK/i$e$a$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)"

    const v2, -0x15a57eaf

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    new-instance v3, LK/i$e$a$a$a;

    iget-object v4, p0, LK/i$e$a$a;->b:LK/y;

    iget-object v5, p0, LK/i$e$a$a;->e:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, LK/i$e$a$a;->f:La1/U;

    iget-object v7, p0, LK/i$e$a$a;->g:La1/J;

    iget-object v8, p0, LK/i$e$a$a;->h:Li1/d;

    iget v9, p0, LK/i$e$a$a;->i:I

    invoke-direct/range {v3 .. v9}, LK/i$e$a$a$a;-><init>(LK/y;Lkotlin/jvm/functions/Function1;La1/U;La1/J;Li1/d;I)V

    .line 6
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    .line 7
    invoke-static {p1, v0}, LY/h;->a(LY/m;I)I

    move-result v1

    .line 8
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v2

    .line 9
    invoke-static {p1, p2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 10
    sget-object v4, LK0/g;->M:LK0/g$a;

    invoke-virtual {v4}, LK0/g$a;->a()Lie/a;

    move-result-object v5

    .line 11
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 12
    :cond_3
    invoke-interface {p1}, LY/m;->I()V

    .line 13
    invoke-interface {p1}, LY/m;->e()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 14
    invoke-interface {p1, v5}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 15
    :cond_4
    invoke-interface {p1}, LY/m;->s()V

    .line 16
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v5

    .line 17
    invoke-virtual {v4}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, v3, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 18
    invoke-virtual {v4}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v5, v2, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 19
    invoke-virtual {v4}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 20
    invoke-interface {v5}, LY/m;->e()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 21
    :cond_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    :cond_6
    invoke-virtual {v4}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, p2, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    invoke-interface {p1}, LY/m;->x()V

    .line 25
    iget-object p2, p0, LK/i$e$a$a;->a:LQ/F;

    .line 26
    iget-object v1, p0, LK/i$e$a$a;->b:LK/y;

    invoke-virtual {v1}, LK/y;->d()LK/m;

    move-result-object v1

    sget-object v2, LK/m;->a:LK/m;

    if-eq v1, v2, :cond_7

    .line 27
    iget-object v1, p0, LK/i$e$a$a;->b:LK/y;

    invoke-virtual {v1}, LK/y;->i()LI0/p;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 28
    iget-object v1, p0, LK/i$e$a$a;->b:LK/y;

    invoke-virtual {v1}, LK/y;->i()LI0/p;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-interface {v1}, LI0/p;->b()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 29
    iget-boolean v1, p0, LK/i$e$a$a;->c:Z

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    goto :goto_2

    :cond_7
    move v1, v0

    .line 30
    :goto_2
    invoke-static {p2, v1, p1, v0}, LK/i;->h(LQ/F;ZLY/m;I)V

    .line 31
    iget-object p2, p0, LK/i$e$a$a;->b:LK/y;

    invoke-virtual {p2}, LK/y;->d()LK/m;

    move-result-object p2

    sget-object v1, LK/m;->c:LK/m;

    if-ne p2, v1, :cond_8

    .line 32
    iget-boolean p2, p0, LK/i$e$a$a;->d:Z

    if-nez p2, :cond_8

    .line 33
    iget-boolean p2, p0, LK/i$e$a$a;->c:Z

    if-eqz p2, :cond_8

    const p2, -0x1f0292

    .line 34
    invoke-interface {p1, p2}, LY/m;->V(I)V

    .line 35
    iget-object p2, p0, LK/i$e$a$a;->a:LQ/F;

    invoke-static {p2, p1, v0}, LK/i;->e(LQ/F;LY/m;I)V

    .line 36
    invoke-interface {p1}, LY/m;->O()V

    goto :goto_3

    :cond_8
    const p2, -0x1dd642

    .line 37
    invoke-interface {p1, p2}, LY/m;->V(I)V

    invoke-interface {p1}, LY/m;->O()V

    :goto_3
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LY/w;->T()V

    :cond_9
    return-void
.end method
