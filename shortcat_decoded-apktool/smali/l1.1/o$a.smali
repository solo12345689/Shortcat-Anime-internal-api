.class final Ll1/o$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll1/o;->b(Ll1/C;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ll1/o;

.field final synthetic c:Ll1/C;


# direct methods
.method constructor <init>(Ljava/util/List;Ll1/o;Ll1/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/o$a;->a:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Ll1/o$a;->b:Ll1/o;

    .line 4
    .line 5
    iput-object p3, p0, Ll1/o$a;->c:Ll1/C;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ll1/o$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    iget-object v0, p0, Ll1/o$a;->a:Ljava/util/List;

    iget-object v1, p0, Ll1/o$a;->b:Ll1/o;

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    .line 4
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 5
    check-cast v4, LI0/A;

    .line 6
    invoke-interface {v4}, LI0/l;->j()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ll1/k;

    if-eqz v5, :cond_0

    check-cast v4, Ll1/k;

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_1

    .line 7
    invoke-virtual {v4}, Ll1/k;->b()Ll1/f;

    move-result-object v5

    .line 8
    invoke-virtual {v1}, Ll1/o;->i()Ll1/l;

    move-result-object v6

    invoke-virtual {v6, v5}, Ll1/i;->b(Ll1/x;)Lp1/f;

    move-result-object v6

    .line 9
    new-instance v7, Ll1/e;

    invoke-virtual {v5}, Ll1/f;->a()Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v7, v5, v6}, Ll1/e;-><init>(Ljava/lang/Object;Lp1/f;)V

    .line 10
    invoke-virtual {v4}, Ll1/k;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    invoke-interface {v5, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    :cond_1
    invoke-static {v1}, Ll1/o;->g(Ll1/o;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Ll1/o$a;->b:Ll1/o;

    invoke-virtual {v0}, Ll1/o;->i()Ll1/l;

    move-result-object v0

    iget-object v1, p0, Ll1/o$a;->c:Ll1/C;

    invoke-virtual {v0, v1}, Ll1/i;->a(Ll1/C;)V

    return-void
.end method
