.class final LK/L$a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/L$a;->k(La1/c0;La1/U;La1/J;LK/Z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI0/p;


# direct methods
.method constructor <init>(LI0/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/L$a$b;->a:LI0/p;

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
.method public final a([F)V
    .locals 2

    .line 1
    iget-object v0, p0, LK/L$a$b;->a:LI0/p;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/p;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LK/L$a$b;->a:LI0/p;

    .line 10
    .line 11
    invoke-static {v0}, LI0/q;->d(LI0/p;)LI0/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, LK/L$a$b;->a:LI0/p;

    .line 16
    .line 17
    invoke-interface {v0, v1, p1}, LI0/p;->o0(LI0/p;[F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls0/g1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ls0/g1;->p()[F

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, LK/L$a$b;->a([F)V

    .line 8
    .line 9
    .line 10
    sget-object p1, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p1
.end method
