.class final Landroidx/compose/ui/platform/P$b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/P$b;->a(LGf/O;)Landroidx/compose/ui/platform/R0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/P;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/P;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/P$b$a;->a:Landroidx/compose/ui/platform/P;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/P$b$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/P$b$a;->a:Landroidx/compose/ui/platform/P;

    invoke-static {v0}, Landroidx/compose/ui/platform/P;->c(Landroidx/compose/ui/platform/P;)LGf/O;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LGf/P;->d(LGf/O;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
