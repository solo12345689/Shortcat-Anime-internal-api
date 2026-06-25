.class final LR8/L;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LP8/h$a;


# instance fields
.field final synthetic a:LP8/h;

.field final synthetic b:Ln9/j;

.field final synthetic c:LR8/o$a;

.field final synthetic d:LR8/N;


# direct methods
.method constructor <init>(LP8/h;Ln9/j;LR8/o$a;LR8/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR8/L;->a:LP8/h;

    .line 2
    .line 3
    iput-object p2, p0, LR8/L;->b:Ln9/j;

    .line 4
    .line 5
    iput-object p3, p0, LR8/L;->c:LR8/o$a;

    .line 6
    .line 7
    iput-object p4, p0, LR8/L;->d:LR8/N;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LR8/L;->a:LP8/h;

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1, v2}, LP8/h;->await(JLjava/util/concurrent/TimeUnit;)LP8/k;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, LR8/L;->b:Ln9/j;

    .line 18
    .line 19
    iget-object v1, p0, LR8/L;->c:LR8/o$a;

    .line 20
    .line 21
    invoke-interface {v1, p1}, LR8/o$a;->a(LP8/k;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Ln9/j;->c(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, p0, LR8/L;->b:Ln9/j;

    .line 30
    .line 31
    invoke-static {p1}, LR8/b;->a(Lcom/google/android/gms/common/api/Status;)LP8/b;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Ln9/j;->b(Ljava/lang/Exception;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
