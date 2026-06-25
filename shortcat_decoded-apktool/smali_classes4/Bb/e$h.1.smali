.class public final LBb/e$h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBb/e;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LBb/e;


# direct methods
.method public constructor <init>(LBb/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LBb/e$h;->a:LBb/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, LBb/e$h;->a:LBb/e;

    .line 2
    .line 3
    invoke-static {v0}, LBb/e;->C(LBb/e;)Lv7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lv7/d;->f()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LBb/e$h;->a:LBb/e;

    .line 11
    .line 12
    invoke-static {v0}, LBb/e;->D(LBb/e;)Lv7/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Lv7/a;->c()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, LBb/e$h;->a:LBb/e;

    .line 20
    .line 21
    invoke-static {v0}, LBb/e;->E(LBb/e;)LGf/O;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lrb/e;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v1, v3, v2, v3}, Lrb/e;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, LGf/P;->c(LGf/O;Ljava/util/concurrent/CancellationException;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    invoke-static {}, LBb/e;->F()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "The scope does not have a job in it"

    .line 41
    .line 42
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBb/e$h;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
