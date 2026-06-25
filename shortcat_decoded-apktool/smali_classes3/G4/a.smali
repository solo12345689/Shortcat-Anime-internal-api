.class public final LG4/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LG4/o;


# instance fields
.field private final a:Landroidx/lifecycle/k;

.field private final b:LGf/C0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k;LGf/C0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG4/a;->a:Landroidx/lifecycle/k;

    .line 5
    .line 6
    iput-object p2, p0, LG4/a;->b:LGf/C0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public E()V
    .locals 1

    .line 1
    iget-object v0, p0, LG4/a;->a:Landroidx/lifecycle/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->removeObserver(Landroidx/lifecycle/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, LG4/a;->b:LGf/C0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/r;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LG4/a;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, LG4/a;->a:Landroidx/lifecycle/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->addObserver(Landroidx/lifecycle/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
