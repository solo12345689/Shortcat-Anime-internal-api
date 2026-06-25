.class final LU/P$d$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/P$d;->invoke-0kLqBqw(LI0/P;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/P;

.field final synthetic b:LI0/P;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:I

.field final synthetic e:Ljava/util/List;

.field final synthetic f:Ljava/lang/Integer;

.field final synthetic g:Lie/o;


# direct methods
.method constructor <init>(LC/P;LI0/P;Ljava/util/List;ILjava/util/List;Ljava/lang/Integer;Lie/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/P$d$b;->a:LC/P;

    .line 2
    .line 3
    iput-object p2, p0, LU/P$d$b;->b:LI0/P;

    .line 4
    .line 5
    iput-object p3, p0, LU/P$d$b;->c:Ljava/util/List;

    .line 6
    .line 7
    iput p4, p0, LU/P$d$b;->d:I

    .line 8
    .line 9
    iput-object p5, p0, LU/P$d$b;->e:Ljava/util/List;

    .line 10
    .line 11
    iput-object p6, p0, LU/P$d$b;->f:Ljava/lang/Integer;

    .line 12
    .line 13
    iput-object p7, p0, LU/P$d$b;->g:Lie/o;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 17
    .line 18
    .line 19
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

    invoke-virtual {p0, p1, p2}, LU/P$d$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 4

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

    const-string v1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)"

    const v2, -0x48526920

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LU/P$d$b;->a:LC/P;

    iget-object v0, p0, LU/P$d$b;->b:LI0/P;

    invoke-static {p2, v0}, LC/S;->c(LC/P;Li1/d;)LC/A;

    move-result-object p2

    .line 5
    iget-object v0, p0, LU/P$d$b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 6
    invoke-interface {p2}, LC/A;->d()F

    move-result v0

    goto :goto_1

    .line 7
    :cond_3
    iget-object v0, p0, LU/P$d$b;->b:LI0/P;

    iget v1, p0, LU/P$d$b;->d:I

    invoke-interface {v0, v1}, Li1/d;->A(I)F

    move-result v0

    .line 8
    :goto_1
    iget-object v1, p0, LU/P$d$b;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, LU/P$d$b;->f:Ljava/lang/Integer;

    if-nez v1, :cond_4

    goto :goto_2

    .line 9
    :cond_4
    iget-object v2, p0, LU/P$d$b;->b:LI0/P;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v2, v1}, Li1/d;->A(I)F

    move-result v1

    goto :goto_3

    .line 10
    :cond_5
    :goto_2
    invoke-interface {p2}, LC/A;->c()F

    move-result v1

    .line 11
    :goto_3
    iget-object v2, p0, LU/P$d$b;->b:LI0/P;

    invoke-interface {v2}, LI0/m;->getLayoutDirection()Li1/t;

    move-result-object v2

    .line 12
    invoke-static {p2, v2}, Landroidx/compose/foundation/layout/p;->g(LC/A;Li1/t;)F

    move-result v2

    .line 13
    iget-object v3, p0, LU/P$d$b;->b:LI0/P;

    invoke-interface {v3}, LI0/m;->getLayoutDirection()Li1/t;

    move-result-object v3

    invoke-static {p2, v3}, Landroidx/compose/foundation/layout/p;->f(LC/A;Li1/t;)F

    move-result p2

    .line 14
    invoke-static {v2, v0, p2, v1}, Landroidx/compose/foundation/layout/p;->d(FFFF)LC/A;

    move-result-object p2

    .line 15
    iget-object v0, p0, LU/P$d$b;->g:Lie/o;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p2, p1, v1}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LY/w;->T()V

    :cond_6
    return-void
.end method
