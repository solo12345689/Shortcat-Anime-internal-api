.class final LI3/b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI3/b;->b(LGf/W;Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/concurrent/futures/c$a;

.field final synthetic b:LGf/W;


# direct methods
.method constructor <init>(Landroidx/concurrent/futures/c$a;LGf/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI3/b$a;->a:Landroidx/concurrent/futures/c$a;

    .line 2
    .line 3
    iput-object p2, p0, LI3/b$a;->b:LGf/W;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LI3/b$a;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 2
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, LI3/b$a;->a:Landroidx/concurrent/futures/c$a;

    invoke-virtual {p1}, Landroidx/concurrent/futures/c$a;->c()Z

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, LI3/b$a;->a:Landroidx/concurrent/futures/c$a;

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->e(Ljava/lang/Throwable;)Z

    return-void

    .line 5
    :cond_1
    iget-object p1, p0, LI3/b$a;->a:Landroidx/concurrent/futures/c$a;

    iget-object v0, p0, LI3/b$a;->b:LGf/W;

    invoke-interface {v0}, LGf/W;->q()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    return-void
.end method
