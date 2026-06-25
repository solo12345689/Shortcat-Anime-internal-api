.class final LF/o$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/o$a;->c()Lkotlin/jvm/functions/Function2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/o;

.field final synthetic b:LF/o$a;


# direct methods
.method constructor <init>(LF/o;LF/o$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/o$a$a;->a:LF/o;

    .line 2
    .line 3
    iput-object p2, p0, LF/o$a$a;->b:LF/o$a;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
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

    invoke-virtual {p0, p1, p2}, LF/o$a$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 8

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

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    const v0, 0x53af4291

    const-string v2, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:92)"

    invoke-static {v0, p2, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LF/o$a$a;->a:LF/o;

    invoke-virtual {p2}, LF/o;->d()Lie/a;

    move-result-object p2

    invoke-interface {p2}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, LF/q;

    .line 5
    iget-object p2, p0, LF/o$a$a;->b:LF/o$a;

    invoke-virtual {p2}, LF/o$a;->f()I

    move-result p2

    .line 6
    invoke-interface {v2}, LF/q;->a()I

    move-result v0

    if-ge p2, v0, :cond_4

    invoke-interface {v2, p2}, LF/q;->d(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, LF/o$a$a;->b:LF/o$a;

    invoke-virtual {v3}, LF/o$a;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move v4, p2

    goto :goto_3

    .line 7
    :cond_4
    :goto_2
    iget-object p2, p0, LF/o$a$a;->b:LF/o$a;

    invoke-virtual {p2}, LF/o$a;->g()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v2, p2}, LF/q;->c(Ljava/lang/Object;)I

    move-result p2

    if-eq p2, v1, :cond_3

    .line 8
    iget-object v0, p0, LF/o$a$a;->b:LF/o$a;

    invoke-static {v0, p2}, LF/o$a;->a(LF/o$a;I)V

    goto :goto_1

    :goto_3
    const/4 p2, 0x0

    if-eq v4, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    :cond_5
    move v0, p2

    .line 9
    :goto_4
    iget-object v1, p0, LF/o$a$a;->a:LF/o;

    iget-object v3, p0, LF/o$a$a;->b:LF/o$a;

    const/16 v5, 0xcf

    .line 10
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {p1, v5, v6}, LY/m;->J(ILjava/lang/Object;)V

    .line 11
    invoke-interface {p1, v0}, LY/m;->a(Z)Z

    move-result v5

    const v6, -0x33d6b053    # -4.4383924E7f

    invoke-interface {p1, v6}, LY/m;->V(I)V

    if-eqz v0, :cond_6

    const v0, -0x7e5ec2e5

    .line 12
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 13
    invoke-static {v1}, LF/o;->a(LF/o;)Lh0/g;

    move-result-object v0

    invoke-static {v0}, LF/P;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 14
    invoke-virtual {v3}, LF/o$a;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LF/P;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/4 v7, 0x0

    move-object v6, p1

    move-object v3, v0

    .line 15
    invoke-static/range {v2 .. v7}, LF/p;->b(LF/q;Ljava/lang/Object;ILjava/lang/Object;LY/m;I)V

    invoke-interface {v6}, LY/m;->O()V

    goto :goto_5

    :cond_6
    move-object v6, p1

    .line 16
    invoke-interface {v6, v5}, LY/m;->f(Z)V

    :goto_5
    invoke-interface {v6}, LY/m;->O()V

    .line 17
    invoke-interface {v6}, LY/m;->B()V

    .line 18
    iget-object p1, p0, LF/o$a$a;->b:LF/o$a;

    invoke-virtual {p1}, LF/o$a;->g()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LF/o$a$a;->b:LF/o$a;

    invoke-interface {v6, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LF/o$a$a;->b:LF/o$a;

    .line 19
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_7

    .line 20
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_8

    .line 21
    :cond_7
    new-instance v2, LF/o$a$a$a;

    invoke-direct {v2, v1}, LF/o$a$a$a;-><init>(LF/o$a;)V

    .line 22
    invoke-interface {v6, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 23
    :cond_8
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v2, v6, p2}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LY/w;->T()V

    :cond_9
    return-void
.end method
