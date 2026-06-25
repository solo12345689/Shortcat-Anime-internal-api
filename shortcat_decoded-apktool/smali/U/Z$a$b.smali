.class final LU/Z$a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/Z$a;->a(Lkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU/W;

.field final synthetic b:LU/x;


# direct methods
.method constructor <init>(LU/W;LU/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/Z$a$b;->a:LU/W;

    .line 2
    .line 3
    iput-object p2, p0, LU/Z$a$b;->b:LU/x;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LU/Z$a$b;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, LU/Z$a$b;->a:LU/W;

    iget-object v1, p0, LU/Z$a$b;->b:LU/x;

    invoke-virtual {v1}, LU/x;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, LU/Z$a$b;->b:LU/x;

    invoke-virtual {v0}, LU/x;->b()Ljava/util/List;

    move-result-object v0

    new-instance v1, LU/Z$a$b$a;

    iget-object v2, p0, LU/Z$a$b;->a:LU/W;

    invoke-direct {v1, v2}, LU/Z$a$b$a;-><init>(LU/W;)V

    invoke-static {v0, v1}, LUd/u;->K(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 4
    iget-object v0, p0, LU/Z$a$b;->b:LU/x;

    invoke-virtual {v0}, LU/x;->c()LY/d1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LY/d1;->invalidate()V

    :cond_0
    return-void
.end method
