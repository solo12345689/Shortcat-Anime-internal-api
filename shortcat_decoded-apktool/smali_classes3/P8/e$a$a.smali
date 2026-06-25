.class public LP8/e$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:LQ8/p;

.field private b:Landroid/os/Looper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()LP8/e$a;
    .locals 4

    .line 1
    iget-object v0, p0, LP8/e$a$a;->a:LQ8/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LQ8/a;

    .line 6
    .line 7
    invoke-direct {v0}, LQ8/a;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LP8/e$a$a;->a:LQ8/p;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LP8/e$a$a;->b:Landroid/os/Looper;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, LP8/e$a$a;->b:Landroid/os/Looper;

    .line 21
    .line 22
    :cond_1
    new-instance v0, LP8/e$a;

    .line 23
    .line 24
    iget-object v1, p0, LP8/e$a$a;->a:LQ8/p;

    .line 25
    .line 26
    iget-object v2, p0, LP8/e$a$a;->b:Landroid/os/Looper;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v0, v1, v3, v2, v3}, LP8/e$a;-><init>(LQ8/p;Landroid/accounts/Account;Landroid/os/Looper;LP8/n;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public b(Landroid/os/Looper;)LP8/e$a$a;
    .locals 1

    .line 1
    const-string v0, "Looper must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LP8/e$a$a;->b:Landroid/os/Looper;

    .line 7
    .line 8
    return-object p0
.end method

.method public c(LQ8/p;)LP8/e$a$a;
    .locals 1

    .line 1
    const-string v0, "StatusExceptionMapper must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LP8/e$a$a;->a:LQ8/p;

    .line 7
    .line 8
    return-object p0
.end method
